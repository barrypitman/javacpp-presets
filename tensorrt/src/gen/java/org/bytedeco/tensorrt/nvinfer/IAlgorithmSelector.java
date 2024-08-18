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
 // IAlgorithm
@Namespace("nvinfer1::v_1_0") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IAlgorithmSelector extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IAlgorithmSelector(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();
    /**
     *  \brief Select Algorithms for a layer from the given list of algorithm choices.
     * 
     *  @return The number of choices selected from [0, nbChoices-1].
     *  @param context The context for which the algorithm choices are valid.
     *  @param choices The list of algorithm choices to select for implementation of this layer.
     *  @param nbChoices Number of algorithm choices.
     *  @param selection The user writes indices of selected choices in to selection buffer which is of size nbChoices.
     * 
     *  \note TensorRT uses its default algorithm selection to choose from the list provided.
     *        If return value is 0, TensorRT's default algorithm selection is used unless
     *        BuilderFlag::kREJECT_EMPTY_ALGORITHMS is set.
     *        The list of choices is valid only for this specific algorithm context.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int selectAlgorithms(@Const @ByRef IAlgorithmContext context, @Cast("const nvinfer1::IAlgorithm*const*") PointerPointer choices,
            int nbChoices, IntPointer selection);
    public native @NoException(true) int selectAlgorithms(@Const @ByRef IAlgorithmContext context, @Const @ByPtrPtr IAlgorithm choices,
            int nbChoices, IntPointer selection);
    public native @NoException(true) int selectAlgorithms(@Const @ByRef IAlgorithmContext context, @Const @ByPtrPtr IAlgorithm choices,
            int nbChoices, IntBuffer selection);
    public native @NoException(true) int selectAlgorithms(@Const @ByRef IAlgorithmContext context, @Const @ByPtrPtr IAlgorithm choices,
            int nbChoices, int[] selection);

    /**
     *  \brief Called by TensorRT to report choices it made.
     * 
     *  \note For a given optimization profile, this call comes after all calls to selectAlgorithms.
     *  algoChoices[i] is the choice that TensorRT made for algoContexts[i], for i in [0, nbAlgorithms-1]
     * 
     *  @param algoContexts The list of all algorithm contexts.
     *  @param algoChoices The list of algorithm choices made by TensorRT
     *  @param nbAlgorithms The size of algoContexts as well as algoChoices.
     *  */
    public native @NoException(true) void reportAlgorithms(@Cast("const nvinfer1::IAlgorithmContext*const*") PointerPointer algoContexts, @Cast("const nvinfer1::IAlgorithm*const*") PointerPointer algoChoices,
            int nbAlgorithms);
    public native @NoException(true) void reportAlgorithms(@Const @ByPtrPtr IAlgorithmContext algoContexts, @Const @ByPtrPtr IAlgorithm algoChoices,
            int nbAlgorithms);
}
