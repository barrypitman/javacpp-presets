// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_mask_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_mask_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_mask_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_mask_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_mask_t position(long position) {
        return (sk_mask_t)super.position(position);
    }

    public native @Cast("uint8_t*") BytePointer fImage(); public native sk_mask_t fImage(BytePointer setter);
    public native @ByRef sk_irect_t fBounds(); public native sk_mask_t fBounds(sk_irect_t setter);
    public native @Cast("uint32_t") int fRowBytes(); public native sk_mask_t fRowBytes(int setter);
    public native @Cast("sk_mask_format_t") int fFormat(); public native sk_mask_t fFormat(int setter);
}
