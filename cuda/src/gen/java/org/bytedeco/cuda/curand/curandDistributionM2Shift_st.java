// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.curand;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.curand.*;

/** \endcond */
/**
 * CURAND distribution M2
 */
/** \cond UNHIDE_TYPEDEFS */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.curand.class)
public class curandDistributionM2Shift_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public curandDistributionM2Shift_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public curandDistributionM2Shift_st(Pointer p) { super(p); }
}
