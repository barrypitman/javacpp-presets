// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * Definition of the match event callback function type.
 *
 * A callback function matching the defined type must be provided by the
 * application calling the \ref hs_scan(), \ref hs_scan_vector() or \ref
 * hs_scan_stream() functions (or other streaming calls which can produce
 * matches).
 *
 * This callback function will be invoked whenever a match is located in the
 * target data during the execution of a scan. The details of the match are
 * passed in as parameters to the callback function, and the callback function
 * should return a value indicating whether or not matching should continue on
 * the target data. If no callbacks are desired from a scan call, NULL may be
 * provided in order to suppress match production.
 *
 * This callback function should not attempt to call Hyperscan API functions on
 * the same stream nor should it attempt to reuse the scratch space allocated
 * for the API calls that caused it to be triggered. Making another call to the
 * Hyperscan library with completely independent parameters should work (for
 * example, scanning a different database in a new stream and with new scratch
 * space), but reusing data structures like stream state and/or scratch space
 * will produce undefined behavior.
 *
 * @param id
 *      The ID number of the expression that matched. If the expression was a
 *      single expression compiled with \ref hs_compile(), this value will be
 *      zero.
 *
 * @param from
 *      - If a start of match flag is enabled for the current pattern, this
 *        argument will be set to the start of match for the pattern assuming
 *        that that start of match value lies within the current 'start of match
 *        horizon' chosen by one of the SOM_HORIZON mode flags.
 <p>
 *      - If the start of match value lies outside this horizon (possible only
 *        when the SOM_HORIZON value is not \ref HS_MODE_SOM_HORIZON_LARGE),
 *        the \p from value will be set to \ref HS_OFFSET_PAST_HORIZON.
 <p>
 *      - This argument will be set to zero if the Start of Match flag is not
 *        enabled for the given pattern.
 *
 * @param to
 *      The offset after the last byte that matches the expression.
 *
 * @param flags
 *      This is provided for future use and is unused at present.
 *
 * @param context
 *      The pointer supplied by the user to the \ref hs_scan(), \ref
 *      hs_scan_vector() or \ref hs_scan_stream() function.
 *
 * @return
 *      Non-zero if the matching should cease, else zero. If scanning is
 *      performed in streaming mode and a non-zero value is returned, any
 *      subsequent calls to \ref hs_scan_stream() for that stream will
 *      immediately return with \ref HS_SCAN_TERMINATED.
 */
@Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class match_event_handler extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    match_event_handler(Pointer p) { super(p); }
    protected match_event_handler() { allocate(); }
    private native void allocate();
    public native int call(@Cast("unsigned int") int id,
                                            @Cast("unsigned long long") long from,
                                            @Cast("unsigned long long") long to,
                                            @Cast("unsigned int") int flags,
                                            Pointer context);
}
