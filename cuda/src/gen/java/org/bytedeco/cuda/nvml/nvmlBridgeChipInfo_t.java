// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Information about the Bridge Chip Firmware
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlBridgeChipInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlBridgeChipInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlBridgeChipInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlBridgeChipInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlBridgeChipInfo_t position(long position) {
        return (nvmlBridgeChipInfo_t)super.position(position);
    }

    /** Type of Bridge Chip  */
    public native @Cast("nvmlBridgeChipType_t") int type(); public native nvmlBridgeChipInfo_t type(int setter);
    /** Firmware Version. 0=Version is unavailable */
    public native @Cast("unsigned int") int fwVersion(); public native nvmlBridgeChipInfo_t fwVersion(int setter);
}
