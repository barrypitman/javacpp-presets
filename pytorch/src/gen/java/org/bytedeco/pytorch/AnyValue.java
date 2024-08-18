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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AnyValue ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** An implementation of {@code std::any} which stores
 *  a type erased object, whose concrete value can be retrieved at runtime by
 *  checking if the {@code typeid()} of a requested type matches the {@code typeid()} of
 *  the object stored. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AnyValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AnyValue(Pointer p) { super(p); }

  /** Move construction and assignment is allowed, and follows the default
   *  behavior of move for {@code std::unique_ptr}. */
  public AnyValue(@ByRef(true) AnyValue arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) AnyValue arg0);
  public native @ByRef @Name("operator =") AnyValue put(@ByRef(true) AnyValue arg0);

  /** Copy construction and assignment is allowed. */

  /** Constructs the {@code AnyValue} from value type. */

  /** Returns a pointer to the value contained in the {@code AnyValue} if the type
   *  passed as template parameter matches the type of the value stored, and
   *  returns a null pointer otherwise. */
  public native @Name("try_get<at::Tensor>") Tensor try_getTensor();
  public native @Name("try_get<torch::nn::ASMoutput>") ASMoutput try_getASMoutput();
  public native @Name("try_get<std::tuple<at::Tensor,at::Tensor> >") T_TensorTensor_T try_getT_TensorTensor_T();
  public native @Name("try_get<std::tuple<torch::Tensor,std::tuple<torch::Tensor,torch::Tensor> > >") T_TensorT_TensorTensor_T_T try_getT_TensorT_TensorTensor_T_T();

  /** Returns the value contained in the {@code AnyValue} if the type passed as
   *  template parameter matches the type of the value stored, and throws an
   *  exception otherwise. */
  public native @ByVal @Name("get<at::Tensor>") Tensor getTensor();
  public native @ByVal @Name("get<torch::nn::ASMoutput>") ASMoutput getASMoutput();
  public native @ByVal @Name("get<std::tuple<at::Tensor,at::Tensor> >") T_TensorTensor_T getT_TensorTensor_T();
  public native @ByVal @Name("get<std::tuple<torch::Tensor,std::tuple<torch::Tensor,torch::Tensor> > >") T_TensorT_TensorTensor_T_T getT_TensorT_TensorTensor_T_T();

  /** Returns the {@code type_info} object of the contained value. */
  public native @Cast("const std::type_info*") @ByRef @NoException(true) Pointer type_info();
}
