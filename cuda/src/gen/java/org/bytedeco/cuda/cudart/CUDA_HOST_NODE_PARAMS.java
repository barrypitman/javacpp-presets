// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Host node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_HOST_NODE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_HOST_NODE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_HOST_NODE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_HOST_NODE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_HOST_NODE_PARAMS position(long position) {
        return (CUDA_HOST_NODE_PARAMS)super.position(position);
    }

    /** The function to call when the node executes */
    public native CUhostFn fn(); public native CUDA_HOST_NODE_PARAMS fn(CUhostFn setter);
    /** Argument to pass to the function */
    public native Pointer userData(); public native CUDA_HOST_NODE_PARAMS userData(Pointer setter);
}
