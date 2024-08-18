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
 * Structure to store the vGPU scheduler capabilities
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuSchedulerCapabilities_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuSchedulerCapabilities_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuSchedulerCapabilities_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuSchedulerCapabilities_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuSchedulerCapabilities_t position(long position) {
        return (nvmlVgpuSchedulerCapabilities_t)super.position(position);
    }
    @Override public nvmlVgpuSchedulerCapabilities_t getPointer(long i) {
        return new nvmlVgpuSchedulerCapabilities_t((Pointer)this).offsetAddress(i);
    }

    /** List the supported vGPU schedulers on the device */
    public native @Cast("unsigned int") int supportedSchedulers(int i); public native nvmlVgpuSchedulerCapabilities_t supportedSchedulers(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer supportedSchedulers();
    /** Maximum timeslice value in ns */
    public native @Cast("unsigned int") int maxTimeslice(); public native nvmlVgpuSchedulerCapabilities_t maxTimeslice(int setter);
    /** Minimum timeslice value in ns */
    public native @Cast("unsigned int") int minTimeslice(); public native nvmlVgpuSchedulerCapabilities_t minTimeslice(int setter);
    /** Flag to check Adaptive Round Robin mode enabled/disabled. */
    public native @Cast("unsigned int") int isArrModeSupported(); public native nvmlVgpuSchedulerCapabilities_t isArrModeSupported(int setter);
    /** Maximum frequency for Adaptive Round Robin mode */
    public native @Cast("unsigned int") int maxFrequencyForARR(); public native nvmlVgpuSchedulerCapabilities_t maxFrequencyForARR(int setter);
    /** Minimum frequency for Adaptive Round Robin mode */
    public native @Cast("unsigned int") int minFrequencyForARR(); public native nvmlVgpuSchedulerCapabilities_t minFrequencyForARR(int setter);
    /** Maximum averaging factor for Adaptive Round Robin mode */
    public native @Cast("unsigned int") int maxAvgFactorForARR(); public native nvmlVgpuSchedulerCapabilities_t maxAvgFactorForARR(int setter);
    /** Minimum averaging factor for Adaptive Round Robin mode */
    public native @Cast("unsigned int") int minAvgFactorForARR(); public native nvmlVgpuSchedulerCapabilities_t minAvgFactorForARR(int setter);
}
