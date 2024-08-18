// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Handle for interface event handler functionality. Created by calling
 * spinInterfaceEventHandlerCreate(), which requires a call to
 * spinInterfaceEventHandlerDestroy() to destroy.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinInterfaceEventHandler extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinInterfaceEventHandler() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinInterfaceEventHandler(Pointer p) { super(p); }
}
