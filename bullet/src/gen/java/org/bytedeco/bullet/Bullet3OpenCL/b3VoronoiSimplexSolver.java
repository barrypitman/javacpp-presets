// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/** b3VoronoiSimplexSolver is an implementation of the closest point distance algorithm from a 1-4 points simplex to the origin.
 *  Can be used with GJK, as an alternative to Johnson distance algorithm. */

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3VoronoiSimplexSolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3VoronoiSimplexSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3VoronoiSimplexSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3VoronoiSimplexSolver position(long position) {
        return (b3VoronoiSimplexSolver)super.position(position);
    }
    @Override public b3VoronoiSimplexSolver getPointer(long i) {
        return new b3VoronoiSimplexSolver((Pointer)this).offsetAddress(i);
    }


	public native int m_numVertices(); public native b3VoronoiSimplexSolver m_numVertices(int setter);

	public native @ByRef b3Vector3 m_simplexVectorW(int i); public native b3VoronoiSimplexSolver m_simplexVectorW(int i, b3Vector3 setter);
	@MemberGetter public native b3Vector3 m_simplexVectorW();
	public native @ByRef b3Vector3 m_simplexPointsP(int i); public native b3VoronoiSimplexSolver m_simplexPointsP(int i, b3Vector3 setter);
	@MemberGetter public native b3Vector3 m_simplexPointsP();
	public native @ByRef b3Vector3 m_simplexPointsQ(int i); public native b3VoronoiSimplexSolver m_simplexPointsQ(int i, b3Vector3 setter);
	@MemberGetter public native b3Vector3 m_simplexPointsQ();

	public native @ByRef b3Vector3 m_cachedP1(); public native b3VoronoiSimplexSolver m_cachedP1(b3Vector3 setter);
	public native @ByRef b3Vector3 m_cachedP2(); public native b3VoronoiSimplexSolver m_cachedP2(b3Vector3 setter);
	public native @ByRef b3Vector3 m_cachedV(); public native b3VoronoiSimplexSolver m_cachedV(b3Vector3 setter);
	public native @ByRef b3Vector3 m_lastW(); public native b3VoronoiSimplexSolver m_lastW(b3Vector3 setter);

	public native @Cast("b3Scalar") float m_equalVertexThreshold(); public native b3VoronoiSimplexSolver m_equalVertexThreshold(float setter);
	public native @Cast("bool") boolean m_cachedValidClosest(); public native b3VoronoiSimplexSolver m_cachedValidClosest(boolean setter);

	public native @ByRef b3SubSimplexClosestResult m_cachedBC(); public native b3VoronoiSimplexSolver m_cachedBC(b3SubSimplexClosestResult setter);

	public native @Cast("bool") boolean m_needsUpdate(); public native b3VoronoiSimplexSolver m_needsUpdate(boolean setter);

	public native void removeVertex(int index);
	public native void reduceVertices(@Const @ByRef b3UsageBitfield usedVerts);
	public native @Cast("bool") boolean updateClosestVectorAndPoints();

	public native @Cast("bool") boolean closestPtPointTetrahedron(@Const @ByRef b3Vector3 p, @Const @ByRef b3Vector3 a, @Const @ByRef b3Vector3 b, @Const @ByRef b3Vector3 c, @Const @ByRef b3Vector3 d, @ByRef b3SubSimplexClosestResult finalResult);
	public native int pointOutsideOfPlane(@Const @ByRef b3Vector3 p, @Const @ByRef b3Vector3 a, @Const @ByRef b3Vector3 b, @Const @ByRef b3Vector3 c, @Const @ByRef b3Vector3 d);
	public native @Cast("bool") boolean closestPtPointTriangle(@Const @ByRef b3Vector3 p, @Const @ByRef b3Vector3 a, @Const @ByRef b3Vector3 b, @Const @ByRef b3Vector3 c, @ByRef b3SubSimplexClosestResult result);
	public b3VoronoiSimplexSolver() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void reset();

	public native void addVertex(@Const @ByRef b3Vector3 w, @Const @ByRef b3Vector3 p, @Const @ByRef b3Vector3 q);

	public native void setEqualVertexThreshold(@Cast("b3Scalar") float threshold);

	public native @Cast("b3Scalar") float getEqualVertexThreshold();

	public native @Cast("bool") boolean closest(@ByRef b3Vector3 v);

	public native @Cast("b3Scalar") float maxVertex();

	public native @Cast("bool") boolean fullSimplex();

	public native int getSimplex(b3Vector3 pBuf, b3Vector3 qBuf, b3Vector3 yBuf);

	public native @Cast("bool") boolean inSimplex(@Const @ByRef b3Vector3 w);

	public native void backup_closest(@ByRef b3Vector3 v);

	public native @Cast("bool") boolean emptySimplex();

	public native void compute_points(@ByRef b3Vector3 p1, @ByRef b3Vector3 p2);

	public native int numVertices();
}
