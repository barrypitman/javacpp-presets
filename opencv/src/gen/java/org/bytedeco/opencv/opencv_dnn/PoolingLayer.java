// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class PoolingLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PoolingLayer(Pointer p) { super(p); }
    
        public native @Name("type") int poolingType(); public native PoolingLayer poolingType(int setter);
        public native @Cast("size_t*") @StdVector SizeTPointer kernel_size(); public native PoolingLayer kernel_size(SizeTPointer setter);
        public native @Cast("size_t*") @StdVector SizeTPointer strides(); public native PoolingLayer strides(SizeTPointer setter);
        public native @Cast("size_t*") @StdVector SizeTPointer pads_begin(); public native PoolingLayer pads_begin(SizeTPointer setter);
        public native @Cast("size_t*") @StdVector SizeTPointer pads_end(); public native PoolingLayer pads_end(SizeTPointer setter);
        /** Flag is true if at least one of the axes is global pooled. */
        public native @Cast("bool") boolean globalPooling(); public native PoolingLayer globalPooling(boolean setter);
        public native @Cast("bool*") @StdVector BoolPointer isGlobalPooling(); public native PoolingLayer isGlobalPooling(BoolPointer setter);
        public native @Cast("bool") boolean computeMaxIdx(); public native PoolingLayer computeMaxIdx(boolean setter);
        public native @Str BytePointer padMode(); public native PoolingLayer padMode(BytePointer setter);
        public native @Cast("bool") boolean ceilMode(); public native PoolingLayer ceilMode(boolean setter);
        // If true for average pooling with padding, divide an every output region
        // by a whole kernel area. Otherwise exclude zero padded values and divide
        // by number of real values.
        public native @Cast("bool") boolean avePoolPaddedArea(); public native PoolingLayer avePoolPaddedArea(boolean setter);
        // ROIPooling parameters.
        public native @ByRef Size pooledSize(); public native PoolingLayer pooledSize(Size setter);
        public native float spatialScale(); public native PoolingLayer spatialScale(float setter);
        // PSROIPooling parameters.
        public native int psRoiOutChannels(); public native PoolingLayer psRoiOutChannels(int setter);

        public static native @Ptr PoolingLayer create(@Const @ByRef LayerParams params);
    }
