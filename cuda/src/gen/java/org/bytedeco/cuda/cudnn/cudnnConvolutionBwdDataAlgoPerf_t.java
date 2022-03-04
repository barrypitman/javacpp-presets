// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;

import static org.bytedeco.cuda.global.cudnn.*;


/* helper function to provide the convolution backward data algo that fit best the requirement */

@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnConvolutionBwdDataAlgoPerf_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnConvolutionBwdDataAlgoPerf_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnConvolutionBwdDataAlgoPerf_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionBwdDataAlgoPerf_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnConvolutionBwdDataAlgoPerf_t position(long position) {
        return (cudnnConvolutionBwdDataAlgoPerf_t)super.position(position);
    }
    @Override public cudnnConvolutionBwdDataAlgoPerf_t getPointer(long i) {
        return new cudnnConvolutionBwdDataAlgoPerf_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cudnnConvolutionBwdDataAlgo_t") int algo(); public native cudnnConvolutionBwdDataAlgoPerf_t algo(int setter);
    public native @Cast("cudnnStatus_t") int status(); public native cudnnConvolutionBwdDataAlgoPerf_t status(int setter);
    public native float time(); public native cudnnConvolutionBwdDataAlgoPerf_t time(float setter);
    public native @Cast("size_t") long memory(); public native cudnnConvolutionBwdDataAlgoPerf_t memory(long setter);
    public native @Cast("cudnnDeterminism_t") int determinism(); public native cudnnConvolutionBwdDataAlgoPerf_t determinism(int setter);
    public native @Cast("cudnnMathType_t") int mathType(); public native cudnnConvolutionBwdDataAlgoPerf_t mathType(int setter);
    public native int reserved(int i); public native cudnnConvolutionBwdDataAlgoPerf_t reserved(int i, int setter);
    @MemberGetter public native IntPointer reserved();
}
