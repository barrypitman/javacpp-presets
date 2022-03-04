// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


// #if defined(_WIN32)
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class long2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public long2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public long2 position(long position) {
        return (long2)super.position(position);
    }
    @Override public long2 getPointer(long i) {
        return new long2((Pointer)this).offsetAddress(i);
    }
 
    public native long x(); public native long2 x(long setter); public native long y(); public native long2 y(long setter);
}
