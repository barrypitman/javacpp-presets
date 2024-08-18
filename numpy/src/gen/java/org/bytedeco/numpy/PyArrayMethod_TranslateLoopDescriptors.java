// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/**
 * The function to convert the actual loop descriptors (as returned by the
 * original {@code resolve_descriptors} function) to the ones the output array
 * should use.
 * This function must return "viewable" types, it must not mutate them in any
 * form that would break the inner-loop logic.  Does not need to support NULL.
 *
 * The function must clean up on error.
 *
 * @param nargs Number of arguments
 * @param new_dtypes The DTypes of the output (usually probably not needed)
 * @param given_descrs Original given_descrs to the resolver, necessary to
 *        fetch any information related to the new dtypes from the original.
 * @param original_descrs The {@code loop_descrs} returned by the wrapped loop.
 * @param loop_descrs The output descriptors, compatible to {@code original_descrs}.
 *
 * @return 0 on success, -1 on failure.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayMethod_TranslateLoopDescriptors extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArrayMethod_TranslateLoopDescriptors(Pointer p) { super(p); }
    protected PyArrayMethod_TranslateLoopDescriptors() { allocate(); }
    private native void allocate();
    public native int call(int nin, int nout,
        @Cast("PyArray_DTypeMeta*const*") PointerPointer new_dtypes, @Cast("PyArray_Descr*const*") PointerPointer given_descrs,
        @Cast("PyArray_Descr**") PointerPointer original_descrs, @Cast("PyArray_Descr**") PointerPointer loop_descrs);
}
