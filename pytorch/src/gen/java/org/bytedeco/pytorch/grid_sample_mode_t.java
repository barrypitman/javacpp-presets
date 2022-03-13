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

@NoOffset @Name("c10::variant<torch::enumtype::kBilinear,torch::enumtype::kNearest>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class grid_sample_mode_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public grid_sample_mode_t(Pointer p) { super(p); }
    public grid_sample_mode_t(kBilinear value) { this(); put(value); }
    public grid_sample_mode_t(kNearest value) { this(); put(value); }
    public grid_sample_mode_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef grid_sample_mode_t put(@ByRef grid_sample_mode_t x);

    public @ByRef kBilinear get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kBilinear get0(@ByRef grid_sample_mode_t container);
    @ValueSetter public native grid_sample_mode_t put(@ByRef kBilinear value);
    public @ByRef kNearest get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kNearest get1(@ByRef grid_sample_mode_t container);
    @ValueSetter public native grid_sample_mode_t put(@ByRef kNearest value);
}

