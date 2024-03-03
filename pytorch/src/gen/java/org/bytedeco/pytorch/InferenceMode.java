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


// A RAII, thread local (!) guard that enables or disables inference mode upon
// construction, and sets it back to the original value upon destruction.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InferenceMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InferenceMode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InferenceMode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InferenceMode position(long position) {
        return (InferenceMode)super.position(position);
    }
    @Override public InferenceMode getPointer(long i) {
        return new InferenceMode((Pointer)this).offsetAddress(i);
    }

  // Note [Expected TLS state in InferenceMode]:
  //   InferenceMode: ADInplaceOrView not in
  //   raw_local_dispatch_key_set.included(),
  //                  Autograd in raw_local_dispatch_key_set.excluded()
  //                  GradMode is disabled.
  //   NormalMode: ADInplaceOrView in raw_local_dispatch_key_set.included(),
  //               Autograd not in raw_local_dispatch_key_set.excluded()
  //               GradMode is enabled by default unless toggled manually
  //               through other APIs, e.g. NoGradGuard.
  //
  // Invariant:
  // - ADInplaceOrView is never in the excluded set
  // - Autograd is never in the included set
  // - Setting InferenceMode will set GradMode accordingly, but not vice versa.
  //
  //  1. Why do we put ADInplaceOrView in included set outside InferenceMode?
  //
  //     Inplace update to inference tensor outside InferenceMode is not
  //     allowed. See Note [Inplace update inference tensor] for more details.
  //     Without going through ADInplaceOrView kernel, we cannot throw error
  //     for `inference_tensor.add_(1)` case.
  //
  // 2. Why not put ADInplaceOrView in the excluded set inside InferenceMode?
  //
  //    For example:
  //    torch::Tensor a = torch::ones({1, 2, 3}).set_requires_grad(true);
  //    torch::Tensor k = a + 2;
  //    {
  //      c10::InferenceMode guard(true);
  //      k.add_(2);
  //    }
  //    `k.add_(2)` still need to go through ADInplaceOrView kernel so that it's
  //    prepared for future autograd.
  //
  // 3. Why does setting InferenceMode also set GradMode?
  //
  //    This is required since InferenceMode is a faster and more restrictive
  //    version of NoGradGuard. All runtime checks using GradMode::is_enabled()
  //    are applicable to InferenceMode as well, e.g.
  //    `tensorTypeInCurrentExecutionContext` in interpreter.cpp.
  public InferenceMode(@Cast("bool") boolean enabled/*=true*/) { super((Pointer)null); allocate(enabled); }
  private native void allocate(@Cast("bool") boolean enabled/*=true*/);
  public InferenceMode() { super((Pointer)null); allocate(); }
  private native void allocate();
  public static native @Cast("bool") boolean is_enabled();
}
