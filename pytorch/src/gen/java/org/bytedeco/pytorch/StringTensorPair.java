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

@NoOffset @Name("std::pair<std::string,torch::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringTensorPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTensorPair(Pointer p) { super(p); }
    public StringTensorPair(BytePointer firstValue, Tensor secondValue) { this(); put(firstValue, secondValue); }
    public StringTensorPair(String firstValue, Tensor secondValue) { this(); put(firstValue, secondValue); }
    public StringTensorPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringTensorPair put(@ByRef StringTensorPair x);


    @MemberGetter public native @StdString BytePointer first(); public native StringTensorPair first(BytePointer first);
    @MemberGetter public native @ByRef Tensor second();  public native StringTensorPair second(Tensor second);
    @MemberSetter @Index public native StringTensorPair first(@StdString String first);

    public StringTensorPair put(BytePointer firstValue, Tensor secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringTensorPair put(String firstValue, Tensor secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

