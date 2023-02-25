// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * A structure containing additional parameters related to an expression,
 * passed in at build time to \ref hs_compile_ext_multi() or \ref
 * hs_expression_ext_info.
 *
 * These parameters allow the set of matches produced by a pattern to be
 * constrained at compile time, rather than relying on the application to
 * process unwanted matches at runtime.
 */
@Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_expr_ext_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public hs_expr_ext_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public hs_expr_ext_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_expr_ext_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public hs_expr_ext_t position(long position) {
        return (hs_expr_ext_t)super.position(position);
    }
    @Override public hs_expr_ext_t getPointer(long i) {
        return new hs_expr_ext_t((Pointer)this).offsetAddress(i);
    }

    /**
     * Flags governing which parts of this structure are to be used by the
     * compiler. See \ref HS_EXT_FLAG.
     */
    public native @Cast("unsigned long long") long flags(); public native hs_expr_ext_t flags(long setter);

    /**
     * The minimum end offset in the data stream at which this expression
     * should match successfully. To use this parameter, set the
     * \ref HS_EXT_FLAG_MIN_OFFSET flag in the hs_expr_ext::flags field.
     */
    public native @Cast("unsigned long long") long min_offset(); public native hs_expr_ext_t min_offset(long setter);

    /**
     * The maximum end offset in the data stream at which this expression
     * should match successfully. To use this parameter, set the
     * \ref HS_EXT_FLAG_MAX_OFFSET flag in the hs_expr_ext::flags field.
     */
    public native @Cast("unsigned long long") long max_offset(); public native hs_expr_ext_t max_offset(long setter);

    /**
     * The minimum match length (from start to end) required to successfully
     * match this expression. To use this parameter, set the
     * \ref HS_EXT_FLAG_MIN_LENGTH flag in the hs_expr_ext::flags field.
     */
    public native @Cast("unsigned long long") long min_length(); public native hs_expr_ext_t min_length(long setter);

    /**
     * Allow patterns to approximately match within this edit distance. To use
     * this parameter, set the \ref HS_EXT_FLAG_EDIT_DISTANCE flag in the
     * hs_expr_ext::flags field.
     */
    public native @Cast("unsigned") int edit_distance(); public native hs_expr_ext_t edit_distance(int setter);

    /**
     * Allow patterns to approximately match within this Hamming distance. To
     * use this parameter, set the \ref HS_EXT_FLAG_HAMMING_DISTANCE flag in the
     * hs_expr_ext::flags field.
     */
    public native @Cast("unsigned") int hamming_distance(); public native hs_expr_ext_t hamming_distance(int setter);
}
