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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FunctionSchema extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionSchema(Pointer p) { super(p); }

  public FunctionSchema(
        @StdString BytePointer name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/) { super((Pointer)null); allocate(name, overload_name, arguments, returns, is_vararg, is_varret); }
  private native void allocate(
        @StdString BytePointer name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/);
  public FunctionSchema(
        @StdString BytePointer name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns) { super((Pointer)null); allocate(name, overload_name, arguments, returns); }
  private native void allocate(
        @StdString BytePointer name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns);
  public FunctionSchema(
        @StdString String name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/) { super((Pointer)null); allocate(name, overload_name, arguments, returns, is_vararg, is_varret); }
  private native void allocate(
        @StdString String name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/);
  public FunctionSchema(
        @StdString String name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns) { super((Pointer)null); allocate(name, overload_name, arguments, returns); }
  private native void allocate(
        @StdString String name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns);

  public FunctionSchema(
        @ByVal Symbol name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/) { super((Pointer)null); allocate(name, overload_name, arguments, returns, is_vararg, is_varret); }
  private native void allocate(
        @ByVal Symbol name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/);
  public FunctionSchema(
        @ByVal Symbol name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns) { super((Pointer)null); allocate(name, overload_name, arguments, returns); }
  private native void allocate(
        @ByVal Symbol name,
        @StdString BytePointer overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns);
  public FunctionSchema(
        @ByVal Symbol name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/) { super((Pointer)null); allocate(name, overload_name, arguments, returns, is_vararg, is_varret); }
  private native void allocate(
        @ByVal Symbol name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns,
        @Cast("bool") boolean is_vararg/*=false*/,
        @Cast("bool") boolean is_varret/*=false*/);
  public FunctionSchema(
        @ByVal Symbol name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns) { super((Pointer)null); allocate(name, overload_name, arguments, returns); }
  private native void allocate(
        @ByVal Symbol name,
        @StdString String overload_name,
        @ByVal ArgumentVector arguments,
        @ByVal ArgumentVector returns);

  // Checks whether this schema is backward compatible with the old one.
  // The following conditions must be true:
  // [Function structure] The new schema's name, overload-name, varargs, and
  //      return arity are the same.
  // [Output Narrowing] The new schema's output type must be the same class
  //      or inherit from the old schema's output type.
  // [Argument count] The new schema must have at least as many arguments as
  //      the old schema (considering the list of positional and kwargs).
  // [Arg Compatibility] Every argument in the old schema has a corresponding
  //      argument in the new schema that:
  //        * is at the same position.
  //        * has the same name.
  //        * is either positional, or kwarg and the old argument was kwarg.
  //        * has the same type, or the old argument's type inherits from the
  //          new argument's type.
  // [Default Values] Every new argument must have a default value.
  // E.g.
  //   OK    f_new(a, b, c=1) => f_old(a, b)
  //   NOK   f_new(a, c=1, *, b) => f_old(a, *, b)
  //   OK    f_new(a, b, *, c) => f_old(a, *, b, c)
  //   NOK   f_new(a, *, b, c) -> f_old(a, b, *, c)
  //   NOK   f_new(a, *, c, b) => f_old(a, *, b, c)
  //   OK    f_new(a, *, b, c, d=1) => f_old(a, *, b, c)
  public native @Cast("bool") boolean isBackwardCompatibleWith(
        @Const @ByRef FunctionSchema old,
        @Cast("std::ostream*") Pointer why_not/*=nullptr*/);
  public native @Cast("bool") boolean isBackwardCompatibleWith(
        @Const @ByRef FunctionSchema old);

  // Checks whether this schema is forward compatible with the old one.
  // The following conditions must be true:
  // [Function structure] The new schema's name, overload-name, varargs, and
  //      return arity are the same.
  // [Output Narrowing] The new schema's output type must be the same class
  //      or inherit from the old schema's output type.
  // [Arg Compatibility] Every argument in the old schema has a corresponding
  //      argument in the new schema that:
  //        * is at the same position.
  //        * has the same name.
  //        * is either positional, or kwarg and the old argument was kwarg.
  //        * has the same type, or the old argument's type inherits from the
  //          new argument's type.
  // [Default Values] Every new argument must have a default value.
  //         Each default value type should NOT be a container type.
  // [Positioning] All defaults arguments MUST go after either old
  //         default arguments or the end of positional arguments
  //         and right BEFORE all out arguments
  public native @Cast("bool") boolean isForwardCompatibleWith(
        @Const @ByRef FunctionSchema old,
        @Cast("std::ostringstream*") @ByRef Pointer why_not);

  

  public native @Const @ByRef OperatorName operator_name();
  public native @StdString BytePointer name();
  public native @StdString BytePointer overload_name();
  public native @Const @ByRef ArgumentVector arguments();
  public native @Const @ByRef ArgumentVector returns();
  public native @Cast("bool") boolean is_vararg();
  public native @Cast("bool") boolean is_varret();
  public native @Cast("bool") boolean is_aliasing(@Const @ByRef SchemaArgument argument);
  public native @Cast("bool") boolean is_mutable();
  public native @Cast("bool") boolean is_mutable(@Const @ByRef SchemaArgument argument);
  public native @Cast("bool") boolean is_mutable(@ByVal @Cast("c10::string_view*") Pointer name);

  // Returns whether lhs and rhs may alias directly.
  // This does not account for cases where lhs or rhs are a container that
  // may contain elements that alias the other argument.
  // FunctionSchema::may_contain_alias will include that functionality.
  public native @Cast("bool") boolean may_alias(@Const @ByRef SchemaArgument lhs, @Const @ByRef SchemaArgument rhs);

  // Returns whether lhs and rhs may alias directly or whether lhs/rhs are a container
  // that may contain elements that alias the other argument.
  // bidirectional = false only returns whether lhs may contain an alias of rhs
  // while bidirectional = true returns both directions.
  public native @Cast("bool") boolean may_contain_alias(@Const @ByRef SchemaArgument lhs, @Const @ByRef SchemaArgument rhs, @Cast("bool") boolean bidirectional/*=true*/);
  public native @Cast("bool") boolean may_contain_alias(@Const @ByRef SchemaArgument lhs, @Const @ByRef SchemaArgument rhs);

  // Returns whether the two AliasTypeSets contain any similarities
  // ie: whether the two type sets can alias.
  public native @Cast("bool") boolean canAliasTypeSetsAlias(@Const @ByRef AliasTypeSetOptional lhs, @Const @ByRef AliasTypeSetOptional rhs);

  // Recursively Finds all contained types within the AliasTypeSet.
  public native @ByVal AliasTypeSetOptional getAliasTypeSetContainedTypes(@Const @ByRef AliasTypeSetOptional aliasTypeSet);

  // Similar to mapTypeToAliasTypeSet defined in alias_analysis.cpp.
  // Used to map types to a type such that all types that can alias will be mapped to the same type.
  // For example, calling this method on 'Optional[List[int]]' is the same as calling this method
  // on 'List[int]'.
  public native @ByVal AliasTypeSetOptional mapTypeToAliasTypeSet(@Const @ByRef Type.TypePtr type);

  // Returns either arguments() or returns() depending on the SchemaArgType
  // output => returns(), input => arguments()
  public native @Const @ByRef ArgumentVector getCorrectList(SchemaArgType type);
  public native @Const @ByRef ArgumentVector getCorrectList(@Cast("c10::SchemaArgType") int type);

  public native @ByVal IntOptional argumentIndexWithName(@ByVal @Cast("c10::string_view*") Pointer name);
  public native @ByVal FunctionSchema cloneWithName(@StdString BytePointer name, @StdString BytePointer overload_name);
  public native @ByVal FunctionSchema cloneWithName(@StdString String name, @StdString String overload_name);
  public native @ByVal FunctionSchema cloneWithArguments(@ByVal ArgumentVector new_arguments);
  public native @ByVal FunctionSchema cloneWithReturns(@ByVal ArgumentVector new_returns);

  public native @StdString BytePointer formatTypeMismatchMsg(
        @Const @ByRef Argument expected,
        @StdString BytePointer actual_type,
        @ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional _position,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional value);
  public native @StdString BytePointer formatTypeMismatchMsg(
        @Const @ByRef Argument expected,
        @StdString BytePointer actual_type);
  public native @StdString String formatTypeMismatchMsg(
        @Const @ByRef Argument expected,
        @StdString String actual_type,
        @ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional _position,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional value);
  public native @StdString String formatTypeMismatchMsg(
        @Const @ByRef Argument expected,
        @StdString String actual_type);

  public native @ByVal FunctionSchema cloneWithRemappedTypes(
        @Const @ByVal TypeMapper type_map);

  public native @ByVal FunctionSchema cloneWithRealTypes(@Cast("bool") boolean with_symint/*=true*/);
  public native @ByVal FunctionSchema cloneWithRealTypes();

  // Check that inputs have the correct types and appends any missing default
  // values.

  public native @StdString BytePointer findErrorInKwargs(@Const @ByRef StringVector kwargs);

  public native @Cast("bool") boolean hasAnyAliasInfo();


  // TODO remove the mutation here
  public native @Cast("bool") boolean isDefaultAliasAnalysisKind();
  public native @ByVal AliasAnalysisKind aliasAnalysis();
  public native void setAliasAnalysis(@ByVal AliasAnalysisKind v);

  public native @ByVal @Cast("c10::optional<c10::string_view>*") Pointer getNamespace();

  // Returns true if we successfully set the namespace (as there
  // was none set, and false otherwise)
  public native @Cast("bool") boolean setNamespaceIfNotSet(@Cast("const char*") BytePointer ns);
  public native @Cast("bool") boolean setNamespaceIfNotSet(String ns);

  // can a function with this schema be substituted for a function of rhs's
  // schema and have the program typecheck?
  // as_method - if true, treat this schema as a method and ignore
  // the first argument, which will be the object in both cases
  public native @Cast("bool") boolean isSubtypeOf(@Const @ByRef FunctionSchema rhs, @Cast("bool") boolean as_method, @Cast("std::ostream*") Pointer why_not/*=nullptr*/);
  public native @Cast("bool") boolean isSubtypeOf(@Const @ByRef FunctionSchema rhs, @Cast("bool") boolean as_method);
}
