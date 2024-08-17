// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


/**for serialization */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3Matrix3x3DoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Matrix3x3DoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Matrix3x3DoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Matrix3x3DoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Matrix3x3DoubleData position(long position) {
        return (b3Matrix3x3DoubleData)super.position(position);
    }
    @Override public b3Matrix3x3DoubleData getPointer(long i) {
        return new b3Matrix3x3DoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3DoubleData m_el(int i); public native b3Matrix3x3DoubleData m_el(int i, b3Vector3DoubleData setter);
	@MemberGetter public native b3Vector3DoubleData m_el();
}
