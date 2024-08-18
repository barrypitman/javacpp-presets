// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxObjCPropertyDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCPropertyDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCPropertyDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCPropertyDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCPropertyDeclInfo position(long position) {
        return (CXIdxObjCPropertyDeclInfo)super.position(position);
    }
    @Override public CXIdxObjCPropertyDeclInfo getPointer(long i) {
        return new CXIdxObjCPropertyDeclInfo((Pointer)this).offsetAddress(i);
    }

  public native @Const CXIdxDeclInfo declInfo(); public native CXIdxObjCPropertyDeclInfo declInfo(CXIdxDeclInfo setter);
  public native @Const CXIdxEntityInfo getter(); public native CXIdxObjCPropertyDeclInfo getter(CXIdxEntityInfo setter);
  public native @Const CXIdxEntityInfo setter(); public native CXIdxObjCPropertyDeclInfo setter(CXIdxEntityInfo setter);
}
