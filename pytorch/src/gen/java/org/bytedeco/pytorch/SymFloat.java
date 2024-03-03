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


// NB: this is actually double precision; we're using the Python naming here
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymFloat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymFloat(Pointer p) { super(p); }

  /*implicit*/ public SymFloat(double d) { super((Pointer)null); allocate(d); }
private native void allocate(double d);
  public SymFloat(@ByVal SymNode ptr) { super((Pointer)null); allocate(ptr); }
  private native void allocate(@ByVal SymNode ptr);
  public SymFloat() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native SymNodeImpl toSymNodeImplUnowned();

  

  // Only valid if is_symbolic()
  public native @ByVal SymNode toSymNodeImpl();

  // Guaranteed to return a SymNode, wrapping using base if necessary
  public native @ByVal SymNode wrap_node(@Const @ByRef SymNode base);

  public native double expect_float();

  public native @ByVal @Name("operator +") SymFloat add(@Const @ByRef SymFloat arg0);
  public native @ByVal @Name("operator -") SymFloat subtract(@Const @ByRef SymFloat arg0);
  public native @ByVal @Name("operator *") SymFloat multiply(@Const @ByRef SymFloat arg0);
  public native @ByVal @Name("operator /") SymFloat divide(@Const @ByRef SymFloat arg0);

  public native @ByVal SymBool sym_eq(@Const @ByRef SymFloat arg0);
  public native @ByVal SymBool sym_ne(@Const @ByRef SymFloat arg0);
  public native @ByVal SymBool sym_lt(@Const @ByRef SymFloat arg0);
  public native @ByVal SymBool sym_le(@Const @ByRef SymFloat arg0);
  public native @ByVal SymBool sym_gt(@Const @ByRef SymFloat arg0);
  public native @ByVal SymBool sym_ge(@Const @ByRef SymFloat arg0);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef SymFloat o);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef SymFloat o);
  public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef SymFloat o);
  public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef SymFloat o);
  public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef SymFloat o);
  public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef SymFloat o);

  public native @ByVal SymFloat min(@Const @ByRef SymFloat sci);
  public native @ByVal SymFloat max(@Const @ByRef SymFloat sci);

  // Need guidance on where to put this code
  public native @ByVal SymFloat sqrt();

  // Insert a guard for the float to be its concrete value, and then return
  // that value.  This operation always works, even if the float is symbolic,
  // so long as we know what the underlying value is. Don't blindly put this
  // everywhere; you can cause overspecialization of PyTorch programs with
  // this method.
  //
  // It should be called as guard_float(__FILE__, __LINE__).  The file and line
  // number can be used to diagnose overspecialization.
  public native double guard_float(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native double guard_float(String file, @Cast("int64_t") long line);

  public native @Cast("bool") boolean has_hint();

  // N.B. It's important to keep this definition in the header
  // as we expect if checks to be folded for mobile builds
  // where `is_symbolic` is always false
  public native @Cast("bool") boolean is_symbolic();

  public native double as_float_unchecked();
}
