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


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuGenericConstraint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuGenericConstraint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuGenericConstraint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuGenericConstraint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuGenericConstraint position(long position) {
        return (b3GpuGenericConstraint)super.position(position);
    }
    @Override public b3GpuGenericConstraint getPointer(long i) {
        return new b3GpuGenericConstraint((Pointer)this).offsetAddress(i);
    }

	public native int m_constraintType(); public native b3GpuGenericConstraint m_constraintType(int setter);
	public native int m_rbA(); public native b3GpuGenericConstraint m_rbA(int setter);
	public native int m_rbB(); public native b3GpuGenericConstraint m_rbB(int setter);
	public native float m_breakingImpulseThreshold(); public native b3GpuGenericConstraint m_breakingImpulseThreshold(float setter);

	public native @ByRef b3Vector3 m_pivotInA(); public native b3GpuGenericConstraint m_pivotInA(b3Vector3 setter);
	public native @ByRef b3Vector3 m_pivotInB(); public native b3GpuGenericConstraint m_pivotInB(b3Vector3 setter);
	public native @ByRef b3Quaternion m_relTargetAB(); public native b3GpuGenericConstraint m_relTargetAB(b3Quaternion setter);

	public native int m_flags(); public native b3GpuGenericConstraint m_flags(int setter);
	public native int m_uid(); public native b3GpuGenericConstraint m_uid(int setter);
	public native int m_padding(int i); public native b3GpuGenericConstraint m_padding(int i, int setter);
	@MemberGetter public native IntPointer m_padding();

	public native int getRigidBodyA();
	public native int getRigidBodyB();

	public native @Const @ByRef b3Vector3 getPivotInA();

	public native @Const @ByRef b3Vector3 getPivotInB();

	public native int isEnabled();

	public native float getBreakingImpulseThreshold();

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo1(@Cast("unsigned int*") IntPointer info, @Const b3RigidBodyData bodies);
	public native void getInfo1(@Cast("unsigned int*") IntBuffer info, @Const b3RigidBodyData bodies);
	public native void getInfo1(@Cast("unsigned int*") int[] info, @Const b3RigidBodyData bodies);

	/**internal method used by the constraint solver, don't use them directly */
	public native void getInfo2(b3GpuConstraintInfo2 info, @Const b3RigidBodyData bodies);
}
