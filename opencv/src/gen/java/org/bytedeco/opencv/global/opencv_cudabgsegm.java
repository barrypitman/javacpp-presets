// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_cudabgsegm.*;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

public class opencv_cudabgsegm extends org.bytedeco.opencv.presets.opencv_cudabgsegm {
    static { Loader.load(); }

// Parsed from <opencv2/cudabgsegm.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_CUDABGSEGM_HPP
// #define OPENCV_CUDABGSEGM_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"
// #include "opencv2/video/background_segm.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudabgsegm Background Segmentation
  \}
 */
// Targeting ../opencv_cudabgsegm/BackgroundSubtractorMOG.java



/** \brief Creates mixture-of-gaussian background subtractor
<p>
@param history Length of the history.
@param nmixtures Number of Gaussian mixtures.
@param backgroundRatio Background ratio.
@param noiseSigma Noise strength (standard deviation of the brightness or each color channel). 0
means some automatic value.
 */
@Namespace("cv::cuda") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history/*=200*/, int nmixtures/*=5*/,
                                  double backgroundRatio/*=0.7*/, double noiseSigma/*=0*/);
@Namespace("cv::cuda") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG();
// Targeting ../opencv_cudabgsegm/BackgroundSubtractorMOG2.java



/** \brief Creates MOG2 Background Subtractor
<p>
@param history Length of the history.
@param varThreshold Threshold on the squared Mahalanobis distance between the pixel and the model
to decide whether a pixel is well described by the background model. This parameter does not
affect the background update.
@param detectShadows If true, the algorithm will detect shadows and mark them. It decreases the
speed a bit, so if you do not need this feature, set the parameter to false.
 */
@Namespace("cv::cuda") public static native @Ptr org.bytedeco.opencv.opencv_cudabgsegm.BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history/*=500*/, double varThreshold/*=16*/,
                                   @Cast("bool") boolean detectShadows/*=true*/);
@Namespace("cv::cuda") public static native @Ptr org.bytedeco.opencv.opencv_cudabgsegm.BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2();

/** \} */

 // namespace cv { namespace cuda {

// #endif /* OPENCV_CUDABGSEGM_HPP */


}
