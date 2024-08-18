// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OperatorSetIdProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorSetIdProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorSetIdProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperatorSetIdProto position(long position) {
        return (OperatorSetIdProto)super.position(position);
    }
    @Override public OperatorSetIdProto getPointer(long i) {
        return new OperatorSetIdProto((Pointer)this).offsetAddress(i);
    }

  public OperatorSetIdProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OperatorSetIdProto(@Const @ByRef OperatorSetIdProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OperatorSetIdProto from);

  public native @ByRef @Name("operator =") OperatorSetIdProto put(@Const @ByRef OperatorSetIdProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef OperatorSetIdProto default_instance();
  public static native @Const OperatorSetIdProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(OperatorSetIdProto other);
  public native void UnsafeArenaSwap(OperatorSetIdProto other);

  // implements Message ----------------------------------------------

  public native OperatorSetIdProto New(Arena arena/*=nullptr*/);
  public native OperatorSetIdProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OperatorSetIdProto from);
  public native void MergeFrom(@Const @ByRef OperatorSetIdProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::OperatorSetIdProto:: */
  public static final int
    kDomainFieldNumber = 1,
    kVersionFieldNumber = 2;
  // optional string domain = 1;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  public native @StdString BytePointer domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);

  // optional int64 version = 2;
  public native @Cast("bool") boolean has_version();
  public native void clear_version();
  public native @Cast("int64_t") long version();
  public native void set_version(@Cast("int64_t") long value);
}
