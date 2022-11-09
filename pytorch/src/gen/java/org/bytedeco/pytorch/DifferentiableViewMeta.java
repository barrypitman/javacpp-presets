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


@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DifferentiableViewMeta extends AutogradMeta {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DifferentiableViewMeta(Pointer p) { super(p); }

  /** requires_grad is a backward AD field so we only use the view specific
   *  logic for backward differentiable views */
  public native @Cast("bool") boolean requires_grad();

  public native @Cast("bool") boolean shared_view_info();

  public native @Cast("bool") boolean has_bw_view();

  public native @Cast("const torch::autograd::ViewInfo*") @ByRef Pointer get_backward_view();

  public native @Cast("uint32_t") int get_attr_version();

  public native void set_attr_version(@Cast("uint32_t") int new_attr_version);

  public native CreationMeta get_creation_meta();

  public native void set_creation_meta(CreationMeta new_creation_meta);
  public native void set_creation_meta(@Cast("torch::autograd::CreationMeta") byte new_creation_meta);

  public native @Cast("bool") boolean has_fw_view();

  public native @Cast("const torch::autograd::ViewInfo*") @ByRef Pointer get_forward_view();
}
