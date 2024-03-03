// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// Note [Python interpreter tag]
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Traditionally, PyTorch is layered such that our Python library
// (libtorch_python) references our pure C++ library (libtorch) as the
// natural order of things.  However, sometimes this natural order is
// subverted: C++ objects refer to Python objects (for example, we
// store a PyObject* pointer on TensorImpl so that converting from a
// C++ Tensor to a Python Tensor is just a memory dereference).
//
// These unusual orderings must be treated with care.  To start, you need to
// virtualize the destructor so that the PyObject can be decref'ed on
// destruction (because the C++ object itself doesn't know anything about
// Python--remember, layering!).  This process itself is fraught, since
// acquiring the GIL could lead to deadlocks if someone is blocking on you
// while holding the GIL.  Furthermore, if the C++ objects outlive the
// interpreter (which can happen if you stash them in a static global
// variable defined in libtorch), you may attempt to decref the object when
// the Python interpreter has already been shutdown.
//
// BUT WAIT, IT GETS WORSE.  With torchdeploy, there may be multiple Python
// interpreters in a single process. If a C++ object is accessible from
// multiple interpreters, we must take care not to accidentally pass a
// PyObject from one interpreter with another interpreter.
//
// To prevent these mixups, we introduce a PyInterpreter "tag" (object with
// a vtable), which specifies a specific Python interpreter.
//
//  - Any given object can be associated with AT MOST one Python interpreter.
//    We represent the interpreter tag as a memory address to an instance of
//    a virtual class that is allocated once per interpreter (this is so that
//    we can request the interpreter to perform operations for us, if
//    necessary).
//
//  - It can be recorded with a PyObject (PyInterpreterObject) so that
//    we know what interpreter the object is associated with, and we can
//    raise an error if you try to use the PyObject from the wrong
//    interpreter context.
//
//  - It contains a vtable that can be used to perform various Python
//    operations from ordinary C++ code that ordinarily wouldn't be accessible
//    from libtorch.
//
// A simple use case is when a C++ object must be associated with a PyObject.
// However, for TensorImpl, we lazily allocate a PyObject the first time the
// object passes into Python.  The invariants for this situation are more
// subtle:
//
//  - A given TensorImpl's interpreter tag can only go from uninitialized to
//    tagged; once tagged, this is a quiescent state (once tagged to an
//    interpreter, ALWAYS tagged to that interpreter)
//
//  - A thread may mutate the PyObject field of a TensorImpl if and only if it
//    holds the GIL for the interpreter tagged on the TensorImpl.  (If the
//    TensorImpl is not tagged, it must first atomically claim its tag before it
//    can validly write)
//
// WARNING: This class has to be written very carefully, because it may be
// possible for a Tensor to have a reference an interpreter corresponding to
// a shared library that has ALREADY BEEN UNLOADED.  This makes blindly calling
// virtual methods very dangerous, because the vtable may be garbage at that
// point (on a good day, you might get "pure virtual method called").
//
// The idea to solve this problem is we always leak PyInterpreters (so they
// always stay live even after dlclose), and make sure we can disarm their
// virtual methods by indirecting through a separate PyInterpreterVTable
// object.  This can be replaced with a no-op vtable from libc10.so, which
// is guaranteed to stick around until the bitter end.
//
// NB: The downside with representing PyInterpreter tags as full objects is that
// it takes an extra word on TensorImpl.  If tags were instead just integer
// indices, on 64-bit architectures we could pack the tag and PyObject together
// into a single atomic word.  On 32-bit architectures we could simply say that
// only one Python interpreter is supported (erroring if a nontrivial
// interpreter tag is attempted to be set).
//
// The difficulty with this scheme is we need to maintain an out-of-line table
// to get at the PyInterpreters so that we can do virtual method calls on them,
// and registration/deregistration to this table must be done in a thread safe
// manner.  This can be easily done if the number of possible PyInterpreters is
// small enough (e.g., 8-bit integer) by simply preallocating an array of
// sufficient size to hold all possible interpreters.  Surely 128 threads is
// more than enough for anyone!
//
// I didn't decide to do this technique at the moment, because the extra word
// added by the PyInterpreter tag takes us to 24 words, which means that we
// still fit inside three eight word cache lines.  If you need to penny pinch
// another word consider doing this!

