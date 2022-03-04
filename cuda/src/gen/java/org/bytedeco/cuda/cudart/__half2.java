// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/* Global-space operator functions are only available to nvcc compilation */
// #if defined(__CUDACC__)
// #endif /* defined(__CUDACC__) */

/* __half2 is visible to non-nvcc host compilers */
@NoOffset @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __half2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __half2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public __half2 position(long position) {
        return (__half2)super.position(position);
    }
    @Override public __half2 getPointer(long i) {
        return new __half2((Pointer)this).offsetAddress(i);
    }

    public native @ByRef __half x(); public native __half2 x(__half setter);
    public native @ByRef __half y(); public native __half2 y(__half setter);
// #if defined(__CPP_VERSION_AT_LEAST_11_FP16)
    public __half2() { super((Pointer)null); allocate(); }
    private native void allocate();
    public __half2(@Const @ByRef(true) __half2 src) { super((Pointer)null); allocate(src); }
    private native void allocate(@Const @ByRef(true) __half2 src);
    public native @ByRef @Name("operator =") __half2 put(@Const @ByRef(true) __half2 src);
// #else
// #endif /* defined(__CPP_VERSION_AT_LEAST_11_FP16) */
    public __half2(@Const @ByRef __half a, @Const @ByRef __half b) { super((Pointer)null); allocate(a, b); }
    private native void allocate(@Const @ByRef __half a, @Const @ByRef __half b);

    /* Convert to/from __half2_raw */
    public __half2(@Const @ByRef __half2_raw h2r ) { super((Pointer)null); allocate(h2r); }
    private native void allocate(@Const @ByRef __half2_raw h2r );
    public native @ByRef @Name("operator =") __half2 put(@Const @ByRef __half2_raw h2r);
    public native @ByVal @Name("operator __half2_raw") __half2_raw as__half2_raw();
}
