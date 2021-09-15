// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Specifies a memory location.
 *
 * To specify a gpu, set type = ::cudaMemLocationTypeDevice and set id = the gpu's device ordinal.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemLocation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemLocation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemLocation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemLocation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemLocation position(long position) {
        return (cudaMemLocation)super.position(position);
    }
    @Override public cudaMemLocation getPointer(long i) {
        return new cudaMemLocation((Pointer)this).offsetAddress(i);
    }

    /** Specifies the location type, which modifies the meaning of id. */
    public native @Cast("cudaMemLocationType") int type(); public native cudaMemLocation type(int setter);
    /** identifier for a given this location's ::CUmemLocationType. */
    public native int id(); public native cudaMemLocation id(int setter);
}
