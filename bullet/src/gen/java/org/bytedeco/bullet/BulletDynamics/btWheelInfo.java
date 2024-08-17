// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


/** btWheelInfo contains information per wheel about friction and suspension. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btWheelInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btWheelInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btWheelInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btWheelInfo position(long position) {
        return (btWheelInfo)super.position(position);
    }
    @Override public btWheelInfo getPointer(long i) {
        return new btWheelInfo((Pointer)this).offsetAddress(i);
    }

	public static class RaycastInfo extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public RaycastInfo() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public RaycastInfo(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public RaycastInfo(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public RaycastInfo position(long position) {
	        return (RaycastInfo)super.position(position);
	    }
	    @Override public RaycastInfo getPointer(long i) {
	        return new RaycastInfo((Pointer)this).offsetAddress(i);
	    }
	
		//set by raycaster
		public native @ByRef btVector3 m_contactNormalWS(); public native RaycastInfo m_contactNormalWS(btVector3 setter);  //contactnormal
		public native @ByRef btVector3 m_contactPointWS(); public native RaycastInfo m_contactPointWS(btVector3 setter);   //raycast hitpoint
		public native @Cast("btScalar") double m_suspensionLength(); public native RaycastInfo m_suspensionLength(double setter);
		public native @ByRef btVector3 m_hardPointWS(); public native RaycastInfo m_hardPointWS(btVector3 setter);       //raycast starting point
		public native @ByRef btVector3 m_wheelDirectionWS(); public native RaycastInfo m_wheelDirectionWS(btVector3 setter);  //direction in worldspace
		public native @ByRef btVector3 m_wheelAxleWS(); public native RaycastInfo m_wheelAxleWS(btVector3 setter);       // axle in worldspace
		public native @Cast("bool") boolean m_isInContact(); public native RaycastInfo m_isInContact(boolean setter);
		public native Pointer m_groundObject(); public native RaycastInfo m_groundObject(Pointer setter);  //could be general void* ptr
	}

	public native @ByRef RaycastInfo m_raycastInfo(); public native btWheelInfo m_raycastInfo(RaycastInfo setter);

	public native @ByRef btTransform m_worldTransform(); public native btWheelInfo m_worldTransform(btTransform setter);

	public native @ByRef btVector3 m_chassisConnectionPointCS(); public native btWheelInfo m_chassisConnectionPointCS(btVector3 setter);  //const
	public native @ByRef btVector3 m_wheelDirectionCS(); public native btWheelInfo m_wheelDirectionCS(btVector3 setter);          //const
	public native @ByRef btVector3 m_wheelAxleCS(); public native btWheelInfo m_wheelAxleCS(btVector3 setter);               // const or modified by steering
	public native @Cast("btScalar") double m_suspensionRestLength1(); public native btWheelInfo m_suspensionRestLength1(double setter);      //const
	public native @Cast("btScalar") double m_maxSuspensionTravelCm(); public native btWheelInfo m_maxSuspensionTravelCm(double setter);
	public native @Cast("btScalar") double getSuspensionRestLength();
	public native @Cast("btScalar") double m_wheelsRadius(); public native btWheelInfo m_wheelsRadius(double setter);              //const
	public native @Cast("btScalar") double m_suspensionStiffness(); public native btWheelInfo m_suspensionStiffness(double setter);       //const
	public native @Cast("btScalar") double m_wheelsDampingCompression(); public native btWheelInfo m_wheelsDampingCompression(double setter);  //const
	public native @Cast("btScalar") double m_wheelsDampingRelaxation(); public native btWheelInfo m_wheelsDampingRelaxation(double setter);   //const
	public native @Cast("btScalar") double m_frictionSlip(); public native btWheelInfo m_frictionSlip(double setter);
	public native @Cast("btScalar") double m_steering(); public native btWheelInfo m_steering(double setter);
	public native @Cast("btScalar") double m_rotation(); public native btWheelInfo m_rotation(double setter);
	public native @Cast("btScalar") double m_deltaRotation(); public native btWheelInfo m_deltaRotation(double setter);
	public native @Cast("btScalar") double m_rollInfluence(); public native btWheelInfo m_rollInfluence(double setter);
	public native @Cast("btScalar") double m_maxSuspensionForce(); public native btWheelInfo m_maxSuspensionForce(double setter);

	public native @Cast("btScalar") double m_engineForce(); public native btWheelInfo m_engineForce(double setter);

	public native @Cast("btScalar") double m_brake(); public native btWheelInfo m_brake(double setter);

	public native @Cast("bool") boolean m_bIsFrontWheel(); public native btWheelInfo m_bIsFrontWheel(boolean setter);

	public native Pointer m_clientInfo(); public native btWheelInfo m_clientInfo(Pointer setter);  //can be used to store pointer to sync transforms...

	public btWheelInfo() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btWheelInfo(@ByRef btWheelInfoConstructionInfo ci) { super((Pointer)null); allocate(ci); }
	private native void allocate(@ByRef btWheelInfoConstructionInfo ci);

	public native void updateWheel(@Const @ByRef btRigidBody chassis, @ByRef RaycastInfo raycastInfo);

	public native @Cast("btScalar") double m_clippedInvContactDotSuspension(); public native btWheelInfo m_clippedInvContactDotSuspension(double setter);
	public native @Cast("btScalar") double m_suspensionRelativeVelocity(); public native btWheelInfo m_suspensionRelativeVelocity(double setter);
	//calculated by suspension
	public native @Cast("btScalar") double m_wheelsSuspensionForce(); public native btWheelInfo m_wheelsSuspensionForce(double setter);
	public native @Cast("btScalar") double m_skidInfo(); public native btWheelInfo m_skidInfo(double setter);
}
