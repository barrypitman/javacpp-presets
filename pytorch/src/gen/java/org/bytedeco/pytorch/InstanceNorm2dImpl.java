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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ InstanceNorm2d
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the InstanceNorm2d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.InstanceNorm2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::InstanceNorm2dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  InstanceNorm2d
 *  model(InstanceNorm2dOptions(4).eps(0.5).momentum(0.1).affine(false).track_running_stats(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InstanceNorm2dImpl extends InstanceNorm2dImplBase {
    static { Loader.load(); }

  
    
      public InstanceNorm2dImpl(@Const @ByRef InstanceNormOptions options_) { super((Pointer)null); allocate(options_); }
      private native void allocate(@Const @ByRef InstanceNormOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstanceNorm2dImpl(Pointer p) { super(p); }

}
