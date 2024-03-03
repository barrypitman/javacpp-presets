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

// This type represents a Tuple
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TupleType extends NamedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TupleType(Pointer p) { super(p); }


  public static native @SharedPtr TupleType createNamed(@Const @ByRef QualifiedNameOptional name,
        @Const @ByRef StringVector field_names,
        @Const @ByRef TypeVector field_types,
        @ByRef IValueVector field_defaults);

  public static native @SharedPtr TupleType createNamed(@Const @ByRef QualifiedNameOptional name,
        @Const @ByRef StringVector field_names,
        @Const @ByRef TypeVector field_types);

  public static native @SharedPtr TupleType createNamed(@Const @ByRef QualifiedNameOptional name,
        @Const @ByRef StringViewVector field_names,
        @Const @ByRef TypeVector field_types);

  public static native @SharedPtr TupleType create(
        @ByVal TypeVector types);
  public static native @SharedPtr TupleType create();

  public native @ByVal TypeArrayRef elements();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);
  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs_, @Cast("std::ostream*") Pointer why_not);

  public native @StdString BytePointer str();
  public native @Cast("bool") boolean hasFreeVariables();
  public native @ByVal TypeArrayRef containedTypes();
  public native @ByVal Type.TypePtr createWithContained(
        @ByVal TypeVector contained_types);
  public native @SharedPtr FunctionSchema schema();
  public native @ByVal StringViewVectorOptional names();

  @MemberGetter public static native TypeKind Kind();
}
