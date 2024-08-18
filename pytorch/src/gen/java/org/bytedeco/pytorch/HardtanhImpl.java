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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Hardtanh ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the HardTanh function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Hardtanh to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::HardtanhOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Hardtanh
 *  model(HardtanhOptions().min_val(-42.42).max_val(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HardtanhImpl extends HardtanhImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HardtanhImpl(Pointer p) { super(p); }

  public HardtanhImpl(@Const @ByRef(nullValue = "torch::nn::HardtanhOptions{}") HardtanhOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::HardtanhImpl>") private native void allocate(@Const @ByRef(nullValue = "torch::nn::HardtanhOptions{}") HardtanhOptions options_);
  public HardtanhImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::HardtanhImpl>") private native void allocate();

  public native @ByVal Tensor forward(@ByVal Tensor input);

  public native void reset();

  /** Pretty prints the {@code Hardtanh} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef HardtanhOptions options(); public native HardtanhImpl options(HardtanhOptions setter);
}
