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


     /** \brief This class represents high-level API for segmentation  models
      *
      * SegmentationModel allows to set params for preprocessing input image.
      * SegmentationModel creates net from file with trained weights and config,
      * sets preprocessing input, runs forward pass and returns the class prediction for each pixel.
      */
     @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class SegmentationModel extends Model {
         static { Loader.load(); }
         /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
         public SegmentationModel(Pointer p) { super(p); }
     
         /**
          * \brief Create segmentation model from network represented in one of the supported formats.
          * An order of \p model and \p config arguments does not matter.
          * @param model [in] Binary file contains trained weights.
          * @param config [in] Text file contains network configuration.
          */
          public SegmentationModel(@Str BytePointer model, @Str BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
          private native void allocate(@Str BytePointer model, @Str BytePointer config/*=""*/);
          public SegmentationModel(@Str BytePointer model) { super((Pointer)null); allocate(model); }
          private native void allocate(@Str BytePointer model);
          public SegmentationModel(@Str String model, @Str String config/*=""*/) { super((Pointer)null); allocate(model, config); }
          private native void allocate(@Str String model, @Str String config/*=""*/);
          public SegmentationModel(@Str String model) { super((Pointer)null); allocate(model); }
          private native void allocate(@Str String model);

         /**
          * \brief Create model from deep learning network.
          * @param network [in] Net object.
          */
         public SegmentationModel(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
         private native void allocate(@Const @ByRef Net network);

         /** \brief Given the \p input frame, create input blob, run net
          *  @param frame [in]  The input image.
          *  @param mask [out] Allocated class prediction for each pixel
          */
         public native void segment(@ByVal Mat frame, @ByVal Mat mask);
         public native void segment(@ByVal UMat frame, @ByVal UMat mask);
         public native void segment(@ByVal GpuMat frame, @ByVal GpuMat mask);
     }
