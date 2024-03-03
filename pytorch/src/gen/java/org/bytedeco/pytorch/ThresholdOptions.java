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
 // namespace functional

// ============================================================================

/** Options for the {@code Threshold} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Threshold model(ThresholdOptions(42.42, 24.24).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ThresholdOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThresholdOptions(Pointer p) { super(p); }

  public ThresholdOptions(double threshold, double value) { super((Pointer)null); allocate(threshold, value); }
  private native void allocate(double threshold, double value);
  public native @ByRef @NoException(true) DoublePointer threshold();
  public native @ByRef @NoException(true) DoublePointer value();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
