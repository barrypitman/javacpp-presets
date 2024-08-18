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

@Name("Ort::detail::SequenceTypeInfoImpl<OrtSequenceTypeInfo>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseSequenceTypeInfoImpl extends BaseSequenceTypeInfo {
    static { Loader.load(); }
    /** Default native constructor. */
    public BaseSequenceTypeInfoImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseSequenceTypeInfoImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseSequenceTypeInfoImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BaseSequenceTypeInfoImpl position(long position) {
        return (BaseSequenceTypeInfoImpl)super.position(position);
    }
    @Override public BaseSequenceTypeInfoImpl getPointer(long i) {
        return new BaseSequenceTypeInfoImpl((Pointer)this).offsetAddress(i);
    }

  /** Wraps OrtApi::GetSequenceElementType */
  public native @ByVal TypeInfo GetSequenceElementType();
}
