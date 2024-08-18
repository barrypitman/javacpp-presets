// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Sets the invocation callback for the registration. The function returns an
 *  error upon failure.
 * 
 *  The callback is called when the operator is executed.  The value passed in
 *  the {@code user_data} parameter is the value that was passed to
 *  {@code TfLiteOperatorCreate}.  Please refer {@code invoke} of {@code TfLiteRegistration} for
 *  the detail.
 *  */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Invoke_Pointer_TfLiteOpaqueContext_TfLiteOpaqueNode extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Invoke_Pointer_TfLiteOpaqueContext_TfLiteOpaqueNode(Pointer p) { super(p); }
    protected Invoke_Pointer_TfLiteOpaqueContext_TfLiteOpaqueNode() { allocate(); }
    private native void allocate();
    public native @Cast("TfLiteStatus") int call(Pointer user_data, TfLiteOpaqueContext context,
                           TfLiteOpaqueNode node);
}
