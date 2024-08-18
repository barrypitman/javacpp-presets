// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


/**
 * This structure describes the bitrate properties of an encoded bitstream. It
 * roughly corresponds to a subset the VBV parameters for MPEG-2 or HRD
 * parameters for H.264/HEVC.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVCPBProperties extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVCPBProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVCPBProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCPBProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVCPBProperties position(long position) {
        return (AVCPBProperties)super.position(position);
    }
    @Override public AVCPBProperties getPointer(long i) {
        return new AVCPBProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Maximum bitrate of the stream, in bits per second.
     * Zero if unknown or unspecified.
     */
    public native @Cast("int64_t") long max_bitrate(); public native AVCPBProperties max_bitrate(long setter);
    /**
     * Minimum bitrate of the stream, in bits per second.
     * Zero if unknown or unspecified.
     */
    public native @Cast("int64_t") long min_bitrate(); public native AVCPBProperties min_bitrate(long setter);
    /**
     * Average bitrate of the stream, in bits per second.
     * Zero if unknown or unspecified.
     */
    public native @Cast("int64_t") long avg_bitrate(); public native AVCPBProperties avg_bitrate(long setter);

    /**
     * The size of the buffer to which the ratecontrol is applied, in bits.
     * Zero if unknown or unspecified.
     */
    public native @Cast("int64_t") long buffer_size(); public native AVCPBProperties buffer_size(long setter);

    /**
     * The delay between the time the packet this structure is associated with
     * is received and the time when it should be decoded, in periods of a 27MHz
     * clock.
     *
     * UINT64_MAX when unknown or unspecified.
     */
    public native @Cast("uint64_t") long vbv_delay(); public native AVCPBProperties vbv_delay(long setter);
}
