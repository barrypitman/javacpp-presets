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

@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ListType extends ListSingleElementType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ListType(Pointer p) { super(p); }

  // It's not exactly a singleton, but there should be exactly one instance of
  // List[T] for every T

  public native @StdString BytePointer str();
  public native @ByVal Type.TypePtr createWithContained(
        @ByVal TypeVector contained_types);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  // global singleton
  // Given an inner type T and an identifier,
  // this function wil return the global singleton type pointer
  // the type List<T>.
  // The extra "identifier" argument is needed beccause we have multiple container types
  // that all re-use this function (List<T>, array<T, N>, etc.)
  public static native @ByVal Type.TypePtr get(@StdString BytePointer identifier, @ByVal Type.TypePtr inner);
  public static native @ByVal Type.TypePtr get(@StdString String identifier, @ByVal Type.TypePtr inner);

  // common cast List[Tensor]
  public static native @SharedPtr ListType ofTensors();
  public static native @SharedPtr ListType ofOptionalTensors();
  public static native @SharedPtr ListType ofInts();
  public static native @SharedPtr ListType ofSymInts();
  public static native @SharedPtr ListType ofFloats();
  public static native @SharedPtr ListType ofComplexDoubles();
  public static native @SharedPtr ListType ofBools();
  public static native @SharedPtr ListType ofStrings();
  public static native @SharedPtr ListType ofNumbers();
}
