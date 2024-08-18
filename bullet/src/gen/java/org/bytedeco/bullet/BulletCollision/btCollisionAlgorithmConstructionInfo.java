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
public class btCollisionAlgorithmConstructionInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionAlgorithmConstructionInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btCollisionAlgorithmConstructionInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btCollisionAlgorithmConstructionInfo position(long position) {
        return (btCollisionAlgorithmConstructionInfo)super.position(position);
    }
    @Override public btCollisionAlgorithmConstructionInfo getPointer(long i) {
        return new btCollisionAlgorithmConstructionInfo((Pointer)this).offsetAddress(i);
    }

	public btCollisionAlgorithmConstructionInfo() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btCollisionAlgorithmConstructionInfo(btDispatcher dispatcher, int temp) { super((Pointer)null); allocate(dispatcher, temp); }
	private native void allocate(btDispatcher dispatcher, int temp);

	public native btDispatcher m_dispatcher1(); public native btCollisionAlgorithmConstructionInfo m_dispatcher1(btDispatcher setter);
	public native btPersistentManifold m_manifold(); public native btCollisionAlgorithmConstructionInfo m_manifold(btPersistentManifold setter);

	//	int	getDispatcherId();
}
