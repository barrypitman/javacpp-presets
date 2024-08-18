// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ValueInfoProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueInfoProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ValueInfoProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ValueInfoProto position(long position) {
        return (ValueInfoProto)super.position(position);
    }
    @Override public ValueInfoProto getPointer(long i) {
        return new ValueInfoProto((Pointer)this).offsetAddress(i);
    }

  public ValueInfoProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ValueInfoProto(@Const @ByRef ValueInfoProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ValueInfoProto from);

  public native @ByRef @Name("operator =") ValueInfoProto put(@Const @ByRef ValueInfoProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef ValueInfoProto default_instance();
  public static native @Const ValueInfoProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(ValueInfoProto other);
  public native void UnsafeArenaSwap(ValueInfoProto other);

  // implements Message ----------------------------------------------

  public native ValueInfoProto New(Arena arena/*=nullptr*/);
  public native ValueInfoProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ValueInfoProto from);
  public native void MergeFrom(@Const @ByRef ValueInfoProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::ValueInfoProto:: */
  public static final int
    kMetadataPropsFieldNumber = 4,
    kNameFieldNumber = 1,
    kDocStringFieldNumber = 3,
    kTypeFieldNumber = 2;
  // repeated .onnx.StringStringEntryProto metadata_props = 4;
  public native int metadata_props_size();
  public native void clear_metadata_props();
  public native StringStringEntryProto mutable_metadata_props(int index);
  public native @Const @ByRef StringStringEntryProto metadata_props(int index);
  public native StringStringEntryProto add_metadata_props();

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  public native @StdString BytePointer name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional string doc_string = 3;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional .onnx.TypeProto type = 2;
  public native @Cast("bool") boolean has_type();
  public native void clear_type();
  public native @Const @ByRef TypeProto type();
  public native TypeProto release_type();
  public native TypeProto mutable_type();
  public native void set_allocated_type(TypeProto type);
  public native void unsafe_arena_set_allocated_type(
        TypeProto type);
  public native TypeProto unsafe_arena_release_type();
}
