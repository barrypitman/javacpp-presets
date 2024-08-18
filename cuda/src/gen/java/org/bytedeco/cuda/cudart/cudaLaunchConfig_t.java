// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA extensible launch configuration
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaLaunchConfig_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaLaunchConfig_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaLaunchConfig_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaLaunchConfig_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaLaunchConfig_t position(long position) {
        return (cudaLaunchConfig_t)super.position(position);
    }
    @Override public cudaLaunchConfig_t getPointer(long i) {
        return new cudaLaunchConfig_t((Pointer)this).offsetAddress(i);
    }

    /** Grid dimensions */
    public native @ByRef dim3 gridDim(); public native cudaLaunchConfig_t gridDim(dim3 setter);
    /** Block dimensions */
    public native @ByRef dim3 blockDim(); public native cudaLaunchConfig_t blockDim(dim3 setter);
    /** Dynamic shared-memory size per thread block in bytes */
    public native @Cast("size_t") long dynamicSmemBytes(); public native cudaLaunchConfig_t dynamicSmemBytes(long setter);
    /** Stream identifier */
    public native CUstream_st stream(); public native cudaLaunchConfig_t stream(CUstream_st setter);
    /** List of attributes; nullable if ::cudaLaunchConfig_t::numAttrs == 0 */
    public native cudaLaunchAttribute attrs(); public native cudaLaunchConfig_t attrs(cudaLaunchAttribute setter);
    /** Number of attributes populated in ::cudaLaunchConfig_t::attrs */
    public native @Cast("unsigned int") int numAttrs(); public native cudaLaunchConfig_t numAttrs(int setter);
}
