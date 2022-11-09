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


/** Options for {@code torch::nn::functional::interpolate}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::interpolate(input,
 *  F::InterpolateFuncOptions().size(std::vector<int64_t>({4})).mode(torch::kNearest));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InterpolateFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public InterpolateFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InterpolateFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpolateFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InterpolateFuncOptions position(long position) {
        return (InterpolateFuncOptions)super.position(position);
    }
    @Override public InterpolateFuncOptions getPointer(long i) {
        return new InterpolateFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) LongVectorOptional size();
  public native @ByRef @NoException(true) DoubleVectorOptional scale_factor();
  public native @ByRef @NoException(true) interpolate_mode_t mode();
  public native @ByRef @NoException(true) BoolOptional align_corners();
  public native @ByRef @NoException(true) BoolOptional recompute_scale_factor();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer antialias();
}
