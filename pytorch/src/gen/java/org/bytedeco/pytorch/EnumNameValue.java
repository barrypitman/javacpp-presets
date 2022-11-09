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

@NoOffset @Name("std::pair<std::string,c10::IValue>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EnumNameValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnumNameValue(Pointer p) { super(p); }
    public EnumNameValue(BytePointer firstValue, IValue secondValue) { this(); put(firstValue, secondValue); }
    public EnumNameValue(String firstValue, IValue secondValue) { this(); put(firstValue, secondValue); }
    public EnumNameValue()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef EnumNameValue put(@ByRef EnumNameValue x);


    @MemberGetter public native @StdString BytePointer first(); public native EnumNameValue first(BytePointer first);
    @MemberGetter public native @ByRef IValue second();  public native EnumNameValue second(IValue second);
    @MemberSetter @Index public native EnumNameValue first(@StdString String first);

    public EnumNameValue put(BytePointer firstValue, IValue secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public EnumNameValue put(String firstValue, IValue secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

