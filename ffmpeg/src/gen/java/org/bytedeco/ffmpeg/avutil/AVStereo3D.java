// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Stereo 3D type: this structure describes how two videos are packed
 * within a single video surface, with additional information as needed.
 *
 * \note The struct must be allocated with av_stereo3d_alloc() and
 *       its size is not a part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVStereo3D extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVStereo3D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVStereo3D(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVStereo3D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVStereo3D position(long position) {
        return (AVStereo3D)super.position(position);
    }
    @Override public AVStereo3D getPointer(long i) {
        return new AVStereo3D((Pointer)this).offsetAddress(i);
    }

    /**
     * How views are packed within the video.
     */
    public native @Cast("AVStereo3DType") int type(); public native AVStereo3D type(int setter);

    /**
     * Additional information about the frame packing.
     */
    public native int flags(); public native AVStereo3D flags(int setter);

    /**
     * Determines which views are packed.
     */
    public native @Cast("AVStereo3DView") int view(); public native AVStereo3D view(int setter);
}
