// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Name("int4") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class Int4 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Int4(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Int4(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Int4 position(long position) {
        return (Int4)super.position(position);
    }
    @Override public Int4 getPointer(long i) {
        return new Int4((Pointer)this).offsetAddress(i);
    }

	public native int x(); public native Int4 x(int setter);
	public native int y(); public native Int4 y(int setter);
	public native int z(); public native Int4 z(int setter);
	public native int w(); public native Int4 w(int setter);
	public Int4() { super((Pointer)null); allocate(); }
	private native void allocate();
	public Int4(int _x, int _y, int _z, int _w) { super((Pointer)null); allocate(_x, _y, _z, _w); }
	private native void allocate(int _x, int _y, int _z, int _w);
	public native @ByRef @Name("operator []") IntPointer get(int i);
}
