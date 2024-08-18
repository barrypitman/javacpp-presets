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


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftBodyPoseData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyPoseData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyPoseData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyPoseData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyPoseData position(long position) {
        return (SoftBodyPoseData)super.position(position);
    }
    @Override public SoftBodyPoseData getPointer(long i) {
        return new SoftBodyPoseData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btMatrix3x3FloatData m_rot(); public native SoftBodyPoseData m_rot(btMatrix3x3FloatData setter);    // Rotation
	public native @ByRef btMatrix3x3FloatData m_scale(); public native SoftBodyPoseData m_scale(btMatrix3x3FloatData setter);  // Scale
	public native @ByRef btMatrix3x3FloatData m_aqq(); public native SoftBodyPoseData m_aqq(btMatrix3x3FloatData setter);    // Base scaling
	public native @ByRef btVector3FloatData m_com(); public native SoftBodyPoseData m_com(btVector3FloatData setter);      // COM

	public native btVector3FloatData m_positions(); public native SoftBodyPoseData m_positions(btVector3FloatData setter);  // Reference positions
	public native FloatPointer m_weights(); public native SoftBodyPoseData m_weights(FloatPointer setter);                 // Weights
	public native int m_numPositions(); public native SoftBodyPoseData m_numPositions(int setter);
	public native int m_numWeigts(); public native SoftBodyPoseData m_numWeigts(int setter);

	public native int m_bvolume(); public native SoftBodyPoseData m_bvolume(int setter);       // Is valid
	public native int m_bframe(); public native SoftBodyPoseData m_bframe(int setter);        // Is frame
	public native float m_restVolume(); public native SoftBodyPoseData m_restVolume(float setter);  // Rest volume
	public native int m_pad(); public native SoftBodyPoseData m_pad(int setter);
}
