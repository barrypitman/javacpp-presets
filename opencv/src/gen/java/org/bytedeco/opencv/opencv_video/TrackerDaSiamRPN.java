// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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

import static org.bytedeco.opencv.global.opencv_video.*;


@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class TrackerDaSiamRPN extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerDaSiamRPN(Pointer p) { super(p); }


    @NoOffset public static class Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Params(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Params position(long position) {
            return (Params)super.position(position);
        }
        @Override public Params getPointer(long i) {
            return new Params((Pointer)this).offsetAddress(i);
        }
    
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native @StdString BytePointer model(); public native Params model(BytePointer setter);
        public native @StdString BytePointer kernel_cls1(); public native Params kernel_cls1(BytePointer setter);
        public native @StdString BytePointer kernel_r1(); public native Params kernel_r1(BytePointer setter);
        public native int backend(); public native Params backend(int setter);
        public native int target(); public native Params target(int setter);
    }

    /** \brief Constructor
    @param parameters DaSiamRPN parameters TrackerDaSiamRPN::Params
    */
    public static native @Ptr TrackerDaSiamRPN create(@Const @ByRef(nullValue = "cv::TrackerDaSiamRPN::Params()") Params parameters);
    public static native @Ptr TrackerDaSiamRPN create();

    /** \brief Return tracking score
    */
    public native float getTrackingScore();

    //void init(InputArray image, const Rect& boundingBox) CV_OVERRIDE;
    //bool update(InputArray image, CV_OUT Rect& boundingBox) CV_OVERRIDE;
}
