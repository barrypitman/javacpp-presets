// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;

// #endif // __cplusplus

/** Hu invariants */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvHuMoments extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHuMoments() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHuMoments(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHuMoments(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHuMoments position(long position) {
        return (CvHuMoments)super.position(position);
    }
    @Override public CvHuMoments getPointer(long i) {
        return new CvHuMoments((Pointer)this).offsetAddress(i);
    }

    /** Hu invariants */
    public native double hu1(); public native CvHuMoments hu1(double setter);
    public native double hu2(); public native CvHuMoments hu2(double setter);
    public native double hu3(); public native CvHuMoments hu3(double setter);
    public native double hu4(); public native CvHuMoments hu4(double setter);
    public native double hu5(); public native CvHuMoments hu5(double setter);
    public native double hu6(); public native CvHuMoments hu6(double setter);
    public native double hu7(); public native CvHuMoments hu7(double setter);
}
