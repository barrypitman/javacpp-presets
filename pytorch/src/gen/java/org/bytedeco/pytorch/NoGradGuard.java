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


// A RAII, thread local (!) guard that stops future operations from building
// gradients.
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NoGradGuard extends AutoGradMode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NoGradGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NoGradGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NoGradGuard position(long position) {
        return (NoGradGuard)super.position(position);
    }
    @Override public NoGradGuard getPointer(long i) {
        return new NoGradGuard((Pointer)this).offsetAddress(i);
    }

  public NoGradGuard() { super((Pointer)null); allocate(); }
  private native void allocate();
}
