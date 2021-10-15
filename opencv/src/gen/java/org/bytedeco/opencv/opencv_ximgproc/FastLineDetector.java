// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \addtogroup ximgproc_fast_line_detector
 *  \{
<p>
/** \brief Class implementing the FLD (Fast Line Detector) algorithm described
in \cite Lee14 .
*/

/** \include samples/fld_lines.cpp */

@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class FastLineDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FastLineDetector(Pointer p) { super(p); }

    /** \example fld_lines.cpp
      An example using the FastLineDetector
      */
    /** \brief Finds lines in the input image.
      This is the output of the default parameters of the algorithm on the above
      shown image.
      <p>
      ![image](pics/corridor_fld.jpg)
      <p>
      @param image A grayscale (CV_8UC1) input image. If only a roi needs to be
      selected, use: {@code fld_ptr-\>detect(image(roi), lines, ...);
      lines += Scalar(roi.x, roi.y, roi.x, roi.y);}
      @param lines A vector of Vec4f elements specifying the beginning
      and ending point of a line.  Where Vec4f is (x1, y1, x2, y2), point
      1 is the start, point 2 - end. Returned lines are directed so that the
      brighter side is on their left.
      */
    public native void detect(@ByVal Mat image, @ByVal Mat lines);
    public native void detect(@ByVal UMat image, @ByVal UMat lines);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat lines);

    /** \brief Draws the line segments on a given image.
      @param image The image, where the lines will be drawn. Should be bigger
      or equal to the image, where the lines were found.
      @param lines A vector of the lines that needed to be drawn.
      @param draw_arrow If true, arrow heads will be drawn.
      @param linecolor Line color.
      @param linethickness Line thickness.
      */
    public native void drawSegments(@ByVal Mat image, @ByVal Mat lines,
                @Cast("bool") boolean draw_arrow/*=false*/, @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar linecolor, int linethickness/*=1*/);
    public native void drawSegments(@ByVal Mat image, @ByVal Mat lines);
    public native void drawSegments(@ByVal UMat image, @ByVal UMat lines,
                @Cast("bool") boolean draw_arrow/*=false*/, @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar linecolor, int linethickness/*=1*/);
    public native void drawSegments(@ByVal UMat image, @ByVal UMat lines);
    public native void drawSegments(@ByVal GpuMat image, @ByVal GpuMat lines,
                @Cast("bool") boolean draw_arrow/*=false*/, @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar linecolor, int linethickness/*=1*/);
    public native void drawSegments(@ByVal GpuMat image, @ByVal GpuMat lines);
}
