// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// administrator power policy overrides
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ADMINISTRATOR_POWER_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ADMINISTRATOR_POWER_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ADMINISTRATOR_POWER_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ADMINISTRATOR_POWER_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ADMINISTRATOR_POWER_POLICY position(long position) {
        return (ADMINISTRATOR_POWER_POLICY)super.position(position);
    }
    @Override public ADMINISTRATOR_POWER_POLICY getPointer(long i) {
        return new ADMINISTRATOR_POWER_POLICY((Pointer)this).offsetAddress(i);
    }


    // meaning of power action "sleep"
    public native @Cast("SYSTEM_POWER_STATE") int MinSleep(); public native ADMINISTRATOR_POWER_POLICY MinSleep(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int MaxSleep(); public native ADMINISTRATOR_POWER_POLICY MaxSleep(int setter);

    // video policies
    public native @Cast("DWORD") int MinVideoTimeout(); public native ADMINISTRATOR_POWER_POLICY MinVideoTimeout(int setter);
    public native @Cast("DWORD") int MaxVideoTimeout(); public native ADMINISTRATOR_POWER_POLICY MaxVideoTimeout(int setter);

    // disk policies
    public native @Cast("DWORD") int MinSpindownTimeout(); public native ADMINISTRATOR_POWER_POLICY MinSpindownTimeout(int setter);
    public native @Cast("DWORD") int MaxSpindownTimeout(); public native ADMINISTRATOR_POWER_POLICY MaxSpindownTimeout(int setter);
}
