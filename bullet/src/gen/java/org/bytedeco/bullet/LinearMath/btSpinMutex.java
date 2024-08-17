// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;
  // notify that all worker threads have been destroyed

/**
 *  btSpinMutex -- lightweight spin-mutex implemented with atomic ops, never puts
 *                a thread to sleep because it is designed to be used with a task scheduler
 *                which has one thread per core and the threads don't sleep until they
 *                run out of tasks. Not good for general purpose use.
 *  */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btSpinMutex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSpinMutex(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSpinMutex(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSpinMutex position(long position) {
        return (btSpinMutex)super.position(position);
    }
    @Override public btSpinMutex getPointer(long i) {
        return new btSpinMutex((Pointer)this).offsetAddress(i);
    }

	public btSpinMutex() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void lock();
	public native void unlock();
	public native @Cast("bool") boolean tryLock();
}
