// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// PyTorch ddp usage logging capabilities
// DDPLoggingData holds data that can be logged in applications
// for analysis and debugging. Data structure is defined in
// c10 directory so that it can be easily imported by both c10
// and torch files.
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DDPLoggingData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DDPLoggingData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DDPLoggingData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DDPLoggingData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DDPLoggingData position(long position) {
        return (DDPLoggingData)super.position(position);
    }
    @Override public DDPLoggingData getPointer(long i) {
        return new DDPLoggingData((Pointer)this).offsetAddress(i);
    }

  // logging fields that are string types.
  public native @ByRef StringStringMap strs_map(); public native DDPLoggingData strs_map(StringStringMap setter);
  // logging fields that are int64_t types.
  public native @ByRef StringLongMap ints_map(); public native DDPLoggingData ints_map(StringLongMap setter);
}
