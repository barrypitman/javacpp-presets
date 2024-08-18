// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// end_ntoshvp

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class XSAVE_AREA_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XSAVE_AREA_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XSAVE_AREA_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XSAVE_AREA_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XSAVE_AREA_HEADER position(long position) {
        return (XSAVE_AREA_HEADER)super.position(position);
    }
    @Override public XSAVE_AREA_HEADER getPointer(long i) {
        return new XSAVE_AREA_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD64") long Mask(); public native XSAVE_AREA_HEADER Mask(long setter);
    public native @Cast("DWORD64") long Reserved(int i); public native XSAVE_AREA_HEADER Reserved(int i, long setter);
    @MemberGetter public native @Cast("DWORD64*") LongPointer Reserved();
}
