// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Type of stream callback functions.
 * @param stream The stream as passed to ::cudaStreamAddCallback, may be NULL.
 * @param status ::cudaSuccess or any persistent error on the stream.
 * @param userData User parameter provided at registration.
 */
@Convention("CUDART_CB") @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaStreamCallback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cudaStreamCallback_t(Pointer p) { super(p); }
    protected cudaStreamCallback_t() { allocate(); }
    private native void allocate();
    public native void call(CUstream_st stream, @Cast("cudaError_t") int status, Pointer userData);
}
