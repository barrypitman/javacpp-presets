// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class ConfigInt extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConfigInt(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConfigInt(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConfigInt position(long position) {
        return (ConfigInt)super.position(position);
    }
    @Override public ConfigInt getPointer(long i) {
        return new ConfigInt((Pointer)this).offsetAddress(i);
    }

    public ConfigInt() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean m_set(); public native ConfigInt m_set(boolean setter);
    public native int m_value(); public native ConfigInt m_value(int setter);

    public native void merge(ConfigInt from);
}
