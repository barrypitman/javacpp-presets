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

@Name("Ort::detail::TypeInfoImpl<OrtTypeInfo>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class TypeInfoImpl extends BaseTypeInfo {
    static { Loader.load(); }
    /** Default native constructor. */
    public TypeInfoImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeInfoImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeInfoImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TypeInfoImpl position(long position) {
        return (TypeInfoImpl)super.position(position);
    }
    @Override public TypeInfoImpl getPointer(long i) {
        return new TypeInfoImpl((Pointer)this).offsetAddress(i);
    }


  /** Wraps OrtApi::CastTypeInfoToTensorInfo */
  public native @ByVal ConstTensorTypeAndShapeInfo GetTensorTypeAndShapeInfo();
  /** Wraps OrtApi::CastTypeInfoToSequenceTypeInfo */
  public native @ByVal @Cast("Ort::ConstSequenceTypeInfo*") BaseSequenceTypeInfoImpl GetSequenceTypeInfo();
  /** Wraps OrtApi::CastTypeInfoToMapTypeInfo */
  public native @ByVal ConstMapTypeInfo GetMapTypeInfo();
  /** wraps OrtApi::CastTypeInfoToOptionalTypeInfo */
  public native @ByVal @Cast("Ort::ConstOptionalTypeInfo*") OptionalTypeInfoImpl GetOptionalTypeInfo();

  public native @Cast("ONNXType") int GetONNXType();
}
