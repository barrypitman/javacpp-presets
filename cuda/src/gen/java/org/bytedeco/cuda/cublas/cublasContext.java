// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cublas;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cublas.*;


/* Opaque structure holding CUBLAS library context */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cublas.class)
public class cublasContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cublasContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasContext(Pointer p) { super(p); }
}
