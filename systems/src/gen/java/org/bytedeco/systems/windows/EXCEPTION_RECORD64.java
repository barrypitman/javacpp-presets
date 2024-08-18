// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class EXCEPTION_RECORD64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EXCEPTION_RECORD64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EXCEPTION_RECORD64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EXCEPTION_RECORD64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EXCEPTION_RECORD64 position(long position) {
        return (EXCEPTION_RECORD64)super.position(position);
    }
    @Override public EXCEPTION_RECORD64 getPointer(long i) {
        return new EXCEPTION_RECORD64((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ExceptionCode(); public native EXCEPTION_RECORD64 ExceptionCode(int setter);
    public native @Cast("DWORD") int ExceptionFlags(); public native EXCEPTION_RECORD64 ExceptionFlags(int setter);
    public native @Cast("DWORD64") long ExceptionRecord(); public native EXCEPTION_RECORD64 ExceptionRecord(long setter);
    public native @Cast("DWORD64") long ExceptionAddress(); public native EXCEPTION_RECORD64 ExceptionAddress(long setter);
    public native @Cast("DWORD") int NumberParameters(); public native EXCEPTION_RECORD64 NumberParameters(int setter);
    public native @Cast("DWORD") int __unusedAlignment(); public native EXCEPTION_RECORD64 __unusedAlignment(int setter);
    public native @Cast("DWORD64") long ExceptionInformation(int i); public native EXCEPTION_RECORD64 ExceptionInformation(int i, long setter);
    @MemberGetter public native @Cast("DWORD64*") LongPointer ExceptionInformation();
}
