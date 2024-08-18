// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/*@}*/

/**
 * \defgroup SpinnakerFuncSignatureC Spinnaker C Function Signatures
 *
 * Spinnaker C function signature definitions
 */
/*@{*/

/**
 * Function signatures are used to create and trigger callbacks and
 * events.
 */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinDeviceEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    spinDeviceEventFunction(Pointer p) { super(p); }
    protected spinDeviceEventFunction() { allocate(); }
    private native void allocate();
    public native void call(spinDeviceEventData hEventData, @Cast("const char*") BytePointer pEventName, Pointer pUserData);
}
