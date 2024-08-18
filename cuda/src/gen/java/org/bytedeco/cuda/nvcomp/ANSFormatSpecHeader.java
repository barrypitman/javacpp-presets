// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/**
 * \brief Format specification for ANS compression
 */
@Namespace("nvcomp") @Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class ANSFormatSpecHeader extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ANSFormatSpecHeader() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANSFormatSpecHeader(Pointer p) { super(p); }
}
