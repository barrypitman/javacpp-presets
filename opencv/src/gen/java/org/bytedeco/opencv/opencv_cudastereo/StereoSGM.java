// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudastereo;

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

import static org.bytedeco.opencv.global.opencv_cudastereo.*;


/////////////////////////////////////////
// StereoSGM

/** \brief The class implements the modified H. Hirschmuller algorithm \cite HH08.
Limitation and difference are as follows:
<p>
-   By default, the algorithm uses only 4 directions which are horizontal and vertical path instead of 8.
Set mode=StereoSGM::MODE_HH in createStereoSGM to run the full variant of the algorithm.
-   Mutual Information cost function is not implemented.
Instead, Center-Symmetric Census Transform with {@code 9 \times 7} window size from \cite Spangenberg2013
is used for robustness.
<p>
@see cv::StereoSGBM
*/
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudastereo.class)
public class StereoSGM extends StereoSGBM {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoSGM(Pointer p) { super(p); }

    /** \brief Computes disparity map for the specified stereo pair
    <p>
    @param left Left 8-bit or 16-bit unsigned single-channel image.
    @param right Right image of the same size and the same type as the left one.
    @param disparity Output disparity map. It has the same size as the input images.
    StereoSGM computes 16-bit fixed-point disparity map (where each disparity value has 4 fractional bits).
    */
    public native @Override void compute(@ByVal Mat left, @ByVal Mat right, @ByVal Mat disparity);
    public native @Override void compute(@ByVal UMat left, @ByVal UMat right, @ByVal UMat disparity);
    public native @Override void compute(@ByVal GpuMat left, @ByVal GpuMat right, @ByVal GpuMat disparity);

    /** \brief Computes disparity map with specified CUDA Stream
    <p>
    @see compute
    */
    public native @Name("compute") void compute_with_stream(@ByVal Mat left, @ByVal Mat right, @ByVal Mat disparity, @ByRef Stream stream);
    public native @Name("compute") void compute_with_stream(@ByVal UMat left, @ByVal UMat right, @ByVal UMat disparity, @ByRef Stream stream);
    public native @Name("compute") void compute_with_stream(@ByVal GpuMat left, @ByVal GpuMat right, @ByVal GpuMat disparity, @ByRef Stream stream);
}
