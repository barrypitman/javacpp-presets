// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Parse and evaluate an expression.
 * Note, this is significantly slower than av_expr_eval().
 *
 * @param res a pointer to a double where is put the result value of
 * the expression, or NAN in case of error
 * @param s expression as a zero terminated string, for example "1+2^3+5*5+sin(2/3)"
 * @param const_names NULL terminated array of zero terminated strings of constant identifiers, for example {"PI", "E", 0}
 * @param const_values a zero terminated array of values for the identifiers from const_names
 * @param func1_names NULL terminated array of zero terminated strings of funcs1 identifiers
 * @param funcs1 NULL terminated array of function pointers for functions which take 1 argument
 * @param func2_names NULL terminated array of zero terminated strings of funcs2 identifiers
 * @param funcs2 NULL terminated array of function pointers for functions which take 2 arguments
 * @param opaque a pointer which will be passed to all functions from funcs1 and funcs2
 * @param log_offset log level offset, can be used to silence error messages
 * @param log_ctx parent logging context
 * @return >= 0 in case of success, a negative value corresponding to an
 * AVERROR code otherwise
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Funcs1_Pointer_double extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Funcs1_Pointer_double(Pointer p) { super(p); }
    protected Funcs1_Pointer_double() { allocate(); }
    private native void allocate();
    public native double call(Pointer arg0, double arg1);
}
