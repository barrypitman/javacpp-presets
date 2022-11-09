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
 // namespace at
@Name("c10::MaybeOwnedTraits<at::TensorBase>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MaybeOwnedTraits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MaybeOwnedTraits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MaybeOwnedTraits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaybeOwnedTraits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MaybeOwnedTraits position(long position) {
        return (MaybeOwnedTraits)super.position(position);
    }
    @Override public MaybeOwnedTraits getPointer(long i) {
        return new MaybeOwnedTraits((Pointer)this).offsetAddress(i);
    }


  public static native @ByVal @Cast("c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") TensorBase createBorrow(@Cast("const c10::MaybeOwnedTraits<at::TensorBase>::owned_type*") @ByRef TensorBase from);

  public static native void assignBorrow(@Cast("c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase lhs, @Cast("const c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase rhs);

  public static native void destroyBorrow(@Cast("c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase toDestroy);

  public static native @Cast("const c10::MaybeOwnedTraits<at::TensorBase>::owned_type*") @ByRef TensorBase referenceFromBorrow(@Cast("const c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase borrow);

  public static native @Cast("const c10::MaybeOwnedTraits<at::TensorBase>::owned_type*") TensorBase pointerFromBorrow(@Cast("const c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase borrow);

  public static native @Cast("bool") boolean debugBorrowIsValid(@Cast("const c10::MaybeOwnedTraits<at::TensorBase>::borrow_type*") @ByRef TensorBase arg0);
}
