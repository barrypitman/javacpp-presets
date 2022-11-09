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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExceptionValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExceptionValue(Pointer p) { super(p); }

  public ExceptionValue(@StdString BytePointer message) { super((Pointer)null); allocate(message); }
  private native void allocate(@StdString BytePointer message);
  public ExceptionValue(@StdString String message) { super((Pointer)null); allocate(message); }
  private native void allocate(@StdString String message);

  public native @StdString BytePointer kind();

  public native @SharedPtr @ByVal SugaredValue call(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @ByVal NamedValueArrayRef args,
        @ByVal NamedValueArrayRef arg3,
        @Cast("size_t") long arg4);

  public native @StdString BytePointer message_(); public native ExceptionValue message_(BytePointer setter);
}
