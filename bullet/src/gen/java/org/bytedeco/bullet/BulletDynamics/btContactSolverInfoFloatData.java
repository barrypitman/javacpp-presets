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

/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btContactSolverInfoFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btContactSolverInfoFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btContactSolverInfoFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btContactSolverInfoFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btContactSolverInfoFloatData position(long position) {
        return (btContactSolverInfoFloatData)super.position(position);
    }
    @Override public btContactSolverInfoFloatData getPointer(long i) {
        return new btContactSolverInfoFloatData((Pointer)this).offsetAddress(i);
    }

	public native float m_tau(); public native btContactSolverInfoFloatData m_tau(float setter);
	public native float m_damping(); public native btContactSolverInfoFloatData m_damping(float setter);  //global non-contact constraint damping, can be locally overridden by constraints during 'getInfo2'.
	public native float m_friction(); public native btContactSolverInfoFloatData m_friction(float setter);
	public native float m_timeStep(); public native btContactSolverInfoFloatData m_timeStep(float setter);

	public native float m_restitution(); public native btContactSolverInfoFloatData m_restitution(float setter);
	public native float m_maxErrorReduction(); public native btContactSolverInfoFloatData m_maxErrorReduction(float setter);
	public native float m_sor(); public native btContactSolverInfoFloatData m_sor(float setter);
	public native float m_erp(); public native btContactSolverInfoFloatData m_erp(float setter);  //used as Baumgarte factor

	public native float m_erp2(); public native btContactSolverInfoFloatData m_erp2(float setter);       //used in Split Impulse
	public native float m_globalCfm(); public native btContactSolverInfoFloatData m_globalCfm(float setter);  //constraint force mixing
	public native float m_splitImpulsePenetrationThreshold(); public native btContactSolverInfoFloatData m_splitImpulsePenetrationThreshold(float setter);
	public native float m_splitImpulseTurnErp(); public native btContactSolverInfoFloatData m_splitImpulseTurnErp(float setter);

	public native float m_linearSlop(); public native btContactSolverInfoFloatData m_linearSlop(float setter);
	public native float m_warmstartingFactor(); public native btContactSolverInfoFloatData m_warmstartingFactor(float setter);
	public native float m_articulatedWarmstartingFactor(); public native btContactSolverInfoFloatData m_articulatedWarmstartingFactor(float setter);
	public native float m_maxGyroscopicForce(); public native btContactSolverInfoFloatData m_maxGyroscopicForce(float setter);

	public native float m_singleAxisRollingFrictionThreshold(); public native btContactSolverInfoFloatData m_singleAxisRollingFrictionThreshold(float setter);
	public native int m_numIterations(); public native btContactSolverInfoFloatData m_numIterations(int setter);
	public native int m_solverMode(); public native btContactSolverInfoFloatData m_solverMode(int setter);
	public native int m_restingContactRestitutionThreshold(); public native btContactSolverInfoFloatData m_restingContactRestitutionThreshold(int setter);

	public native int m_minimumSolverBatchSize(); public native btContactSolverInfoFloatData m_minimumSolverBatchSize(int setter);
	public native int m_splitImpulse(); public native btContactSolverInfoFloatData m_splitImpulse(int setter);
	
}