@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PyInterpreterVTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyInterpreterVTable(Pointer p) { super(p); }


  // Report the name of this interpreter
  public native @StdString BytePointer name();

  // Run Py_DECREF on a PyObject.  We DO NOT assume the GIL is held on call
  // See NOTE [PyInterpreter::decref takes a `has_pyobj_slot` arg]
  public native void decref(@Cast("PyObject*") Pointer pyobj, @Cast("bool") boolean has_pyobj_slot);

  // Perform a detach by deferring to the __torch_dispatch__ implementation of
  // detach, which will also arrange for the PyObject to get copied in this
  // situation
  public native @ByVal TensorImplPtr detach(
        @Const TensorImpl self);

  // Invoke the Python boxed fallback dispatch to go back into Python
  public native void dispatch(@Const @ByRef OperatorHandle op, IValueVector stack);

  public native void reportErrorCallback(@Cast("PyObject*") Pointer callback, DispatchKey key);
  public native void reportErrorCallback(@Cast("PyObject*") Pointer callback, @Cast("c10::DispatchKey") short key);

  // This is only invoked in the multipy/torchdeploy situation from
  // pythonOpRegistrationTrampoline; this lets us get to the Python
  // interpreter to actually find the appropriate Python op registration
  // entry to call.
  public native void python_op_registration_trampoline(
        @Const @ByRef OperatorHandle op,
        DispatchKey arg1,
        IValueVector stack);
  public native void python_op_registration_trampoline(
        @Const @ByRef OperatorHandle op,
        @Cast("c10::DispatchKey") short arg1,
        IValueVector stack);

  public native void throw_abstract_impl_not_imported_error(
        @StdString BytePointer opname,
        @Cast("const char*") BytePointer pymodule,
        @Cast("const char*") BytePointer context);
  public native void throw_abstract_impl_not_imported_error(
        @StdString String opname,
        String pymodule,
        String context);

  // Invoke the Python dispatcher to handle this call
  public native void python_dispatcher(
        @Const @ByRef OperatorHandle op,
        @ByVal DispatchKeySet arg1,
        IValueVector stack);

  public native @Cast("bool") boolean is_contiguous(@Const TensorImpl self, @ByVal MemoryFormat arg1);
  public native @Cast("bool") boolean is_strides_like(@Const TensorImpl self, @ByVal MemoryFormat arg1);
  public native @Cast("bool") boolean is_non_overlapping_and_dense(@Const TensorImpl self);
  public native @ByVal Device device(@Const TensorImpl self);
  public native @Cast("int64_t") long dim(@Const TensorImpl self);
  public native @ByVal LongArrayRef strides(@Const TensorImpl self);
  public native @ByVal LongArrayRef sizes(@Const TensorImpl self);
  public native @ByVal SymIntArrayRef sym_sizes(@Const TensorImpl self);
  public native Layout layout(@Const TensorImpl self);
  public native @Cast("int64_t") long numel(@Const TensorImpl self);
  public native @ByVal SymInt sym_numel(@Const TensorImpl self);
  public native @ByVal SymIntArrayRef sym_strides(@Const TensorImpl self);
  public native @ByVal SymInt sym_storage_offset(@Const TensorImpl self);

  public native void trace_gpu_event_creation(@Cast("uintptr_t") long event);
  public native void trace_gpu_event_deletion(@Cast("uintptr_t") long event);
  public native void trace_gpu_event_record(@Cast("uintptr_t") long event, @Cast("uintptr_t") long stream);
  public native void trace_gpu_event_wait(@Cast("uintptr_t") long event, @Cast("uintptr_t") long stream);
  public native void trace_gpu_memory_allocation(@Cast("uintptr_t") long ptr);
  public native void trace_gpu_memory_deallocation(@Cast("uintptr_t") long ptr);
  public native void trace_gpu_stream_creation(@Cast("uintptr_t") long stream);
  public native void trace_gpu_device_synchronization();
  public native void trace_gpu_stream_synchronization(@Cast("uintptr_t") long stream);
  public native void trace_gpu_event_synchronization(@Cast("uintptr_t") long event);

  public native void reset_backward_hooks(@Const TensorImpl self);
}
