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


@Namespace("torch::jit::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SlotCursor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SlotCursor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SlotCursor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SlotCursor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SlotCursor position(long position) {
        return (SlotCursor)super.position(position);
    }
    @Override public SlotCursor getPointer(long i) {
        return new SlotCursor((Pointer)this).offsetAddress(i);
    }

  public native @ByRef JitModule module_(); public native SlotCursor module_(JitModule setter);
  public native @Cast("int64_t") long i_(); public native SlotCursor i_(long setter); // slot offset, -1 indicates the module itself
}
