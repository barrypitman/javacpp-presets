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
// Constraint between rigid/multi body and deformable objects nodes
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableNodeRigidContactConstraint extends btDeformableRigidContactConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableNodeRigidContactConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableNodeRigidContactConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableNodeRigidContactConstraint position(long position) {
        return (btDeformableNodeRigidContactConstraint)super.position(position);
    }
    @Override public btDeformableNodeRigidContactConstraint getPointer(long i) {
        return new btDeformableNodeRigidContactConstraint((Pointer)this).offsetAddress(i);
    }

	// the deformable node in contact
	public native btSoftBody.Node m_node(); public native btDeformableNodeRigidContactConstraint m_node(btSoftBody.Node setter);

	public btDeformableNodeRigidContactConstraint(@Const @ByRef btSoftBody.DeformableNodeRigidContact contact, @Const @ByRef btContactSolverInfo infoGlobal) { super((Pointer)null); allocate(contact, infoGlobal); }
	private native void allocate(@Const @ByRef btSoftBody.DeformableNodeRigidContact contact, @Const @ByRef btContactSolverInfo infoGlobal);
	public btDeformableNodeRigidContactConstraint(@Const @ByRef btDeformableNodeRigidContactConstraint other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btDeformableNodeRigidContactConstraint other);
	public btDeformableNodeRigidContactConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();

	// get the velocity of the deformable node in contact
	public native @ByVal btVector3 getVb();

	// get the split impulse velocity of the deformable face at the contact point
	public native @ByVal btVector3 getSplitVb();

	// get the velocity change of the input soft body node in the constraint
	public native @ByVal btVector3 getDv(@Const btSoftBody.Node arg0);

	// cast the contact to the desired type
	public native @Const btSoftBody.DeformableNodeRigidContact getContact();

	public native void applyImpulse(@Const @ByRef btVector3 impulse);

	public native void applySplitImpulse(@Const @ByRef btVector3 impulse);
}
