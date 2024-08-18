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
 * struct NppiBufferDescriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiBufferDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiBufferDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiBufferDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiBufferDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiBufferDescriptor position(long position) {
        return (NppiBufferDescriptor)super.position(position);
    }
    @Override public NppiBufferDescriptor getPointer(long i) {
        return new NppiBufferDescriptor((Pointer)this).offsetAddress(i);
    }

    /** per image device memory pointer to the corresponding buffer */
    public native Pointer pData(); public native NppiBufferDescriptor pData(Pointer setter);
    /** allocated buffer size */
    public native int nBufferSize(); public native NppiBufferDescriptor nBufferSize(int setter);
}
