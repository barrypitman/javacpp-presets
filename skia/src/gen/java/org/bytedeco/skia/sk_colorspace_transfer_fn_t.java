// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_colorspace_transfer_fn_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_colorspace_transfer_fn_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_colorspace_transfer_fn_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_colorspace_transfer_fn_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_colorspace_transfer_fn_t position(long position) {
        return (sk_colorspace_transfer_fn_t)super.position(position);
    }

    public native float fG(); public native sk_colorspace_transfer_fn_t fG(float setter);
    public native float fA(); public native sk_colorspace_transfer_fn_t fA(float setter);
    public native float fB(); public native sk_colorspace_transfer_fn_t fB(float setter);
    public native float fC(); public native sk_colorspace_transfer_fn_t fC(float setter);
    public native float fD(); public native sk_colorspace_transfer_fn_t fD(float setter);
    public native float fE(); public native sk_colorspace_transfer_fn_t fE(float setter);
    public native float fF(); public native sk_colorspace_transfer_fn_t fF(float setter);
}
