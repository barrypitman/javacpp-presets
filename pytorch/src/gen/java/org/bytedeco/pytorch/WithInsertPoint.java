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


/** \brief An utility class for setting temporary insertion points.
 *
 * When an object of this class is created, it stores the current insertion
 * point, sets the new one, and restores the original insertion point when the
 * object is destroyed.
 */
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WithInsertPoint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WithInsertPoint(Pointer p) { super(p); }

  public WithInsertPoint(JitNode n) { super((Pointer)null); allocate(n); }
  private native void allocate(JitNode n);
  public WithInsertPoint(Block b) { super((Pointer)null); allocate(b); }
  private native void allocate(Block b);
}
