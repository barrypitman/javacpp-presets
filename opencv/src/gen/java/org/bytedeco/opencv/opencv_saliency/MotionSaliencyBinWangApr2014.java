// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_saliency;

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

import static org.bytedeco.opencv.global.opencv_saliency.*;





/************************************ Specific Motion Saliency Specialized Classes ************************************/

/**
 * A Fast Self-tuning Background Subtraction Algorithm.
 *
 * This background subtraction algorithm is inspired to the work of B. Wang and P. Dudek [2]
 * [2]  B. Wang and P. Dudek "A Fast Self-tuning Background Subtraction Algorithm", in proc of IEEE Workshop on Change Detection, 2014
 *
 */
/** \brief the Fast Self-tuning Background Subtraction Algorithm from \cite BinWangApr2014
 */
@Namespace("cv::saliency") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_saliency.class)
public class MotionSaliencyBinWangApr2014 extends MotionSaliency {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MotionSaliencyBinWangApr2014(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MotionSaliencyBinWangApr2014(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MotionSaliencyBinWangApr2014 position(long position) {
        return (MotionSaliencyBinWangApr2014)super.position(position);
    }
    @Override public MotionSaliencyBinWangApr2014 getPointer(long i) {
        return new MotionSaliencyBinWangApr2014((Pointer)this).offsetAddress(i);
    }

  public MotionSaliencyBinWangApr2014() { super((Pointer)null); allocate(); }
  private native void allocate();

  public static native @Ptr MotionSaliencyBinWangApr2014 create();

  public native @Cast("bool") boolean computeSaliency( @ByVal Mat image, @ByVal Mat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal UMat image, @ByVal UMat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal GpuMat image, @ByVal GpuMat saliencyMap );

  /** \brief This is a utility function that allows to set the correct size (taken from the input image) in the
    corresponding variables that will be used to size the data structures of the algorithm.
    @param W width of input image
    @param H height of input image
  */
  public native void setImagesize( int W, int H );
  /** \brief This function allows the correct initialization of all data structures that will be used by the
    algorithm.
  */
  public native @Cast("bool") boolean init();

  public native int getImageWidth();
  public native void setImageWidth(int val);
  public native int getImageHeight();
  public native void setImageHeight(int val);

}
