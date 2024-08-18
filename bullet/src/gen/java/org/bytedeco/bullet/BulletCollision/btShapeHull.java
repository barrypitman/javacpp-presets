// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btShapeHull class takes a btConvexShape, builds a simplified convex hull using btConvexHull and provides triangle indices and vertices.
 * It can be useful for to simplify a complex convex object and for visualization of a non-polyhedral convex object.
 * It approximates the convex hull using the supporting vertex of 42 directions. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btShapeHull extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btShapeHull(Pointer p) { super(p); }


	public btShapeHull(@Const btConvexShape shape) { super((Pointer)null); allocate(shape); }
	private native void allocate(@Const btConvexShape shape);

	public native @Cast("bool") boolean buildHull(@Cast("btScalar") double margin, int highres/*=0*/);
	public native @Cast("bool") boolean buildHull(@Cast("btScalar") double margin);

	public native int numTriangles();
	public native int numVertices();
	public native int numIndices();

	public native @Const btVector3 getVertexPointer();
	public native @Cast("const unsigned int*") IntPointer getIndexPointer();
}
