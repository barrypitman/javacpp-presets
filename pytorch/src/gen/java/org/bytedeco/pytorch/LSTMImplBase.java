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

@Name("torch::nn::detail::RNNImplBase<torch::nn::LSTMImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LSTMImplBase extends LSTMImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LSTMImplBase(Pointer p) { super(p); }

  public LSTMImplBase(@Const @ByRef RNNOptionsBase options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@Const @ByRef RNNOptionsBase options_);

  /** Initializes the parameters of the RNN module. */
  public native void reset();

  public native void reset_parameters();

  /** Overrides {@code nn::Module::to()} to call {@code flatten_parameters()} after the
   *  original operation. */
  public native void to(@ByVal Device device, ScalarType dtype, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(@ByVal Device device, ScalarType dtype);
  public native void to(ScalarType dtype, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(ScalarType dtype);
  public native void to(@ByVal Device device, @Cast("bool") boolean non_blocking/*=false*/);
  public native void to(@ByVal Device device);

  /** Pretty prints the RNN module into the given {@code stream}. */
  
  ///
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Modifies the internal storage of weights for optimization purposes.
   * 
   *  On CPU, this method should be called if any of the weight or bias vectors
   *  are changed (i.e. weights are added or removed). On GPU, it should be
   *  called __any time the storage of any parameter is modified__, e.g. any
   *  time a parameter is assigned a new value. This allows using the fast path
   *  in cuDNN implementations of respective RNN {@code forward()} methods. It is
   *  called once upon construction, inside {@code reset()}. */
  public native void flatten_parameters();

  public native @ByVal TensorVector all_weights();

  /** The RNN's options. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef RNNOptionsBase options_base(); public native LSTMImplBase options_base(RNNOptionsBase setter);
}
