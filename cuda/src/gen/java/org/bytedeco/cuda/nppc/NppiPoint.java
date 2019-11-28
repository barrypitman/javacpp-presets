// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;



/** 
 * 2D Point
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiPoint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiPoint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiPoint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiPoint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiPoint position(long position) {
        return (NppiPoint)super.position(position);
    }

    /**  x-coordinate. */
    public native int x(); public native NppiPoint x(int setter);
    /**  y-coordinate. */
    public native int y(); public native NppiPoint y(int setter);
}
