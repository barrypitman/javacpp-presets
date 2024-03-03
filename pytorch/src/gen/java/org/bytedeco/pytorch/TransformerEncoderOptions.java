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


/** Options for the {@code TransformerEncoder}
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerEncoderLayer encoderLayer(TransformerEncoderLayerOptions(512,
 *  8).dropout(0.1)); auto options = TransformerEncoderOptions(encoderLayer,
 *  6).norm(LayerNorm(LayerNormOptions({2})));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerEncoderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerEncoderOptions(Pointer p) { super(p); }

  // This constructor will keep a shallow copy of encoder_layer, so it keeps all
  // the data in encoder_layer.
  // This constructor will create a new TransformerEncoderLayer obj based on
  // passed in encoder_layer_options.
  public TransformerEncoderOptions(
        @Const @ByRef TransformerEncoderLayerOptions encoder_layer_options,
        @Cast("int64_t") long num_layers) { super((Pointer)null); allocate(encoder_layer_options, num_layers); }
  private native void allocate(
        @Const @ByRef TransformerEncoderLayerOptions encoder_layer_options,
        @Cast("int64_t") long num_layers);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_layers();
  public native @ByRef @NoException(true) AnyModule norm();
}
