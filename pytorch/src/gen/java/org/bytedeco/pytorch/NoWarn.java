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


@Namespace("torch::jit::tracer") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NoWarn extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoWarn(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NoWarn(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NoWarn position(long position) {
        return (NoWarn)super.position(position);
    }
    @Override public NoWarn getPointer(long i) {
        return new NoWarn((Pointer)this).offsetAddress(i);
    }

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public NoWarn() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @SharedPtr TracingState state(); public native NoWarn state(TracingState setter);
  public native @Cast("bool") boolean prev(); public native NoWarn prev(boolean setter);
}
