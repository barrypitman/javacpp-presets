// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #endif // (NTDDI_VERSION >= NTDDI_WINXP) || !defined(_BATCLASS_)

//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_LEGACY_PERFSTATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_LEGACY_PERFSTATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_LEGACY_PERFSTATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_LEGACY_PERFSTATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_LEGACY_PERFSTATE position(long position) {
        return (PPM_WMI_LEGACY_PERFSTATE)super.position(position);
    }
    @Override public PPM_WMI_LEGACY_PERFSTATE getPointer(long i) {
        return new PPM_WMI_LEGACY_PERFSTATE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Frequency(); public native PPM_WMI_LEGACY_PERFSTATE Frequency(int setter);
    public native @Cast("DWORD") int Flags(); public native PPM_WMI_LEGACY_PERFSTATE Flags(int setter);
    public native @Cast("DWORD") int PercentFrequency(); public native PPM_WMI_LEGACY_PERFSTATE PercentFrequency(int setter);
}
