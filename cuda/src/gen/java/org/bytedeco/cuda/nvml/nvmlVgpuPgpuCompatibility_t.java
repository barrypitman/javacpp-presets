// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * vGPU-pGPU compatibility structure
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuPgpuCompatibility_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuPgpuCompatibility_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuPgpuCompatibility_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuPgpuCompatibility_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuPgpuCompatibility_t position(long position) {
        return (nvmlVgpuPgpuCompatibility_t)super.position(position);
    }

    /** Compatibility of vGPU VM. See \ref nvmlVgpuVmCompatibility_t */
    public native @Cast("nvmlVgpuVmCompatibility_t") int vgpuVmCompatibility(); public native nvmlVgpuPgpuCompatibility_t vgpuVmCompatibility(int setter);
    /** Limiting factor for vGPU-pGPU compatibility. See \ref nvmlVgpuPgpuCompatibilityLimitCode_t */
    public native @Cast("nvmlVgpuPgpuCompatibilityLimitCode_t") int compatibilityLimitCode(); public native nvmlVgpuPgpuCompatibility_t compatibilityLimitCode(int setter);
}
