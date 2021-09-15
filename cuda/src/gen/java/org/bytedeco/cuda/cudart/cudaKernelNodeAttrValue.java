// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Graph kernel node attributes union, used with ::cudaGraphKernelNodeSetAttribute/::cudaGraphKernelNodeGetAttribute
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaKernelNodeAttrValue extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaKernelNodeAttrValue() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaKernelNodeAttrValue(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaKernelNodeAttrValue(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaKernelNodeAttrValue position(long position) {
        return (cudaKernelNodeAttrValue)super.position(position);
    }
    @Override public cudaKernelNodeAttrValue getPointer(long i) {
        return new cudaKernelNodeAttrValue((Pointer)this).offsetAddress(i);
    }

    /** Attribute ::CUaccessPolicyWindow. */
    public native @ByRef cudaAccessPolicyWindow accessPolicyWindow(); public native cudaKernelNodeAttrValue accessPolicyWindow(cudaAccessPolicyWindow setter);
    public native int cooperative(); public native cudaKernelNodeAttrValue cooperative(int setter);
}
