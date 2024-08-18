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


//struct b3InertiaData;
//b3InertiaData

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3JacobiSolverInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3JacobiSolverInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3JacobiSolverInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3JacobiSolverInfo position(long position) {
        return (b3JacobiSolverInfo)super.position(position);
    }
    @Override public b3JacobiSolverInfo getPointer(long i) {
        return new b3JacobiSolverInfo((Pointer)this).offsetAddress(i);
    }

	public native int m_fixedBodyIndex(); public native b3JacobiSolverInfo m_fixedBodyIndex(int setter);

	public native float m_deltaTime(); public native b3JacobiSolverInfo m_deltaTime(float setter);
	public native float m_positionDrift(); public native b3JacobiSolverInfo m_positionDrift(float setter);
	public native float m_positionConstraintCoeff(); public native b3JacobiSolverInfo m_positionConstraintCoeff(float setter);
	public native int m_numIterations(); public native b3JacobiSolverInfo m_numIterations(int setter);

	public b3JacobiSolverInfo() { super((Pointer)null); allocate(); }
	private native void allocate();
}
