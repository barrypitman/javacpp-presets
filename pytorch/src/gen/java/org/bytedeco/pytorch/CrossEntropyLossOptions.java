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
 // namespace functional

// ============================================================================

/** Options for the {@code CrossEntropyLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  CrossEntropyLoss model(CrossEntropyLossOptions().ignore_index(-100).reduction(torch::kMean));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CrossEntropyLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CrossEntropyLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CrossEntropyLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CrossEntropyLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CrossEntropyLossOptions position(long position) {
        return (CrossEntropyLossOptions)super.position(position);
    }
    @Override public CrossEntropyLossOptions getPointer(long i) {
        return new CrossEntropyLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor weight();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer ignore_index();
  public native @ByRef @NoException(true) loss_reduction_t reduction();
  public native @ByRef @NoException(true) DoublePointer label_smoothing();
}
