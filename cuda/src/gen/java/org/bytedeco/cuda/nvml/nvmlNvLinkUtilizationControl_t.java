// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** 
 * Struct to define the NVLINK counter controls
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlNvLinkUtilizationControl_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlNvLinkUtilizationControl_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlNvLinkUtilizationControl_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlNvLinkUtilizationControl_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlNvLinkUtilizationControl_t position(long position) {
        return (nvmlNvLinkUtilizationControl_t)super.position(position);
    }

    public native @Cast("nvmlNvLinkUtilizationCountUnits_t") int units(); public native nvmlNvLinkUtilizationControl_t units(int setter);
    public native @Cast("nvmlNvLinkUtilizationCountPktTypes_t") int pktfilter(); public native nvmlNvLinkUtilizationControl_t pktfilter(int setter);
}
