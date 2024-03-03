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


/**
 * bits4x2 is an uninterpreted dtype of a tensor with 4 bits (packed to byte
 * boundary), without any semantics defined.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class bits4x2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public bits4x2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public bits4x2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public bits4x2 position(long position) {
        return (bits4x2)super.position(position);
    }
    @Override public bits4x2 getPointer(long i) {
        return new bits4x2((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint8_t") byte val_(); public native bits4x2 val_(byte setter);
  public bits4x2() { super((Pointer)null); allocate(); }
  private native void allocate();
  public bits4x2(@Cast("uint8_t") byte val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("uint8_t") byte val);
}
