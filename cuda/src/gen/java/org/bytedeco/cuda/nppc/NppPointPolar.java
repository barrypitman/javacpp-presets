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
 * 2D Polar Point
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppPointPolar extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppPointPolar() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppPointPolar(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppPointPolar(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppPointPolar position(long position) {
        return (NppPointPolar)super.position(position);
    }
    @Override public NppPointPolar getPointer(long i) {
        return new NppPointPolar((Pointer)this).offsetAddress(i);
    }

    /**  Polar rho value. */
    public native @Cast("Npp32f") float rho(); public native NppPointPolar rho(float setter);
    /**  Polar theta value. */
    public native @Cast("Npp32f") float theta(); public native NppPointPolar theta(float setter);
}
