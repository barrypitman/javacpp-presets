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

@NoOffset @Name("c10::optional<c10::Stride>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StrideOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StrideOptional(Pointer p) { super(p); }
    public StrideOptional(Stride value) { this(); put(value); }
    public StrideOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StrideOptional put(@ByRef StrideOptional x);


    public native boolean has_value();
    @Name("value") public native @ByRef Stride get();
    @ValueSetter public native StrideOptional put(@ByRef Stride value);
}

