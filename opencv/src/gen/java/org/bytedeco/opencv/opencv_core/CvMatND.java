// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

/**
  @deprecated consider using cv::Mat instead
  */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvMatND extends AbstractCvMatND {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMatND() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMatND(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMatND(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMatND position(long position) {
        return (CvMatND)super.position(position);
    }
    @Override public CvMatND getPointer(long i) {
        return new CvMatND((Pointer)this).offsetAddress(i);
    }

    public native int type(); public native CvMatND type(int setter);
    public native int dims(); public native CvMatND dims(int setter);

    public native IntPointer refcount(); public native CvMatND refcount(IntPointer setter);
    public native int hdr_refcount(); public native CvMatND hdr_refcount(int setter);

        @Name("data.ptr") public native @Cast("uchar*") BytePointer data_ptr(); public native CvMatND data_ptr(BytePointer setter);
        @Name("data.fl") public native FloatPointer data_fl(); public native CvMatND data_fl(FloatPointer setter);
        @Name("data.db") public native DoublePointer data_db(); public native CvMatND data_db(DoublePointer setter);
        @Name("data.i") public native IntPointer data_i(); public native CvMatND data_i(IntPointer setter);
        @Name("data.s") public native ShortPointer data_s(); public native CvMatND data_s(ShortPointer setter);

        @Name({"dim", ".size"}) public native int dim_size(int i); public native CvMatND dim_size(int i, int setter);
        @Name({"dim", ".step"}) public native int dim_step(int i); public native CvMatND dim_step(int i, int setter);

// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
// #endif
}
