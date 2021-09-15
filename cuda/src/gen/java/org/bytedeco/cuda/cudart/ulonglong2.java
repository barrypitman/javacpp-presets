// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ulonglong2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ulonglong2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ulonglong2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ulonglong2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ulonglong2 position(long position) {
        return (ulonglong2)super.position(position);
    }
    @Override public ulonglong2 getPointer(long i) {
        return new ulonglong2((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned long long int") long x(); public native ulonglong2 x(long setter);
    public native @Cast("unsigned long long int") long y(); public native ulonglong2 y(long setter);
}
