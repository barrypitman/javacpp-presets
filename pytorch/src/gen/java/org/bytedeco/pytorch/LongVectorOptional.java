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

@NoOffset @Name("c10::optional<std::vector<int64_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LongVectorOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongVectorOptional(Pointer p) { super(p); }
    public LongVectorOptional(LongVector value) { this(); put(value); }
    public LongVectorOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef LongVectorOptional put(@ByRef LongVectorOptional x);


    public native boolean has_value();
    @Name("value") public native @Cast("std::vector<int64_t>*") @ByRef LongVector get();
    @ValueSetter public native LongVectorOptional put(@Cast("std::vector<int64_t>*") @ByRef LongVector value);
}

