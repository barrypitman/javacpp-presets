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
public class IPluginV3 extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV3(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();

    /** \brief Return a pointer to plugin object implementing the specified PluginCapabilityType.
     * 
     *  \note IPluginV3 objects added for the build phase (through addPluginV3()) must return valid objects for
     *  PluginCapabilityType::kCORE, PluginCapabilityType::kBUILD and PluginCapabilityType::kRUNTIME.
     * 
     *  \note IPluginV3 objects added for the runtime phase must return valid objects for
     *  PluginCapabilityType::kCORE and PluginCapabilityType::kRUNTIME.
     * 
     *  @see TensorRTPhase
     *  @see IPluginCreatorV3One::createPlugin()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) IPluginCapability getCapabilityInterface(PluginCapabilityType type);
    public native @NoException(true) IPluginCapability getCapabilityInterface(@Cast("nvinfer1::PluginCapabilityType") int type);

    /**
     *  \brief Clone the plugin object. This copies over internal plugin parameters and returns a new plugin object with
     *  these parameters. The cloned object must be in a fully initialized state.
     * 
     *  \note The cloned object must return valid objects through getCapabilityInterface() for at least the same
     *  PluginCapabilityTypes as the original object.
     * 
     *  @return A cloned plugin object in an initialized state with the same parameters as the current object.
     *          nullptr must be returned if the cloning fails.
     *  */
    public native @NoException(true) IPluginV3 clone();
}
