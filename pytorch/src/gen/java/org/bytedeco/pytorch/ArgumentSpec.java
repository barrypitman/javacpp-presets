// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ArgumentSpec extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArgumentSpec(Pointer p) { super(p); }

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public ArgumentSpec(@Cast("size_t") long num_flat_tensor_inputs, @Cast("size_t") long num_flat_optional_inputs) { super((Pointer)null); allocate(num_flat_tensor_inputs, num_flat_optional_inputs); }
  private native void allocate(@Cast("size_t") long num_flat_tensor_inputs, @Cast("size_t") long num_flat_optional_inputs);

  public native void addOptional(@Const @ByRef IValue input);

  public native void addTensor(@Const @ByRef IValue input, @Cast("bool") boolean with_grad);

  public native void combineHash(@Const @ByRef ArgumentInfo arg);

  // equality is fast: check ninputs, and then check the raw array data,
  // there are no size/stride indirections
  // hopefully std::vector<bool> has fast equality
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ArgumentSpec spec);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef ArgumentSpec spec);
  public native @Cast("size_t") long numTensors();
  public native @Const @ByRef ArgumentInfo tensorAt(@Cast("size_t") long i);
  public native @Cast("size_t") long numOptionals();
  public native @Cast("bool") boolean isPresent(@Cast("size_t") long i);
  public native @Cast("size_t") @Name("hashCode") long _hashCode();
}
