// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// The following info-class is intended for DTC's use only; it will be
// deprecated, and no one else should take a dependency on it.
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTION_BIND_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTION_BIND_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTION_BIND_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTION_BIND_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTION_BIND_INFORMATION position(long position) {
        return (TRANSACTION_BIND_INFORMATION)super.position(position);
    }
    @Override public TRANSACTION_BIND_INFORMATION getPointer(long i) {
        return new TRANSACTION_BIND_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("HANDLE") Pointer TmHandle(); public native TRANSACTION_BIND_INFORMATION TmHandle(Pointer setter);
}
