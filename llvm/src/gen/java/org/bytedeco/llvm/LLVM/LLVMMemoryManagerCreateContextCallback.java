// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryManagerCreateContextCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMMemoryManagerCreateContextCallback(Pointer p) { super(p); }
    protected LLVMMemoryManagerCreateContextCallback() { allocate(); }
    private native void allocate();
    public native Pointer call(Pointer CtxCtx);
}
