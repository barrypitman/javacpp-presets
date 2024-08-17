// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


/** point to point constraint between two rigidbodies each with a pivotpoint that descibes the 'ballsocket' location in local space */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3Point2PointConstraint extends b3TypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Point2PointConstraint(Pointer p) { super(p); }


	public native @ByRef b3ConstraintSetting m_setting(); public native b3Point2PointConstraint m_setting(b3ConstraintSetting setter);

	public b3Point2PointConstraint(int rbA, int rbB, @Const @ByRef b3Vector3 pivotInA, @Const @ByRef b3Vector3 pivotInB) { super((Pointer)null); allocate(rbA, rbB, pivotInA, pivotInB); }
	private native void allocate(int rbA, int rbB, @Const @ByRef b3Vector3 pivotInA, @Const @ByRef b3Vector3 pivotInB);

	//b3Point2PointConstraint(int  rbA,const b3Vector3& pivotInA);

	public native void getInfo1(b3ConstraintInfo1 info, @Const b3RigidBodyData bodies);

	public native void getInfo1NonVirtual(b3ConstraintInfo1 info, @Const b3RigidBodyData bodies);

	public native void getInfo2(b3ConstraintInfo2 info, @Const b3RigidBodyData bodies);

	public native void getInfo2NonVirtual(b3ConstraintInfo2 info, @Const @ByRef b3Transform body0_trans, @Const @ByRef b3Transform body1_trans);

	public native void updateRHS(@Cast("b3Scalar") float timeStep);

	public native void setPivotA(@Const @ByRef b3Vector3 pivotA);

	public native void setPivotB(@Const @ByRef b3Vector3 pivotB);

	public native @Const @ByRef b3Vector3 getPivotInA();

	public native @Const @ByRef b3Vector3 getPivotInB();

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("b3Scalar") float value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("b3Scalar") float value);
	/**return the local value of parameter */
	public native @Cast("b3Scalar") float getParam(int num, int axis/*=-1*/);
	public native @Cast("b3Scalar") float getParam(int num);

	//	virtual	int	calculateSerializeBufferSize() const;

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	//	virtual	const char*	serialize(void* dataBuffer, b3Serializer* serializer) const;
}
