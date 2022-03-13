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


/** Options for the {@code Upsample} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Upsample model(UpsampleOptions().scale_factor(std::vector<double>({3})).mode(torch::kLinear).align_corners(false));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UpsampleOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public UpsampleOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UpsampleOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UpsampleOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public UpsampleOptions position(long position) {
        return (UpsampleOptions)super.position(position);
    }
    @Override public UpsampleOptions getPointer(long i) {
        return new UpsampleOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) LongVectorOptional size();
  public native @ByRef @NoException(true) DoubleVectorOptional scale_factor();
  public native @ByRef @NoException(true) upsample_mode_t mode();
  public native @ByRef @NoException(true) BoolOptional align_corners();
}
