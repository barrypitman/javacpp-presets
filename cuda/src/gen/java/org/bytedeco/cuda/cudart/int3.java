// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class int3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public int3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public int3 position(long position) {
        return (int3)super.position(position);
    }
    @Override public int3 getPointer(long i) {
        return new int3((Pointer)this).offsetAddress(i);
    }

    public native int x(); public native int3 x(int setter);
    public native int y(); public native int3 y(int setter);
    public native int z(); public native int3 z(int setter);
}
