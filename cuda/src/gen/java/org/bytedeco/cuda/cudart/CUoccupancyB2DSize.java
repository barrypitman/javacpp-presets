// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Block size to per-block dynamic shared memory mapping for a certain
 * kernel @param blockSize Block size of the kernel.
 *
 * @return The dynamic shared memory needed by a block.
 */
@Convention("CUDA_CB") @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUoccupancyB2DSize extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CUoccupancyB2DSize(Pointer p) { super(p); }
    protected CUoccupancyB2DSize() { allocate(); }
    private native void allocate();
    public native @Cast("size_t") long call(int blockSize);
}
