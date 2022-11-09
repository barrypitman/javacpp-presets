// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ HingeEmbeddingLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that measures the loss given an input tensor :math:{@code x}
 *  and a labels tensor :math:{@code y} (containing 1 or -1).
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.HingeEmbeddingLoss to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::HingeEmbeddingLossOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  HingeEmbeddingLoss
 *  model(HingeEmbeddingLossOptions().margin(4).reduction(torch::kNone));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HingeEmbeddingLossImpl extends HingeEmbeddingLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HingeEmbeddingLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HingeEmbeddingLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HingeEmbeddingLossImpl position(long position) {
        return (HingeEmbeddingLossImpl)super.position(position);
    }
    @Override public HingeEmbeddingLossImpl getPointer(long i) {
        return new HingeEmbeddingLossImpl((Pointer)this).offsetAddress(i);
    }

  public HingeEmbeddingLossImpl(
        @Const @ByRef(nullValue = "torch::nn::HingeEmbeddingLossOptions{}") HingeEmbeddingLossOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(
        @Const @ByRef(nullValue = "torch::nn::HingeEmbeddingLossOptions{}") HingeEmbeddingLossOptions options_);
  public HingeEmbeddingLossImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code HingeEmbeddingLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef HingeEmbeddingLossOptions options(); public native HingeEmbeddingLossImpl options(HingeEmbeddingLossOptions setter);
}
