// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorIteratorConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorIteratorConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorIteratorConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorIteratorConfig position(long position) {
        return (TensorIteratorConfig)super.position(position);
    }
    @Override public TensorIteratorConfig getPointer(long i) {
        return new TensorIteratorConfig((Pointer)this).offsetAddress(i);
    }


  public TensorIteratorConfig() { super((Pointer)null); allocate(); }
  private native void allocate();

  
  

  /** Construction */
  // Stores input/output Tensors without incrementing the reference count.
  // Important: the outputs have to be added before the inputs.
  public native @ByRef TensorIteratorConfig add_output(@Const @ByRef TensorBase output);
  public native @ByRef TensorIteratorConfig add_input(@Const @ByRef TensorBase input);

  // Borrowing from temporaries is unlikely to go well.
  
  

  // Stores input/output Tensors while incrementing the reference count.
  // Note that add_{in,out}put are nearly always what you
  // want, and the exception (adding an unnamed temporary) won't
  // compile.
  public native @ByRef TensorIteratorConfig add_owned_output(@Const @ByRef TensorBase output);
  public native @ByRef TensorIteratorConfig add_owned_input(@Const @ByRef TensorBase input);

  // Advanced API: stores input/output Tensors without incrementing
  // the reference count. The caller must ensure that these Tensors
  // live at least as long as this TensorIteratorConfig and any
  // TensorIteratorBase built from this TensorIteratorConfig.
  // Important: the outputs have to be added before the inputs.
  public native @ByRef TensorIteratorConfig add_borrowed_output(@Const @ByRef TensorBase output);
  public native @ByRef TensorIteratorConfig add_borrowed_input(@Const @ByRef TensorBase input);

  // Borrowing from temporaries is unlikely to go well.
  
  

  // Sets the check_mem_overlap_ flag, which is true by default.
  // If true, inputs are checked for partial overlap with the outputs and
  // outputs are checked for internal overlap (e.g. broadcasted views). An error
  // is raised if unacceptable overlap is detected.
  // If you're migrating an existing operator to using TensorIterator, please
  // consider if the previous implementation checked memory overlap. If it did
  // not, and if the operator is idempotent (for example, Tensor.fill_(0)), then
  // checking memory overlap is BC-breaking. Please don't check memory overlap
  // in that case.
  public native @ByRef TensorIteratorConfig set_check_mem_overlap(@Cast("bool") boolean check_mem_overlap);

  // Sets the check_all_same_dtype_ flag, which is true by default
  // If true, checks that all inputs and defined outputs have the same dtype
  // Setting either of promote_inputs_to_common_dtype_
  //   or cast_common_dtype_to_outputs_ to true will set
  //   check_all_same_dtype_ to false.
  public native @ByRef TensorIteratorConfig check_all_same_dtype(@Cast("const bool") boolean _check_all_same_dtype);

  // Sets the check_all_same_device_ flag, which is true by default
  // If true, all operands must be on the same device, with the possible
  //   exception of CPU scalars, which can be passed to some CUDA kernels
  //   as kernel arguments.
  public native @ByRef TensorIteratorConfig check_all_same_device(
        @Cast("const bool") boolean _check_all_same_device);

  // Sets the enforce_safe_casting_to_output_ flag, which is false by default
  // If true, the iterator's "common dtype" must be computable
  //   (see the [Common Dtype Computation] note) and
  //   canCast(common dtype, output dtype) must be true for all outputs.
  public native @ByRef TensorIteratorConfig enforce_safe_casting_to_output(
        @Cast("const bool") boolean _enforce_safe_casting_to_output);

  // Sets the enforce_linear_iteration_ flag, which is false by default.
  // If true, iteration goes in the same order as a C-contiguous tensor
  // is layed out in memory. i.e. last dimension iterates fastest.
  //
  // This iteration order can be less efficient and may even prevent
  // vectorization. So only use if the correctness of your kernel depends on it.
  public native @ByRef TensorIteratorConfig enforce_linear_iteration(
        @Cast("const bool") boolean _enforce_linear_iteration/*=true*/);
  public native @ByRef TensorIteratorConfig enforce_linear_iteration();

  // Sets the promote_inputs_to_common_dtype_ flag, which is false by default
  // If true, the iterator's "common dtype" is always computed (see the
  //   [Common Dtype Computation] note) and, on the CPU, temporary copies of
  //   the inputs in the common dtype are passed as the actual inputs to
  //   the operation.
  // Setting this flag to true sets check_all_same_dtype_ to false.
  public native @ByRef TensorIteratorConfig promote_inputs_to_common_dtype(
        @Cast("const bool") boolean _promote_inputs_to_common_dtype);

  // Sets the promote_integer_inputs_to_float_ flag, which is false by default
  // NOTE: If set to true, the promote_inputs_to_common_dtype_ must also be
  // true. If true, if the iterator's "common dtype" is an integral type
  // (including bool)
  //   then it is changed to the default float scalar type.
  public native @ByRef TensorIteratorConfig promote_integer_inputs_to_float(
        @Cast("const bool") boolean _promote_integer_inputs_to_float);

  public native @ByRef TensorIteratorConfig is_reduction(@Cast("const bool") boolean _is_reduction);

  public native @ByRef TensorIteratorConfig allow_cpu_scalars(@Cast("const bool") boolean _allow_cpu_scalars);

  // Sets the cast_common_dtype_to_outputs_ flag, which is false by default
  // If true, the iterator's "common dtype" must be computatable
  //   (see the [Common Dtype Computation] note) and, on the CPU, temporary
  //   copies of the outputs are passed as the actual output to the operation.
  //   These temporaries are then copied to the original outputs after
  //   the operation is performed (see cast_outputs()).
  // Setting this flag to true sets check_all_same_dtype_ to false.
  public native @ByRef TensorIteratorConfig cast_common_dtype_to_outputs(
        @Cast("const bool") boolean _cast_common_dtype_to_outputs);

  public native @ByRef TensorIteratorConfig resize_outputs(@Cast("bool") boolean resize_outputs);

  // Bypass output dtype/device computation and fix the dtype/device as
  // specified here.
  public native @ByRef TensorIteratorConfig declare_static_dtype_and_device(
        ScalarType dtype,
        @ByVal Device device);
  public native @ByRef TensorIteratorConfig declare_static_dtype(ScalarType dtype);
  public native @ByRef TensorIteratorConfig declare_static_device(@ByVal Device device);
  public native @ByRef TensorIteratorConfig declare_static_shape(@ByVal LongArrayRef shape);
  public native @ByRef TensorIteratorConfig declare_static_shape(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... shape);
  public native @ByRef TensorIteratorConfig declare_static_shape(
        @ByVal LongArrayRef shape,
        @ByVal LongArrayRef squash_dims);
  public native @ByRef TensorIteratorConfig declare_static_shape(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long[] shape,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... squash_dims);

  // It would be better if this was && qualified, but this would be at the cost
  // of a lot of boilerplate above
  public native @ByVal TensorIterator build();
}
