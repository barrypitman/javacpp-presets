// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Host node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_HOST_NODE_PARAMS_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_HOST_NODE_PARAMS_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_HOST_NODE_PARAMS_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_HOST_NODE_PARAMS_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_HOST_NODE_PARAMS_v1 position(long position) {
        return (CUDA_HOST_NODE_PARAMS_v1)super.position(position);
    }
    @Override public CUDA_HOST_NODE_PARAMS_v1 getPointer(long i) {
        return new CUDA_HOST_NODE_PARAMS_v1((Pointer)this).offsetAddress(i);
    }

    /** The function to call when the node executes */
    public native CUhostFn fn(); public native CUDA_HOST_NODE_PARAMS_v1 fn(CUhostFn setter);
    /** Argument to pass to the function */
    public native Pointer userData(); public native CUDA_HOST_NODE_PARAMS_v1 userData(Pointer setter);
}
