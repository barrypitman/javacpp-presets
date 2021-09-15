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
 * PCI information about a GPU device.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlPciInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlPciInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlPciInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlPciInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlPciInfo_t position(long position) {
        return (nvmlPciInfo_t)super.position(position);
    }
    @Override public nvmlPciInfo_t getPointer(long i) {
        return new nvmlPciInfo_t((Pointer)this).offsetAddress(i);
    }

    /** The legacy tuple domain:bus:device.function PCI identifier (&amp; NULL terminator) */
    public native @Cast("char") byte busIdLegacy(int i); public native nvmlPciInfo_t busIdLegacy(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer busIdLegacy();
    /** The PCI domain on which the device's bus resides, 0 to 0xffffffff */
    public native @Cast("unsigned int") int domain(); public native nvmlPciInfo_t domain(int setter);
    /** The bus on which the device resides, 0 to 0xff */
    public native @Cast("unsigned int") int bus(); public native nvmlPciInfo_t bus(int setter);
    /** The device's id on the bus, 0 to 31 */
    public native @Cast("unsigned int") int device(); public native nvmlPciInfo_t device(int setter);
    /** The combined 16-bit device id and 16-bit vendor id */
    public native @Cast("unsigned int") int pciDeviceId(); public native nvmlPciInfo_t pciDeviceId(int setter);

    // Added in NVML 2.285 API
    /** The 32-bit Sub System Device ID */
    public native @Cast("unsigned int") int pciSubSystemId(); public native nvmlPciInfo_t pciSubSystemId(int setter);

    /** The tuple domain:bus:device.function PCI identifier (&amp; NULL terminator) */
    public native @Cast("char") byte busId(int i); public native nvmlPciInfo_t busId(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer busId();
}
