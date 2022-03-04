// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA IPC event handle
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUipcEventHandle_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUipcEventHandle_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUipcEventHandle_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUipcEventHandle_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUipcEventHandle_v1 position(long position) {
        return (CUipcEventHandle_v1)super.position(position);
    }
    @Override public CUipcEventHandle_v1 getPointer(long i) {
        return new CUipcEventHandle_v1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte reserved(int i); public native CUipcEventHandle_v1 reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
