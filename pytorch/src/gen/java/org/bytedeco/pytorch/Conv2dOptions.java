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

@Name("torch::nn::ConvOptions<2>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv2dOptions(Pointer p) { super(p); }


  public Conv2dOptions(
        @Cast("int64_t") long in_channels,
        @Cast("int64_t") long out_channels,
        @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(in_channels, out_channels, kernel_size); }
  private native void allocate(
        @Cast("int64_t") long in_channels,
        @Cast("int64_t") long out_channels,
        @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer in_channels();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer out_channels();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer stride();
  public native @ByRef @NoException(true) conv_padding_t2 padding();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer dilation();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer groups();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
  public native @ByRef @NoException(true) conv_padding_mode_t padding_mode();
}
