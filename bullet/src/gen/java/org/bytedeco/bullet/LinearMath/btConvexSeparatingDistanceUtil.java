// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**The btConvexSeparatingDistanceUtil can help speed up convex collision detection
 * by conservatively updating a cached separating distance/vector instead of re-calculating the closest distance */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btConvexSeparatingDistanceUtil extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexSeparatingDistanceUtil(Pointer p) { super(p); }

	public btConvexSeparatingDistanceUtil(@Cast("btScalar") double boundingRadiusA, @Cast("btScalar") double boundingRadiusB) { super((Pointer)null); allocate(boundingRadiusA, boundingRadiusB); }
	private native void allocate(@Cast("btScalar") double boundingRadiusA, @Cast("btScalar") double boundingRadiusB);

	public native @Cast("btScalar") double getConservativeSeparatingDistance();

	public native void updateSeparatingDistance(@Const @ByRef btTransform transA, @Const @ByRef btTransform transB);

	public native void initSeparatingDistance(@Const @ByRef btVector3 separatingVector, @Cast("btScalar") double separatingDistance, @Const @ByRef btTransform transA, @Const @ByRef btTransform transB);
}
