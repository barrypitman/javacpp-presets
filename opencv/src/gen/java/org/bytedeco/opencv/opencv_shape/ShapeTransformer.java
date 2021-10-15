// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/** \addtogroup shape
 *  \{
<p>
/** \brief Abstract base class for shape transformation algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class ShapeTransformer extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeTransformer(Pointer p) { super(p); }

    /** \brief Estimate the transformation parameters of the current transformer algorithm, based on point matches.
    <p>
    @param transformingShape Contour defining first shape.
    @param targetShape Contour defining second shape (Target).
    @param matches Standard vector of Matches between points.
     */
    public native void estimateTransformation(@ByVal Mat transformingShape, @ByVal Mat targetShape,
                                                     @ByRef DMatchVector matches);
    public native void estimateTransformation(@ByVal UMat transformingShape, @ByVal UMat targetShape,
                                                     @ByRef DMatchVector matches);
    public native void estimateTransformation(@ByVal GpuMat transformingShape, @ByVal GpuMat targetShape,
                                                     @ByRef DMatchVector matches);

    /** \brief Apply a transformation, given a pre-estimated transformation parameters.
    <p>
    @param input Contour (set of points) to apply the transformation.
    @param output Output contour.
     */
    public native float applyTransformation(@ByVal Mat input, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat output);
    public native float applyTransformation(@ByVal Mat input);
    public native float applyTransformation(@ByVal UMat input, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat output);
    public native float applyTransformation(@ByVal UMat input);
    public native float applyTransformation(@ByVal GpuMat input, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat output);
    public native float applyTransformation(@ByVal GpuMat input);

    /** \brief Apply a transformation, given a pre-estimated transformation parameters, to an Image.
    <p>
    @param transformingImage Input image.
    @param output Output image.
    @param flags Image interpolation method.
    @param borderMode border style.
    @param borderValue border value.
     */
    public native void warpImage(@ByVal Mat transformingImage, @ByVal Mat output,
                                       int flags/*=cv::INTER_LINEAR*/, int borderMode/*=cv::BORDER_CONSTANT*/,
                                       @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue);
    public native void warpImage(@ByVal Mat transformingImage, @ByVal Mat output);
    public native void warpImage(@ByVal UMat transformingImage, @ByVal UMat output,
                                       int flags/*=cv::INTER_LINEAR*/, int borderMode/*=cv::BORDER_CONSTANT*/,
                                       @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue);
    public native void warpImage(@ByVal UMat transformingImage, @ByVal UMat output);
    public native void warpImage(@ByVal GpuMat transformingImage, @ByVal GpuMat output,
                                       int flags/*=cv::INTER_LINEAR*/, int borderMode/*=cv::BORDER_CONSTANT*/,
                                       @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue);
    public native void warpImage(@ByVal GpuMat transformingImage, @ByVal GpuMat output);
}
