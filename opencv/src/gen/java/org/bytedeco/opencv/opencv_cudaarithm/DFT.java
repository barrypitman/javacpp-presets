// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaarithm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_cudaarithm.*;


/** \brief Base class for DFT operator as a cv::Algorithm. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaarithm.class)
public class DFT extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DFT(Pointer p) { super(p); }

    /** \brief Computes an FFT of a given image.
    <p>
    @param image Source image. Only CV_32FC1 images are supported for now.
    @param result Result image.
    @param stream Stream for the asynchronous version.
     */
    public native void compute(@ByVal Mat image, @ByVal Mat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal Mat image, @ByVal Mat result);
    public native void compute(@ByVal UMat image, @ByVal UMat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal UMat image, @ByVal UMat result);
    public native void compute(@ByVal GpuMat image, @ByVal GpuMat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal GpuMat image, @ByVal GpuMat result);
}
