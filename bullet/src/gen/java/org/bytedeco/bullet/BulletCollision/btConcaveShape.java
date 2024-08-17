// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btConcaveShape class provides an interface for non-moving (static) concave shapes.
 * It has been implemented by the btStaticPlaneShape, btBvhTriangleMeshShape and btHeightfieldTerrainShape. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConcaveShape extends btCollisionShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConcaveShape(Pointer p) { super(p); }


	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	public native @Cast("btScalar") double getMargin();
	public native void setMargin(@Cast("btScalar") double collisionMargin);
}
