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


// We special case Graph attributes like this because we want to ensure that
// Graph::copy() is called when we clone() these attributes.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GraphAttr extends AttributeValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphAttr(Pointer p) { super(p); }

  public GraphAttr(@ByVal Symbol name, @SharedPtr @ByVal Graph value_) { super((Pointer)null); allocate(name, value_); }
  private native void allocate(@ByVal Symbol name, @SharedPtr @ByVal Graph value_);
  public native @SharedPtr @ByRef Graph value();
  public native @UniquePtr @ByVal AttributeValue clone();
  public native JitAttributeKind kind();
}
