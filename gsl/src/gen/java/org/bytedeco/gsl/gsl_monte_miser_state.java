// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_monte_miser_state extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_monte_miser_state() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_monte_miser_state(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_monte_miser_state(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_monte_miser_state position(long position) {
        return (gsl_monte_miser_state)super.position(position);
    }
    @Override public gsl_monte_miser_state getPointer(long i) {
        return new gsl_monte_miser_state((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long min_calls(); public native gsl_monte_miser_state min_calls(long setter);
  public native @Cast("size_t") long min_calls_per_bisection(); public native gsl_monte_miser_state min_calls_per_bisection(long setter);
  public native double dither(); public native gsl_monte_miser_state dither(double setter);
  public native double estimate_frac(); public native gsl_monte_miser_state estimate_frac(double setter);
  public native double alpha(); public native gsl_monte_miser_state alpha(double setter);
  public native @Cast("size_t") long dim(); public native gsl_monte_miser_state dim(long setter);
  public native int estimate_style(); public native gsl_monte_miser_state estimate_style(int setter);
  public native int depth(); public native gsl_monte_miser_state depth(int setter);
  public native int verbose(); public native gsl_monte_miser_state verbose(int setter);
  public native DoublePointer x(); public native gsl_monte_miser_state x(DoublePointer setter);
  public native DoublePointer xmid(); public native gsl_monte_miser_state xmid(DoublePointer setter);
  public native DoublePointer sigma_l(); public native gsl_monte_miser_state sigma_l(DoublePointer setter);
  public native DoublePointer sigma_r(); public native gsl_monte_miser_state sigma_r(DoublePointer setter);
  public native DoublePointer fmax_l(); public native gsl_monte_miser_state fmax_l(DoublePointer setter);
  public native DoublePointer fmax_r(); public native gsl_monte_miser_state fmax_r(DoublePointer setter);
  public native DoublePointer fmin_l(); public native gsl_monte_miser_state fmin_l(DoublePointer setter);
  public native DoublePointer fmin_r(); public native gsl_monte_miser_state fmin_r(DoublePointer setter);
  public native DoublePointer fsum_l(); public native gsl_monte_miser_state fsum_l(DoublePointer setter);
  public native DoublePointer fsum_r(); public native gsl_monte_miser_state fsum_r(DoublePointer setter);
  public native DoublePointer fsum2_l(); public native gsl_monte_miser_state fsum2_l(DoublePointer setter);
  public native DoublePointer fsum2_r(); public native gsl_monte_miser_state fsum2_r(DoublePointer setter);
  public native @Cast("size_t*") SizeTPointer hits_l(); public native gsl_monte_miser_state hits_l(SizeTPointer setter);
  public native @Cast("size_t*") SizeTPointer hits_r(); public native gsl_monte_miser_state hits_r(SizeTPointer setter);
}
