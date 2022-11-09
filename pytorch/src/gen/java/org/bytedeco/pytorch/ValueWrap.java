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

@Name("torch::jit::Wrap<torch::jit::Value>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ValueWrap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueWrap(Pointer p) { super(p); }

  public ValueWrap(Value p) { super((Pointer)null); allocate(p); }
  private native void allocate(Value p);
  public native void clear();
  public native Value elem(); public native ValueWrap elem(Value setter);
  public static class Clear_cb_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Clear_cb_Pointer(Pointer p) { super(p); }
      protected Clear_cb_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0);
  }
  public native Clear_cb_Pointer clear_cb(); public native ValueWrap clear_cb(Clear_cb_Pointer setter);
}
