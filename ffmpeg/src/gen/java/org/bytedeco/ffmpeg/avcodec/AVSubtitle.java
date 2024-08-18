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


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVSubtitle extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVSubtitle() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVSubtitle(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVSubtitle(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVSubtitle position(long position) {
        return (AVSubtitle)super.position(position);
    }
    @Override public AVSubtitle getPointer(long i) {
        return new AVSubtitle((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint16_t") short format(); public native AVSubtitle format(short setter); /* 0 = graphics */
    public native @Cast("uint32_t") int start_display_time(); public native AVSubtitle start_display_time(int setter); /* relative to packet pts, in ms */
    public native @Cast("uint32_t") int end_display_time(); public native AVSubtitle end_display_time(int setter); /* relative to packet pts, in ms */
    public native @Cast("unsigned") int num_rects(); public native AVSubtitle num_rects(int setter);
    public native AVSubtitleRect rects(int i); public native AVSubtitle rects(int i, AVSubtitleRect setter);
    public native @Cast("AVSubtitleRect**") PointerPointer rects(); public native AVSubtitle rects(PointerPointer setter);
    /** Same as packet pts, in AV_TIME_BASE */
    public native @Cast("int64_t") long pts(); public native AVSubtitle pts(long setter);
}
