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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AvgPool3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies avgpool over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AvgPool3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AvgPool3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AvgPool3d model(AvgPool3dOptions(5).stride(2));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool3dImpl extends AvgPool3dImplBase {
    static { Loader.load(); }

  
    public AvgPool3dImpl(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
    public AvgPool3dImpl(@Const @ByRef AvgPool3dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef AvgPool3dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool3dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
