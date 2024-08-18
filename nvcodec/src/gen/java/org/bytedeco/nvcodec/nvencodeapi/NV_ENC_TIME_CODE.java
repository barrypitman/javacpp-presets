// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_TIME_CODE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_TIME_CODE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_TIME_CODE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_TIME_CODE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_TIME_CODE position(long position) {
        return (NV_ENC_TIME_CODE)super.position(position);
    }
    @Override public NV_ENC_TIME_CODE getPointer(long i) {
        return new NV_ENC_TIME_CODE((Pointer)this).offsetAddress(i);
    }

    /** [in] Display picStruct */
    public native @Cast("NV_ENC_DISPLAY_PIC_STRUCT") int displayPicStruct(); public native NV_ENC_TIME_CODE displayPicStruct(int setter);
    /** [in] Clock Timestamp set */
    public native @ByRef NV_ENC_CLOCK_TIMESTAMP_SET clockTimestamp(int i); public native NV_ENC_TIME_CODE clockTimestamp(int i, NV_ENC_CLOCK_TIMESTAMP_SET setter);
    @MemberGetter public native NV_ENC_CLOCK_TIMESTAMP_SET clockTimestamp();
    /** [in] 0 : Inserts Clock Timestamp if NV_ENC_CONFIG_H264::enableTimeCode (H264) or 
                                                                                          NV_ENC_CONFIG_HEVC::outputTimeCodeSEI (HEVC) is specified 
                                                                                      1 : Skips insertion of Clock Timestamp for current frame */
    public native @Cast("uint32_t") int skipClockTimestampInsertion(); public native NV_ENC_TIME_CODE skipClockTimestampInsertion(int setter);
}
