// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_uint4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_uint4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_uint4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_uint4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_uint4 position(long position) {
        return (cl_uint4)super.position(position);
    }
    @Override public cl_uint4 getPointer(long i) {
        return new cl_uint4((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_uint") int s(int i); public native cl_uint4 s(int i, int setter);
    @MemberGetter public native @Cast("cl_uint*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_UINT2__)
// #endif
// #if defined( __CL_UINT4__)
// #endif
}
