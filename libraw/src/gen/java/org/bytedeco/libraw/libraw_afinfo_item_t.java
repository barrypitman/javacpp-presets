// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_afinfo_item_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_afinfo_item_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_afinfo_item_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_afinfo_item_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_afinfo_item_t position(long position) {
          return (libraw_afinfo_item_t)super.position(position);
      }
      @Override public libraw_afinfo_item_t getPointer(long i) {
          return new libraw_afinfo_item_t((Pointer)this).offsetAddress(i);
      }
  
      public native @Cast("unsigned") int AFInfoData_tag(); public native libraw_afinfo_item_t AFInfoData_tag(int setter);
      public native short AFInfoData_order(); public native libraw_afinfo_item_t AFInfoData_order(short setter);
      public native @Cast("unsigned") int AFInfoData_version(); public native libraw_afinfo_item_t AFInfoData_version(int setter);
      public native @Cast("unsigned") int AFInfoData_length(); public native libraw_afinfo_item_t AFInfoData_length(int setter);
      public native @Cast("uchar*") BytePointer AFInfoData(); public native libraw_afinfo_item_t AFInfoData(BytePointer setter);
  }
