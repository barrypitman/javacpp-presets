// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Static S-class unit info.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlUnitInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlUnitInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlUnitInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlUnitInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlUnitInfo_t position(long position) {
        return (nvmlUnitInfo_t)super.position(position);
    }
    @Override public nvmlUnitInfo_t getPointer(long i) {
        return new nvmlUnitInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Product name */
    public native @Cast("char") byte name(int i); public native nvmlUnitInfo_t name(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer name();
    /** Product identifier */
    public native @Cast("char") byte id(int i); public native nvmlUnitInfo_t id(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer id();
    /** Product serial number */
    public native @Cast("char") byte serial(int i); public native nvmlUnitInfo_t serial(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer serial();
    /** Firmware version */
    public native @Cast("char") byte firmwareVersion(int i); public native nvmlUnitInfo_t firmwareVersion(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer firmwareVersion();
}
