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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyMLCPConstraintSolver extends btMultiBodyConstraintSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyMLCPConstraintSolver(Pointer p) { super(p); }


	/** Constructor
	 * 
	 *  @param solver [in] MLCP solver. Assumed it's not null.
	 *  @param maxLCPSize [in] Maximum size of LCP to solve using MLCP solver. If the MLCP size exceeds this number, sequaltial impulse method will be used. */
	public btMultiBodyMLCPConstraintSolver(btMLCPSolverInterface solver) { super((Pointer)null); allocate(solver); }
	private native void allocate(btMLCPSolverInterface solver);

	/** Destructor */

	/** Sets MLCP solver. Assumed it's not null. */
	public native void setMLCPSolver(btMLCPSolverInterface solver);

	/** Returns the number of fallbacks of using btSequentialImpulseConstraintSolver, which happens when the MLCP
	 *  solver fails. */
	public native int getNumFallbacks();

	/** Sets the number of fallbacks. This function may be used to reset the number to zero. */
	public native void setNumFallbacks(int num);

	/** Returns the constraint solver type. */
	public native @Cast("btConstraintSolverType") int getSolverType();
}
