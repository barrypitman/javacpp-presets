// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/** Serializable properties */
@Name("dai::PropertiesSerializable<dai::Properties,dai::IMUProperties>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMUPropertiesSerializable extends DaiProperties {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMUPropertiesSerializable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMUPropertiesSerializable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMUPropertiesSerializable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMUPropertiesSerializable position(long position) {
        return (IMUPropertiesSerializable)super.position(position);
    }
    @Override public IMUPropertiesSerializable getPointer(long i) {
        return new IMUPropertiesSerializable((Pointer)this).offsetAddress(i);
    }

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] data);

    public native @UniquePtr @Override DaiProperties clone();
}
