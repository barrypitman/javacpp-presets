// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Options for saving TIFF images. Used in saving PPM images
 * with a call to spinImageSaveTiff().
 */
@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinTIFFOption extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinTIFFOption() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinTIFFOption(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinTIFFOption(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinTIFFOption position(long position) {
        return (spinTIFFOption)super.position(position);
    }
    @Override public spinTIFFOption getPointer(long i) {
        return new spinTIFFOption((Pointer)this).offsetAddress(i);
    }

    /** Compression method to use for encoding TIFF images. */
    public native spinTIFFCompressionMethod compression(); public native spinTIFFOption compression(spinTIFFCompressionMethod setter);
    /** Reserved for future use. */
    public native @Cast("unsigned int") int reserved(int i); public native spinTIFFOption reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}
