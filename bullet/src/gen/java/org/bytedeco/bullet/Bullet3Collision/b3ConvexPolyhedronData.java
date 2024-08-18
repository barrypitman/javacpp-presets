// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3ConvexPolyhedronData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3ConvexPolyhedronData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ConvexPolyhedronData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ConvexPolyhedronData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3ConvexPolyhedronData position(long position) {
        return (b3ConvexPolyhedronData)super.position(position);
    }
    @Override public b3ConvexPolyhedronData getPointer(long i) {
        return new b3ConvexPolyhedronData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_localCenter(); public native b3ConvexPolyhedronData m_localCenter(b3Vector3 setter);
	public native @ByRef b3Vector3 m_extents(); public native b3ConvexPolyhedronData m_extents(b3Vector3 setter);
	public native @ByRef b3Vector3 mC(); public native b3ConvexPolyhedronData mC(b3Vector3 setter);
	public native @ByRef b3Vector3 mE(); public native b3ConvexPolyhedronData mE(b3Vector3 setter);

	public native float m_radius(); public native b3ConvexPolyhedronData m_radius(float setter);
	public native int m_faceOffset(); public native b3ConvexPolyhedronData m_faceOffset(int setter);
	public native int m_numFaces(); public native b3ConvexPolyhedronData m_numFaces(int setter);
	public native int m_numVertices(); public native b3ConvexPolyhedronData m_numVertices(int setter);

	public native int m_vertexOffset(); public native b3ConvexPolyhedronData m_vertexOffset(int setter);
	public native int m_uniqueEdgesOffset(); public native b3ConvexPolyhedronData m_uniqueEdgesOffset(int setter);
	public native int m_numUniqueEdges(); public native b3ConvexPolyhedronData m_numUniqueEdges(int setter);
	public native int m_unused(); public native b3ConvexPolyhedronData m_unused(int setter);
}
