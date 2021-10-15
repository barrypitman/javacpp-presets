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
 * Specify properties for StereoDepth
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StereoDepthProperties extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StereoDepthProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StereoDepthProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoDepthProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StereoDepthProperties position(long position) {
        return (StereoDepthProperties)super.position(position);
    }
    @Override public StereoDepthProperties getPointer(long i) {
        return new StereoDepthProperties((Pointer)this).offsetAddress(i);
    }

    public static class RectificationMesh extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public RectificationMesh() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public RectificationMesh(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public RectificationMesh(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public RectificationMesh position(long position) {
            return (RectificationMesh)super.position(position);
        }
        @Override public RectificationMesh getPointer(long i) {
            return new RectificationMesh((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Uri which points to the mesh array for 'left' input rectification
         */
        public native @StdString BytePointer meshLeftUri(); public native RectificationMesh meshLeftUri(BytePointer setter);
        /**
         * Uri which points to the mesh array for 'right' input rectification
         */
        public native @StdString BytePointer meshRightUri(); public native RectificationMesh meshRightUri(BytePointer setter);
        /**
         * Mesh array size in bytes, for each of 'left' and 'right' (need to match)
         */
        public native @ByRef @Cast("tl::optional<std::uint32_t>*") IntOptional meshSize(); public native RectificationMesh meshSize(IntOptional setter);
        /**
         * Distance between mesh points, in the horizontal direction
         */
        public native @Cast("uint16_t") short stepWidth(); public native RectificationMesh stepWidth(short setter);
        /**
         * Distance between mesh points, in the vertical direction
         */
        public native @Cast("uint16_t") short stepHeight(); public native RectificationMesh stepHeight(short setter);
    }

    /** Initial stereo config */
    public native @ByRef RawStereoDepthConfig initialConfig(); public native StereoDepthProperties initialConfig(RawStereoDepthConfig setter);

    /** Whether to wait for config at 'inputConfig' IO */
    public native @Cast("bool") boolean inputConfigSync(); public native StereoDepthProperties inputConfigSync(boolean setter);

    /**
     * Align the disparity/depth to the perspective of a rectified output, or center it
     */
    public enum DepthAlign { RECTIFIED_RIGHT(0), RECTIFIED_LEFT(1), CENTER(2);

        public final int value;
        private DepthAlign(int v) { this.value = v; }
        private DepthAlign(DepthAlign e) { this.value = e.value; }
        public DepthAlign intern() { for (DepthAlign e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /**
     * Set the disparity/depth alignment to the perspective of a rectified output, or center it
     */
    public native DepthAlign depthAlign(); public native StereoDepthProperties depthAlign(DepthAlign setter);
    /**
     * Which camera to align disparity/depth to.
     * When configured (not AUTO), takes precedence over 'depthAlign'
     */
    public native CameraBoardSocket depthAlignCamera(); public native StereoDepthProperties depthAlignCamera(CameraBoardSocket setter);

    public native @Cast("bool") boolean enableRectification(); public native StereoDepthProperties enableRectification(boolean setter);

    /**
     * Disparity range increased from 96 to 192, combined from full resolution and downscaled images.
     * Suitable for short range objects
     */
    public native @Cast("bool") boolean enableExtendedDisparity(); public native StereoDepthProperties enableExtendedDisparity(boolean setter);
    /**
     * Fill color for missing data at frame edges: grayscale 0..255, or -1 to replicate pixels
     */
    public native @Cast("std::int32_t") int rectifyEdgeFillColor(); public native StereoDepthProperties rectifyEdgeFillColor(int setter);
    /**
     * Input frame width. Optional (taken from MonoCamera nodes if they exist)
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional width(); public native StereoDepthProperties width(IntOptional setter);
    /**
     * Input frame height. Optional (taken from MonoCamera nodes if they exist)
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional height(); public native StereoDepthProperties height(IntOptional setter);
    /**
     * Output disparity/depth width. Currently only used when aligning to RGB
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional outWidth(); public native StereoDepthProperties outWidth(IntOptional setter);
    /**
     * Output disparity/depth height. Currently only used when aligning to RGB
     */
    public native @ByRef @Cast("tl::optional<std::int32_t>*") IntOptional outHeight(); public native StereoDepthProperties outHeight(IntOptional setter);
    /**
     * Whether to keep aspect ratio of the input (rectified) or not
     */
    public native @Cast("bool") boolean outKeepAspectRatio(); public native StereoDepthProperties outKeepAspectRatio(boolean setter);

    /**
     * Specify a direct warp mesh to be used for rectification,
     * instead of intrinsics + extrinsic matrices
     */
    public native @ByRef RectificationMesh mesh(); public native StereoDepthProperties mesh(RectificationMesh setter);

    /**
     * Whether to enable switching stereo modes at runtime or not.
     * E.g. standard to subpixel, standard+LR-check to subpixel + LR-check.
     * Note: It will allocate resources for worst cases scenario,
     * should be enabled only if dynamic mode switch is required.
     * Default value: false.
     */
    public native @Cast("bool") boolean enableRuntimeStereoModeSwitch(); public native StereoDepthProperties enableRuntimeStereoModeSwitch(boolean setter);

    /** Num frames in output pool */
    public native int numFramesPool(); public native StereoDepthProperties numFramesPool(int setter);
}
