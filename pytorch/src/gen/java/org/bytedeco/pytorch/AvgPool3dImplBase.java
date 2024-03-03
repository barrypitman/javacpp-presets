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

@Name("torch::nn::AvgPoolImpl<3,torch::nn::AvgPool3dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool3dImplBase extends AvgPool3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool3dImplBase(Pointer p) { super(p); }

  public AvgPool3dImplBase(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public AvgPool3dImplBase(@Const @ByRef AvgPool3dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@Const @ByRef AvgPool3dOptions options_);

  public native void reset();

  /** Pretty prints the {@code AvgPool{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef AvgPool3dOptions options(); public native AvgPool3dImplBase options(AvgPool3dOptions setter);
}
