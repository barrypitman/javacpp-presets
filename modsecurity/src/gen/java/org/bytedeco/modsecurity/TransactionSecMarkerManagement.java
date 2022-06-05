// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


@Namespace("modsecurity") @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class TransactionSecMarkerManagement extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TransactionSecMarkerManagement() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TransactionSecMarkerManagement(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransactionSecMarkerManagement(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TransactionSecMarkerManagement position(long position) {
        return (TransactionSecMarkerManagement)super.position(position);
    }
    @Override public TransactionSecMarkerManagement getPointer(long i) {
        return new TransactionSecMarkerManagement((Pointer)this).offsetAddress(i);
    }

    public native @Cast("bool") boolean isInsideAMarker();

    public native void removeMarker();
}
