// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvjpeg;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvjpeg.*;



@Properties(inherit = org.bytedeco.cuda.presets.nvjpeg.class)
public class tDevMallocV2 extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    tDevMallocV2(Pointer p) { super(p); }
    protected tDevMallocV2() { allocate(); }
    private native void allocate();
    public native int call(Pointer ctx, @Cast("void**") PointerPointer ptr, @Cast("size_t") long size, CUstream_st stream);
}
