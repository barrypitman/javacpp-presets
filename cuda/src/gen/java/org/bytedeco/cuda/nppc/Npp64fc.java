// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Complex Number
 * This struct represents a double floating-point complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp64fc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp64fc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp64fc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp64fc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp64fc position(long position) {
        return (Npp64fc)super.position(position);
    }
    @Override public Npp64fc getPointer(long i) {
        return new Npp64fc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp64f") double re(); public native Npp64fc re(double setter);
    /**  Imaginary part */
    public native @Cast("Npp64f") double im(); public native Npp64fc im(double setter);
}
