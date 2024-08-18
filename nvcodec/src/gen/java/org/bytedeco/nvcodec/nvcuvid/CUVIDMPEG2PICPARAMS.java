// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;



/********************************************************/
/** \struct CUVIDMPEG2PICPARAMS
/** MPEG-2 picture parameters
/** This structure is used in CUVIDPICPARAMS structure
/********************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDMPEG2PICPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDMPEG2PICPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDMPEG2PICPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDMPEG2PICPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDMPEG2PICPARAMS position(long position) {
        return (CUVIDMPEG2PICPARAMS)super.position(position);
    }
    @Override public CUVIDMPEG2PICPARAMS getPointer(long i) {
        return new CUVIDMPEG2PICPARAMS((Pointer)this).offsetAddress(i);
    }

    public native int ForwardRefIdx(); public native CUVIDMPEG2PICPARAMS ForwardRefIdx(int setter);          // Picture index of forward reference (P/B-frames)
    public native int BackwardRefIdx(); public native CUVIDMPEG2PICPARAMS BackwardRefIdx(int setter);         // Picture index of backward reference (B-frames)
    public native int picture_coding_type(); public native CUVIDMPEG2PICPARAMS picture_coding_type(int setter);
    public native int full_pel_forward_vector(); public native CUVIDMPEG2PICPARAMS full_pel_forward_vector(int setter);
    public native int full_pel_backward_vector(); public native CUVIDMPEG2PICPARAMS full_pel_backward_vector(int setter);
    public native int f_code(int i, int j); public native CUVIDMPEG2PICPARAMS f_code(int i, int j, int setter);
    @MemberGetter public native @Cast("int(* /*[2]*/ )[2]") IntPointer f_code();
    public native int intra_dc_precision(); public native CUVIDMPEG2PICPARAMS intra_dc_precision(int setter);
    public native int frame_pred_frame_dct(); public native CUVIDMPEG2PICPARAMS frame_pred_frame_dct(int setter);
    public native int concealment_motion_vectors(); public native CUVIDMPEG2PICPARAMS concealment_motion_vectors(int setter);
    public native int q_scale_type(); public native CUVIDMPEG2PICPARAMS q_scale_type(int setter);
    public native int intra_vlc_format(); public native CUVIDMPEG2PICPARAMS intra_vlc_format(int setter);
    public native int alternate_scan(); public native CUVIDMPEG2PICPARAMS alternate_scan(int setter);
    public native int top_field_first(); public native CUVIDMPEG2PICPARAMS top_field_first(int setter);
    // Quantization matrices (raster order)
    public native @Cast("unsigned char") byte QuantMatrixIntra(int i); public native CUVIDMPEG2PICPARAMS QuantMatrixIntra(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer QuantMatrixIntra();
    public native @Cast("unsigned char") byte QuantMatrixInter(int i); public native CUVIDMPEG2PICPARAMS QuantMatrixInter(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer QuantMatrixInter();
}
