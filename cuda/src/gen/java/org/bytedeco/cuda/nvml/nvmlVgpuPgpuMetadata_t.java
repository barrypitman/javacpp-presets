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
 * Physical GPU metadata structure
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuPgpuMetadata_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuPgpuMetadata_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuPgpuMetadata_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuPgpuMetadata_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuPgpuMetadata_t position(long position) {
        return (nvmlVgpuPgpuMetadata_t)super.position(position);
    }
    @Override public nvmlVgpuPgpuMetadata_t getPointer(long i) {
        return new nvmlVgpuPgpuMetadata_t((Pointer)this).offsetAddress(i);
    }

    /** Current version of the structure */
    public native @Cast("unsigned int") int version(); public native nvmlVgpuPgpuMetadata_t version(int setter);
    /** Current revision of the structure */
    public native @Cast("unsigned int") int revision(); public native nvmlVgpuPgpuMetadata_t revision(int setter);
    /** Host driver version */
    public native @Cast("char") byte hostDriverVersion(int i); public native nvmlVgpuPgpuMetadata_t hostDriverVersion(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer hostDriverVersion();
    /** Pgpu virtualization capabilities bitfield */
    public native @Cast("unsigned int") int pgpuVirtualizationCaps(); public native nvmlVgpuPgpuMetadata_t pgpuVirtualizationCaps(int setter);
    /** Reserved for internal use */
    public native @Cast("unsigned int") int reserved(int i); public native nvmlVgpuPgpuMetadata_t reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    /** vGPU version range supported by host driver */
    public native @ByRef nvmlVgpuVersion_t hostSupportedVgpuRange(); public native nvmlVgpuPgpuMetadata_t hostSupportedVgpuRange(nvmlVgpuVersion_t setter);
    /** Size of opaque data field in bytes */
    public native @Cast("unsigned int") int opaqueDataSize(); public native nvmlVgpuPgpuMetadata_t opaqueDataSize(int setter);
    /** Opaque data */
    public native @Cast("char") byte opaqueData(int i); public native nvmlVgpuPgpuMetadata_t opaqueData(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer opaqueData();
}
