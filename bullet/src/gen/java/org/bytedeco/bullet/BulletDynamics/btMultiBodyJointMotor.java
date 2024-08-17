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
public class btMultiBodyJointMotor extends btMultiBodyConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyJointMotor(Pointer p) { super(p); }

	public btMultiBodyJointMotor(btMultiBody body, int link, @Cast("btScalar") double desiredVelocity, @Cast("btScalar") double maxMotorImpulse) { super((Pointer)null); allocate(body, link, desiredVelocity, maxMotorImpulse); }
	private native void allocate(btMultiBody body, int link, @Cast("btScalar") double desiredVelocity, @Cast("btScalar") double maxMotorImpulse);
	public btMultiBodyJointMotor(btMultiBody body, int link, int linkDoF, @Cast("btScalar") double desiredVelocity, @Cast("btScalar") double maxMotorImpulse) { super((Pointer)null); allocate(body, link, linkDoF, desiredVelocity, maxMotorImpulse); }
	private native void allocate(btMultiBody body, int link, int linkDoF, @Cast("btScalar") double desiredVelocity, @Cast("btScalar") double maxMotorImpulse);
	public native void finalizeMultiDof();

	public native int getIslandIdA();
	public native int getIslandIdB();

	public native void createConstraintRows(@ByRef btMultiBodySolverConstraintArray constraintRows,
										  @ByRef btMultiBodyJacobianData data,
										  @Const @ByRef btContactSolverInfo infoGlobal);

	public native void setVelocityTarget(@Cast("btScalar") double velTarget, @Cast("btScalar") double kd/*=1.f*/);
	public native void setVelocityTarget(@Cast("btScalar") double velTarget);

	public native void setPositionTarget(@Cast("btScalar") double posTarget, @Cast("btScalar") double kp/*=1.f*/);
	public native void setPositionTarget(@Cast("btScalar") double posTarget);

	public native void setErp(@Cast("btScalar") double erp);
	public native @Cast("btScalar") double getErp();
	public native void setRhsClamp(@Cast("btScalar") double rhsClamp);
	public native void debugDraw(btIDebugDraw drawer);
}
