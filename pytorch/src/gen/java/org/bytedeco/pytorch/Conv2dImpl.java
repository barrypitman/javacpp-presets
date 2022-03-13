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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Conv2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies convolution over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Conv2d to learn about
 *  the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::Conv2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Conv2d model(Conv2dOptions(3, 2, 3).stride(1).bias(false));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv2dImpl extends Conv2dImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv2dImpl(Pointer p) { super(p); }

  public Conv2dImpl(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(input_channels, output_channels, kernel_size); }
  @NoDeallocator private native void allocate(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
  public Conv2dImpl(@ByVal Conv2dOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@ByVal Conv2dOptions options_);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
