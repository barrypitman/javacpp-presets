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
 // namespace functional

// ============================================================================

/** Options for the {@code CosineEmbeddingLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  CosineEmbeddingLoss model(CosineEmbeddingLossOptions().margin(0.5));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CosineEmbeddingLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CosineEmbeddingLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CosineEmbeddingLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CosineEmbeddingLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CosineEmbeddingLossOptions position(long position) {
        return (CosineEmbeddingLossOptions)super.position(position);
    }
    @Override public CosineEmbeddingLossOptions getPointer(long i) {
        return new CosineEmbeddingLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer margin();
  public native @ByRef @NoException(true) loss_reduction_t reduction();
}
