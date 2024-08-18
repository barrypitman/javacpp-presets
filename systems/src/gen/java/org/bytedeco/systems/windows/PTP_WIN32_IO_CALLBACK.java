// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_DESKTOP)

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PTP_WIN32_IO_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PTP_WIN32_IO_CALLBACK(Pointer p) { super(p); }
    protected PTP_WIN32_IO_CALLBACK() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("PTP_CALLBACK_INSTANCE") TP_CALLBACK_INSTANCE Instance,
    @Cast("PVOID") Pointer Context,
    @Cast("PVOID") Pointer Overlapped,
    @Cast("ULONG") long IoResult,
    @Cast("ULONG_PTR") long NumberOfBytesTransferred,
    @Cast("PTP_IO") TP_IO Io
    );
}
