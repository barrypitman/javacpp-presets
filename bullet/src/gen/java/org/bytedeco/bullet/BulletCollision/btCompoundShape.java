// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** The btCompoundShape allows to store multiple other btCollisionShapes
 *  This allows for moving concave collision objects. This is more general then the static concave btBvhTriangleMeshShape.
 *  It has an (optional) dynamic aabb tree to accelerate early rejection tests.
 *  \todo: This aabb tree can also be use to speed up ray tests on btCompoundShape, see http://code.google.com/p/bullet/issues/detail?id=25
 *  Currently, removal of child shapes is only supported when disabling the aabb tree (pass 'false' in the constructor of btCompoundShape) */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCompoundShape extends btCollisionShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCompoundShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btCompoundShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btCompoundShape position(long position) {
        return (btCompoundShape)super.position(position);
    }
    @Override public btCompoundShape getPointer(long i) {
        return new btCompoundShape((Pointer)this).offsetAddress(i);
    }


	public btCompoundShape(@Cast("bool") boolean enableDynamicAabbTree/*=true*/, int initialChildCapacity/*=0*/) { super((Pointer)null); allocate(enableDynamicAabbTree, initialChildCapacity); }
	private native void allocate(@Cast("bool") boolean enableDynamicAabbTree/*=true*/, int initialChildCapacity/*=0*/);
	public btCompoundShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void addChildShape(@Const @ByRef btTransform localTransform, btCollisionShape shape);

	/** Remove all children shapes that contain the specified shape */
	public native void removeChildShape(btCollisionShape shape);

	public native void removeChildShapeByIndex(int childShapeindex);

	public native int getNumChildShapes();

	public native btCollisionShape getChildShape(int index);

	public native @ByRef btTransform getChildTransform(int index);

	/**set a new transform for a child, and update internal data structures (local aabb and dynamic tree) */
	public native void updateChildTransform(int childIndex, @Const @ByRef btTransform newChildTransform, @Cast("bool") boolean shouldRecalculateLocalAabb/*=true*/);
	public native void updateChildTransform(int childIndex, @Const @ByRef btTransform newChildTransform);

	public native btCompoundShapeChild getChildList();

	/**getAabb's default implementation is brute force, expected derived classes to implement a fast dedicated version */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	/** Re-calculate the local Aabb. Is called at the end of removeChildShapes. 
	Use this yourself if you modify the children or their transforms. */
	public native void recalculateLocalAabb();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native @Const @ByRef btVector3 getLocalScaling();

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native void setMargin(@Cast("btScalar") double margin);
	public native @Cast("btScalar") double getMargin();
	public native @Cast("const char*") BytePointer getName();

	public native btDbvt getDynamicAabbTree();

	public native void createAabbTreeFromChildren();

	/**computes the exact moment of inertia and the transform from the coordinate system defined by the principal axes of the moment of inertia
	 * and the center of mass to the current coordinate system. "masses" points to an array of masses of the children. The resulting transform
	 * "principal" has to be applied inversely to all children transforms in order for the local coordinate system of the compound
	 * shape to be centered at the center of mass and to coincide with the principal axes. This also necessitates a correction of the world transform
	 * of the collision object by the principal transform. */
	public native void calculatePrincipalAxisTransform(@Cast("const btScalar*") DoublePointer masses, @ByRef btTransform principal, @ByRef btVector3 inertia);
	public native void calculatePrincipalAxisTransform(@Cast("const btScalar*") DoubleBuffer masses, @ByRef btTransform principal, @ByRef btVector3 inertia);
	public native void calculatePrincipalAxisTransform(@Cast("const btScalar*") double[] masses, @ByRef btTransform principal, @ByRef btVector3 inertia);

	public native int getUpdateRevision();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
