// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


// Used in torch.package and TorchScript deserialization to coordinate
// sharing of storages between models.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeserializationStorageContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeserializationStorageContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeserializationStorageContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DeserializationStorageContext position(long position) {
        return (DeserializationStorageContext)super.position(position);
    }
    @Override public DeserializationStorageContext getPointer(long i) {
        return new DeserializationStorageContext((Pointer)this).offsetAddress(i);
    }

  public DeserializationStorageContext() { super((Pointer)null); allocate(); }
  private native void allocate();
  
  

  public native void addStorage(@StdString BytePointer name, @Cast({"", "c10::Storage&&"}) @StdMove Storage storage);
  public native void addStorage(@StdString String name, @Cast({"", "c10::Storage&&"}) @StdMove Storage storage);

  public native @Cast("bool") boolean hasStorage(@StdString BytePointer name);
  public native @Cast("bool") boolean hasStorage(@StdString String name);

  public native @Cast({"", "c10::Storage&&"}) @StdMove Storage getStorage(@StdString BytePointer name);
  public native @Cast({"", "c10::Storage&&"}) @StdMove Storage getStorage(@StdString String name);
}
