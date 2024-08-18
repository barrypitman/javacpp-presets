// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class _btMprSimplex_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _btMprSimplex_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _btMprSimplex_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _btMprSimplex_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _btMprSimplex_t position(long position) {
        return (_btMprSimplex_t)super.position(position);
    }
    @Override public _btMprSimplex_t getPointer(long i) {
        return new _btMprSimplex_t((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btMprSupport_t ps(int i); public native _btMprSimplex_t ps(int i, btMprSupport_t setter);
	@MemberGetter public native btMprSupport_t ps();
	/** index of last added point */
	public native int last(); public native _btMprSimplex_t last(int setter);
}
