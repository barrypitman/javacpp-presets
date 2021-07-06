// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \addtogroup features2d_main
 *  \{ */

// //! writes vector of keypoints to the file storage
// CV_EXPORTS void write(FileStorage& fs, const String& name, const std::vector<KeyPoint>& keypoints);
// //! reads vector of keypoints from the specified file storage node
// CV_EXPORTS void read(const FileNode& node, CV_OUT std::vector<KeyPoint>& keypoints);

/** \brief A class filters a vector of keypoints.
 <p>
 Because now it is difficult to provide a convenient interface for all usage scenarios of the
 keypoints filter class, it has only several needed by now static methods.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class KeyPointsFilter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KeyPointsFilter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KeyPointsFilter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KeyPointsFilter position(long position) {
        return (KeyPointsFilter)super.position(position);
    }
    @Override public KeyPointsFilter getPointer(long i) {
        return new KeyPointsFilter((Pointer)this).offsetAddress(i);
    }

    public KeyPointsFilter() { super((Pointer)null); allocate(); }
    private native void allocate();

    /*
     * Remove keypoints within borderPixels of an image edge.
     */
    public static native void runByImageBorder( @ByRef KeyPointVector keypoints, @ByVal Size imageSize, int borderSize );
    /*
     * Remove keypoints of sizes out of range.
     */
    public static native void runByKeypointSize( @ByRef KeyPointVector keypoints, float minSize,
                                       float maxSize/*=FLT_MAX*/ );
    public static native void runByKeypointSize( @ByRef KeyPointVector keypoints, float minSize );
    /*
     * Remove keypoints from some image by mask for pixels of this image.
     */
    public static native void runByPixelsMask( @ByRef KeyPointVector keypoints, @Const @ByRef Mat mask );
    /*
     * Remove duplicated keypoints.
     */
    public static native void removeDuplicated( @ByRef KeyPointVector keypoints );
    /*
     * Remove duplicated keypoints and sort the remaining keypoints
     */
    public static native void removeDuplicatedSorted( @ByRef KeyPointVector keypoints );

    /*
     * Retain the specified number of the best keypoints (according to the response)
     */
    public static native void retainBest( @ByRef KeyPointVector keypoints, int npoints );
}
