// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \brief OpenVINO Provider Options
*
* @see OrtApi::SessionOptionsAppendExecutionProvider_OpenVINO
*/
@NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtOpenVINOProviderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtOpenVINOProviderOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtOpenVINOProviderOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OrtOpenVINOProviderOptions position(long position) {
        return (OrtOpenVINOProviderOptions)super.position(position);
    }
    @Override public OrtOpenVINOProviderOptions getPointer(long i) {
        return new OrtOpenVINOProviderOptions((Pointer)this).offsetAddress(i);
    }

// #ifdef __cplusplus
  public OrtOpenVINOProviderOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
// #endif
  /** \brief Device type string
  *
  * Valid settings are one of: "CPU_FP32", "GPU_FP32", "GPU_FP16", "MYRIAD_FP16", "VAD-M_FP16" or "VAD-F_FP32"
  */
  public native @Cast("const char*") BytePointer device_type(); public native OrtOpenVINOProviderOptions device_type(BytePointer setter);
  /** 0 = disabled, nonzero = enabled */
  public native @Cast("unsigned char") byte enable_vpu_fast_compile(); public native OrtOpenVINOProviderOptions enable_vpu_fast_compile(byte setter);
  public native @Cast("const char*") BytePointer device_id(); public native OrtOpenVINOProviderOptions device_id(BytePointer setter);
  /** 0 = Use default number of threads */
  public native @Cast("size_t") long num_of_threads(); public native OrtOpenVINOProviderOptions num_of_threads(long setter);
  /** 0 = disabled, nonzero = enabled */
  public native @Cast("unsigned char") byte use_compiled_network(); public native OrtOpenVINOProviderOptions use_compiled_network(byte setter);
  public native @Cast("const char*") BytePointer blob_dump_path(); public native OrtOpenVINOProviderOptions blob_dump_path(BytePointer setter);          // path is set to empty by default
  public native Pointer context(); public native OrtOpenVINOProviderOptions context(Pointer setter);
  /** 0 = disabled, nonzero = enabled */
  public native @Cast("unsigned char") byte enable_opencl_throttling(); public native OrtOpenVINOProviderOptions enable_opencl_throttling(byte setter);
  /** 0 = disabled, nonzero = enabled */
  public native @Cast("unsigned char") byte enable_dynamic_shapes(); public native OrtOpenVINOProviderOptions enable_dynamic_shapes(byte setter);
}
