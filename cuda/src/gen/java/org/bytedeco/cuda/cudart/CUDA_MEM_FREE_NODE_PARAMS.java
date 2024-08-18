// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memory free node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEM_FREE_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEM_FREE_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEM_FREE_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEM_FREE_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEM_FREE_NODE_PARAMS position(long position) {
        return (CUDA_MEM_FREE_NODE_PARAMS)super.position(position);
    }
    @Override public CUDA_MEM_FREE_NODE_PARAMS getPointer(long i) {
        return new CUDA_MEM_FREE_NODE_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** in: the pointer to free */
    public native @Cast("CUdeviceptr") long dptr(); public native CUDA_MEM_FREE_NODE_PARAMS dptr(long setter);
}
