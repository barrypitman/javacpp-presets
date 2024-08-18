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
 * GPU instance profile information.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuInstanceProfileInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuInstanceProfileInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuInstanceProfileInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuInstanceProfileInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuInstanceProfileInfo_t position(long position) {
        return (nvmlGpuInstanceProfileInfo_t)super.position(position);
    }
    @Override public nvmlGpuInstanceProfileInfo_t getPointer(long i) {
        return new nvmlGpuInstanceProfileInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Unique profile ID within the device */
    public native @Cast("unsigned int") int id(); public native nvmlGpuInstanceProfileInfo_t id(int setter);
    /** Peer-to-Peer support */
    public native @Cast("unsigned int") int isP2pSupported(); public native nvmlGpuInstanceProfileInfo_t isP2pSupported(int setter);
    /** GPU Slice count */
    public native @Cast("unsigned int") int sliceCount(); public native nvmlGpuInstanceProfileInfo_t sliceCount(int setter);
    /** GPU instance count */
    public native @Cast("unsigned int") int instanceCount(); public native nvmlGpuInstanceProfileInfo_t instanceCount(int setter);
    /** Streaming Multiprocessor count */
    public native @Cast("unsigned int") int multiprocessorCount(); public native nvmlGpuInstanceProfileInfo_t multiprocessorCount(int setter);
    /** Copy Engine count */
    public native @Cast("unsigned int") int copyEngineCount(); public native nvmlGpuInstanceProfileInfo_t copyEngineCount(int setter);
    /** Decoder Engine count */
    public native @Cast("unsigned int") int decoderCount(); public native nvmlGpuInstanceProfileInfo_t decoderCount(int setter);
    /** Encoder Engine count */
    public native @Cast("unsigned int") int encoderCount(); public native nvmlGpuInstanceProfileInfo_t encoderCount(int setter);
    /** JPEG Engine count */
    public native @Cast("unsigned int") int jpegCount(); public native nvmlGpuInstanceProfileInfo_t jpegCount(int setter);
    /** OFA Engine count */
    public native @Cast("unsigned int") int ofaCount(); public native nvmlGpuInstanceProfileInfo_t ofaCount(int setter);
    /** Memory size in MBytes */
    public native @Cast("unsigned long long") long memorySizeMB(); public native nvmlGpuInstanceProfileInfo_t memorySizeMB(long setter);
}
