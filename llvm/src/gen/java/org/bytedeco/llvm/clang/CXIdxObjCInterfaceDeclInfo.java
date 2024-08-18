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
public class CXIdxObjCInterfaceDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCInterfaceDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCInterfaceDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCInterfaceDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCInterfaceDeclInfo position(long position) {
        return (CXIdxObjCInterfaceDeclInfo)super.position(position);
    }
    @Override public CXIdxObjCInterfaceDeclInfo getPointer(long i) {
        return new CXIdxObjCInterfaceDeclInfo((Pointer)this).offsetAddress(i);
    }

  public native @Const CXIdxObjCContainerDeclInfo containerInfo(); public native CXIdxObjCInterfaceDeclInfo containerInfo(CXIdxObjCContainerDeclInfo setter);
  public native @Const CXIdxBaseClassInfo superInfo(); public native CXIdxObjCInterfaceDeclInfo superInfo(CXIdxBaseClassInfo setter);
  public native @Const CXIdxObjCProtocolRefListInfo protocols(); public native CXIdxObjCInterfaceDeclInfo protocols(CXIdxObjCProtocolRefListInfo setter);
}
