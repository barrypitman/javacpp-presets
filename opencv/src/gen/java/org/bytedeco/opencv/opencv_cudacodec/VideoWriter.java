// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

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

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief Video writer interface.
<p>
The implementation uses H264 video codec.
<p>
\note Currently only Windows platform is supported.
<p>
\note
   -   An example on how to use the videoWriter class can be found at
        opencv_source_code/samples/gpu/video_writer.cpp
 */
@Name("cv::cudacodec::VideoWriter") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class VideoWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoWriter(Pointer p) { super(p); }


    /** \brief Writes the next video frame.
    <p>
    @param frame The written frame.
    @param lastFrame Indicates that it is end of stream. The parameter can be ignored.
    <p>
    The method write the specified image to video file. The image must have the same size and the same
    surface format as has been specified when opening the video writer.
     */
    public native void write(@ByVal Mat frame, @Cast("bool") boolean lastFrame/*=false*/);
    public native void write(@ByVal Mat frame);
    public native void write(@ByVal UMat frame, @Cast("bool") boolean lastFrame/*=false*/);
    public native void write(@ByVal UMat frame);
    public native void write(@ByVal GpuMat frame, @Cast("bool") boolean lastFrame/*=false*/);
    public native void write(@ByVal GpuMat frame);

    public native @ByVal EncoderParams getEncoderParams();
}
