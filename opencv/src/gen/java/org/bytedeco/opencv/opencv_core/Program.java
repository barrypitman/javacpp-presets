// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Program extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Program(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Program(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Program position(long position) {
        return (Program)super.position(position);
    }
    @Override public Program getPointer(long i) {
        return new Program((Pointer)this).offsetAddress(i);
    }

    public Program() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public Program(@Const @ByRef ProgramSource src,
                @Str BytePointer buildflags, @Str BytePointer errmsg) { super((Pointer)null); allocate(src, buildflags, errmsg); }
    private native void allocate(@Const @ByRef ProgramSource src,
                @Str BytePointer buildflags, @Str BytePointer errmsg);
    public Program(@Const @ByRef ProgramSource src,
                @Str String buildflags, @Str String errmsg) { super((Pointer)null); allocate(src, buildflags, errmsg); }
    private native void allocate(@Const @ByRef ProgramSource src,
                @Str String buildflags, @Str String errmsg);
    public Program(@Const @ByRef Program prog) { super((Pointer)null); allocate(prog); }
    private native void allocate(@Const @ByRef Program prog);
    public native @ByRef @Name("operator =") Program put(@Const @ByRef Program prog);

    public native @Cast("bool") boolean create(@Const @ByRef ProgramSource src,
                    @Str BytePointer buildflags, @Str BytePointer errmsg);
    public native @Cast("bool") boolean create(@Const @ByRef ProgramSource src,
                    @Str String buildflags, @Str String errmsg);

    public native Pointer ptr();

    /**
     * \brief Query device-specific program binary.
     *
     * Returns RAW OpenCL executable binary without additional attachments.
     *
     * @see ProgramSource::fromBinary
     *
     * @param binary [out] output buffer
     */
    public native void getBinary(@Cast("char*") @StdVector BytePointer binary);
    public native void getBinary(@Cast("char*") @StdVector ByteBuffer binary);
    public native void getBinary(@Cast("char*") @StdVector byte[] binary);
    public native @Cast("cv::ocl::Program::Impl*") Pointer getImpl();
    public native @Cast("bool") boolean empty();
// #ifndef OPENCV_REMOVE_DEPRECATED_API
    // TODO Remove this
    public native @Cast("bool") @Deprecated boolean read(@Str BytePointer buf, @Str BytePointer buildflags);
    public native @Cast("bool") @Deprecated boolean read(@Str String buf, @Str String buildflags); // removed, use ProgramSource instead
    public native @Cast("bool") @Deprecated boolean write(@Str BytePointer buf);
    public native @Cast("bool") @Deprecated boolean write(@Str String buf); // removed, use getBinary() method instead (RAW OpenCL binary)
    public native @Const @Deprecated @ByRef ProgramSource source(); // implementation removed
    public native @Deprecated @Str BytePointer getPrefix(); // deprecated, implementation replaced
    public static native @Deprecated @Str BytePointer getPrefix(@Str BytePointer buildflags);
    public static native @Deprecated @Str String getPrefix(@Str String buildflags); // deprecated, implementation replaced
// #endif
}
