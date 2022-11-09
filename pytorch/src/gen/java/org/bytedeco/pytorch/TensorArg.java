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


// The following are utility functions for checking that arguments
// make sense.  These are particularly useful for native functions,
// which do NO argument checking by default.

@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorArg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArg(Pointer p) { super(p); }

  @MemberGetter public native @Const @ByRef Tensor tensor();
  public native @Cast("const char*") BytePointer name(); public native TensorArg name(BytePointer setter);
  public native int pos(); public native TensorArg pos(int setter); // 1-indexed
  public TensorArg(@Const @ByRef Tensor tensor, @Cast("const char*") BytePointer name, int pos) { super((Pointer)null); allocate(tensor, name, pos); }
  private native void allocate(@Const @ByRef Tensor tensor, @Cast("const char*") BytePointer name, int pos);
  public TensorArg(@Const @ByRef Tensor tensor, String name, int pos) { super((Pointer)null); allocate(tensor, name, pos); }
  private native void allocate(@Const @ByRef Tensor tensor, String name, int pos);
  // Try to mitigate any possibility of dangling reference to temporaries.
  
  public native @Const @Name("operator ->") Tensor access();
  public native @Const @ByRef @Name("operator *") Tensor multiply();
}
