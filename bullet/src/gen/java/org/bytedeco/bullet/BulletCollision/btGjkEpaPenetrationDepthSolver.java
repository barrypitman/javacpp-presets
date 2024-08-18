// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**EpaPenetrationDepthSolver uses the Expanding Polytope Algorithm to
 * calculate the penetration depth between two convex shapes. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGjkEpaPenetrationDepthSolver extends btConvexPenetrationDepthSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGjkEpaPenetrationDepthSolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGjkEpaPenetrationDepthSolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btGjkEpaPenetrationDepthSolver position(long position) {
        return (btGjkEpaPenetrationDepthSolver)super.position(position);
    }
    @Override public btGjkEpaPenetrationDepthSolver getPointer(long i) {
        return new btGjkEpaPenetrationDepthSolver((Pointer)this).offsetAddress(i);
    }

	public btGjkEpaPenetrationDepthSolver() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("bool") boolean calcPenDepth(@ByRef btSimplexSolverInterface simplexSolver,
						  @Const btConvexShape pConvexA, @Const btConvexShape pConvexB,
						  @Const @ByRef btTransform transformA, @Const @ByRef btTransform transformB,
						  @ByRef btVector3 v, @ByRef btVector3 wWitnessOnA, @ByRef btVector3 wWitnessOnB,
						  btIDebugDraw debugDraw);
}
