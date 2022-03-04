// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

/** CUDA memory pool */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemPoolHandle_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUmemPoolHandle_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemPoolHandle_st(Pointer p) { super(p); }
}
