// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Contains the device fabric information
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuFabricInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuFabricInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuFabricInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuFabricInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuFabricInfo_t position(long position) {
        return (nvmlGpuFabricInfo_t)super.position(position);
    }
    @Override public nvmlGpuFabricInfo_t getPointer(long i) {
        return new nvmlGpuFabricInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Uuid of the cluster to which this GPU belongs */
    public native @Cast("unsigned char") byte clusterUuid(int i); public native nvmlGpuFabricInfo_t clusterUuid(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer clusterUuid();
    /** Error status, if any. Must be checked only if state returns "complete". */
    public native @Cast("nvmlReturn_t") int status(); public native nvmlGpuFabricInfo_t status(int setter);
    /** ID of the fabric clique to which this GPU belongs */
    public native @Cast("unsigned int") int cliqueId(); public native nvmlGpuFabricInfo_t cliqueId(int setter);
    /** Current state of GPU registration process */
    public native @Cast("nvmlGpuFabricState_t") byte state(); public native nvmlGpuFabricInfo_t state(byte setter);
}
