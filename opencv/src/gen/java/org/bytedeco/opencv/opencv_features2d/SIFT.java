// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;



/** \brief Class for extracting keypoints and computing descriptors using the Scale Invariant Feature Transform
(SIFT) algorithm by D. Lowe \cite Lowe04 .
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class SIFT extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public SIFT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SIFT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SIFT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SIFT position(long position) {
        return (SIFT)super.position(position);
    }
    @Override public SIFT getPointer(long i) {
        return new SIFT((Pointer)this).offsetAddress(i);
    }

    /**
    @param nfeatures The number of best features to retain. The features are ranked by their scores
    (measured in SIFT algorithm as the local contrast)
    <p>
    @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
    number of octaves is computed automatically from the image resolution.
    <p>
    @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
    (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
    <p>
    \note The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
    nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
    this argument to 0.09.
    <p>
    @param edgeThreshold The threshold used to filter out edge-like features. Note that the its meaning
    is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
    filtered out (more features are retained).
    <p>
    @param sigma The sigma of the Gaussian applied to the input image at the octave \#0. If your image
    is captured with a weak camera with soft lenses, you might want to reduce the number.
    */
    public static native @Ptr SIFT create(int nfeatures/*=0*/, int nOctaveLayers/*=3*/,
            double contrastThreshold/*=0.04*/, double edgeThreshold/*=10*/,
            double sigma/*=1.6*/);
    public static native @Ptr SIFT create();

    /** \brief Create SIFT with specified descriptorType.
    @param nfeatures The number of best features to retain. The features are ranked by their scores
    (measured in SIFT algorithm as the local contrast)
    <p>
    @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
    number of octaves is computed automatically from the image resolution.
    <p>
    @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
    (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
    <p>
    \note The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
    nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
    this argument to 0.09.
    <p>
    @param edgeThreshold The threshold used to filter out edge-like features. Note that the its meaning
    is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
    filtered out (more features are retained).
    <p>
    @param sigma The sigma of the Gaussian applied to the input image at the octave \#0. If your image
    is captured with a weak camera with soft lenses, you might want to reduce the number.
    <p>
    @param descriptorType The type of descriptors. Only CV_32F and CV_8U are supported.
    */
    public static native @Ptr SIFT create(int nfeatures, int nOctaveLayers,
            double contrastThreshold, double edgeThreshold,
            double sigma, int descriptorType);

    public native @Str @Override BytePointer getDefaultName();
}
