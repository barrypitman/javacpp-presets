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


/** A list of {@code Module}s that registers its elements.
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    torch::nn::ModuleList mlist(
 *      torch::nn::Linear(3, 4),
 *      torch::nn::BatchNorm1d(4),
 *      torch::nn::Dropout(0.5)
 *    );
 * 
 *    for (const auto &module : *mlist) {
 *      module->pretty_print(std::cout);
 *    }
 * 
 *  \endrst
 * 
 *  Why should you use {@code ModuleList} instead of a simple {@code std::vector}? The value
 *  a {@code ModuleList} provides over manually calling a sequence of modules is that
 *  it allows treating the whole container *as a single module*, such that
 *  performing a transformation on the {@code ModuleList} applies to each of the
 *  modules it stores (which are each a registered submodule of the
 *  {@code ModuleList}). For example, calling
 *  {@code .to(torch::kCUDA)} on a {@code ModuleList} will move each module in the list to
 *  CUDA memory. For example:
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    torch::nn::ModuleList mlist(
 *      torch::nn::Linear(3, 4),
 *      torch::nn::BatchNorm1d(4),
 *      torch::nn::Dropout(0.5)
 *    );
 * 
 *    // Convert all modules to CUDA.
 *    mlist->to(torch::kCUDA);
 * 
 *  \endrst
 * 
 *  Finally, {@code ModuleList} provides a lightweight container API, such as allowing
 *  iteration over submodules, positional access, adding a new module after
 *  construction via {@code push_back}, as well as joining two {@code ModuleList}s via
 *  {@code extend}. */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModuleListImpl extends ModuleListImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleListImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ModuleListImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ModuleListImpl position(long position) {
        return (ModuleListImpl)super.position(position);
    }
    @Override public ModuleListImpl getPointer(long i) {
        return new ModuleListImpl((Pointer)this).offsetAddress(i);
    }


  public ModuleListImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  /** Constructs the {@code ModuleList} from a variadic list of modules. */

  /** Special cloning function for {@code ModuleList} because it does not use
   *  {@code reset()}. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module clone(
        @Const @ByRef(nullValue = "c10::optional<c10::Device>(c10::nullopt)") DeviceOptional device);
  public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module clone();

  /** {@code reset()} is empty for {@code ModuleList}, since it does not have parameters of
   *  its own. */
  public native void reset();

  /** Pretty prints the {@code ModuleList} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native void push_back(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module module);

  /** Adds a new {@code Module} to the {@code ModuleList} container, moving or copying
   *  it into a {@code shared_ptr} internally. This method allows passing value types,
   *  and letting the container deal with the boxing. */

  /** Unwraps the contained module of a {@code ModuleHolder} and adds it to the
   *  {@code ModuleList}. */

  /** Iterates over the container and calls {@code push_back()} on each value. */

  /** Returns an iterator to the start of the {@code ModuleList}. */
  public native @ByVal @Cast("torch::nn::ModuleListImpl::Iterator*") SharedModuleVector.Iterator begin();

  /** Returns a const iterator to the start of the {@code ModuleList}. */

  /** Returns an iterator to the end of the {@code ModuleList}. */
  public native @ByVal @Cast("torch::nn::ModuleListImpl::Iterator*") SharedModuleVector.Iterator end();

  /** Returns a const iterator to the end of the {@code ModuleList}. */

  /** Attempts to return the module at the given index as the requested type.
   *  Throws an exception if the index is out of bounds or the types do not
   *  match. */

  /** Attempts to return the module at the given index as the requested type.
   *  Throws an exception if the index is out of bounds or the types do not
   *  match. */

  /** Attempts to return a {@code std::shared_ptr} whose dynamic type is that of the
   *  underlying module at the given index. Throws an exception if the index is
   *  out of bounds. */
  public native @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module ptr(@Cast("size_t") long index);

  /** Attempts to return a {@code std::shared_ptr} whose type is the one provided.
   *  Throws an exception if the index is out of bounds or the types do not
   *  match. */

  /** Like {@code ptr(index)}. */
  public native @SharedPtr @Name("operator []") @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module get(@Cast("size_t") long index);

  /** The current size of the {@code ModuleList} container. */
  public native @Cast("size_t") @NoException(true) long size();

  /** True if there are no modules in the {@code ModuleList}. */
  public native @Cast("bool") @NoException(true) boolean is_empty();

  public native void insert(@Cast("size_t") long index, @SharedPtr @Cast({"", "std::shared_ptr<torch::nn::Module>"}) Module module);

  /** Unwraps the contained module of a {@code ModuleHolder} and inserts it in the
   *  {@code ModuleList}. */

  /** inserts a new {@code Module} to the {@code ModuleList} container, moving or copying
   *  it into a {@code shared_ptr} internally. This method allows passing value types,
   *  and letting the container deal with the boxing. */
}
