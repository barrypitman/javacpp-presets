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

@NoOffset @Name("std::pair<void*,void*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PointerPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PointerPair(Pointer p) { super(p); }
    public PointerPair(Pointer firstValue, Pointer secondValue) { this(); put(firstValue, secondValue); }
    public PointerPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef PointerPair put(@ByRef PointerPair x);


    @MemberGetter public native Pointer first(); public native PointerPair first(Pointer first);
    @MemberGetter public native Pointer second();  public native PointerPair second(Pointer second);

    public PointerPair put(Pointer firstValue, Pointer secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

