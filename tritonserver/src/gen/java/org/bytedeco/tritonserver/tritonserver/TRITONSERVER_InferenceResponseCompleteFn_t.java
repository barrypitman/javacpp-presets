// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;


/** Type for callback function indicating that an inference response
 *  has completed. The callback function takes ownership of the
 *  TRITONSERVER_InferenceResponse object. The 'userp' data is the
 *  data provided as 'response_userp' in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 * 
 *  One or more flags may be specified when the callback is invoked:
 * 
 *    - TRITONSERVER_RESPONSE_COMPLETE_FINAL: Indicates that no more
 *      responses will be generated for a given request (more
 *      specifically, that no more responses will be generated for the
 *      inference request that set this callback and 'userp'). When
 *      this flag is set 'response' may be a response object or may be
 *      nullptr. If 'response' is not nullptr, then 'response' is the
 *      last response that Triton will produce for the request. If
 *      'response' is nullptr then Triton is indicating that no more
 *      responses will be produced for the request. */

///
@Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_InferenceResponseCompleteFn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TRITONSERVER_InferenceResponseCompleteFn_t(Pointer p) { super(p); }
    protected TRITONSERVER_InferenceResponseCompleteFn_t() { allocate(); }
    private native void allocate();
    public native void call(
    TRITONSERVER_InferenceResponse response, @Cast("const uint32_t") int flags,
    Pointer userp);
}
