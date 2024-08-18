// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * \defgroup CINDEX_COMMENT Comment introspection
 *
 * The routines in this group provide access to information in documentation
 * comments. These facilities are distinct from the core and may be subject to
 * their own schedule of stability and deprecation.
 *
 * \{
 */

/**
 * A parsed comment.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXComment extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXComment() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXComment(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXComment(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXComment position(long position) {
        return (CXComment)super.position(position);
    }
    @Override public CXComment getPointer(long i) {
        return new CXComment((Pointer)this).offsetAddress(i);
    }

  public native @Const Pointer ASTNode(); public native CXComment ASTNode(Pointer setter);
  public native CXTranslationUnit TranslationUnit(); public native CXComment TranslationUnit(CXTranslationUnit setter);
}
