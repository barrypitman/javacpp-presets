// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/**
\brief Class implementing the Tree Based Morse Regions (TBMR) as described in
\cite Najman2014 extended with scaled extraction ability.
<p>
@param min_area prune areas smaller than minArea
@param max_area_relative prune areas bigger than maxArea = max_area_relative *
input_image_size
@param scale_factor scale factor for scaled extraction.
@param n_scales number of applications of the scale factor (octaves).
<p>
\note This algorithm is based on Component Tree (Min/Max) as well as MSER but
uses a Morse-theory approach to extract features.
<p>
Features are ellipses (similar to MSER, however a MSER feature can never be a
TBMR feature and vice versa).
<p>
*/
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class TBMR extends AffineFeature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TBMR(Pointer p) { super(p); }

    public static native @Ptr TBMR create(int min_area/*=60*/,
            float max_area_relative/*=0.01f*/,
            float scale_factor/*=1.25f*/,
            int n_scales/*=-1*/);
    public static native @Ptr TBMR create();

    public native void setMinArea(int minArea);
    public native int getMinArea();
    public native void setMaxAreaRelative(float maxArea);
    public native float getMaxAreaRelative();
    public native void setScaleFactor(float scale_factor);
    public native float getScaleFactor();
    public native void setNScales(int n_scales);
    public native int getNScales();
}
