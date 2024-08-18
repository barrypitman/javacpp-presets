// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A custom generator function. This can be used to create a custom generator
 * object using LLVMOrcCreateCustomCAPIDefinitionGenerator. The resulting
 * object can be attached to a JITDylib, via LLVMOrcJITDylibAddGenerator, to
 * receive callbacks when lookups fail to match existing definitions.
 *
 * GeneratorObj will contain the address of the custom generator object.
 *
 * Ctx will contain the context object passed to
 * LLVMOrcCreateCustomCAPIDefinitionGenerator.
 *
 * LookupState will contain a pointer to an LLVMOrcLookupStateRef object. This
 * can optionally be modified to make the definition generation process
 * asynchronous: If the LookupStateRef value is copied, and the original
 * LLVMOrcLookupStateRef set to null, the lookup will be suspended. Once the
 * asynchronous definition process has been completed clients must call
 * LLVMOrcLookupStateContinueLookup to continue the lookup (this should be
 * done unconditionally, even if errors have occurred in the mean time, to
 * free the lookup state memory and notify the query object of the failures).
 * If LookupState is captured this function must return LLVMErrorSuccess.
 *
 * The Kind argument can be inspected to determine the lookup kind (e.g.
 * as-if-during-static-link, or as-if-during-dlsym).
 *
 * The JD argument specifies which JITDylib the definitions should be generated
 * into.
 *
 * The JDLookupFlags argument can be inspected to determine whether the original
 * lookup included non-exported symbols.
 *
 * Finally, the LookupSet argument contains the set of symbols that could not
 * be found in JD already (the set of generation candidates).
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction(Pointer p) { super(p); }
    protected LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction() { allocate(); }
    private native void allocate();
    public native LLVMErrorRef call(
    LLVMOrcDefinitionGeneratorRef GeneratorObj, Pointer Ctx,
    @ByPtrPtr LLVMOrcLookupStateRef LookupState, @Cast("LLVMOrcLookupKind") int Kind,
    LLVMOrcJITDylibRef JD, @Cast("LLVMOrcJITDylibLookupFlags") int JDLookupFlags,
    @Cast("LLVMOrcCLookupSet") LLVMOrcCLookupSetElement LookupSet, @Cast("size_t") long LookupSetSize);
}
