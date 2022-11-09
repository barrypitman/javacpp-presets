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


//===----------------------------------------------------------------------===//
//                std::index_sequence shim for C++11
//===----------------------------------------------------------------------===//

// A container of type-template parameter indices.
@Namespace("torch") @Opaque @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Indices extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Indices() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Indices(Pointer p) { super(p); }
}
