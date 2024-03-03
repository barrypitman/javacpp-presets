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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Storage extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Storage(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Storage(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Storage position(long position) {
        return (Storage)super.position(position);
    }
    @Override public Storage getPointer(long i) {
        return new Storage((Pointer)this).offsetAddress(i);
    }

  @Opaque public static class use_byte_size_t extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public use_byte_size_t() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public use_byte_size_t(Pointer p) { super(p); }
  }
  public static class unsafe_borrow_t extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public unsafe_borrow_t(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public unsafe_borrow_t(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public unsafe_borrow_t position(long position) {
          return (unsafe_borrow_t)super.position(position);
      }
      @Override public unsafe_borrow_t getPointer(long i) {
          return new unsafe_borrow_t((Pointer)this).offsetAddress(i);
      }
  
    public unsafe_borrow_t() { super((Pointer)null); allocate(); }
    private native void allocate();
  }

  public Storage() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Storage(@ByVal StorageImplPtr ptr) { super((Pointer)null); allocate(ptr); }
  private native void allocate(@ByVal StorageImplPtr ptr);

  // Allocates memory buffer using given allocator and creates a storage with it
  public Storage(
        @ByVal use_byte_size_t arg0,
        @ByVal SymInt size_bytes,
        Allocator allocator/*=nullptr*/,
        @Cast("bool") boolean resizable/*=false*/) { super((Pointer)null); allocate(arg0, size_bytes, allocator, resizable); }
  private native void allocate(
        @ByVal use_byte_size_t arg0,
        @ByVal SymInt size_bytes,
        Allocator allocator/*=nullptr*/,
        @Cast("bool") boolean resizable/*=false*/);
  public Storage(
        @ByVal use_byte_size_t arg0,
        @ByVal SymInt size_bytes) { super((Pointer)null); allocate(arg0, size_bytes); }
  private native void allocate(
        @ByVal use_byte_size_t arg0,
        @ByVal SymInt size_bytes);

  // Creates storage with pre-allocated memory buffer. Allocator is given for
  // potential future reallocations, however it can be nullptr if the storage
  // is non-resizable
  public Storage(
        @ByVal use_byte_size_t arg0,
        @Cast("size_t") long size_bytes,
        @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr,
        Allocator allocator/*=nullptr*/,
        @Cast("bool") boolean resizable/*=false*/) { super((Pointer)null); allocate(arg0, size_bytes, data_ptr, allocator, resizable); }
  private native void allocate(
        @ByVal use_byte_size_t arg0,
        @Cast("size_t") long size_bytes,
        @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr,
        Allocator allocator/*=nullptr*/,
        @Cast("bool") boolean resizable/*=false*/);
  public Storage(
        @ByVal use_byte_size_t arg0,
        @Cast("size_t") long size_bytes,
        @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr) { super((Pointer)null); allocate(arg0, size_bytes, data_ptr); }
  private native void allocate(
        @ByVal use_byte_size_t arg0,
        @Cast("size_t") long size_bytes,
        @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr);
  // Legacy constructor for partially initialized (dtype or memory) storages
  // that can be temporarily created with Caffe2 APIs. See the note on top of
  // TensorImpl.h for details.
  public static native @ByVal Storage create_legacy(@ByVal Device device);

  // Mimic create_legacy, but without requiring a newly-created StorageImpl.
  public native void reset_legacy();

  // TODO: remove later
  public native void set_nbytes(@Cast("size_t") long size_bytes);

  public native void set_nbytes(@ByVal SymInt size_bytes);

  public native @Cast("bool") boolean resizable();

  public native @Cast("size_t") long nbytes();

  public native @ByVal SymInt sym_nbytes();
  // get() use here is to get const-correctness

  public native @Const Pointer data();

  public native Pointer mutable_data();

  public native @ByRef DataPtr mutable_data_ptr();

  public native @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr();

  // Returns the previous data_ptr
  public native @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr set_data_ptr(@Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr);

  public native void set_data_ptr_noswap(@Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr);

  public native DeviceType device_type();

  public native Allocator allocator();

  public native @ByVal Device device();

  public native StorageImpl unsafeReleaseStorageImpl();

  public native @NoException(true) StorageImpl unsafeGetStorageImpl();

  public native @ByVal WeakStorage getWeakStorageImpl();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  public native @Cast("size_t") long use_count();

  public native @Cast("bool") boolean unique();

  public native @Cast("bool") boolean is_alias_of(@Const @ByRef Storage other);

  public native void UniqueStorageShareExternalPointer(
        Pointer src,
        @Cast("size_t") long _capacity,
        PointerConsumer d/*=nullptr*/);
  public native void UniqueStorageShareExternalPointer(
        Pointer src,
        @Cast("size_t") long _capacity);

  public native void UniqueStorageShareExternalPointer(
        @Cast({"", "c10::DataPtr&&"}) @StdMove DataPtr data_ptr,
        @Cast("size_t") long _capacity);
}
