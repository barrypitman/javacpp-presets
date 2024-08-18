// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Clock offset info.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlClockOffset_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlClockOffset_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlClockOffset_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlClockOffset_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlClockOffset_v1_t position(long position) {
        return (nvmlClockOffset_v1_t)super.position(position);
    }
    @Override public nvmlClockOffset_v1_t getPointer(long i) {
        return new nvmlClockOffset_v1_t((Pointer)this).offsetAddress(i);
    }

    /** The version number of this struct */
    public native @Cast("unsigned int") int version(); public native nvmlClockOffset_v1_t version(int setter);
    public native @Cast("nvmlClockType_t") int type(); public native nvmlClockOffset_v1_t type(int setter);
    public native @Cast("nvmlPstates_t") int pstate(); public native nvmlClockOffset_v1_t pstate(int setter);
    public native int clockOffsetMHz(); public native nvmlClockOffset_v1_t clockOffsetMHz(int setter);
    public native int minClockOffsetMHz(); public native nvmlClockOffset_v1_t minClockOffsetMHz(int setter);
    public native int maxClockOffsetMHz(); public native nvmlClockOffset_v1_t maxClockOffsetMHz(int setter);
}
