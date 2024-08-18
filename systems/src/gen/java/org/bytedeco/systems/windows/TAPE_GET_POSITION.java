// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_GET_POSITION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_GET_POSITION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_GET_POSITION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_GET_POSITION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_GET_POSITION position(long position) {
        return (TAPE_GET_POSITION)super.position(position);
    }
    @Override public TAPE_GET_POSITION getPointer(long i) {
        return new TAPE_GET_POSITION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Type(); public native TAPE_GET_POSITION Type(int setter);
    public native @Cast("DWORD") int Partition(); public native TAPE_GET_POSITION Partition(int setter);
    public native @ByRef LARGE_INTEGER Offset(); public native TAPE_GET_POSITION Offset(LARGE_INTEGER setter);
}
