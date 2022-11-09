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

@NoOffset @Name("c10::variant<torch::enumtype::kSum,torch::enumtype::kMean,torch::enumtype::kMax>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingBagMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingBagMode(Pointer p) { super(p); }
    public EmbeddingBagMode(kSum value) { this(); put(value); }
    public EmbeddingBagMode(kMean value) { this(); put(value); }
    public EmbeddingBagMode(kMax value) { this(); put(value); }
    public EmbeddingBagMode()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef EmbeddingBagMode put(@ByRef EmbeddingBagMode x);

    public @ByRef kSum get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kSum get0(@ByRef EmbeddingBagMode container);
    @ValueSetter public native EmbeddingBagMode put(@ByRef kSum value);
    public @ByRef kMean get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kMean get1(@ByRef EmbeddingBagMode container);
    @ValueSetter public native EmbeddingBagMode put(@ByRef kMean value);
    public @ByRef kMax get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kMax get2(@ByRef EmbeddingBagMode container);
    @ValueSetter public native EmbeddingBagMode put(@ByRef kMax value);
}

