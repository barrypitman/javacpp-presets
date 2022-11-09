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

@Name("c10::ArrayRef<c10::Symbol>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymbolArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymbolArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SymbolArrayRef position(long position) {
        return (SymbolArrayRef)super.position(position);
    }
    @Override public SymbolArrayRef getPointer(long i) {
        return new SymbolArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public SymbolArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  public SymbolArrayRef(@Const @ByRef Symbol OneElt) { super((Pointer)null); allocate(OneElt); }
  private native void allocate(@Const @ByRef Symbol OneElt);

  /** Construct an ArrayRef from a pointer and length. */
  public SymbolArrayRef(@Const Symbol data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const Symbol data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public SymbolArrayRef(@Const Symbol begin, @Const Symbol end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const Symbol begin, @Const Symbol end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::ArrayRef<c10::Symbol>::iterator*") Symbol begin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::Symbol>::iterator*") Symbol end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::ArrayRef<c10::Symbol>::const_iterator*") Symbol cbegin();
  public native @ByVal @Cast("const c10::ArrayRef<c10::Symbol>::const_iterator*") Symbol cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const Symbol data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef Symbol front();

  /** back - Get the last element. */
  public native @Const @ByRef Symbol back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal SymbolArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal SymbolArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal SymbolArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") Symbol get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef Symbol at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @ByVal SymbolVector vec();

  /** \} */
}
