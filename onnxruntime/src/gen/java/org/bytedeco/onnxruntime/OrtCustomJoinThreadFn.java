// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief Custom thread join function
 *
 * Onnxruntime thread pool destructor will call the function to join a custom thread.
 * Argument ort_custom_thread_handle is the value returned by OrtCustomCreateThreadFn
 */
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCustomJoinThreadFn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    OrtCustomJoinThreadFn(Pointer p) { super(p); }
    protected OrtCustomJoinThreadFn() { allocate(); }
    private native void allocate();
    public native void call(@Cast("OrtCustomThreadHandle") OrtCustomHandleType ort_custom_thread_handle);
}
