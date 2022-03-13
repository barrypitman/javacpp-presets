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

@NoOffset @Name("c10::optional<c10::ArrayRef<double> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleArrayRefOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleArrayRefOptional(Pointer p) { super(p); }
    public DoubleArrayRefOptional(DoubleArrayRef value) { this(); put(value); }
    public DoubleArrayRefOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DoubleArrayRefOptional put(@ByRef DoubleArrayRefOptional x);


    public native boolean has_value();
    @Name("value") public native @ByRef DoubleArrayRef get();
    @ValueSetter public native DoubleArrayRefOptional put(@ByRef DoubleArrayRef value);
}

