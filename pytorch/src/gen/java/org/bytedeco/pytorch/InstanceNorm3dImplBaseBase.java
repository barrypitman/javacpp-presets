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

@Name("torch::nn::NormImplBase<3,torch::nn::InstanceNorm3dImpl,torch::nn::InstanceNormOptions>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InstanceNorm3dImplBaseBase extends InstanceNorm3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstanceNorm3dImplBaseBase(Pointer p) { super(p); }


  public native void reset();

  public native void reset_running_stats();

  public native void reset_parameters();

  /** The options with which this module was constructed. */
  public native @ByRef InstanceNormOptions options(); public native InstanceNorm3dImplBaseBase options(InstanceNormOptions setter);

  /** The learned weight.
   *  Only defined if the {@code affine} option was {@code true} upon construction. */
  public native @ByRef Tensor weight(); public native InstanceNorm3dImplBaseBase weight(Tensor setter);

  /** The learned bias.
   *  Only defined if the {@code affine} option was {@code true} upon construction. */
  public native @ByRef Tensor bias(); public native InstanceNorm3dImplBaseBase bias(Tensor setter);

  /** The running mean.
   *  Only defined if the {@code track_running_stats} option was {@code true} upon construction. */
  public native @ByRef Tensor running_mean(); public native InstanceNorm3dImplBaseBase running_mean(Tensor setter);

  /** The running variance.
   *  Only defined if the {@code track_running_stats} option was {@code true} upon construction. */
  public native @ByRef Tensor running_var(); public native InstanceNorm3dImplBaseBase running_var(Tensor setter);

  /** The number of the forward call.
   *  Only defined if the {@code track_running_stats} option was {@code true} upon construction. */
  public native @ByRef Tensor num_batches_tracked(); public native InstanceNorm3dImplBaseBase num_batches_tracked(Tensor setter);
}
