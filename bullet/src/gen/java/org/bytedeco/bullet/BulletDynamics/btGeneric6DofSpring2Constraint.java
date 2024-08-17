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
  // bits per axis

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofSpring2Constraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofSpring2Constraint(Pointer p) { super(p); }


	public btGeneric6DofSpring2Constraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("RotateOrder") int rotOrder/*=RO_XYZ*/) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB, rotOrder); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("RotateOrder") int rotOrder/*=RO_XYZ*/);
	public btGeneric6DofSpring2Constraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB);
	public btGeneric6DofSpring2Constraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("RotateOrder") int rotOrder/*=RO_XYZ*/) { super((Pointer)null); allocate(rbB, frameInB, rotOrder); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("RotateOrder") int rotOrder/*=RO_XYZ*/);
	public btGeneric6DofSpring2Constraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB) { super((Pointer)null); allocate(rbB, frameInB); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB);

	public native void buildJacobian();
	public native void getInfo1(btConstraintInfo1 info);
	public native void getInfo2(btConstraintInfo2 info);
	public native int calculateSerializeBufferSize();
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native btRotationalLimitMotor2 getRotationalLimitMotor(int index);
	public native btTranslationalLimitMotor2 getTranslationalLimitMotor();

	// Calculates the global transform for the joint offset for body A an B, and also calculates the angle differences between the bodies.
	public native void calculateTransforms(@Const @ByRef btTransform transA, @Const @ByRef btTransform transB);
	public native void calculateTransforms();

	// Gets the global transform of the offset for body A
	public native @Const @ByRef btTransform getCalculatedTransformA();
	// Gets the global transform of the offset for body B
	public native @Const @ByRef btTransform getCalculatedTransformB();

	public native @ByRef btTransform getFrameOffsetA();
	public native @ByRef btTransform getFrameOffsetB();

	// Get the rotation axis in global coordinates ( btGeneric6DofSpring2Constraint::calculateTransforms() must be called previously )
	public native @ByVal btVector3 getAxis(int axis_index);

	// Get the relative Euler angle ( btGeneric6DofSpring2Constraint::calculateTransforms() must be called previously )
	public native @Cast("btScalar") double getAngle(int axis_index);

	// Get the relative position of the constraint pivot ( btGeneric6DofSpring2Constraint::calculateTransforms() must be called previously )
	public native @Cast("btScalar") double getRelativePivotPosition(int axis_index);

	public native void setFrames(@Const @ByRef btTransform frameA, @Const @ByRef btTransform frameB);

	public native void setLinearLowerLimit(@Const @ByRef btVector3 linearLower);
	public native void getLinearLowerLimit(@ByRef btVector3 linearLower);
	public native void setLinearUpperLimit(@Const @ByRef btVector3 linearUpper);
	public native void getLinearUpperLimit(@ByRef btVector3 linearUpper);

	public native void setAngularLowerLimit(@Const @ByRef btVector3 angularLower);

	public native void setAngularLowerLimitReversed(@Const @ByRef btVector3 angularLower);

	public native void getAngularLowerLimit(@ByRef btVector3 angularLower);

	public native void getAngularLowerLimitReversed(@ByRef btVector3 angularLower);

	public native void setAngularUpperLimit(@Const @ByRef btVector3 angularUpper);

	public native void setAngularUpperLimitReversed(@Const @ByRef btVector3 angularUpper);

	public native void getAngularUpperLimit(@ByRef btVector3 angularUpper);

	public native void getAngularUpperLimitReversed(@ByRef btVector3 angularUpper);

	//first 3 are linear, next 3 are angular

	public native void setLimit(int axis, @Cast("btScalar") double lo, @Cast("btScalar") double hi);

	public native void setLimitReversed(int axis, @Cast("btScalar") double lo, @Cast("btScalar") double hi);

	public native @Cast("bool") boolean isLimited(int limitIndex);

	public native void setRotationOrder(@Cast("RotateOrder") int order);
	public native @Cast("RotateOrder") int getRotationOrder();

	public native void setAxis(@Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2);

	public native void setBounce(int index, @Cast("btScalar") double bounce);

	public native void enableMotor(int index, @Cast("bool") boolean onOff);
	public native void setServo(int index, @Cast("bool") boolean onOff);  // set the type of the motor (servo or not) (the motor has to be turned on for servo also)
	public native void setTargetVelocity(int index, @Cast("btScalar") double velocity);
	public native void setServoTarget(int index, @Cast("btScalar") double target);
	public native void setMaxMotorForce(int index, @Cast("btScalar") double force);

	public native void enableSpring(int index, @Cast("bool") boolean onOff);
	public native void setStiffness(int index, @Cast("btScalar") double stiffness, @Cast("bool") boolean limitIfNeeded/*=true*/);
	public native void setStiffness(int index, @Cast("btScalar") double stiffness);  // if limitIfNeeded is true the system will automatically limit the stiffness in necessary situations where otherwise the spring would move unrealistically too widely
	public native void setDamping(int index, @Cast("btScalar") double damping, @Cast("bool") boolean limitIfNeeded/*=true*/);
	public native void setDamping(int index, @Cast("btScalar") double damping);      // if limitIfNeeded is true the system will automatically limit the damping in necessary situations where otherwise the spring would blow up
	public native void setEquilibriumPoint();                                                   // set the current constraint position/orientation as an equilibrium point for all DOF
	public native void setEquilibriumPoint(int index);                                          // set the current constraint position/orientation as an equilibrium point for given DOF
	public native void setEquilibriumPoint(int index, @Cast("btScalar") double val);

	//override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	//If no axis is provided, it uses the default axis for this constraint.
	public native void setParam(int num, @Cast("btScalar") double value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") double value);
	public native @Cast("btScalar") double getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") double getParam(int num);

	public static native @Cast("btScalar") double btGetMatrixElem(@Const @ByRef btMatrix3x3 mat, int index);
	public static native @Cast("bool") boolean matrixToEulerXYZ(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
	public static native @Cast("bool") boolean matrixToEulerXZY(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
	public static native @Cast("bool") boolean matrixToEulerYXZ(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
	public static native @Cast("bool") boolean matrixToEulerYZX(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
	public static native @Cast("bool") boolean matrixToEulerZXY(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
	public static native @Cast("bool") boolean matrixToEulerZYX(@Const @ByRef btMatrix3x3 mat, @ByRef btVector3 xyz);
}
