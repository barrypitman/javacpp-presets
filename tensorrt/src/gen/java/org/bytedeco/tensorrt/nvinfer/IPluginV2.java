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


/**
 *  \class IPluginV2
 * 
 *  \brief Plugin class for user-implemented layers.
 * 
 *  Plugins are a mechanism for applications to implement custom layers. When
 *  combined with IPluginCreator it provides a mechanism to register plugins and
 *  look up the Plugin Registry during de-serialization.
 * 
 *  @see IPluginCreator
 *  @see IPluginRegistry
 * 
 *  @deprecated Deprecated in TensorRT 8.5. Implement IPluginV2DynamicExt or IPluginV2IOExt depending on your
 *  requirement.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV2(Pointer p) { super(p); }

    /**
     *  \brief Return the API version with which this plugin was built.
     * 
     *  Do not override this method as it is used by the TensorRT library to maintain backwards-compatibility with
     *  plugins.
     * 
     *  @return The TensorRT version in the format (major * 100 + minor) * 100 + patch.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, the implementation provided here is safe to call from any thread.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorRTVersion();

    /**
     *  \brief Return the plugin type. Should match the plugin name returned by the corresponding plugin creator
     * 
     *  @see IPluginCreator::getPluginName()
     * 
     *  \warning The string returned must be NULL-terminated and have a length of 1024 bytes or less including the
     *  NULL terminator.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getPluginType();

    /**
     *  \brief Return the plugin version. Should match the plugin version returned by the corresponding plugin creator
     * 
     *  @see IPluginCreator::getPluginVersion()
     * 
     *  \warning The string returned must be NULL-terminated and have a length of 1024 bytes or less including the
     *  NULL terminator.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getPluginVersion();

    /**
     *  \brief Get the number of outputs from the layer.
     * 
     *  @return The number of outputs, which is a positive integer.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called
     *  prior to any call to initialize().
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOutputs();

    /**
     *  \brief Get the dimension of an output tensor.
     * 
     *  @param index The index of the output tensor. Will lie in the valid range (between 0 and getNbOutputs()-1
     *  inclusive).
     *  @param inputs The input tensor dimensions. Will be the start address of a Dims array of length nbInputDims.
     *  @param nbInputDims The number of input tensors. Will be a non-negative integer.
     * 
     *  @return The output tensor dimensions if the index is in the valid range.
     *          An invalid value of Dims{-1, {}} must be returned if the index is not in the valid range.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called
     *  prior to any call to initialize().
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     * 
     *  \note In any non-IPluginV2DynamicExt plugin, batch size must not be included in the returned dimensions,
     *  even if the plugin is expected to be run in a network with explicit batch mode enabled.
     *  Please see the TensorRT Developer Guide for more details on how plugin inputs and outputs behave.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims64 getOutputDimensions(int index, @Cast("const nvinfer1::Dims*") Dims64 inputs, int nbInputDims);

    /**
     *  \brief Check format support.
     * 
     *  @param type DataType requested.
     *  @param format PluginFormat requested.
     * 
     *  @return true if the plugin supports the type-format combination.
     * 
     *  This function is called by the implementations of INetworkDefinition, IBuilder, and
     *  safe::ICudaEngine/ICudaEngine. In particular, it is called when creating an engine and when deserializing an
     *  engine.
     * 
     *  \warning for the format field, the values PluginFormat::kCHW4, PluginFormat::kCHW16, and PluginFormat::kCHW32
     *  will not be passed in, this is to keep backward compatibility with TensorRT 5.x series.  Use PluginV2IOExt
     *  or PluginV2DynamicExt for other PluginFormats.
     * 
     *  \warning DataType:kBOOL and DataType::kUINT8 are not supported.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean supportsFormat(DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format);
    public native @Cast("bool") @NoException(true) boolean supportsFormat(@Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format);

    /**
     *  \brief Configure the layer.
     * 
     *  This function is called by the builder prior to initialize(). It provides an opportunity for the layer to make
     *  algorithm choices on the basis of its weights, dimensions, and maximum batch size.
     * 
     *  @param inputDims The input tensor dimensions. Will be the start address of a Dims array of length nbInputs.
     *  @param nbInputs The number of inputs. Will be a non-negative integer.
     *  @param outputDims The output tensor dimensions. Will be the start address of a Dims array of length nbOutputs.
     *  @param nbOutputs The number of outputs. Will be a positive integer identical to the return value of
     *  getNbOutputs().
     *  @param type The data type selected for the engine.
     *  @param format The format selected for the engine.
     *  @param maxBatchSize The maximum batch size. Will be a positive integer.
     * 
     *  The dimensions passed here do not include the outermost batch size (i.e. for 2-D image networks, they will be
     *  3-dimensional CHW dimensions).
     * 
     *  \warning for the format field, the values PluginFormat::kCHW4, PluginFormat::kCHW16, and PluginFormat::kCHW32
     *  will not be passed in, this is to keep backward compatibility with TensorRT 5.x series.  Use PluginV2IOExt
     *  or PluginV2DynamicExt for other PluginFormats.
     * 
     *  \warning DataType:kBOOL and DataType::kUINT8 are not supported.
     * 
     *  @see clone()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin. However, TensorRT
     *                   will not call this method from two threads simultaneously on a given clone of a plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void configureWithFormat(@Cast("const nvinfer1::Dims*") Dims64 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims64 outputDims, int nbOutputs,
            DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format, int maxBatchSize);
    public native @NoException(true) void configureWithFormat(@Cast("const nvinfer1::Dims*") Dims64 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims64 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format, int maxBatchSize);

    /**
     *  \brief Initialize the layer for execution. This is called when the engine is created.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin or when using multiple
     *                   execution contexts using this plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int initialize();

    /**
     *  \brief Release resources acquired during plugin layer initialization. This is called when the engine is
     *  destroyed.
     * 
     *  @see initialize()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin or when using multiple
     *                   execution contexts using this plugin. However, TensorRT will not call this method from
     *                   two threads simultaneously on a given clone of a plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void terminate();

    /**
     *  \brief Find the workspace size required by the layer.
     * 
     *  This function is called during engine startup, after initialize(). The workspace size returned must be
     *  sufficient for any batch size up to the maximum.
     * 
     *  @param maxBatchSize The maximum batch size, which will be a positive integer.
     * 
     *  @return The workspace size in bytes, i.e. the device memory size that the plugin requires for its internal
     *  computations.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin. However, TensorRT
     *                   will not call this method from two threads simultaneously on a given clone of a plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getWorkspaceSize(int maxBatchSize);

    /**
     *  \brief Execute the layer.
     * 
     *  @param batchSize The number of inputs in the batch.
     *  @param inputs The memory for the input tensors. Will be an array of device addresses corresponding to input
     *         tensors of length nbInputs, where nbInputs is the second parameter passed to configureWithFormat().
     *         The i-th input tensor will have the dimensions inputDims[i], where inputDims is the first parameter
     *         that was passed to configureWithFormat().
     *  @param outputs The memory for the output tensors. Will be an array of device addresses corresponding to output
     *         tensors of length getNbOutputs().
     *  @param workspace Workspace for execution. Will be the start address of a device buffer whose length will be at
     *         least getWorkspaceSize(batchSize).
     *  @param stream The stream in which to execute the kernels. This will be a valid CUDA stream.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int enqueue(int batchSize, @Cast("const void*const*") PointerPointer inputs, @Cast("void*const*") PointerPointer outputs, Pointer workspace,
            CUstream_st stream);
    public native @NoException(true) int enqueue(int batchSize, @Cast("const void*const*") @ByPtrPtr Pointer inputs, @Cast("void*const*") @ByPtrPtr Pointer outputs, Pointer workspace,
            CUstream_st stream);

    /**
     *  \brief Find the size of the serialization buffer required to store the plugin configuration in a binary file.
     * 
     *  @return The size of the serialization buffer in bytes.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getSerializationSize();

    /**
     *  \brief Serialize the layer.
     * 
     *  @param buffer A pointer to a host buffer to serialize data. Size of buffer will be at least as large as the
     *  value returned by getSerializationSize.
     * 
     *  @see getSerializationSize()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void serialize(Pointer buffer);

    /**
     *  \brief Destroy the plugin object. This will be called when the network, builder or engine is destroyed.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void destroy();

    /**
     *  \brief Clone the plugin object. This copies over internal plugin parameters and returns a new plugin object with
     *  these parameters.
     * 
     *  The TensorRT runtime calls clone() to clone the plugin when an execution context is created for an engine,
     *  after the engine has been created.  The runtime does not call initialize() on the cloned plugin,
     *  so the cloned plugin must be created in an initialized state.
     * 
     *  @return A cloned plugin object in an initialized state with the same parameters as the current object.
     *          nullptr must be returned if the cloning fails, e.g. because of resource exhaustion.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin or when creating multiple
     *                   execution contexts.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IPluginV2 clone();

    /**
     *  \brief Set the namespace that this plugin object belongs to. Ideally, all plugin
     *  objects from the same plugin library must have the same namespace.
     * 
     *  @param pluginNamespace The namespace for the plugin object.
     * 
     *  \warning The string pluginNamespace will be NULL-terminated and have a length of 1024 bytes or less including the
     *  NULL terminator.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPluginNamespace(String pluginNamespace);
    public native @NoException(true) void setPluginNamespace(@Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return the namespace of the plugin object.
     * 
     *  @return The namespace string that was passed to setPluginNamespace(), possibly after truncation to 1024 bytes
     *  if a longer string was passed. An empty string must be returned as default value.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when building networks on multiple devices sharing the same plugin.
     *  */
    public native @NoException(true) String getPluginNamespace();

    // @cond SuppressDoxyWarnings
}
