// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;
  // for the types

/**The btConeShape implements a cone shape primitive, centered around the origin and aligned with the Y axis. The btConeShapeX is aligned around the X axis and btConeShapeZ around the Z axis. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConeShape extends btConvexInternalShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeShape(Pointer p) { super(p); }


	public btConeShape(@Cast("btScalar") double radius, @Cast("btScalar") double height) { super((Pointer)null); allocate(radius, height); }
	private native void allocate(@Cast("btScalar") double radius, @Cast("btScalar") double height);

	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);
	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native @Cast("btScalar") double getRadius();
	public native @Cast("btScalar") double getHeight();

	public native void setRadius(@Cast("const btScalar") double radius);
	public native void setHeight(@Cast("const btScalar") double height);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @Cast("const char*") BytePointer getName();

	/**choose upAxis index */
	public native void setConeUpIndex(int upIndex);

	public native int getConeUpIndex();

	public native @ByVal btVector3 getAnisotropicRollingFrictionDirection();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
