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
 * Implement this interface and register your instance with the dispatcher
 * to get notified when operators are registered or deregistered with
 * the dispatcher.
 *
 * NB: registration events only occur when a 'def' occurs; we don't trigger
 * on 'impl' or 'fallback' calls.
 */
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OpRegistrationListener extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpRegistrationListener(Pointer p) { super(p); }


  public native void onOperatorRegistered(@Const @ByRef OperatorHandle op);
  public native void onOperatorDeregistered(@Const @ByRef OperatorHandle op);
}
