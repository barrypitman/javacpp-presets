// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class int2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public int2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public int2 position(long position) {
        return (int2)super.position(position);
    }
    @Override public int2 getPointer(long i) {
        return new int2((Pointer)this).offsetAddress(i);
    }
 
    public native int x(); public native int2 x(int setter); public native int y(); public native int2 y(int setter);
}
