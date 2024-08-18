// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Launch attribute
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaLaunchAttribute extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaLaunchAttribute() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaLaunchAttribute(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaLaunchAttribute(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaLaunchAttribute position(long position) {
        return (cudaLaunchAttribute)super.position(position);
    }
    @Override public cudaLaunchAttribute getPointer(long i) {
        return new cudaLaunchAttribute((Pointer)this).offsetAddress(i);
    }

    /** Attribute to set */
    public native @Cast("cudaLaunchAttributeID") int id(); public native cudaLaunchAttribute id(int setter);
    public native @Cast("char") byte pad(int i); public native cudaLaunchAttribute pad(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer pad();
    /** Value of the attribute */
    public native @ByRef cudaLaunchAttributeValue val(); public native cudaLaunchAttribute val(cudaLaunchAttributeValue setter);
}
