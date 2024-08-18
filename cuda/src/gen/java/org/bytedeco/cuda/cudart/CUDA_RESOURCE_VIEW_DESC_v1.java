// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Resource view descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_RESOURCE_VIEW_DESC_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_RESOURCE_VIEW_DESC_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_RESOURCE_VIEW_DESC_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_RESOURCE_VIEW_DESC_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_RESOURCE_VIEW_DESC_v1 position(long position) {
        return (CUDA_RESOURCE_VIEW_DESC_v1)super.position(position);
    }
    @Override public CUDA_RESOURCE_VIEW_DESC_v1 getPointer(long i) {
        return new CUDA_RESOURCE_VIEW_DESC_v1((Pointer)this).offsetAddress(i);
    }

    /** Resource view format */
    public native @Cast("CUresourceViewFormat") int format(); public native CUDA_RESOURCE_VIEW_DESC_v1 format(int setter);
    /** Width of the resource view */
    public native @Cast("size_t") long width(); public native CUDA_RESOURCE_VIEW_DESC_v1 width(long setter);
    /** Height of the resource view */
    public native @Cast("size_t") long height(); public native CUDA_RESOURCE_VIEW_DESC_v1 height(long setter);
    /** Depth of the resource view */
    public native @Cast("size_t") long depth(); public native CUDA_RESOURCE_VIEW_DESC_v1 depth(long setter);
    /** First defined mipmap level */
    public native @Cast("unsigned int") int firstMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC_v1 firstMipmapLevel(int setter);
    /** Last defined mipmap level */
    public native @Cast("unsigned int") int lastMipmapLevel(); public native CUDA_RESOURCE_VIEW_DESC_v1 lastMipmapLevel(int setter);
    /** First layer index */
    public native @Cast("unsigned int") int firstLayer(); public native CUDA_RESOURCE_VIEW_DESC_v1 firstLayer(int setter);
    /** Last layer index */
    public native @Cast("unsigned int") int lastLayer(); public native CUDA_RESOURCE_VIEW_DESC_v1 lastLayer(int setter);
    public native @Cast("unsigned int") int reserved(int i); public native CUDA_RESOURCE_VIEW_DESC_v1 reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
