// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/** 
 * Data structure for contour total counts.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiContourTotalsInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiContourTotalsInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiContourTotalsInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiContourTotalsInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiContourTotalsInfo position(long position) {
        return (NppiContourTotalsInfo)super.position(position);
    }
    @Override public NppiContourTotalsInfo getPointer(long i) {
        return new NppiContourTotalsInfo((Pointer)this).offsetAddress(i);
    }

    /** total number of contour pixels in image */
    public native @Cast("Npp32u") int nTotalImagePixelContourCount(); public native NppiContourTotalsInfo nTotalImagePixelContourCount(int setter);
    /** longest per contour pixel count in image */
    public native @Cast("Npp32u") int nLongestImageContourPixelCount(); public native NppiContourTotalsInfo nLongestImageContourPixelCount(int setter);
}
