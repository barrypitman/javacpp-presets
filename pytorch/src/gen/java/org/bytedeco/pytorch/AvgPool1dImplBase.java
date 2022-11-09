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


/** Base class for all (dimension-specialized) avgpool modules. */
@Name("torch::nn::AvgPoolImpl<1,torch::nn::AvgPool1dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool1dImplBase extends AvgPool1dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool1dImplBase(Pointer p) { super(p); }

  public AvgPool1dImplBase(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
  @NoDeallocator private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
  public AvgPool1dImplBase(@Const @ByRef AvgPool1dOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef AvgPool1dOptions options_);

  public native void reset();

  /** Pretty prints the {@code AvgPool{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef AvgPool1dOptions options(); public native AvgPool1dImplBase options(AvgPool1dOptions setter);
}
