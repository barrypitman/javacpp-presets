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


// NB: this is actually double precision; we're using the Python naming here
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymFloat extends Pointer {
    static { Loader.load(); }

  /*implicit*/ public SymFloat(double d) { super((Pointer)null); allocate(d); }
private native void allocate(double d);
  public SymFloat(@ByVal @Cast("c10::SymFloatNode*") Pointer ptr) { super((Pointer)null); allocate(ptr); }
  private native void allocate(@ByVal @Cast("c10::SymFloatNode*") Pointer ptr);
  public SymFloat() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native SymFloatNodeImpl toSymFloatNodeImplUnowned();

  

  public native @ByVal @Cast("c10::SymFloatNode*") Pointer toSymFloatNodeImpl();
  public static native @ByVal SymFloat toSymFloat(@ByVal @Cast("c10::SymFloatNode*") Pointer sin);

  public native double expect_float();

  public native @ByVal @Name("operator +") SymFloat add(@ByVal SymFloat arg0);
  public native @ByVal @Name("operator -") SymFloat subtract(@ByVal SymFloat arg0);
  public native @ByVal @Name("operator *") SymFloat multiply(@ByVal SymFloat arg0);
  public native @ByVal @Name("operator /") SymFloat divide(@ByVal SymFloat arg0);

  // N.B. It's important to keep this definition in the header
  // as we expect if checks to be folded for mobile builds
  // where `is_symbolic` is always false
  public native @Cast("bool") boolean is_symbolic();

  public native double as_float_unchecked();
}
