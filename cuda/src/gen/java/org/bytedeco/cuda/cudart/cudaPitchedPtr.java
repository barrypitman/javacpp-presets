// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA Pitched memory pointer
 *
 * @see ::make_cudaPitchedPtr
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaPitchedPtr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaPitchedPtr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaPitchedPtr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaPitchedPtr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaPitchedPtr position(long position) {
        return (cudaPitchedPtr)super.position(position);
    }
    @Override public cudaPitchedPtr getPointer(long i) {
        return new cudaPitchedPtr((Pointer)this).offsetAddress(i);
    }

    /** Pointer to allocated memory */
    public native Pointer ptr(); public native cudaPitchedPtr ptr(Pointer setter);
    /** Pitch of allocated memory in bytes */
    public native @Cast("size_t") long pitch(); public native cudaPitchedPtr pitch(long setter);
    /** Logical width of allocation in elements */
    public native @Cast("size_t") long xsize(); public native cudaPitchedPtr xsize(long setter);
    /** Logical height of allocation in elements */
    public native @Cast("size_t") long ysize(); public native cudaPitchedPtr ysize(long setter);
}
