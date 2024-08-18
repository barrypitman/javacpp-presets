// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ConvertError extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvertError(Pointer p) { super(p); }


  public ConvertError(@StdString BytePointer message) { super((Pointer)null); allocate(message); }
  private native void allocate(@StdString BytePointer message);
  public ConvertError(@StdString String message) { super((Pointer)null); allocate(message); }
  private native void allocate(@StdString String message);

  public native @NoException(true) @Cast("const char*") BytePointer what();

  public native void AppendContext(@StdString BytePointer context);
  public native void AppendContext(@StdString String context);
}
