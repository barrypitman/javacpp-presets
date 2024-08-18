// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// begin_ntoshvp

//
// Define 128-bit 16-byte aligned xmm register type.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class M128A extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public M128A() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public M128A(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public M128A(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public M128A position(long position) {
        return (M128A)super.position(position);
    }
    @Override public M128A getPointer(long i) {
        return new M128A((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONGLONG") long Low(); public native M128A Low(long setter);
    public native @Cast("LONGLONG") long High(); public native M128A High(long setter);
}
