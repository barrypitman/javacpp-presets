// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleConvexcastCallback extends btTriangleCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleConvexcastCallback(Pointer p) { super(p); }

	public native @Const btConvexShape m_convexShape(); public native btTriangleConvexcastCallback m_convexShape(btConvexShape setter);
	public native @ByRef btTransform m_convexShapeFrom(); public native btTriangleConvexcastCallback m_convexShapeFrom(btTransform setter);
	public native @ByRef btTransform m_convexShapeTo(); public native btTriangleConvexcastCallback m_convexShapeTo(btTransform setter);
	public native @ByRef btTransform m_triangleToWorld(); public native btTriangleConvexcastCallback m_triangleToWorld(btTransform setter);
	public native @Cast("btScalar") double m_hitFraction(); public native btTriangleConvexcastCallback m_hitFraction(double setter);
	public native @Cast("btScalar") double m_triangleCollisionMargin(); public native btTriangleConvexcastCallback m_triangleCollisionMargin(double setter);
	public native @Cast("btScalar") double m_allowedPenetration(); public native btTriangleConvexcastCallback m_allowedPenetration(double setter);

	public native void processTriangle(btVector3 triangle, int partId, int triangleIndex);

	public native @Cast("btScalar") double reportHit(@Const @ByRef btVector3 hitNormalLocal, @Const @ByRef btVector3 hitPointLocal, @Cast("btScalar") double hitFraction, int partId, int triangleIndex);
}
