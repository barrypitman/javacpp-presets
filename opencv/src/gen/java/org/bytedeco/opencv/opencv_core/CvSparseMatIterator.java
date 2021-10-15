// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSparseMatIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSparseMatIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSparseMatIterator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSparseMatIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSparseMatIterator position(long position) {
        return (CvSparseMatIterator)super.position(position);
    }
    @Override public CvSparseMatIterator getPointer(long i) {
        return new CvSparseMatIterator((Pointer)this).offsetAddress(i);
    }

    public native CvSparseMat mat(); public native CvSparseMatIterator mat(CvSparseMat setter);
    public native CvSparseNode node(); public native CvSparseMatIterator node(CvSparseNode setter);
    public native int curidx(); public native CvSparseMatIterator curidx(int setter);
}
