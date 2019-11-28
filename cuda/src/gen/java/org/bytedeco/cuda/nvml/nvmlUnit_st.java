// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;



/** \} */

/***************************************************************************************************/
/** \defgroup nvmlUnitStructs Unit Structs
 *  \{
 */
/***************************************************************************************************/

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlUnit_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvmlUnit_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlUnit_st(Pointer p) { super(p); }
}
