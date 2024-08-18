// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sockaddr_storage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sockaddr_storage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sockaddr_storage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sockaddr_storage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sockaddr_storage position(long position) {
        return (sockaddr_storage)super.position(position);
    }
    @Override public sockaddr_storage getPointer(long i) {
        return new sockaddr_storage((Pointer)this).offsetAddress(i);
    }

    public native @Cast("sa_family_t") short ss_family(); public native sockaddr_storage ss_family(short setter);	/* Address family, etc.  */
    public native @Cast("char") byte __ss_padding(int i); public native sockaddr_storage __ss_padding(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer __ss_padding();
    public native @Cast("unsigned long int") long __ss_align(); public native sockaddr_storage __ss_align(long setter);	/* Force desired alignment.  */
  }
