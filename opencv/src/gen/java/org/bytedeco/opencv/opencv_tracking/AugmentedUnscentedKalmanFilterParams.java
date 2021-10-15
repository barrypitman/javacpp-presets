// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief Augmented Unscented Kalman filter parameters.
* The class for initialization parameters of Augmented Unscented Kalman filter
*/
@Namespace("cv::detail::tracking::kalman_filters") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class AugmentedUnscentedKalmanFilterParams extends UnscentedKalmanFilterParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AugmentedUnscentedKalmanFilterParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AugmentedUnscentedKalmanFilterParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AugmentedUnscentedKalmanFilterParams position(long position) {
        return (AugmentedUnscentedKalmanFilterParams)super.position(position);
    }
    @Override public AugmentedUnscentedKalmanFilterParams getPointer(long i) {
        return new AugmentedUnscentedKalmanFilterParams((Pointer)this).offsetAddress(i);
    }


    public AugmentedUnscentedKalmanFilterParams() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
    * @param dp - dimensionality of the state vector,
    * @param mp - dimensionality of the measurement vector,
    * @param cp - dimensionality of the control vector,
    * @param processNoiseCovDiag - value of elements on main diagonal process noise cross-covariance matrix,
    * @param measurementNoiseCovDiag - value of elements on main diagonal measurement noise cross-covariance matrix,
    * @param dynamicalSystem - ptr to object of the class containing functions for computing the next state and the measurement,
    * @param type - type of the created matrices that should be CV_32F or CV_64F.
    */
    public AugmentedUnscentedKalmanFilterParams( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ ) { super((Pointer)null); allocate(dp, mp, cp, processNoiseCovDiag, measurementNoiseCovDiag, dynamicalSystem, type); }
    private native void allocate( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ );
    public AugmentedUnscentedKalmanFilterParams( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem ) { super((Pointer)null); allocate(dp, mp, cp, processNoiseCovDiag, measurementNoiseCovDiag, dynamicalSystem); }
    private native void allocate( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem );

    /** The function for initialization of Augmented Unscented Kalman filter
    * @param dp - dimensionality of the state vector,
    * @param mp - dimensionality of the measurement vector,
    * @param cp - dimensionality of the control vector,
    * @param processNoiseCovDiag - value of elements on main diagonal process noise cross-covariance matrix,
    * @param measurementNoiseCovDiag - value of elements on main diagonal measurement noise cross-covariance matrix,
    * @param dynamicalSystem - object of the class containing functions for computing the next state and the measurement,
    * @param type - type of the created matrices that should be CV_32F or CV_64F.
    */
    public native void init( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ );
    public native void init( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem );
}
