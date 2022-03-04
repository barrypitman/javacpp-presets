// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ushort3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ushort3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ushort3 position(long position) {
        return (ushort3)super.position(position);
    }
    @Override public ushort3 getPointer(long i) {
        return new ushort3((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned short") short x(); public native ushort3 x(short setter);
    public native @Cast("unsigned short") short y(); public native ushort3 y(short setter);
    public native @Cast("unsigned short") short z(); public native ushort3 z(short setter);
}
