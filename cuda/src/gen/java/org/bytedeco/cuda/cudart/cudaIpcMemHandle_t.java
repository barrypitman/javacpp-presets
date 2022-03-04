// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA IPC memory handle
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaIpcMemHandle_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaIpcMemHandle_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaIpcMemHandle_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaIpcMemHandle_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaIpcMemHandle_t position(long position) {
        return (cudaIpcMemHandle_t)super.position(position);
    }
    @Override public cudaIpcMemHandle_t getPointer(long i) {
        return new cudaIpcMemHandle_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char") byte reserved(int i); public native cudaIpcMemHandle_t reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
