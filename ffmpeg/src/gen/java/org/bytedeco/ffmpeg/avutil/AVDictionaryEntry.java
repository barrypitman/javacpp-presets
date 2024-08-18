// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

/**
 * \}
 */

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVDictionaryEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDictionaryEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDictionaryEntry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDictionaryEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDictionaryEntry position(long position) {
        return (AVDictionaryEntry)super.position(position);
    }
    @Override public AVDictionaryEntry getPointer(long i) {
        return new AVDictionaryEntry((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char*") BytePointer key(); public native AVDictionaryEntry key(BytePointer setter);
    public native @Cast("char*") BytePointer value(); public native AVDictionaryEntry value(BytePointer setter);
}
