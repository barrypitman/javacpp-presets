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

@NoOffset @Name("c10::variant<torch::enumtype::kNone,torch::enumtype::kBatchMean,torch::enumtype::kSum,torch::enumtype::kMean>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class kldiv_loss_reduction_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public kldiv_loss_reduction_t(Pointer p) { super(p); }
    public kldiv_loss_reduction_t(kNone value) { this(); put(value); }
    public kldiv_loss_reduction_t(kBatchMean value) { this(); put(value); }
    public kldiv_loss_reduction_t(kSum value) { this(); put(value); }
    public kldiv_loss_reduction_t(kMean value) { this(); put(value); }
    public kldiv_loss_reduction_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef kldiv_loss_reduction_t put(@ByRef kldiv_loss_reduction_t x);

    public @ByRef kNone get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kNone get0(@ByRef kldiv_loss_reduction_t container);
    @ValueSetter public native kldiv_loss_reduction_t put(@ByRef kNone value);
    public @ByRef kBatchMean get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kBatchMean get1(@ByRef kldiv_loss_reduction_t container);
    @ValueSetter public native kldiv_loss_reduction_t put(@ByRef kBatchMean value);
    public @ByRef kSum get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kSum get2(@ByRef kldiv_loss_reduction_t container);
    @ValueSetter public native kldiv_loss_reduction_t put(@ByRef kSum value);
    public @ByRef kMean get3() { return get3(this); }
    @Namespace @Name("c10::get<3>") public static native @ByRef kMean get3(@ByRef kldiv_loss_reduction_t container);
    @ValueSetter public native kldiv_loss_reduction_t put(@ByRef kMean value);
}

