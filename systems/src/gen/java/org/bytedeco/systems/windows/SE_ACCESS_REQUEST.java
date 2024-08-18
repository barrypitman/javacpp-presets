// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SE_ACCESS_REQUEST extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SE_ACCESS_REQUEST() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SE_ACCESS_REQUEST(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SE_ACCESS_REQUEST(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SE_ACCESS_REQUEST position(long position) {
        return (SE_ACCESS_REQUEST)super.position(position);
    }
    @Override public SE_ACCESS_REQUEST getPointer(long i) {
        return new SE_ACCESS_REQUEST((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Size(); public native SE_ACCESS_REQUEST Size(int setter);
    public native @Cast("PSE_SECURITY_DESCRIPTOR") SE_SECURITY_DESCRIPTOR SeSecurityDescriptor(); public native SE_ACCESS_REQUEST SeSecurityDescriptor(SE_SECURITY_DESCRIPTOR setter);
    public native @Cast("ACCESS_MASK") int DesiredAccess(); public native SE_ACCESS_REQUEST DesiredAccess(int setter);
    public native @Cast("ACCESS_MASK") int PreviouslyGrantedAccess(); public native SE_ACCESS_REQUEST PreviouslyGrantedAccess(int setter);
    public native @Cast("PSID") Pointer PrincipalSelfSid(); public native SE_ACCESS_REQUEST PrincipalSelfSid(Pointer setter);      // Need to watch how this field affects the cache.
    public native @Cast("PGENERIC_MAPPING") GENERIC_MAPPING GenericMapping(); public native SE_ACCESS_REQUEST GenericMapping(GENERIC_MAPPING setter);
    public native @Cast("DWORD") int ObjectTypeListCount(); public native SE_ACCESS_REQUEST ObjectTypeListCount(int setter);
    public native @Cast("POBJECT_TYPE_LIST") OBJECT_TYPE_LIST ObjectTypeList(); public native SE_ACCESS_REQUEST ObjectTypeList(OBJECT_TYPE_LIST setter);
}
