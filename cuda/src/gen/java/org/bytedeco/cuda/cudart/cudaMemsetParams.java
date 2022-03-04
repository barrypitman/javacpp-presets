// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA Memset node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemsetParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemsetParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemsetParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemsetParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemsetParams position(long position) {
        return (cudaMemsetParams)super.position(position);
    }
    @Override public cudaMemsetParams getPointer(long i) {
        return new cudaMemsetParams((Pointer)this).offsetAddress(i);
    }

    /** Destination device pointer */
    public native Pointer dst(); public native cudaMemsetParams dst(Pointer setter);
    /** Pitch of destination device pointer. Unused if height is 1 */
    public native @Cast("size_t") long pitch(); public native cudaMemsetParams pitch(long setter);
    /** Value to be set */
    public native @Cast("unsigned int") int value(); public native cudaMemsetParams value(int setter);
    /** Size of each element in bytes. Must be 1, 2, or 4. */
    public native @Cast("unsigned int") int elementSize(); public native cudaMemsetParams elementSize(int setter);
    /** Width of the row in elements */
    public native @Cast("size_t") long width(); public native cudaMemsetParams width(long setter);
    /** Number of rows */
    public native @Cast("size_t") long height(); public native cudaMemsetParams height(long setter);
}
