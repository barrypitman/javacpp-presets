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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuRaycast extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuRaycast(Pointer p) { super(p); }

	public b3GpuRaycast(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q) { super((Pointer)null); allocate(ctx, device, q); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q);

	public native void castRaysHost(@Const @ByRef b3RayInfoArray raysIn, @ByRef b3RayHitArray hitResults,
						  int numBodies, @Const b3RigidBodyData bodies, int numCollidables, @Const b3Collidable collidables,
						  @Const b3GpuNarrowPhaseInternalData narrowphaseData);

	public native void castRays(@Const @ByRef b3RayInfoArray rays, @ByRef b3RayHitArray hitResults,
					  int numBodies, @Const b3RigidBodyData bodies, int numCollidables, @Const b3Collidable collidables,
					  @Const b3GpuNarrowPhaseInternalData narrowphaseData, b3GpuBroadphaseInterface broadphase);
}
