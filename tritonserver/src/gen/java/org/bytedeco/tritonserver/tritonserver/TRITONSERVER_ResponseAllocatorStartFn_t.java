// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;


/** Type for function that is called to indicate that subsequent
 *  allocation requests will refer to a new response.
 * 
 *  @param allocator The allocator that is provided in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @param userp The user data pointer that is provided as
 *  'response_allocator_userp' in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @return a TRITONSERVER_Error object if a failure occurs. */

///
///
///
///
///
///
@Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_ResponseAllocatorStartFn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TRITONSERVER_ResponseAllocatorStartFn_t(Pointer p) { super(p); }
    protected TRITONSERVER_ResponseAllocatorStartFn_t() { allocate(); }
    private native void allocate();
    public native TRITONSERVER_Error call(
    TRITONSERVER_ResponseAllocator allocator, Pointer userp);
}
