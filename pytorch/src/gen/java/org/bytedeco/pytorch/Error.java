// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** The primary ATen error class.
 *  Provides a complete error message with source location information via
 *  {@code what()}, and a more concise message via {@code what_without_backtrace()}.
 *  Don't throw this directly; use TORCH_CHECK/TORCH_INTERNAL_ASSERT instead.
 * 
 *  NB: c10::Error is handled specially by the default torch to suppress the
 *  backtrace, see torch/csrc/Exceptions.h */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Error extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Error(Pointer p) { super(p); }

  // PyTorch-style Error constructor.  NB: the implementation of this
  // is actually in Logging.cpp

  // Caffe2-style error message

  // Base constructor

  // Add some new context to the message stack.  The last added context
  // will be formatted at the end of the context list upon printing.
  // WARNING: This method is O(n) in the size of the stack, so don't go
  // wild adding a ridiculous amount of context to error messages.
  public native void add_context(@StdString BytePointer msg);
  public native void add_context(@StdString String msg);

  public native @StdString BytePointer msg();

  public native @Const @ByRef StringVector context();

  public native @StdString BytePointer backtrace();

  /** Returns the complete error message, including the source location.
   *  The returned pointer is invalidated if you call add_context() on
   *  this object. */
  public native @NoException(true) @Cast("const char*") BytePointer what();

  public native @Const @NoException(true) Pointer caller();

  /** Returns only the error message string, without source location.
   *  The returned pointer is invalidated if you call add_context() on
   *  this object. */
  public native @NoException(true) @Cast("const char*") BytePointer what_without_backtrace();
}
