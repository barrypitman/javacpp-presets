// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Base class for warping logic implementation.
 */
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class ProjectorBase extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ProjectorBase() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ProjectorBase(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProjectorBase(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ProjectorBase position(long position) {
        return (ProjectorBase)super.position(position);
    }
    @Override public ProjectorBase getPointer(long i) {
        return new ProjectorBase((Pointer)this).offsetAddress(i);
    }

    public native void setCameraParams(@ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") Mat K,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") Mat R,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::zeros(3, 1, CV_32F))") Mat T);
    public native void setCameraParams();
    public native void setCameraParams(@ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") UMat K,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") UMat R,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::zeros(3, 1, CV_32F))") UMat T);
    public native void setCameraParams(@ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") GpuMat K,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::eye(3, 3, CV_32F))") GpuMat R,
                             @ByVal(nullValue = "cv::InputArray(cv::Mat::zeros(3, 1, CV_32F))") GpuMat T);

    public native float scale(); public native ProjectorBase scale(float setter);
    public native float k(int i); public native ProjectorBase k(int i, float setter);
    @MemberGetter public native FloatPointer k();
    public native float rinv(int i); public native ProjectorBase rinv(int i, float setter);
    @MemberGetter public native FloatPointer rinv();
    public native float r_kinv(int i); public native ProjectorBase r_kinv(int i, float setter);
    @MemberGetter public native FloatPointer r_kinv();
    public native float k_rinv(int i); public native ProjectorBase k_rinv(int i, float setter);
    @MemberGetter public native FloatPointer k_rinv();
    public native float t(int i); public native ProjectorBase t(int i, float setter);
    @MemberGetter public native FloatPointer t();
}
