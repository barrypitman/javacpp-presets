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
public class btOptimizedBvhNodeDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btOptimizedBvhNodeDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btOptimizedBvhNodeDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btOptimizedBvhNodeDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btOptimizedBvhNodeDoubleData position(long position) {
        return (btOptimizedBvhNodeDoubleData)super.position(position);
    }
    @Override public btOptimizedBvhNodeDoubleData getPointer(long i) {
        return new btOptimizedBvhNodeDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3DoubleData m_aabbMinOrg(); public native btOptimizedBvhNodeDoubleData m_aabbMinOrg(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_aabbMaxOrg(); public native btOptimizedBvhNodeDoubleData m_aabbMaxOrg(btVector3DoubleData setter);
	public native int m_escapeIndex(); public native btOptimizedBvhNodeDoubleData m_escapeIndex(int setter);
	public native int m_subPart(); public native btOptimizedBvhNodeDoubleData m_subPart(int setter);
	public native int m_triangleIndex(); public native btOptimizedBvhNodeDoubleData m_triangleIndex(int setter);
	public native @Cast("char") byte m_pad(int i); public native btOptimizedBvhNodeDoubleData m_pad(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_pad();
}
