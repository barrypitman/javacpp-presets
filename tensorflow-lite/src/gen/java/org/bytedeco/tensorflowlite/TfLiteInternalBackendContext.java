// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// This is the base class for TF Lite internal backend contexts (like a
// RUY-based cpu backend context class). A derived internal backend context is
// generally a collection of utilities (i.e. a thread pool etc.) for TF Lite to
// use certain kernel libraries, such as Gemmlowp, RUY, etc., to implement TF
// Lite operators.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteInternalBackendContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteInternalBackendContext(Pointer p) { super(p); }


  // Set the maximum number of threads that could be used for parallelizing
  // TfLite computation.
  public native void SetMaxNumThreads(int max_num_threads);

  // A context may internally cache prepacked versions of constant tensors for
  // faster computation. This function will clear any caches on the context.
  public native void ClearCaches();
}
