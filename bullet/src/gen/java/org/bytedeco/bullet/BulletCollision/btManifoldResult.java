// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btManifoldResult is a helper class to manage  contact results. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btManifoldResult extends btDiscreteCollisionDetectorInterface.Result {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btManifoldResult(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btManifoldResult(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btManifoldResult position(long position) {
        return (btManifoldResult)super.position(position);
    }
    @Override public btManifoldResult getPointer(long i) {
        return new btManifoldResult((Pointer)this).offsetAddress(i);
    }

	public btManifoldResult() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btManifoldResult(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap) { super((Pointer)null); allocate(body0Wrap, body1Wrap); }
	private native void allocate(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);

	public native void setPersistentManifold(btPersistentManifold manifoldPtr);
	public native btPersistentManifold getPersistentManifold();

	public native void setShapeIdentifiersA(int partId0, int index0);

	public native void setShapeIdentifiersB(int partId1, int index1);

	public native void addContactPoint(@Const @ByRef btVector3 normalOnBInWorld, @Const @ByRef btVector3 pointInWorld, @Cast("btScalar") double depth);

	public native void refreshContactPoints();

	public native @Const btCollisionObjectWrapper getBody0Wrap();
	public native @Const btCollisionObjectWrapper getBody1Wrap();

	public native void setBody0Wrap(@Const btCollisionObjectWrapper obj0Wrap);

	public native void setBody1Wrap(@Const btCollisionObjectWrapper obj1Wrap);

	public native @Const btCollisionObject getBody0Internal();

	public native @Const btCollisionObject getBody1Internal();

	public native @Cast("btScalar") double m_closestPointDistanceThreshold(); public native btManifoldResult m_closestPointDistanceThreshold(double setter);

	/** in the future we can let the user override the methods to combine restitution and friction */
	public static native @Cast("btScalar") double calculateCombinedRestitution(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public static native @Cast("btScalar") double calculateCombinedFriction(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public static native @Cast("btScalar") double calculateCombinedRollingFriction(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public static native @Cast("btScalar") double calculateCombinedSpinningFriction(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public static native @Cast("btScalar") double calculateCombinedContactDamping(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public static native @Cast("btScalar") double calculateCombinedContactStiffness(@Const btCollisionObject body0, @Const btCollisionObject body1);
}
