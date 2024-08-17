// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


//
// Constraint that a certain node in the deformable objects cannot move
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableStaticConstraint extends btDeformableContactConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableStaticConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableStaticConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableStaticConstraint position(long position) {
        return (btDeformableStaticConstraint)super.position(position);
    }
    @Override public btDeformableStaticConstraint getPointer(long i) {
        return new btDeformableStaticConstraint((Pointer)this).offsetAddress(i);
    }

	public native btSoftBody.Node m_node(); public native btDeformableStaticConstraint m_node(btSoftBody.Node setter);

	public btDeformableStaticConstraint(btSoftBody.Node node, @Const @ByRef btContactSolverInfo infoGlobal) { super((Pointer)null); allocate(node, infoGlobal); }
	private native void allocate(btSoftBody.Node node, @Const @ByRef btContactSolverInfo infoGlobal);
	public btDeformableStaticConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btDeformableStaticConstraint(@Const @ByRef btDeformableStaticConstraint other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btDeformableStaticConstraint other);

	public native @Cast("btScalar") double solveConstraint(@Const @ByRef btContactSolverInfo infoGlobal);

	public native @ByVal btVector3 getVa();

	public native @ByVal btVector3 getVb();

	public native @ByVal btVector3 getDv(@Const btSoftBody.Node n);

	public native void applyImpulse(@Const @ByRef btVector3 impulse);
	public native void setPenetrationScale(@Cast("btScalar") double scale);
}
