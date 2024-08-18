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
public class CXIdxAttrInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxAttrInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxAttrInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxAttrInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxAttrInfo position(long position) {
        return (CXIdxAttrInfo)super.position(position);
    }
    @Override public CXIdxAttrInfo getPointer(long i) {
        return new CXIdxAttrInfo((Pointer)this).offsetAddress(i);
    }

  public native @Cast("CXIdxAttrKind") int kind(); public native CXIdxAttrInfo kind(int setter);
  public native @ByRef CXCursor cursor(); public native CXIdxAttrInfo cursor(CXCursor setter);
  public native @ByRef CXIdxLoc loc(); public native CXIdxAttrInfo loc(CXIdxLoc setter);
}
