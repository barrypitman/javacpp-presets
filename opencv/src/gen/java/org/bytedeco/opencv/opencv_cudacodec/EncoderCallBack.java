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


/** \brief Callbacks for CUDA video encoder.
 */
@Namespace("cv::cudacodec") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class EncoderCallBack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncoderCallBack(Pointer p) { super(p); }

    /** enum cv::cudacodec::EncoderCallBack::PicType */
    public static final int
        IFRAME = 1,
        PFRAME = 2,
        BFRAME = 3;

    /** \brief Callback function to signal the start of bitstream that is to be encoded.
    <p>
    Callback must allocate buffer for CUDA encoder and return pointer to it and it's size.
     */
    public native @Cast("uchar*") BytePointer acquireBitStream(IntPointer bufferSize);
    public native @Cast("uchar*") ByteBuffer acquireBitStream(IntBuffer bufferSize);
    public native @Cast("uchar*") byte[] acquireBitStream(int[] bufferSize);

    /** \brief Callback function to signal that the encoded bitstream is ready to be written to file.
    */
    public native void releaseBitStream(@Cast("unsigned char*") BytePointer data, int size);
    public native void releaseBitStream(@Cast("unsigned char*") ByteBuffer data, int size);
    public native void releaseBitStream(@Cast("unsigned char*") byte[] data, int size);

    /** \brief Callback function to signal that the encoding operation on the frame has started.
    <p>
    @param frameNumber
    @param picType Specify frame type (I-Frame, P-Frame or B-Frame).
     */
    public native void onBeginFrame(int frameNumber, @Cast("cv::cudacodec::EncoderCallBack::PicType") int picType);

    /** \brief Callback function signals that the encoding operation on the frame has finished.
    <p>
    @param frameNumber
    @param picType Specify frame type (I-Frame, P-Frame or B-Frame).
     */
    public native void onEndFrame(int frameNumber, @Cast("cv::cudacodec::EncoderCallBack::PicType") int picType);
}
