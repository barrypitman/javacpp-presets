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
 * \}
 */

/**
 * \defgroup lavc_packet AVPacket
 *
 * Types and functions for working with AVPacket.
 * \{
 */

/**
 * This structure stores compressed data. It is typically exported by demuxers
 * and then passed as input to decoders, or received as output from encoders and
 * then passed to muxers.
 *
 * For video, it should typically contain one compressed frame. For audio it may
 * contain several compressed frames. Encoders are allowed to output empty
 * packets, with no compressed data, containing only side data
 * (e.g. to update some stream parameters at the end of encoding).
 *
 * The semantics of data ownership depends on the buf field.
 * If it is set, the packet data is dynamically allocated and is
 * valid indefinitely until a call to av_packet_unref() reduces the
 * reference count to 0.
 *
 * If the buf field is not set av_packet_ref() would make a copy instead
 * of increasing the reference count.
 *
 * The side data is always allocated with av_malloc(), copied by
 * av_packet_ref() and freed by av_packet_unref().
 *
 * sizeof(AVPacket) being a part of the public ABI is deprecated. once
 * av_init_packet() is removed, new packets will only be able to be allocated
 * with av_packet_alloc(), and new fields may be added to the end of the struct
 * with a minor bump.
 *
 * @see av_packet_alloc
 * @see av_packet_ref
 * @see av_packet_unref
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVPacket extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacket() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVPacket(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacket(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVPacket position(long position) {
        return (AVPacket)super.position(position);
    }
    @Override public AVPacket getPointer(long i) {
        return new AVPacket((Pointer)this).offsetAddress(i);
    }

    /**
     * A reference to the reference-counted buffer where the packet data is
     * stored.
     * May be NULL, then the packet data is not reference-counted.
     */
    public native AVBufferRef buf(); public native AVPacket buf(AVBufferRef setter);
    /**
     * Presentation timestamp in AVStream->time_base units; the time at which
     * the decompressed packet will be presented to the user.
     * Can be AV_NOPTS_VALUE if it is not stored in the file.
     * pts MUST be larger or equal to dts as presentation cannot happen before
     * decompression, unless one wants to view hex dumps. Some formats misuse
     * the terms dts and pts/cts to mean something different. Such timestamps
     * must be converted to true pts/dts before they are stored in AVPacket.
     */
    public native @Cast("int64_t") long pts(); public native AVPacket pts(long setter);
    /**
     * Decompression timestamp in AVStream->time_base units; the time at which
     * the packet is decompressed.
     * Can be AV_NOPTS_VALUE if it is not stored in the file.
     */
    public native @Cast("int64_t") long dts(); public native AVPacket dts(long setter);
    public native @Cast("uint8_t*") BytePointer data(); public native AVPacket data(BytePointer setter);
    public native int size(); public native AVPacket size(int setter);
    public native int stream_index(); public native AVPacket stream_index(int setter);
    /**
     * A combination of AV_PKT_FLAG values
     */
    public native int flags(); public native AVPacket flags(int setter);
    /**
     * Additional packet data that can be provided by the container.
     * Packet can contain several types of side information.
     */
    public native AVPacketSideData side_data(); public native AVPacket side_data(AVPacketSideData setter);
    public native int side_data_elems(); public native AVPacket side_data_elems(int setter);

    /**
     * Duration of this packet in AVStream->time_base units, 0 if unknown.
     * Equals next_pts - this_pts in presentation order.
     */
    public native @Cast("int64_t") long duration(); public native AVPacket duration(long setter);

    /** byte position in stream, -1 if unknown */
    public native @Cast("int64_t") long pos(); public native AVPacket pos(long setter);

    /**
     * for some private data of the user
     */
    public native Pointer opaque(); public native AVPacket opaque(Pointer setter);

    /**
     * AVBufferRef for free use by the API user. FFmpeg will never check the
     * contents of the buffer ref. FFmpeg calls av_buffer_unref() on it when
     * the packet is unreferenced. av_packet_copy_props() calls create a new
     * reference with av_buffer_ref() for the target packet's opaque_ref field.
     *
     * This is unrelated to the opaque field, although it serves a similar
     * purpose.
     */
    public native AVBufferRef opaque_ref(); public native AVPacket opaque_ref(AVBufferRef setter);

    /**
     * Time base of the packet's timestamps.
     * In the future, this field may be set on packets output by encoders or
     * demuxers, but its value will be by default ignored on input to decoders
     * or muxers.
     */
    public native @ByRef AVRational time_base(); public native AVPacket time_base(AVRational setter);
}
