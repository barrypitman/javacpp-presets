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

@Name("c10::SingletonTypePtr<c10::StringType>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringTypePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTypePtr(Pointer p) { super(p); }

  /* implicit */ public StringTypePtr(StringType p) { super((Pointer)null); allocate(p); }
private native void allocate(StringType p);

  // We need this to satisfy Pybind11, but it shouldn't be hit.

  public native StringType get();

  public native @Name("operator ->") StringType access();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
}
