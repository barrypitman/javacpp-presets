// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaoptflow;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaoptflow.*;

/** \brief Base Interface for optical flow algorithms using NVIDIA Optical Flow SDK.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaoptflow.class)
public class NvidiaHWOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NvidiaHWOpticalFlow(Pointer p) { super(p); }
    /** Downcast constructor. */
    public NvidiaHWOpticalFlow(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::cuda::NvidiaHWOpticalFlow*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(NvidiaHWOpticalFlow pointer);

    /** \brief Calculates Optical Flow using NVIDIA Optical Flow SDK.
    <p>
    * NVIDIA GPUs starting with Turing contain a dedicated hardware accelerator for computing optical flow vectors between pairs of images.
    * The optical flow hardware accelerator generates block-based optical flow vectors.
    * The size of the block depends on hardware in use, and can be queried using the function getGridSize().
    * The block-based flow vectors generated by the hardware can be converted to dense representation (i.e. per-pixel flow vectors) using upSampler() helper function, if needed.
    * The flow vectors are stored in CV_16SC2 format with x and y components of each flow vector in 16-bit signed fixed point representation S10.5.
    <p>
    @param inputImage Input image.
    @param referenceImage Reference image of the same size and the same type as input image.
    @param flow A buffer consisting of inputImage.Size() / getGridSize() flow vectors in CV_16SC2 format.
    @param stream It is highly recommended that CUDA streams for pre and post processing of optical flow vectors should be set once per session in create() function as a part of optical flow session creation.
                  This parameter is left here for backward compatibility and may be removed in the future.
                  Default value is NULL stream;
    @param hint Hint buffer if client provides external hints. Must have same size as flow buffer.
                Caller can provide flow vectors as hints for optical flow calculation.
    @param cost Cost buffer contains numbers indicating the confidence associated with each of the generated flow vectors.
                Higher the cost, lower the confidence. Cost buffer is of type CV_32SC1.
    <p>
    \note
    - Client must use critical sections around each calc() function if calling it from multiple threads.
    */
    public native void calc(
            @ByVal Mat inputImage,
            @ByVal Mat referenceImage,
            @ByVal Mat flow,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat hint,
            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat cost);
    public native void calc(
            @ByVal Mat inputImage,
            @ByVal Mat referenceImage,
            @ByVal Mat flow);
    public native void calc(
            @ByVal UMat inputImage,
            @ByVal UMat referenceImage,
            @ByVal UMat flow,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat hint,
            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat cost);
    public native void calc(
            @ByVal UMat inputImage,
            @ByVal UMat referenceImage,
            @ByVal UMat flow);
    public native void calc(
            @ByVal GpuMat inputImage,
            @ByVal GpuMat referenceImage,
            @ByVal GpuMat flow,
            @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream,
            @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat hint,
            @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat cost);
    public native void calc(
            @ByVal GpuMat inputImage,
            @ByVal GpuMat referenceImage,
            @ByVal GpuMat flow);

    /** \brief Releases all buffers, contexts and device pointers.
    */
    public native void collectGarbage();

    /** \brief Returns grid size of output buffer as per the hardware's capability.
    */
    public native int getGridSize();
}
