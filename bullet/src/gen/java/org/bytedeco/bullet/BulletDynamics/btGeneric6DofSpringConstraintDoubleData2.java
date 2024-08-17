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


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofSpringConstraintDoubleData2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGeneric6DofSpringConstraintDoubleData2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGeneric6DofSpringConstraintDoubleData2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofSpringConstraintDoubleData2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGeneric6DofSpringConstraintDoubleData2 position(long position) {
        return (btGeneric6DofSpringConstraintDoubleData2)super.position(position);
    }
    @Override public btGeneric6DofSpringConstraintDoubleData2 getPointer(long i) {
        return new btGeneric6DofSpringConstraintDoubleData2((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btGeneric6DofConstraintDoubleData2 m_6dofData(); public native btGeneric6DofSpringConstraintDoubleData2 m_6dofData(btGeneric6DofConstraintDoubleData2 setter);

	public native int m_springEnabled(int i); public native btGeneric6DofSpringConstraintDoubleData2 m_springEnabled(int i, int setter);
	@MemberGetter public native IntPointer m_springEnabled();
	public native double m_equilibriumPoint(int i); public native btGeneric6DofSpringConstraintDoubleData2 m_equilibriumPoint(int i, double setter);
	@MemberGetter public native DoublePointer m_equilibriumPoint();
	public native double m_springStiffness(int i); public native btGeneric6DofSpringConstraintDoubleData2 m_springStiffness(int i, double setter);
	@MemberGetter public native DoublePointer m_springStiffness();
	public native double m_springDamping(int i); public native btGeneric6DofSpringConstraintDoubleData2 m_springDamping(int i, double setter);
	@MemberGetter public native DoublePointer m_springDamping();
}
