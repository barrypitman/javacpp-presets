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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MaxPool2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies maxpool over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MaxPool2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MaxPool2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MaxPool2d model(MaxPool2dOptions({3, 2}).stride({2, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MaxPool2dImpl extends MaxPool2dImplBase {
    static { Loader.load(); }

  
    public MaxPool2dImpl(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
    public MaxPool2dImpl(@Const @ByRef MaxPool2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef MaxPool2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPool2dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the outputs and the indices of the max values.
   *  Useful for {@code torch::nn::MaxUnpool2d} later. */
  public native @ByVal T_TensorTensor_T forward_with_indices(@Const @ByRef Tensor input);
}
