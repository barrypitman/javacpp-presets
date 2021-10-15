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



/** \brief Unscented Kalman filter parameters.
* The class for initialization parameters of Unscented Kalman filter
*/
@Namespace("cv::detail::tracking::kalman_filters") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class UnscentedKalmanFilterParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnscentedKalmanFilterParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UnscentedKalmanFilterParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public UnscentedKalmanFilterParams position(long position) {
        return (UnscentedKalmanFilterParams)super.position(position);
    }
    @Override public UnscentedKalmanFilterParams getPointer(long i) {
        return new UnscentedKalmanFilterParams((Pointer)this).offsetAddress(i);
    }


     /** Dimensionality of the state vector. */
     public native int DP(); public native UnscentedKalmanFilterParams DP(int setter);
     /** Dimensionality of the measurement vector. */
     public native int MP(); public native UnscentedKalmanFilterParams MP(int setter);
     /** Dimensionality of the control vector. */
     public native int CP(); public native UnscentedKalmanFilterParams CP(int setter);
     /** Type of elements of vectors and matrices, default is CV_64F. */
     public native int dataType(); public native UnscentedKalmanFilterParams dataType(int setter);

     /** Initial state, DP x 1, default is zero. */
     public native @ByRef Mat stateInit(); public native UnscentedKalmanFilterParams stateInit(Mat setter);
     /** State estimate cross-covariance matrix, DP x DP, default is identity. */
     public native @ByRef Mat errorCovInit(); public native UnscentedKalmanFilterParams errorCovInit(Mat setter);

     /** Process noise cross-covariance matrix, DP x DP. */
     public native @ByRef Mat processNoiseCov(); public native UnscentedKalmanFilterParams processNoiseCov(Mat setter);
     /** Measurement noise cross-covariance matrix, MP x MP. */
     public native @ByRef Mat measurementNoiseCov(); public native UnscentedKalmanFilterParams measurementNoiseCov(Mat setter);

     // Parameters of algorithm
     /** Default is 1e-3. */
     public native double alpha(); public native UnscentedKalmanFilterParams alpha(double setter);
     /** Default is 0. */
     public native double k(); public native UnscentedKalmanFilterParams k(double setter);
     /** Default is 2.0. */
     public native double beta(); public native UnscentedKalmanFilterParams beta(double setter);

     //Dynamical system model
     /** Object of the class containing functions for computing the next state and the measurement. */
     public native @Ptr UkfSystemModel model(); public native UnscentedKalmanFilterParams model(UkfSystemModel setter);

    /** The constructors.
    */
    public UnscentedKalmanFilterParams() { super((Pointer)null); allocate(); }
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
    public UnscentedKalmanFilterParams( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ ) { super((Pointer)null); allocate(dp, mp, cp, processNoiseCovDiag, measurementNoiseCovDiag, dynamicalSystem, type); }
    private native void allocate( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ );
    public UnscentedKalmanFilterParams( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem ) { super((Pointer)null); allocate(dp, mp, cp, processNoiseCovDiag, measurementNoiseCovDiag, dynamicalSystem); }
    private native void allocate( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem );

    /** The function for initialization of Unscented Kalman filter
    * @param dp - dimensionality of the state vector,
    * @param mp - dimensionality of the measurement vector,
    * @param cp - dimensionality of the control vector,
    * @param processNoiseCovDiag - value of elements on main diagonal process noise cross-covariance matrix,
    * @param measurementNoiseCovDiag - value of elements on main diagonal measurement noise cross-covariance matrix,
    * @param dynamicalSystem - ptr to object of the class containing functions for computing the next state and the measurement,
    * @param type - type of the created matrices that should be CV_32F or CV_64F.
    */
    public native void init( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem, int type/*=CV_64F*/ );
    public native void init( int dp, int mp, int cp, double processNoiseCovDiag, double measurementNoiseCovDiag,
                                    @Ptr UkfSystemModel dynamicalSystem );
}
