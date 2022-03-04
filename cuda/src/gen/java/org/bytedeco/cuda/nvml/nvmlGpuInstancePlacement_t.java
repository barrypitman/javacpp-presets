// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuInstancePlacement_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuInstancePlacement_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuInstancePlacement_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuInstancePlacement_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuInstancePlacement_t position(long position) {
        return (nvmlGpuInstancePlacement_t)super.position(position);
    }
    @Override public nvmlGpuInstancePlacement_t getPointer(long i) {
        return new nvmlGpuInstancePlacement_t((Pointer)this).offsetAddress(i);
    }

    /** Index of first occupied memory slice */
    public native @Cast("unsigned int") int start(); public native nvmlGpuInstancePlacement_t start(int setter);
    /** Number of memory slices occupied */
    public native @Cast("unsigned int") int size(); public native nvmlGpuInstancePlacement_t size(int setter);
}
