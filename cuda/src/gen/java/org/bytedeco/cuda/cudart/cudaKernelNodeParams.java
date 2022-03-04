// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA GPU kernel node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaKernelNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaKernelNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaKernelNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaKernelNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaKernelNodeParams position(long position) {
        return (cudaKernelNodeParams)super.position(position);
    }
    @Override public cudaKernelNodeParams getPointer(long i) {
        return new cudaKernelNodeParams((Pointer)this).offsetAddress(i);
    }

    /** Kernel to launch */
    public native Pointer func(); public native cudaKernelNodeParams func(Pointer setter);
    /** Grid dimensions */
    public native @ByRef dim3 gridDim(); public native cudaKernelNodeParams gridDim(dim3 setter);
    /** Block dimensions */
    public native @ByRef dim3 blockDim(); public native cudaKernelNodeParams blockDim(dim3 setter);
    /** Dynamic shared-memory size per thread block in bytes */
    public native @Cast("unsigned int") int sharedMemBytes(); public native cudaKernelNodeParams sharedMemBytes(int setter);
    /** Array of pointers to individual kernel arguments*/
    public native Pointer kernelParams(int i); public native cudaKernelNodeParams kernelParams(int i, Pointer setter);
    public native @Cast("void**") PointerPointer kernelParams(); public native cudaKernelNodeParams kernelParams(PointerPointer setter);
    /** Pointer to kernel arguments in the "extra" format */
    public native Pointer extra(int i); public native cudaKernelNodeParams extra(int i, Pointer setter);
    public native @Cast("void**") PointerPointer extra(); public native cudaKernelNodeParams extra(PointerPointer setter);
}
