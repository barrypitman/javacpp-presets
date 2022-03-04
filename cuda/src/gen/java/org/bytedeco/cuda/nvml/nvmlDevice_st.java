// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlDevice_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvmlDevice_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlDevice_st(Pointer p) { super(p); }
}
