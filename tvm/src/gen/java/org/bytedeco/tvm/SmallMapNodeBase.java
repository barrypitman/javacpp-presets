// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;

@Name("tvm::runtime::InplaceArrayBase<tvm::runtime::SmallMapNode,tvm::runtime::MapNode::KVType>") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class SmallMapNodeBase extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SmallMapNodeBase() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SmallMapNodeBase(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SmallMapNodeBase(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SmallMapNodeBase position(long position) {
        return (SmallMapNodeBase)super.position(position);
    }
    @Override public SmallMapNodeBase getPointer(long i) {
        return new SmallMapNodeBase((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Access element at index
   * @param idx The index of the element.
   * @return Const reference to ElemType at the index.
   */

  /**
   * \brief Access element at index
   * @param idx The index of the element.
   * @return Reference to ElemType at the index.
   */
  public native @Cast("tvm::runtime::MapNode::KVType*") @ByRef @Name("operator []") Pointer get(@Cast("size_t") long idx);

  /**
   * \brief Destroy the Inplace Array Base object
   */
}
