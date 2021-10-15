// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

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

import static org.bytedeco.opencv.global.opencv_calib3d.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class UsacParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UsacParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public UsacParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public UsacParams position(long position) {
        return (UsacParams)super.position(position);
    }
    @Override public UsacParams getPointer(long i) {
        return new UsacParams((Pointer)this).offsetAddress(i);
    }
 // in alphabetical order
    public UsacParams() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native double confidence(); public native UsacParams confidence(double setter);
    public native @Cast("bool") boolean isParallel(); public native UsacParams isParallel(boolean setter);
    public native int loIterations(); public native UsacParams loIterations(int setter);
    public native @Cast("cv::LocalOptimMethod") int loMethod(); public native UsacParams loMethod(int setter);
    public native int loSampleSize(); public native UsacParams loSampleSize(int setter);
    public native int maxIterations(); public native UsacParams maxIterations(int setter);
    public native @Cast("cv::NeighborSearchMethod") int neighborsSearch(); public native UsacParams neighborsSearch(int setter);
    public native int randomGeneratorState(); public native UsacParams randomGeneratorState(int setter);
    public native @Cast("cv::SamplingMethod") int sampler(); public native UsacParams sampler(int setter);
    public native @Cast("cv::ScoreMethod") int score(); public native UsacParams score(int setter);
    public native double threshold(); public native UsacParams threshold(double setter);
}
