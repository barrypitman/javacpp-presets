// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;

@Namespace("nvinfer1::v_1_0") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IOutputAllocator extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IOutputAllocator(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();

    /**
     *  \brief Return a pointer to memory for an output tensor, or nullptr if memory cannot be allocated.
     *         If the requested memory size exceeds the currentMemory size, the currentMemory can be freed as well.
     *         If currentMemory is known to be big enough, one option is to return currentMemory.
     * 
     *  @param tensorName name of the output tensor.
     *  @param currentMemory points to the address set by IExectionContext::setTensorAddress.
     *  @param size number of bytes required. Always positive, even for an empty tensor.
     *  @param alignment required alignment of the allocation.
     * 
     *  @return A pointer to memory to use for the output tensor or nullptr.
     * 
     * 
     *  To preallocate memory and have the engine fail if the preallocation is not big enough,
     *  use IExecutionContext::setTensorAddress to set a pointer to the preallocated memory,
     *  and have reallocateOutput return nullptr if that memory is not big enough.
     * 
     *  @deprecated Deprecated in TensorRT 10.0. Superseded by reallocateOutputAsync with cudaStream_t argument
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) Pointer reallocateOutput(
            String tensorName, Pointer currentMemory, @Cast("uint64_t") long size, @Cast("uint64_t") long alignment);
    public native @Deprecated @NoException(true) Pointer reallocateOutput(
            @Cast("const char*") BytePointer tensorName, Pointer currentMemory, @Cast("uint64_t") long size, @Cast("uint64_t") long alignment);

    /**
     *  \brief Return a pointer to memory for an output tensor, or nullptr if memory cannot be allocated.
     *         If the requested memory size exceeds the currentMemory size, the currentMemory can be freed as well.
     *         If currentMemory is known to be big enough, one option is to return currentMemory.
     * 
     *  @param tensorName name of the output tensor.
     *  @param currentMemory points to the address set by IExectionContext::setTensorAddress.
     *  @param size number of bytes required. Always positive, even for an empty tensor.
     *  @param alignment required alignment of the allocation.
     *  @param stream The stream in which to execute the kernels.
     * 
     *  @return A pointer to memory to use for the output tensor or nullptr.
     * 
     *  To preallocate memory and have the engine fail if the preallocation is not big enough,
     *  use IExecutionContext::setTensorAddress to set a pointer to the preallocated memory,
     *  and have reallocateOutputAsync return nullptr if that memory is not big enough.
     * 
     *  The default definition exists for sake of backward compatibility with earlier versions of TensorRT.
     *  Eventually this method will become a pure virtual method that requires an override, and method
     *  reallocateOutput() will disappear. Code moving away from TensorRT 9.x should override method
     *  reallocateOutputAsync() and NOT override method reallocateOutput().
     *  */
    
    
    //!
    //!
    //!
    //!
    public native Pointer reallocateOutputAsync(
            String tensorName, Pointer currentMemory, @Cast("uint64_t") long size, @Cast("uint64_t") long alignment, CUstream_st arg4);
    public native Pointer reallocateOutputAsync(
            @Cast("const char*") BytePointer tensorName, Pointer currentMemory, @Cast("uint64_t") long size, @Cast("uint64_t") long alignment, CUstream_st arg4);

    /**
     *  \brief Called by TensorRT when the shape of the output tensor is known.
     * 
     *  Called by TensorRT sometime between when it calls reallocateOutput and enqueueV3 returns.
     * 
     *  @param dims dimensions of the output
     *  @param tensorName name of the tensor
     *  */
    public native @NoException(true) void notifyShape(String tensorName, @Cast("const nvinfer1::Dims*") @ByRef Dims64 dims);
    public native @NoException(true) void notifyShape(@Cast("const char*") BytePointer tensorName, @Cast("const nvinfer1::Dims*") @ByRef Dims64 dims);
}
