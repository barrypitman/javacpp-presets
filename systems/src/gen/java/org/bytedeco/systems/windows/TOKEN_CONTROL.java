// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;




@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_CONTROL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_CONTROL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_CONTROL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_CONTROL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_CONTROL position(long position) {
        return (TOKEN_CONTROL)super.position(position);
    }
    @Override public TOKEN_CONTROL getPointer(long i) {
        return new TOKEN_CONTROL((Pointer)this).offsetAddress(i);
    }

    public native @ByRef LUID TokenId(); public native TOKEN_CONTROL TokenId(LUID setter);
    public native @ByRef LUID AuthenticationId(); public native TOKEN_CONTROL AuthenticationId(LUID setter);
    public native @ByRef LUID ModifiedId(); public native TOKEN_CONTROL ModifiedId(LUID setter);
    public native @ByRef TOKEN_SOURCE TokenSource(); public native TOKEN_CONTROL TokenSource(TOKEN_SOURCE setter);
}
