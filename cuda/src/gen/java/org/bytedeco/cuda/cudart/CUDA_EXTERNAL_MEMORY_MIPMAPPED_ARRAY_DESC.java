// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External memory mipmap descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC position(long position) {
        return (CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC)super.position(position);
    }

    /**
     * Offset into the memory object where the base level of the
     * mipmap chain is.
     */
    public native @Cast("unsigned long long") long offset(); public native CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC offset(long setter);
    /**
     * Format, dimension and type of base level of the mipmap chain
     */
    public native @ByRef CUDA_ARRAY3D_DESCRIPTOR arrayDesc(); public native CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC arrayDesc(CUDA_ARRAY3D_DESCRIPTOR setter);
    /**
     * Total number of levels in the mipmap chain
     */
    public native @Cast("unsigned int") int numLevels(); public native CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC numLevels(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
