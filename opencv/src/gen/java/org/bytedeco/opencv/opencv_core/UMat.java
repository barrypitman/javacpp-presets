// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \todo document */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class UMat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMat(Pointer p) { super(p); }

    /** default constructor */
    public UMat(@Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(usageFlags); }
    @NoException private native void allocate(@Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    /** constructs 2D matrix of the specified size and type */
    // (_type is CV_8UC1, CV_64FC3, CV_32SC(12) etc.)
    public UMat(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(rows, cols, type, usageFlags); }
    private native void allocate(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
    private native void allocate(int rows, int cols, int type);
    public UMat(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(size, type, usageFlags); }
    private native void allocate(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(@ByVal Size size, int type) { super((Pointer)null); allocate(size, type); }
    private native void allocate(@ByVal Size size, int type);
    /** constructs 2D matrix and fills it with the specified value _s. */
    public UMat(int rows, int cols, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(rows, cols, type, s, usageFlags); }
    private native void allocate(int rows, int cols, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int rows, int cols, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(rows, cols, type, s); }
    private native void allocate(int rows, int cols, int type, @Const @ByRef Scalar s);
    public UMat(@ByVal Size size, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(size, type, s, usageFlags); }
    private native void allocate(@ByVal Size size, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(@ByVal Size size, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(size, type, s); }
    private native void allocate(@ByVal Size size, int type, @Const @ByRef Scalar s);

    /** constructs n-dimensional matrix */
    public UMat(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntPointer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntBuffer sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type);
    public UMat(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, usageFlags); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const int[] sizes, int type) { super((Pointer)null); allocate(ndims, sizes, type); }
    private native void allocate(int ndims, @Const int[] sizes, int type);
    public UMat(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntPointer sizes, int type, @Const @ByRef Scalar s);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const IntBuffer sizes, int type, @Const @ByRef Scalar s);
    public UMat(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/) { super((Pointer)null); allocate(ndims, sizes, type, s, usageFlags); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public UMat(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s) { super((Pointer)null); allocate(ndims, sizes, type, s); }
    private native void allocate(int ndims, @Const int[] sizes, int type, @Const @ByRef Scalar s);

    /** copy constructor */
    public UMat(@Const @ByRef UMat m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef UMat m);

    /** creates a matrix header for a part of the bigger matrix */
    public UMat(@Const @ByRef UMat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange) { super((Pointer)null); allocate(m, rowRange, colRange); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Range rowRange, @Const @ByRef(nullValue = "cv::Range::all()") Range colRange);
    public UMat(@Const @ByRef UMat m, @Const @ByRef Range rowRange) { super((Pointer)null); allocate(m, rowRange); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Range rowRange);
    public UMat(@Const @ByRef UMat m, @Const @ByRef Rect roi) { super((Pointer)null); allocate(m, roi); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef Rect roi);
    public UMat(@Const @ByRef UMat m, @Const @ByRef RangeVector ranges) { super((Pointer)null); allocate(m, ranges); }
    private native void allocate(@Const @ByRef UMat m, @Const @ByRef RangeVector ranges);

    // FIXIT copyData=false is not implemented, drop this in favor of cv::Mat (OpenCV 5.0)
    /** builds matrix from std::vector with or without copying the data */

    /** destructor - calls release() */
    /** assignment operators */
    public native @ByRef @Name("operator =") UMat put(@Const @ByRef UMat m);

    public native @ByVal Mat getMat(@Cast("cv::AccessFlag") int flags);

    /** returns a new matrix header for the specified row */
    public native @ByVal UMat row(int y);
    /** returns a new matrix header for the specified column */
    public native @ByVal UMat col(int x);
    /** ... for the specified row span */
    public native @ByVal UMat rowRange(int startrow, int endrow);
    public native @ByVal UMat rowRange(@Const @ByRef Range r);
    /** ... for the specified column span */
    public native @ByVal UMat colRange(int startcol, int endcol);
    public native @ByVal UMat colRange(@Const @ByRef Range r);
    /** ... for the specified diagonal
     *  (d=0 - the main diagonal,
     *   >0 - a diagonal from the upper half,
     *   <0 - a diagonal from the lower half) */
    public native @ByVal UMat diag(int d/*=0*/);
    public native @ByVal UMat diag();
    /** constructs a square diagonal matrix which main diagonal is vector "d" */
    /* nothing by default */ public static native @ByVal UMat diag(@Const @ByRef UMat d, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat diag(@Const @ByRef UMat d);  // OpenCV 5.0: remove abi compatibility overload

    /** returns deep copy of the matrix, i.e. the data is copied */
    /* nothing by default */ public native @ByVal UMat clone();
    /** copies the matrix content to "m". */
    // It calls m.create(this->size(), this->type()).
    public native void copyTo( @ByVal Mat m );
    public native void copyTo( @ByVal UMat m );
    public native void copyTo( @ByVal GpuMat m );
    /** copies those matrix elements to "m" that are marked with non-zero mask elements. */
    public native void copyTo( @ByVal Mat m, @ByVal Mat mask );
    public native void copyTo( @ByVal UMat m, @ByVal UMat mask );
    public native void copyTo( @ByVal GpuMat m, @ByVal GpuMat mask );
    /** converts matrix to another datatype with optional scaling. See cvConvertScale. */
    public native void convertTo( @ByVal Mat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByVal Mat m, int rtype );
    public native void convertTo( @ByVal UMat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByVal UMat m, int rtype );
    public native void convertTo( @ByVal GpuMat m, int rtype, double alpha/*=1*/, double beta/*=0*/ );
    public native void convertTo( @ByVal GpuMat m, int rtype );

    public native void assignTo( @ByRef UMat m, int type/*=-1*/ );
    public native void assignTo( @ByRef UMat m );

    /** sets every matrix element to s */
    public native @ByRef @Name("operator =") UMat put(@Const @ByRef Scalar s);
    /** sets some of the matrix elements to s, according to the mask */
    public native @ByRef UMat setTo(@ByVal Mat value, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat mask);
    public native @ByRef UMat setTo(@ByVal Mat value);
    public native @ByRef UMat setTo(@ByVal UMat value, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat mask);
    public native @ByRef UMat setTo(@ByVal UMat value);
    public native @ByRef UMat setTo(@ByVal GpuMat value, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat mask);
    public native @ByRef UMat setTo(@ByVal GpuMat value);
    /** creates alternative matrix header for the same data, with different */
    // number of channels and/or different number of rows. see cvReshape.
    public native @ByVal UMat reshape(int cn, int rows/*=0*/);
    public native @ByVal UMat reshape(int cn);
    public native @ByVal UMat reshape(int cn, int newndims, @Const IntPointer newsz);
    public native @ByVal UMat reshape(int cn, int newndims, @Const IntBuffer newsz);
    public native @ByVal UMat reshape(int cn, int newndims, @Const int[] newsz);

    /** matrix transposition by means of matrix expressions */
    public native @ByVal UMat t();
    /** matrix inversion by means of matrix expressions */
    public native @ByVal UMat inv(int method/*=cv::DECOMP_LU*/);
    public native @ByVal UMat inv();
    /** per-element matrix multiplication by means of matrix expressions */
    public native @ByVal UMat mul(@ByVal Mat m, double scale/*=1*/);
    public native @ByVal UMat mul(@ByVal Mat m);
    public native @ByVal UMat mul(@ByVal UMat m, double scale/*=1*/);
    public native @ByVal UMat mul(@ByVal UMat m);
    public native @ByVal UMat mul(@ByVal GpuMat m, double scale/*=1*/);
    public native @ByVal UMat mul(@ByVal GpuMat m);

    /** computes dot-product */
    public native double dot(@ByVal Mat m);
    public native double dot(@ByVal UMat m);
    public native double dot(@ByVal GpuMat m);

    /** Matlab-style matrix initialization */
    /* nothing by default */ public static native @ByVal UMat zeros(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat zeros(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat zeros(int ndims, @Const IntPointer sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
public static native @ByVal UMat zeros(int ndims, @Const IntBuffer sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
public static native @ByVal UMat zeros(int ndims, @Const int[] sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat zeros(int rows, int cols, int type);  // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */ public static native @ByVal UMat zeros(@ByVal Size size, int type);  // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */   // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */ public static native @ByVal UMat ones(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat ones(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat ones(int ndims, @Const IntPointer sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
public static native @ByVal UMat ones(int ndims, @Const IntBuffer sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
public static native @ByVal UMat ones(int ndims, @Const int[] sz, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat ones(int rows, int cols, int type);  // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */ public static native @ByVal UMat ones(@ByVal Size size, int type);  // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */   // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */ public static native @ByVal UMat eye(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat eye(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags);
    /* nothing by default */ public static native @ByVal UMat eye(int rows, int cols, int type);  // OpenCV 5.0: remove abi compatibility overload
    /* nothing by default */ public static native @ByVal UMat eye(@ByVal Size size, int type);  // OpenCV 5.0: remove abi compatibility overload

    /** allocates new matrix data unless the matrix already has specified size and type. */
    // previous data is unreferenced if needed.
    public native void create(int rows, int cols, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int rows, int cols, int type);
    public native void create(@ByVal Size size, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(@ByVal Size size, int type);
    public native void create(int ndims, @Const IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const IntPointer sizes, int type);
    public native void create(int ndims, @Const IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const IntBuffer sizes, int type);
    public native void create(int ndims, @Const int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(int ndims, @Const int[] sizes, int type);
    public native void create(@StdVector IntPointer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(@StdVector IntPointer sizes, int type);
    public native void create(@StdVector IntBuffer sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(@StdVector IntBuffer sizes, int type);
    public native void create(@StdVector int[] sizes, int type, @Cast("cv::UMatUsageFlags") int usageFlags/*=cv::USAGE_DEFAULT*/);
    public native void create(@StdVector int[] sizes, int type);

    /** increases the reference counter; use with care to avoid memleaks */
    public native void addref();
    /** decreases reference counter; */
    // deallocates the data when reference counter reaches 0.
    public native void release();

    /** deallocates the matrix data */
    public native @Name("deallocate") void _deallocate();
    /** internal use function; properly re-allocates _size, _step arrays */
    public native void copySize(@Const @ByRef UMat m);

    /** locates matrix header within a parent matrix. See below */
    public native void locateROI( @ByRef Size wholeSize, @ByRef Point ofs );
    /** moves/resizes the current matrix ROI inside the parent matrix. */
    public native @ByRef UMat adjustROI( int dtop, int dbottom, int dleft, int dright );
    /** extracts a rectangular sub-matrix */
    // (this is a generalized form of row, rowRange etc.)
    public native @ByVal @Name("operator ()") UMat apply( @ByVal Range rowRange, @ByVal Range colRange );
    public native @ByVal @Name("operator ()") UMat apply( @Const @ByRef Rect roi );
    public native @ByVal @Name("operator ()") UMat apply( @Const Range ranges );
    public native @ByVal @Name("operator ()") UMat apply(@Const @ByRef RangeVector ranges);

    /** returns true iff the matrix data is continuous */
    // (i.e. when there are no gaps between successive rows).
    // similar to CV_IS_MAT_CONT(cvmat->type)
    public native @Cast("bool") boolean isContinuous();

    /** returns true if the matrix is a submatrix of another matrix */
    public native @Cast("bool") boolean isSubmatrix();

    /** returns element size in bytes, */
    // similar to CV_ELEM_SIZE(cvmat->type)
    public native @Cast("size_t") long elemSize();
    /** returns the size of element channel in bytes. */
    public native @Cast("size_t") long elemSize1();
    /** returns element type, similar to CV_MAT_TYPE(cvmat->type) */
    public native int type();
    /** returns element type, similar to CV_MAT_DEPTH(cvmat->type) */
    public native int depth();
    /** returns element type, similar to CV_MAT_CN(cvmat->type) */
    public native int channels();
    /** returns step/elemSize1() */
    public native @Cast("size_t") long step1(int i/*=0*/);
    public native @Cast("size_t") long step1();
    /** returns true if matrix data is NULL */
    public native @Cast("bool") boolean empty();
    /** returns the total number of matrix elements */
    public native @Cast("size_t") long total();

    /** returns N if the matrix is 1-channel (N x ptdim) or ptdim-channel (1 x N) or (N x 1); negative number otherwise */
    public native int checkVector(int elemChannels, int depth/*=-1*/, @Cast("bool") boolean requireContinuous/*=true*/);
    public native int checkVector(int elemChannels);

    /** Returns the OpenCL buffer handle on which UMat operates on.
        The UMat instance should be kept alive during the use of the handle to prevent the buffer to be
        returned to the OpenCV buffer pool.
     */
    public native Pointer handle(@Cast("cv::AccessFlag") int accessFlags);
    public native void ndoffset(@Cast("size_t*") SizeTPointer ofs);

    /** enum cv::UMat:: */
    public static final int MAGIC_VAL  = 0x42FF0000, AUTO_STEP = 0, CONTINUOUS_FLAG = CV_MAT_CONT_FLAG, SUBMATRIX_FLAG = CV_SUBMAT_FLAG;
    /** enum cv::UMat:: */
    public static final int MAGIC_MASK = 0xFFFF0000, TYPE_MASK = 0x00000FFF, DEPTH_MASK = 7;

    /** includes several bit-fields:
         - the magic signature
         - continuity flag
         - depth
         - number of channels
     */
    public native int flags(); public native UMat flags(int setter);

    /** the matrix dimensionality, >= 2 */
    public native int dims(); public native UMat dims(int setter);

    /** number of rows in the matrix; -1 when the matrix has more than 2 dimensions */
    public native int rows(); public native UMat rows(int setter);

    /** number of columns in the matrix; -1 when the matrix has more than 2 dimensions */
    public native int cols(); public native UMat cols(int setter);

    /** custom allocator */
    public native MatAllocator allocator(); public native UMat allocator(MatAllocator setter);

    /** usage flags for allocator; recommend do not set directly, instead set during construct/create/getUMat */
    public native @Cast("cv::UMatUsageFlags") int usageFlags(); public native UMat usageFlags(int setter);

    /** and the standard allocator */
    public static native MatAllocator getStdAllocator();

    /** internal use method: updates the continuity flag */
    public native void updateContinuityFlag();

    /** black-box container of UMat data */
    public native UMatData u(); public native UMat u(UMatData setter);

    /** offset of the submatrix (or 0) */
    public native @Cast("size_t") long offset(); public native UMat offset(long setter);

    /** dimensional size of the matrix; accessible in various formats */
    public native @ByVal Size size();
    @MemberGetter public native int size(int i);

    /** number of bytes each matrix element/row/plane/dimension occupies */
    @MemberGetter public native long step();
    @MemberGetter public native long step(int i);
}
