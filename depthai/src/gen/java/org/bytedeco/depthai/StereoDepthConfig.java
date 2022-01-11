// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * StereoDepthConfig message.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StereoDepthConfig extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoDepthConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StereoDepthConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StereoDepthConfig position(long position) {
        return (StereoDepthConfig)super.position(position);
    }
    @Override public StereoDepthConfig getPointer(long i) {
        return new StereoDepthConfig((Pointer)this).offsetAddress(i);
    }


    /**
     * Construct StereoDepthConfig message.
     */
    public StereoDepthConfig() { super((Pointer)null); allocate(); }
    private native void allocate();
    public StereoDepthConfig(@SharedPtr RawStereoDepthConfig ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawStereoDepthConfig ptr);

    /**
     * @param align Set the disparity/depth alignment: centered (between the 'left' and 'right' inputs),
     * or from the perspective of a rectified output stream
     */
    public native void setDepthAlign(RawStereoDepthConfig.AlgorithmControl.DepthAlign align);

    /**
     * Confidence threshold for disparity calculation
     * @param confThr Confidence threshold value 0..255
     */
    public native void setConfidenceThreshold(int confThr);
    /**
     * Get confidence threshold for disparity calculation
     */
    public native int getConfidenceThreshold();

    /**
     * @param median Set kernel size for disparity/depth median filtering, or disable
     */
    public native void setMedianFilter(MedianFilter median);
    public native void setMedianFilter(@Cast("dai::MedianFilter") int median);
    /**
     * Get median filter setting
     */
    public native MedianFilter getMedianFilter();

    /**
     * A larger value of the parameter means that farther colors within the pixel neighborhood will be mixed together,
     * resulting in larger areas of semi-equal color.
     * @param sigma Set sigma value for 5x5 bilateral filter. 0..65535
     */
    public native void setBilateralFilterSigma(@Cast("uint16_t") short sigma);
    /**
     * Get sigma value for 5x5 bilateral filter
     */
    public native @Cast("uint16_t") short getBilateralFilterSigma();

    /**
     * @param threshold Set threshold for left-right, right-left disparity map combine, 0..255
     */
    public native void setLeftRightCheckThreshold(int threshold);
    /**
     * Get threshold for left-right check combine
     */
    public native int getLeftRightCheckThreshold();

    /**
     * Computes and combines disparities in both L-R and R-L directions, and combine them.
     *
     * For better occlusion handling, discarding invalid disparity values
     */
    public native void setLeftRightCheck(@Cast("bool") boolean enable);

    /**
     * Disparity range increased from 95 to 190, combined from full resolution and downscaled images.
     * Suitable for short range objects
     */
    public native void setExtendedDisparity(@Cast("bool") boolean enable);

    /**
     * Computes disparity with sub-pixel interpolation (5 fractional bits).
     *
     * Suitable for long range. Currently incompatible with extended disparity
     */
    public native void setSubpixel(@Cast("bool") boolean enable);

    /**
     * Useful for normalization of the disparity map.
     * @return Maximum disparity value that the node can return
     */
    public native float getMaxDisparity();

    /**
     * Set explicit configuration.
     * @param config Explicit configuration
     */
    public native void set(@ByVal RawStereoDepthConfig config);

    /**
     * Retrieve configuration data for StereoDepth.
     * @return config for stereo depth algorithm
     */
    public native @ByVal RawStereoDepthConfig get();
}
