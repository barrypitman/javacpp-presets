// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class ArmInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ArmInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArmInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArmInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ArmInfo position(long position) {
        return (ArmInfo)super.position(position);
    }
    @Override public ArmInfo getPointer(long i) {
        return new ArmInfo((Pointer)this).offsetAddress(i);
    }

  public native @ByRef ArmFeatures features(); public native ArmInfo features(ArmFeatures setter);
  public native int implementer(); public native ArmInfo implementer(int setter);
  public native int architecture(); public native ArmInfo architecture(int setter);
  public native int variant(); public native ArmInfo variant(int setter);
  public native int part(); public native ArmInfo part(int setter);
  public native int revision(); public native ArmInfo revision(int setter);
}
