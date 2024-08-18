// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


// #ifdef USE_BT_CLOCK

/**The btClock is a portable basic clock that measures accurate time in seconds, use for profiling. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btClock extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btClock(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btClock(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btClock position(long position) {
        return (btClock)super.position(position);
    }
    @Override public btClock getPointer(long i) {
        return new btClock((Pointer)this).offsetAddress(i);
    }

	public btClock() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btClock(@Const @ByRef btClock other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btClock other);
	public native @ByRef @Name("operator =") btClock put(@Const @ByRef btClock other);

	/** Resets the initial reference time. */
	public native void reset();

	/** Returns the time in ms since the last call to reset or since
	 *  the btClock was created. */
	public native @Cast("unsigned long long int") long getTimeMilliseconds();

	/** Returns the time in us since the last call to reset or since
	 *  the Clock was created. */
	public native @Cast("unsigned long long int") long getTimeMicroseconds();

	public native @Cast("unsigned long long int") long getTimeNanoseconds();

	/** Returns the time in s since the last call to reset or since
	 *  the Clock was created. */
	public native @Cast("btScalar") double getTimeSeconds();
}
