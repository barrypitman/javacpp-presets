// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUuuid_st extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUuuid_st() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUuuid_st(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUuuid_st(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUuuid_st position(long position) {
        return (CUuuid_st)super.position(position);
    }
    @Override public CUuuid_st getPointer(long i) {
        return new CUuuid_st((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte bytes(int i); public native CUuuid_st bytes(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer bytes();
}
