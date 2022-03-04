// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* Specifies the allocation properties for a allocation.
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemAllocationProp_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemAllocationProp_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemAllocationProp_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemAllocationProp_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemAllocationProp_v1 position(long position) {
        return (CUmemAllocationProp_v1)super.position(position);
    }
    @Override public CUmemAllocationProp_v1 getPointer(long i) {
        return new CUmemAllocationProp_v1((Pointer)this).offsetAddress(i);
    }

    /** Allocation type */
    public native @Cast("CUmemAllocationType") int type(); public native CUmemAllocationProp_v1 type(int setter);
    /** requested ::CUmemAllocationHandleType */
    public native @Cast("CUmemAllocationHandleType") int requestedHandleTypes(); public native CUmemAllocationProp_v1 requestedHandleTypes(int setter);
    /** Location of allocation */
    public native @ByRef @Cast("CUmemLocation*") CUmemLocation_v1 location(); public native CUmemAllocationProp_v1 location(CUmemLocation_v1 setter);
    /**
     * Windows-specific POBJECT_ATTRIBUTES required when
     * ::CU_MEM_HANDLE_TYPE_WIN32 is specified.  This object atributes structure
     * includes security attributes that define
     * the scope of which exported allocations may be tranferred to other
     * processes.  In all other cases, this field is required to be zero.
     */
    public native Pointer win32HandleMetaData(); public native CUmemAllocationProp_v1 win32HandleMetaData(Pointer setter);
         /**
         * Allocation hint for requesting compressible memory.
         * On devices that support Compute Data Compression, compressible
         * memory can be used to accelerate accesses to data with unstructured
         * sparsity and other compressible data patterns. Applications are 
         * expected to query allocation property of the handle obtained with 
         * ::cuMemCreate using ::cuMemGetAllocationPropertiesFromHandle to 
         * validate if the obtained allocation is compressible or not. Note that 
         * compressed memory may not be mappable on all devices.
         */
         @Name("allocFlags.compressionType") public native @Cast("unsigned char") byte allocFlags_compressionType(); public native CUmemAllocationProp_v1 allocFlags_compressionType(byte setter);
         @Name("allocFlags.gpuDirectRDMACapable") public native @Cast("unsigned char") byte allocFlags_gpuDirectRDMACapable(); public native CUmemAllocationProp_v1 allocFlags_gpuDirectRDMACapable(byte setter);
         /** Bitmask indicating intended usage for this allocation */
         @Name("allocFlags.usage") public native @Cast("unsigned short") short allocFlags_usage(); public native CUmemAllocationProp_v1 allocFlags_usage(short setter);
         @Name("allocFlags.reserved") public native @Cast("unsigned char") byte allocFlags_reserved(int i); public native CUmemAllocationProp_v1 allocFlags_reserved(int i, byte setter);
         @Name("allocFlags.reserved") @MemberGetter public native @Cast("unsigned char*") BytePointer allocFlags_reserved();
}
