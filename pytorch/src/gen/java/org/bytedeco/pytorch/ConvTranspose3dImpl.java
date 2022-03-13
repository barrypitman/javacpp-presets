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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ConvTranspose3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the ConvTranspose3d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ConvTranspose3d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ConvTranspose3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ConvTranspose3d model(ConvTranspose3dOptions(2, 2, 2).stride(1).bias(false));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose3dImpl extends ConvTranspose3dImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose3dImpl(Pointer p) { super(p); }

  public ConvTranspose3dImpl(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(input_channels, output_channels, kernel_size); }
  @NoDeallocator private native void allocate(
        @Cast("int64_t") long input_channels,
        @Cast("int64_t") long output_channels,
        @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public ConvTranspose3dImpl(@ByVal ConvTranspose3dOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@ByVal ConvTranspose3dOptions options_);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input,
                   @Const @ByRef(nullValue = "c10::optional<at::IntArrayRef>(c10::nullopt)") LongArrayRefOptional output_size);
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
