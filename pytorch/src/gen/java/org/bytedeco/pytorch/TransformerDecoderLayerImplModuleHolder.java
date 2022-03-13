// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("torch::nn::ModuleHolder<torch::nn::TransformerDecoderLayerImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderLayerImplModuleHolder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderLayerImplModuleHolder(Pointer p) { super(p); }

  
  ///

  /** Default constructs the contained module if if has a default constructor,
   *  else produces a static error.
   * 
   *  NOTE: This uses the behavior of template
   *  classes in C++ that constructors (or any methods) are only compiled when
   *  actually used. */
  

  /** Constructs the {@code ModuleHolder} with an empty contained value. Access to
   *  the underlying module is not permitted and will throw an exception, until
   *  a value is assigned. */
  /* implicit */ public TransformerDecoderLayerImplModuleHolder(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0);

  /** Constructs the {@code ModuleHolder} with a contained module, forwarding all
   *  arguments to its constructor. */

  /** Constructs the {@code ModuleHolder} from a pointer to the contained type.
   *  Example: {@code Linear(std::make_shared<LinearImpl>(...))}. */
  /* implicit */ public TransformerDecoderLayerImplModuleHolder(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::TransformerDecoderLayerImpl>"}) TransformerDecoderLayerImpl module) { super((Pointer)null); allocate(module); }
private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::TransformerDecoderLayerImpl>"}) TransformerDecoderLayerImpl module);

  /** Returns true if the {@code ModuleHolder} contains a module, or false if it is
   *  {@code nullptr}. */
  public native @Cast("bool") @Name("operator bool") @NoException(true) boolean asBoolean();

  /** Forwards to the contained module. */
  public native @Name("operator ->") TransformerDecoderLayerImpl access();

  /** Forwards to the contained module. */

  /** Returns a reference to the contained module. */
  public native @ByRef @Name("operator *") TransformerDecoderLayerImpl multiply();

  /** Returns a const reference to the contained module. */

  /** Returns a shared pointer to the underlying module. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::TransformerDecoderLayerImpl>"}) TransformerDecoderLayerImpl ptr();

  /** Returns a pointer to the underlying module. */
  public native TransformerDecoderLayerImpl get();

  /** Returns a const pointer to the underlying module. */

  /** Calls the {@code forward()} method of the contained module. */

  /** Forwards to the subscript operator of the contained module.
   *  NOTE: std::forward is qualified to prevent VS2017 emitting
   *        error C2872: 'std': ambiguous symbol */

  /** Returns true if the {@code ModuleHolder} does not contain a module. */
  public native @Cast("bool") @NoException(true) boolean is_empty();
}
