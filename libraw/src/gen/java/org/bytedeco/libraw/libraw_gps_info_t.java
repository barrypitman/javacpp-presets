// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_gps_info_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_gps_info_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_gps_info_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_gps_info_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_gps_info_t position(long position) {
          return (libraw_gps_info_t)super.position(position);
      }
      @Override public libraw_gps_info_t getPointer(long i) {
          return new libraw_gps_info_t((Pointer)this).offsetAddress(i);
      }
  
    public native float latitude(int i); public native libraw_gps_info_t latitude(int i, float setter);
    @MemberGetter public native FloatPointer latitude();     /* Deg,min,sec */
    public native float longitude(int i); public native libraw_gps_info_t longitude(int i, float setter);
    @MemberGetter public native FloatPointer longitude();    /* Deg,min,sec */
    public native float gpstimestamp(int i); public native libraw_gps_info_t gpstimestamp(int i, float setter);
    @MemberGetter public native FloatPointer gpstimestamp(); /* Deg,min,sec */
    public native float altitude(); public native libraw_gps_info_t altitude(float setter);
    public native @Cast("char") byte altref(); public native libraw_gps_info_t altref(byte setter);
    public native @Cast("char") byte latref(); public native libraw_gps_info_t latref(byte setter);
    public native @Cast("char") byte longref(); public native libraw_gps_info_t longref(byte setter);
    public native @Cast("char") byte gpsstatus(); public native libraw_gps_info_t gpsstatus(byte setter);
    public native @Cast("char") byte gpsparsed(); public native libraw_gps_info_t gpsparsed(byte setter);
  }
