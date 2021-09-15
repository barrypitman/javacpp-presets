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
 * Clock Monitor error types
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlClkMonFaultInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlClkMonFaultInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlClkMonFaultInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlClkMonFaultInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlClkMonFaultInfo_t position(long position) {
        return (nvmlClkMonFaultInfo_t)super.position(position);
    }
    @Override public nvmlClkMonFaultInfo_t getPointer(long i) {
        return new nvmlClkMonFaultInfo_t((Pointer)this).offsetAddress(i);
    }

    /**
     * The Domain which faulted
     */
    public native @Cast("unsigned int") int clkApiDomain(); public native nvmlClkMonFaultInfo_t clkApiDomain(int setter);

    /**
     * Faults Information
     */
    public native @Cast("unsigned int") int clkDomainFaultMask(); public native nvmlClkMonFaultInfo_t clkDomainFaultMask(int setter);
}
