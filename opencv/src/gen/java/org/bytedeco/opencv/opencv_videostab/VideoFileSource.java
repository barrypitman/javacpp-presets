// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class VideoFileSource extends IFrameSource {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoFileSource(Pointer p) { super(p); }

    public VideoFileSource(@Str BytePointer path, @Cast("bool") boolean volatileFrame/*=false*/) { super((Pointer)null); allocate(path, volatileFrame); }
    private native void allocate(@Str BytePointer path, @Cast("bool") boolean volatileFrame/*=false*/);
    public VideoFileSource(@Str BytePointer path) { super((Pointer)null); allocate(path); }
    private native void allocate(@Str BytePointer path);
    public VideoFileSource(@Str String path, @Cast("bool") boolean volatileFrame/*=false*/) { super((Pointer)null); allocate(path, volatileFrame); }
    private native void allocate(@Str String path, @Cast("bool") boolean volatileFrame/*=false*/);
    public VideoFileSource(@Str String path) { super((Pointer)null); allocate(path); }
    private native void allocate(@Str String path);

    public native void reset();
    public native @ByVal Mat nextFrame();

    public native int width();
    public native int height();
    public native int count();
    public native double fps();
}
