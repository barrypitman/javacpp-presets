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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ OrderedDict::Item ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

@Name("torch::OrderedDict<std::string,at::Tensor>::Item") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringTensorDictItem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTensorDictItem(Pointer p) { super(p); }

  /** Constructs a new item. */
  public StringTensorDictItem(@StdString BytePointer key, @ByVal Tensor value) { super((Pointer)null); allocate(key, value); }
  private native void allocate(@StdString BytePointer key, @ByVal Tensor value);
  public StringTensorDictItem(@StdString String key, @ByVal Tensor value) { super((Pointer)null); allocate(key, value); }
  private native void allocate(@StdString String key, @ByVal Tensor value);

// #if defined(__CUDACC__) && (__CUDACC_VER_MAJOR__ < 11) && defined(_MSC_VER)
  /** Related issue: https://github.com/pytorch/pytorch/issues/55266
   *  Needs to define this function for CUDA < 11.0 on Windows,
   *  although it usually won't be used actually. */
  public native @ByRef @Name("operator =") StringTensorDictItem put(@Const @ByRef StringTensorDictItem other);
// #endif

  /** Returns a reference to the value. */
  public native @ByRef @Name("operator *") Tensor multiply();

  /** Returns a reference to the value. */

  /** Allows access to the value using the arrow operator. */
  public native @Name("operator ->") Tensor access();

  /** Allows access to the value using the arrow operator. */

  /** Returns a reference to the key. */
  public native @StdString @NoException(true) BytePointer key();

  /** Returns a reference to the value. */
  public native @ByRef @NoException(true) Tensor value();

  /** Returns a reference to the value. */

  /** Returns a {@code (key, value)} pair. */
  public native @Cast("const std::pair<std::string,at::Tensor>*") @ByRef @NoException(true) StringTensorPair pair();
}
