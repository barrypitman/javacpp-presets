// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ConcatLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ConcatLayer(Pointer p) { super(p); }
    
        public native int axis(); public native ConcatLayer axis(int setter);
        /**
         * \brief Add zero padding in case of concatenation of blobs with different
         * spatial sizes.
         *
         * Details: https://github.com/torch/nn/blob/master/doc/containers.md#depthconcat
         */
        public native @Cast("bool") boolean padding(); public native ConcatLayer padding(boolean setter);
        public native int paddingValue(); public native ConcatLayer paddingValue(int setter);

        public static native @Ptr ConcatLayer create(@Const @ByRef LayerParams params);
    }
