// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Interface used to provide a module to JIT or interpreter.
 * This is now just a synonym for llvm::Module, but we have to keep using the
 * different type to keep binary compatibility.
 */
@Name("LLVMOpaqueModuleProvider") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMModuleProviderRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMModuleProviderRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMModuleProviderRef(Pointer p) { super(p); }
}
