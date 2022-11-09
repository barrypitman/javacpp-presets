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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MobileCode extends Code {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MobileCode(Pointer p) { super(p); }

  public MobileCode(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name,
        @Cast("bool") boolean emit_default_input_instructions/*=true*/,
        @Cast("bool") boolean support_default_args_before_out/*=true*/,
        @Cast("bool") boolean emit_promoted_ops/*=true*/,
        @Cast("size_t") long remaining_bailout_depth/*=0*/) { super((Pointer)null); allocate(graph, function_name, emit_default_input_instructions, support_default_args_before_out, emit_promoted_ops, remaining_bailout_depth); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name,
        @Cast("bool") boolean emit_default_input_instructions/*=true*/,
        @Cast("bool") boolean support_default_args_before_out/*=true*/,
        @Cast("bool") boolean emit_promoted_ops/*=true*/,
        @Cast("size_t") long remaining_bailout_depth/*=0*/);
  public MobileCode(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString BytePointer function_name);
  public MobileCode(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name,
        @Cast("bool") boolean emit_default_input_instructions/*=true*/,
        @Cast("bool") boolean support_default_args_before_out/*=true*/,
        @Cast("bool") boolean emit_promoted_ops/*=true*/,
        @Cast("size_t") long remaining_bailout_depth/*=0*/) { super((Pointer)null); allocate(graph, function_name, emit_default_input_instructions, support_default_args_before_out, emit_promoted_ops, remaining_bailout_depth); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name,
        @Cast("bool") boolean emit_default_input_instructions/*=true*/,
        @Cast("bool") boolean support_default_args_before_out/*=true*/,
        @Cast("bool") boolean emit_promoted_ops/*=true*/,
        @Cast("size_t") long remaining_bailout_depth/*=0*/);
  public MobileCode(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(
        @Const @SharedPtr @ByRef Graph graph,
        @StdString String function_name);
}
