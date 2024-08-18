// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
 /* freebsd */

/*
 * Getkerninfo clock information structure
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class clockinfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public clockinfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public clockinfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public clockinfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public clockinfo position(long position) {
        return (clockinfo)super.position(position);
    }
    @Override public clockinfo getPointer(long i) {
        return new clockinfo((Pointer)this).offsetAddress(i);
    }

	public native int hz(); public native clockinfo hz(int setter);             /* clock frequency */
	public native int tick(); public native clockinfo tick(int setter);           /* micro-seconds per hz tick */
	public native int tickadj(); public native clockinfo tickadj(int setter);        /* clock skew rate for adjtime() */
	public native int stathz(); public native clockinfo stathz(int setter);         /* statistics clock frequency */
	public native int profhz(); public native clockinfo profhz(int setter);         /* profiling clock frequency */
}
