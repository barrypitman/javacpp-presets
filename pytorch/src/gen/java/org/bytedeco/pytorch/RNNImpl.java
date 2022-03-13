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
 // namespace detail

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ RNN ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A multi-layer Elman RNN module with Tanh or ReLU activation.
 *  See https://pytorch.org/docs/master/generated/torch.nn.RNN.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::RNNOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  RNN model(RNNOptions(128, 64).num_layers(3).dropout(0.2).nonlinearity(torch::kTanh));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNImpl extends RNNImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNImpl(Pointer p) { super(p); }

  public RNNImpl(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public RNNImpl(@Const @ByRef RNNOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef RNNOptions options_);

  public native @ByVal TensorTensorTuple forward(@Const @ByRef Tensor input, @ByVal(nullValue = "at::Tensor{}") Tensor hx);
  public native @ByVal TensorTensorTuple forward(@Const @ByRef Tensor input);
  public native @ByVal PackedSequenceTensorTuple forward_with_packed_input(@Const @ByRef PackedSequence packed_input, @ByVal(nullValue = "at::Tensor{}") Tensor hx);
  public native @ByVal PackedSequenceTensorTuple forward_with_packed_input(@Const @ByRef PackedSequence packed_input);

  public native @ByRef RNNOptions options(); public native RNNImpl options(RNNOptions setter);
}
