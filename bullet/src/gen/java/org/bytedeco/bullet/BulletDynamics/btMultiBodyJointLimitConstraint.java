// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyJointLimitConstraint extends btMultiBodyConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyJointLimitConstraint(Pointer p) { super(p); }

	public btMultiBodyJointLimitConstraint(btMultiBody body, int link, @Cast("btScalar") double lower, @Cast("btScalar") double upper) { super((Pointer)null); allocate(body, link, lower, upper); }
	private native void allocate(btMultiBody body, int link, @Cast("btScalar") double lower, @Cast("btScalar") double upper);

	public native void finalizeMultiDof();

	public native int getIslandIdA();
	public native int getIslandIdB();

	public native void createConstraintRows(@ByRef btMultiBodySolverConstraintArray constraintRows,
										  @ByRef btMultiBodyJacobianData data,
										  @Const @ByRef btContactSolverInfo infoGlobal);

	public native void debugDraw(btIDebugDraw drawer);
	public native @Cast("btScalar") double getLowerBound();
	public native @Cast("btScalar") double getUpperBound();
	public native void setLowerBound(@Cast("btScalar") double lower);
	public native void setUpperBound(@Cast("btScalar") double upper);
}
