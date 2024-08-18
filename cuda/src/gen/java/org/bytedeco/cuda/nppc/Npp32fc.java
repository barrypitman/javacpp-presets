// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * This struct represents a single floating-point complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp32fc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp32fc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp32fc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp32fc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp32fc position(long position) {
        return (Npp32fc)super.position(position);
    }
    @Override public Npp32fc getPointer(long i) {
        return new Npp32fc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp32f") float re(); public native Npp32fc re(float setter);
    /**  Imaginary part */
    public native @Cast("Npp32f") float im(); public native Npp32fc im(float setter);
}
