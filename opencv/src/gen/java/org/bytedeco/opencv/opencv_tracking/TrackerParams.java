// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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

import static org.bytedeco.opencv.global.opencv_tracking.*;


/**
 *  \brief The TrackerParams struct stores parameters of TrackerByMatching
 *  */
@Namespace("cv::detail::tracking::tbm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackerParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackerParams position(long position) {
        return (TrackerParams)super.position(position);
    }
    @Override public TrackerParams getPointer(long i) {
        return new TrackerParams((Pointer)this).offsetAddress(i);
    }

    /** Min track duration in milliseconds. */
    public native @Cast("size_t") long min_track_duration(); public native TrackerParams min_track_duration(long setter);

    /** Forget about track if the last bounding box in */
    public native @Cast("size_t") long forget_delay(); public native TrackerParams forget_delay(long setter);
                          /** track was detected more than specified number of
                           *  frames ago. */

    /** Affinity threshold which is used to determine if */
    public native float aff_thr_fast(); public native TrackerParams aff_thr_fast(float setter);
                         /** tracklet and detection should be combined (fast
                          *  descriptor is used). */

    /** Affinity threshold which is used to determine if */
    public native float aff_thr_strong(); public native TrackerParams aff_thr_strong(float setter);
                           /** tracklet and detection should be combined(strong
                            *  descriptor is used). */

    /** Shape affinity weight. */
    public native float shape_affinity_w(); public native TrackerParams shape_affinity_w(float setter);

    /** Motion affinity weight. */
    public native float motion_affinity_w(); public native TrackerParams motion_affinity_w(float setter);

    /** Time affinity weight. */
    public native float time_affinity_w(); public native TrackerParams time_affinity_w(float setter);

    /** Min confidence of detection. */
    public native float min_det_conf(); public native TrackerParams min_det_conf(float setter);

    /** Bounding box aspect ratios range. */
    public native @ByRef @Cast("cv::Vec2f*") Point2f bbox_aspect_ratios_range(); public native TrackerParams bbox_aspect_ratios_range(Point2f setter);

    /** Bounding box heights range. */
    public native @ByRef @Cast("cv::Vec2f*") Point2f bbox_heights_range(); public native TrackerParams bbox_heights_range(Point2f setter);

    /** How many frames are used to predict bounding box in case */
    public native int predict(); public native TrackerParams predict(int setter);
    /** of lost track. */

    /** If 'fast' confidence is greater than this */
    public native float strong_affinity_thr(); public native TrackerParams strong_affinity_thr(float setter);
                                /** threshold then 'strong' Re-ID approach is
                                 *  used. */

    /** Affinity threshold for re-identification. */
    public native float reid_thr(); public native TrackerParams reid_thr(float setter);

    /** Drop forgotten tracks. If it's enabled it */
    public native @Cast("bool") boolean drop_forgotten_tracks(); public native TrackerParams drop_forgotten_tracks(boolean setter);
                                 /** disables an ability to get detection log. */

    /** The number of objects in track is
    <p>
    ///
    /// */
    public native int max_num_objects_in_track(); public native TrackerParams max_num_objects_in_track(int setter);
                                   /** restricted by this parameter. If it is negative or zero, the max number of
                                    *  objects in track is not restricted.
     <p>
     * 
     *  Default constructor.
     *  */
    public TrackerParams() { super((Pointer)null); allocate(); }
    private native void allocate();
}
