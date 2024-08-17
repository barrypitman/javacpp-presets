// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**Enabling USE_SEPDISTANCE_UTIL2 requires 100% reliable distance computation. However, when using large size ratios GJK can be imprecise
 * so the distance is not conservative. In that case, enabling this USE_SEPDISTANCE_UTIL2 would result in failing/missing collisions.
 * Either improve GJK for large size ratios (testing a 100 units versus a 0.1 unit object) or only enable the util
 * for certain pairs that have a small size ratio */

//#define USE_SEPDISTANCE_UTIL2 1

/**The convexConvexAlgorithm collision algorithm implements time of impact, convex closest points and penetration depth calculations between two convex objects.
/**Multiple contact points are calculated by perturbing the orientation of the smallest object orthogonal to the separating normal.
/**This idea was described by Gino van den Bergen in this forum topic http://www.bulletphysics.com/Bullet/phpBB3/viewtopic.php?f=4&t=288&p=888#p888 */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexConvexAlgorithm extends btActivatingCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexConvexAlgorithm(Pointer p) { super(p); }

	public btConvexConvexAlgorithm(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, btConvexPenetrationDepthSolver pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold) { super((Pointer)null); allocate(mf, ci, body0Wrap, body1Wrap, pdSolver, numPerturbationIterations, minimumPointsPerturbationThreshold); }
	private native void allocate(btPersistentManifold mf, @Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, btConvexPenetrationDepthSolver pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") double calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void getAllContactManifolds(@Cast("btManifoldArray*") @ByRef btPersistentManifoldArray manifoldArray);

	public native void setLowLevelOfDetail(@Cast("bool") boolean useLowLevel);

	public native @Const btPersistentManifold getManifold();

	@NoOffset public static class CreateFunc extends btCollisionAlgorithmCreateFunc {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CreateFunc(Pointer p) { super(p); }
	
		public native btConvexPenetrationDepthSolver m_pdSolver(); public native CreateFunc m_pdSolver(btConvexPenetrationDepthSolver setter);
		public native int m_numPerturbationIterations(); public native CreateFunc m_numPerturbationIterations(int setter);
		public native int m_minimumPointsPerturbationThreshold(); public native CreateFunc m_minimumPointsPerturbationThreshold(int setter);

		public CreateFunc(btConvexPenetrationDepthSolver pdSolver) { super((Pointer)null); allocate(pdSolver); }
		private native void allocate(btConvexPenetrationDepthSolver pdSolver);

		public native btCollisionAlgorithm CreateCollisionAlgorithm(@ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);
	}
}
