// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvrtc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvrtc.*;



/*************************************************************************//**
 *
 * \defgroup compilation Compilation
 *
 * NVRTC defines the following type and functions for actual compilation.
 *
 ****************************************************************************/


/**
 * \ingroup compilation
 * \brief   nvrtcProgram is the unit of compilation, and an opaque handle for
 *          a program.
 *
 * To compile a CUDA program string, an instance of nvrtcProgram must be
 * created first with ::nvrtcCreateProgram, then compiled with
 * ::nvrtcCompileProgram.
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvrtc.class)
public class _nvrtcProgram extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _nvrtcProgram() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _nvrtcProgram(Pointer p) { super(p); }
}
