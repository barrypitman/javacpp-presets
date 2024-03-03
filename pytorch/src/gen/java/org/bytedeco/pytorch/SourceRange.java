// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// A SourceRange is a reference to subset of a Source, specified by `start` and
// `end` byte offsets into the source text.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SourceRange extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceRange(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SourceRange(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SourceRange position(long position) {
        return (SourceRange)super.position(position);
    }
    @Override public SourceRange getPointer(long i) {
        return new SourceRange((Pointer)this).offsetAddress(i);
    }

  public SourceRange(@SharedPtr Source source_view, @Cast("size_t") long start_, @Cast("size_t") long end_) { super((Pointer)null); allocate(source_view, start_, end_); }
  private native void allocate(@SharedPtr Source source_view, @Cast("size_t") long start_, @Cast("size_t") long end_);

  public SourceRange() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SourceRange(
        @SharedPtr Source source_view_,
        @ByVal StringCordView.Iterator start_iter,
        @Cast("size_t") long end_) { super((Pointer)null); allocate(source_view_, start_iter, end_); }
  private native void allocate(
        @SharedPtr Source source_view_,
        @ByVal StringCordView.Iterator start_iter,
        @Cast("size_t") long end_);

  public native @StringView BytePointer token_text();

  public native @Const @ByVal StringCordView text();
  public native @Cast("size_t") long size();
  @MemberGetter public static native @Cast("const size_t") long CONTEXT();
  public static final long CONTEXT = CONTEXT();
  public native void highlight(@Cast("std::ostream*") @ByRef Pointer out);

  // Customizable version of 'highlight' method.
  public native void print_with_context(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Cast("size_t") long context,
        @Cast("bool") boolean highlight,
        @StdString BytePointer funcname);
  public native void print_with_context(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Cast("size_t") long context,
        @Cast("bool") boolean highlight,
        @StdString String funcname);

  public native @SharedPtr Source source();
  public native @Cast("size_t") long start();
  public native @Cast("size_t") long end();
  public native @StdString BytePointer str();

  public native @ByVal T_StringSizeTSizeT_TOptional file_line_col();

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef SourceRange rhs);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef SourceRange rhs);

  public native @ByVal SourceRangeOptional findSourceRangeThatGenerated();
}
