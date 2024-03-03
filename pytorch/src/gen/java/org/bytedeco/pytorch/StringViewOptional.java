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

@NoOffset @Name("c10::optional<c10::string_view>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringViewOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringViewOptional(Pointer p) { super(p); }
    public StringViewOptional(BytePointer value) { this(); put(value); }
    public StringViewOptional(String value) { this(); put(value); }
    public StringViewOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringViewOptional put(@ByRef StringViewOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @StringView BytePointer get();
    @ValueSetter public native StringViewOptional put(@StringView BytePointer value);
    @ValueSetter public native StringViewOptional put(@StringView String value);
}

