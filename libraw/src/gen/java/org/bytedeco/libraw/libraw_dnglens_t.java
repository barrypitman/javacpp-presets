// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_dnglens_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_dnglens_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_dnglens_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_dnglens_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_dnglens_t position(long position) {
          return (libraw_dnglens_t)super.position(position);
      }
      @Override public libraw_dnglens_t getPointer(long i) {
          return new libraw_dnglens_t((Pointer)this).offsetAddress(i);
      }
  
    public native float MinFocal(); public native libraw_dnglens_t MinFocal(float setter);
    public native float MaxFocal(); public native libraw_dnglens_t MaxFocal(float setter);
    public native float MaxAp4MinFocal(); public native libraw_dnglens_t MaxAp4MinFocal(float setter);
    public native float MaxAp4MaxFocal(); public native libraw_dnglens_t MaxAp4MaxFocal(float setter);
  }
