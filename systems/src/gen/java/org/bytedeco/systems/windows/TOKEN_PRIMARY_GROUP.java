// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_PRIMARY_GROUP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_PRIMARY_GROUP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_PRIMARY_GROUP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_PRIMARY_GROUP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_PRIMARY_GROUP position(long position) {
        return (TOKEN_PRIMARY_GROUP)super.position(position);
    }
    @Override public TOKEN_PRIMARY_GROUP getPointer(long i) {
        return new TOKEN_PRIMARY_GROUP((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PSID") Pointer PrimaryGroup(); public native TOKEN_PRIMARY_GROUP PrimaryGroup(Pointer setter);
}
