// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Struct to hold perf policy violation status data
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlViolationTime_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlViolationTime_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlViolationTime_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlViolationTime_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlViolationTime_t position(long position) {
        return (nvmlViolationTime_t)super.position(position);
    }
    @Override public nvmlViolationTime_t getPointer(long i) {
        return new nvmlViolationTime_t((Pointer)this).offsetAddress(i);
    }

    /** referenceTime represents CPU timestamp in microseconds */
    public native @Cast("unsigned long long") long referenceTime(); public native nvmlViolationTime_t referenceTime(long setter);
    /** violationTime in Nanoseconds */
    public native @Cast("unsigned long long") long violationTime(); public native nvmlViolationTime_t violationTime(long setter);
}
