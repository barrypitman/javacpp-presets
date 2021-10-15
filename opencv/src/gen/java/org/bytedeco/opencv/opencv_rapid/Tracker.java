// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_rapid;

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

import static org.bytedeco.opencv.global.opencv_rapid.*;


/** Abstract base class for stateful silhouette trackers */
@Namespace("cv::rapid") @Properties(inherit = org.bytedeco.opencv.presets.opencv_rapid.class)
public class Tracker extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracker(Pointer p) { super(p); }

    public native float compute(@ByVal Mat img, int num, int len, @ByVal Mat K, @ByVal Mat rvec, @ByVal Mat tvec,
                @Const @ByRef(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER | cv::TermCriteria::EPS, 5, 1.5)") TermCriteria termcrit);
    public native float compute(@ByVal Mat img, int num, int len, @ByVal Mat K, @ByVal Mat rvec, @ByVal Mat tvec);
    public native float compute(@ByVal UMat img, int num, int len, @ByVal UMat K, @ByVal UMat rvec, @ByVal UMat tvec,
                @Const @ByRef(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER | cv::TermCriteria::EPS, 5, 1.5)") TermCriteria termcrit);
    public native float compute(@ByVal UMat img, int num, int len, @ByVal UMat K, @ByVal UMat rvec, @ByVal UMat tvec);
    public native float compute(@ByVal GpuMat img, int num, int len, @ByVal GpuMat K, @ByVal GpuMat rvec, @ByVal GpuMat tvec,
                @Const @ByRef(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER | cv::TermCriteria::EPS, 5, 1.5)") TermCriteria termcrit);
    public native float compute(@ByVal GpuMat img, int num, int len, @ByVal GpuMat K, @ByVal GpuMat rvec, @ByVal GpuMat tvec);
    public native void clearState();
}
