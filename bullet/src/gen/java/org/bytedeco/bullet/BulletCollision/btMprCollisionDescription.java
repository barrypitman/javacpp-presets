// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


//#define MPR_AVERAGE_CONTACT_POSITIONS

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMprCollisionDescription extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMprCollisionDescription(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMprCollisionDescription(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btMprCollisionDescription position(long position) {
        return (btMprCollisionDescription)super.position(position);
    }
    @Override public btMprCollisionDescription getPointer(long i) {
        return new btMprCollisionDescription((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_firstDir(); public native btMprCollisionDescription m_firstDir(btVector3 setter);
	public native int m_maxGjkIterations(); public native btMprCollisionDescription m_maxGjkIterations(int setter);
	public native @Cast("btScalar") double m_maximumDistanceSquared(); public native btMprCollisionDescription m_maximumDistanceSquared(double setter);
	public native @Cast("btScalar") double m_gjkRelError2(); public native btMprCollisionDescription m_gjkRelError2(double setter);

	public btMprCollisionDescription() { super((Pointer)null); allocate(); }
	private native void allocate();
}
