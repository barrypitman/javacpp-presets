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


/** Options for the {@code Transformer} module
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerOptions options;
 *  TransformerOptions options(16, 4);
 *  auto options = TransformerOptions().d_model(4).nhead(2).dropout(0.0);
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TransformerOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TransformerOptions position(long position) {
        return (TransformerOptions)super.position(position);
    }
    @Override public TransformerOptions getPointer(long i) {
        return new TransformerOptions((Pointer)this).offsetAddress(i);
    }

  // The following constructors are commonly used
  // Please don't add more unless it is proved as a common usage
  public TransformerOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TransformerOptions(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead) { super((Pointer)null); allocate(d_model, nhead); }
  private native void allocate(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead);
  public TransformerOptions(
        @Cast("int64_t") long d_model,
        @Cast("int64_t") long nhead,
        @Cast("int64_t") long num_encoder_layers,
        @Cast("int64_t") long num_decoder_layers) { super((Pointer)null); allocate(d_model, nhead, num_encoder_layers, num_decoder_layers); }
  private native void allocate(
        @Cast("int64_t") long d_model,
        @Cast("int64_t") long nhead,
        @Cast("int64_t") long num_encoder_layers,
        @Cast("int64_t") long num_decoder_layers);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer d_model();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer nhead();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_encoder_layers();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_decoder_layers();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer dim_feedforward();
  public native @ByRef @NoException(true) DoublePointer dropout();
  public native @ByRef @NoException(true) TransformerActivation activation();
  public native @ByRef @NoException(true) AnyModule custom_encoder();
  public native @ByRef @NoException(true) AnyModule custom_decoder();
}
