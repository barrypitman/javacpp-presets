// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* evaluation accelerator */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_interp_accel extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_interp_accel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_interp_accel(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_interp_accel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_interp_accel position(long position) {
        return (gsl_interp_accel)super.position(position);
    }
    @Override public gsl_interp_accel getPointer(long i) {
        return new gsl_interp_accel((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long cache(); public native gsl_interp_accel cache(long setter);        /* cache of index   */
  public native @Cast("size_t") long miss_count(); public native gsl_interp_accel miss_count(long setter);   /* keep statistics  */
  public native @Cast("size_t") long hit_count(); public native gsl_interp_accel hit_count(long setter);
}
