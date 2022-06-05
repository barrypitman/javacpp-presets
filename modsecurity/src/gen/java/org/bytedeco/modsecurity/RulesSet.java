// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;




/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class RulesSet extends RulesSetProperties {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RulesSet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RulesSet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RulesSet position(long position) {
        return (RulesSet)super.position(position);
    }
    @Override public RulesSet getPointer(long i) {
        return new RulesSet((Pointer)this).offsetAddress(i);
    }

    public RulesSet() { super((Pointer)null); allocate(); }
    private native void allocate();

    public RulesSet(DebugLog customLog) { super((Pointer)null); allocate(customLog); }
    private native void allocate(DebugLog customLog);

    public native int loadFromUri(@Cast("const char*") BytePointer uri);
    public native int loadFromUri(String uri);
    public native int loadRemote(@Cast("const char*") BytePointer key, @Cast("const char*") BytePointer uri);
    public native int loadRemote(String key, String uri);
    public native int load(@Cast("const char*") BytePointer rules);
    public native int load(String rules);
    public native int load(@Cast("const char*") BytePointer rules, @StdString BytePointer ref);
    public native int load(String rules, @StdString String ref);

    public native void dump();

    public native int merge(Driver driver);
    public native int merge(RulesSet rules);

    public native int evaluate(int phase, Transaction transaction);
    public native @StdString BytePointer getParserError();

    public native void debug(int level, @StdString BytePointer id, @StdString BytePointer uri,
            @StdString BytePointer msg);
    public native void debug(int level, @StdString String id, @StdString String uri,
            @StdString String msg);
}
