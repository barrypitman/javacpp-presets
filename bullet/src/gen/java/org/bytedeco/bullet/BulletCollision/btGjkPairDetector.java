// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btGjkPairDetector uses GJK to implement the btDiscreteCollisionDetectorInterface */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGjkPairDetector extends btDiscreteCollisionDetectorInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGjkPairDetector(Pointer p) { super(p); }

	//some debugging to fix degeneracy problems
	public native int m_lastUsedMethod(); public native btGjkPairDetector m_lastUsedMethod(int setter);
	public native int m_curIter(); public native btGjkPairDetector m_curIter(int setter);
	public native int m_degenerateSimplex(); public native btGjkPairDetector m_degenerateSimplex(int setter);
	public native int m_catchDegeneracies(); public native btGjkPairDetector m_catchDegeneracies(int setter);
	public native int m_fixContactNormalDirection(); public native btGjkPairDetector m_fixContactNormalDirection(int setter);

	public btGjkPairDetector(@Const btConvexShape objectA, @Const btConvexShape objectB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) { super((Pointer)null); allocate(objectA, objectB, simplexSolver, penetrationDepthSolver); }
	private native void allocate(@Const btConvexShape objectA, @Const btConvexShape objectB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver);
	public btGjkPairDetector(@Const btConvexShape objectA, @Const btConvexShape objectB, int shapeTypeA, int shapeTypeB, @Cast("btScalar") double marginA, @Cast("btScalar") double marginB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) { super((Pointer)null); allocate(objectA, objectB, shapeTypeA, shapeTypeB, marginA, marginB, simplexSolver, penetrationDepthSolver); }
	private native void allocate(@Const btConvexShape objectA, @Const btConvexShape objectB, int shapeTypeA, int shapeTypeB, @Cast("btScalar") double marginA, @Cast("btScalar") double marginB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver);

	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw, @Cast("bool") boolean swapResults/*=false*/);
	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw);

	public native void getClosestPointsNonVirtual(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw);

	public native void setMinkowskiA(@Const btConvexShape minkA);

	public native void setMinkowskiB(@Const btConvexShape minkB);
	public native void setCachedSeparatingAxis(@Const @ByRef btVector3 separatingAxis);

	public native @Const @ByRef btVector3 getCachedSeparatingAxis();
	public native @Cast("btScalar") double getCachedSeparatingDistance();

	public native void setPenetrationDepthSolver(btConvexPenetrationDepthSolver penetrationDepthSolver);

	/**don't use setIgnoreMargin, it's for Bullet's internal use */
	public native void setIgnoreMargin(@Cast("bool") boolean ignoreMargin);
}
