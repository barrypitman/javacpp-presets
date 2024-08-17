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
public class btQuantizedBvhNodeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btQuantizedBvhNodeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuantizedBvhNodeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuantizedBvhNodeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btQuantizedBvhNodeData position(long position) {
        return (btQuantizedBvhNodeData)super.position(position);
    }
    @Override public btQuantizedBvhNodeData getPointer(long i) {
        return new btQuantizedBvhNodeData((Pointer)this).offsetAddress(i);
    }

	public native @Cast("unsigned short") short m_quantizedAabbMin(int i); public native btQuantizedBvhNodeData m_quantizedAabbMin(int i, short setter);
	@MemberGetter public native @Cast("unsigned short*") ShortPointer m_quantizedAabbMin();
	public native @Cast("unsigned short") short m_quantizedAabbMax(int i); public native btQuantizedBvhNodeData m_quantizedAabbMax(int i, short setter);
	@MemberGetter public native @Cast("unsigned short*") ShortPointer m_quantizedAabbMax();
	public native int m_escapeIndexOrTriangleIndex(); public native btQuantizedBvhNodeData m_escapeIndexOrTriangleIndex(int setter);
}
