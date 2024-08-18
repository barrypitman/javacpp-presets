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



/**
 * \struct _NV_ENC_PIC_PARAMS
 * Encoding parameters that need to be sent on a per frame basis.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_PIC_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_PIC_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_PIC_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_PIC_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_PIC_PARAMS position(long position) {
        return (NV_ENC_PIC_PARAMS)super.position(position);
    }
    @Override public NV_ENC_PIC_PARAMS getPointer(long i) {
        return new NV_ENC_PIC_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_PIC_PARAMS_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_PIC_PARAMS version(int setter);
    /** [in]: Specifies the input frame width */
    public native @Cast("uint32_t") int inputWidth(); public native NV_ENC_PIC_PARAMS inputWidth(int setter);
    /** [in]: Specifies the input frame height */
    public native @Cast("uint32_t") int inputHeight(); public native NV_ENC_PIC_PARAMS inputHeight(int setter);
    /** [in]: Specifies the input buffer pitch. If pitch value is not known, set this to inputWidth. */
    public native @Cast("uint32_t") int inputPitch(); public native NV_ENC_PIC_PARAMS inputPitch(int setter);
    /** [in]: Specifies bit-wise OR of encode picture flags. See ::NV_ENC_PIC_FLAGS enum. */
    public native @Cast("uint32_t") int encodePicFlags(); public native NV_ENC_PIC_PARAMS encodePicFlags(int setter);
    /** [in]: Specifies the frame index associated with the input frame. It is necessary to pass this as monotonically increasing starting 0 when lookaheadLevel, UHQ Tuning Info
                                                                                               or encoding same frames multiple times without advancing encoder state feature are enabled */
    public native @Cast("uint32_t") int frameIdx(); public native NV_ENC_PIC_PARAMS frameIdx(int setter);
    /** [in]: Specifies opaque data which is associated with the encoded frame, but not actually encoded in the output bitstream.
                                                                                               This opaque data can be used later to uniquely refer to the corresponding encoded frame. For example, it can be used
                                                                                               for identifying the frame to be invalidated in the reference picture buffer, if lost at the client. */
    public native @Cast("uint64_t") long inputTimeStamp(); public native NV_ENC_PIC_PARAMS inputTimeStamp(long setter);
    /** [in]: Specifies duration of the input picture */
    public native @Cast("uint64_t") long inputDuration(); public native NV_ENC_PIC_PARAMS inputDuration(long setter);
    /** [in]: Specifies the input buffer pointer. Client must use a pointer obtained from ::NvEncCreateInputBuffer() or ::NvEncMapInputResource() APIs.*/
    public native NV_ENC_INPUT_PTR inputBuffer(); public native NV_ENC_PIC_PARAMS inputBuffer(NV_ENC_INPUT_PTR setter);
    /** [in]: Specifies the output buffer pointer.
                                                                                               If NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is set to 0, specifies the pointer to output buffer. Client should use a pointer obtained from ::NvEncCreateBitstreamBuffer() API.
                                                                                               If NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is set to 1, client should allocate buffer in video memory for NV_ENC_ENCODE_OUT_PARAMS struct and encoded bitstream data. Client
                                                                                               should use a pointer obtained from ::NvEncMapInputResource() API, when mapping this output buffer and assign it to NV_ENC_PIC_PARAMS::outputBitstream.
                                                                                               First 256 bytes of this buffer should be interpreted as NV_ENC_ENCODE_OUT_PARAMS struct followed by encoded bitstream data. Recommended size for output buffer is sum of size of
                                                                                               NV_ENC_ENCODE_OUT_PARAMS struct and twice the input frame size for lower resolution eg. CIF and 1.5 times the input frame size for higher resolutions. If encoded bitstream size is
                                                                                               greater than the allocated buffer size for encoded bitstream, then the output buffer will have encoded bitstream data equal to buffer size. All CUDA operations on this buffer must use
                                                                                               the default stream. */
    public native NV_ENC_OUTPUT_PTR outputBitstream(); public native NV_ENC_PIC_PARAMS outputBitstream(NV_ENC_OUTPUT_PTR setter);
    /** [in]: Specifies an event to be signaled on completion of encoding of this Frame [only if operating in Asynchronous mode]. Each output buffer should be associated with a distinct event pointer. */
    public native Pointer completionEvent(); public native NV_ENC_PIC_PARAMS completionEvent(Pointer setter);
    /** [in]: Specifies the input buffer format. */
    public native @Cast("NV_ENC_BUFFER_FORMAT") int bufferFmt(); public native NV_ENC_PIC_PARAMS bufferFmt(int setter);
    /** [in]: Specifies structure of the input picture. */
    public native @Cast("NV_ENC_PIC_STRUCT") int pictureStruct(); public native NV_ENC_PIC_PARAMS pictureStruct(int setter);
    /** [in]: Specifies input picture type. Client required to be set explicitly by the client if the client has not set NV_ENC_INITALIZE_PARAMS::enablePTD to 1 while calling NvInitializeEncoder. */
    public native @Cast("NV_ENC_PIC_TYPE") int pictureType(); public native NV_ENC_PIC_PARAMS pictureType(int setter);
    /** [in]: Specifies the codec specific per-picture encoding parameters. */
    public native @ByRef NV_ENC_CODEC_PIC_PARAMS codecPicParams(); public native NV_ENC_PIC_PARAMS codecPicParams(NV_ENC_CODEC_PIC_PARAMS setter);
    /** [in]: For H264 and Hevc, specifies the number of hint candidates per block per direction for the current frame. meHintCountsPerBlock[0] is for L0 predictors and meHintCountsPerBlock[1] is for L1 predictors.
                                                                                               The candidate count in NV_ENC_PIC_PARAMS::meHintCountsPerBlock[lx] must never exceed NV_ENC_INITIALIZE_PARAMS::maxMEHintCountsPerBlock[lx] provided during encoder initialization. */
    public native @ByRef NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE meHintCountsPerBlock(int i); public native NV_ENC_PIC_PARAMS meHintCountsPerBlock(int i, NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE setter);
    @MemberGetter public native NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE meHintCountsPerBlock();
    /** [in]: For H264 and Hevc, Specifies the pointer to ME external hints for the current frame. The size of ME hint buffer should be equal to number of macroblocks * the total number of candidates per macroblock.
                                                                                               The total number of candidates per MB per direction = 1*meHintCountsPerBlock[Lx].numCandsPerBlk16x16 + 2*meHintCountsPerBlock[Lx].numCandsPerBlk16x8 + 2*meHintCountsPerBlock[Lx].numCandsPerBlk8x8
                                                                                               + 4*meHintCountsPerBlock[Lx].numCandsPerBlk8x8. For frames using bidirectional ME , the total number of candidates for single macroblock is sum of total number of candidates per MB for each direction (L0 and L1) */
    public native NVENC_EXTERNAL_ME_HINT meExternalHints(); public native NV_ENC_PIC_PARAMS meExternalHints(NVENC_EXTERNAL_ME_HINT setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved2(int i); public native NV_ENC_PIC_PARAMS reserved2(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved2();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved5(int i); public native NV_ENC_PIC_PARAMS reserved5(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved5();
    /** [in]: Specifies the pointer to signed byte array containing value per MB for H264, per CTB for HEVC and per SB for AV1 in raster scan order for the current picture, which will be interpreted depending on NV_ENC_RC_PARAMS::qpMapMode.
                                                                                                If NV_ENC_RC_PARAMS::qpMapMode is NV_ENC_QP_MAP_DELTA, qpDeltaMap specifies QP modifier per MB for H264, per CTB for HEVC and per SB for AV1. This QP modifier will be applied on top of the QP chosen by rate control.
                                                                                                If NV_ENC_RC_PARAMS::qpMapMode is NV_ENC_QP_MAP_EMPHASIS, qpDeltaMap specifies Emphasis Level Map per MB for H264. This level value along with QP chosen by rate control is used to
                                                                                                compute the QP modifier, which in turn is applied on top of QP chosen by rate control.
                                                                                                If NV_ENC_RC_PARAMS::qpMapMode is NV_ENC_QP_MAP_DISABLED, value in qpDeltaMap will be ignored.*/
    public native @Cast("int8_t*") BytePointer qpDeltaMap(); public native NV_ENC_PIC_PARAMS qpDeltaMap(BytePointer setter);
    /** [in]: Specifies the size in bytes of qpDeltaMap surface allocated by client and pointed to by NV_ENC_PIC_PARAMS::qpDeltaMap. Surface (array) should be picWidthInMbs * picHeightInMbs for H264, picWidthInCtbs * picHeightInCtbs for HEVC and
                                                                                                picWidthInSbs * picHeightInSbs for AV1 */
    public native @Cast("uint32_t") int qpDeltaMapSize(); public native NV_ENC_PIC_PARAMS qpDeltaMapSize(int setter);
    /** [in]: Reserved bitfields and must be set to 0 */
    public native @Cast("uint32_t") int reservedBitFields(); public native NV_ENC_PIC_PARAMS reservedBitFields(int setter);
    /** [in]: Specifies temporal distance for reference picture (NVENC_EXTERNAL_ME_HINT::refidx = 0) used during external ME with NV_ENC_INITALIZE_PARAMS::enablePTD = 1 . meHintRefPicDist[0] is for L0 hints and meHintRefPicDist[1] is for L1 hints.
                                                                                                If not set, will internally infer distance of 1. Ignored for NV_ENC_INITALIZE_PARAMS::enablePTD = 0 */
    public native @Cast("uint16_t") short meHintRefPicDist(int i); public native NV_ENC_PIC_PARAMS meHintRefPicDist(int i, short setter);
    @MemberGetter public native @Cast("uint16_t*") ShortPointer meHintRefPicDist();
     /** [in]: Reserved and must be set to 0 */
     public native @Cast("uint32_t") int reserved4(); public native NV_ENC_PIC_PARAMS reserved4(int setter);
    /** [in]: Specifies the input alpha buffer pointer. Client must use a pointer obtained from ::NvEncCreateInputBuffer() or ::NvEncMapInputResource() APIs.
                                                                                                Applicable only when encoding hevc with alpha layer is enabled. */
    public native NV_ENC_INPUT_PTR alphaBuffer(); public native NV_ENC_PIC_PARAMS alphaBuffer(NV_ENC_INPUT_PTR setter);
    /** [in]: For AV1,Specifies the pointer to ME external SB hints for the current frame. The size of ME hint buffer should be equal to meSbHintsCount. */
    public native NVENC_EXTERNAL_ME_SB_HINT meExternalSbHints(); public native NV_ENC_PIC_PARAMS meExternalSbHints(NVENC_EXTERNAL_ME_SB_HINT setter);
    /** [in]: For AV1, specifies the total number of external ME SB hint candidates for the frame
                                                                                                NV_ENC_PIC_PARAMS::meSbHintsCount must never exceed the total number of SBs in frame * the max number of candidates per SB provided during encoder initialization.
                                                                                                The max number of candidates per SB is maxMeHintCountsPerBlock[0].numCandsPerSb + maxMeHintCountsPerBlock[1].numCandsPerSb */
    public native @Cast("uint32_t") int meSbHintsCount(); public native NV_ENC_PIC_PARAMS meSbHintsCount(int setter);
    /** [in]: Specifies the buffer index in which the encoder state will be saved for current frame encode. It must be in the 
                                                                                                range 0 to NV_ENC_INITIALIZE_PARAMS::numStateBuffers - 1. */
    public native @Cast("uint32_t") int stateBufferIdx(); public native NV_ENC_PIC_PARAMS stateBufferIdx(int setter);
    /** [in]: Specifies the reconstructed frame buffer pointer to output reconstructed frame, if enabled by setting NV_ENC_INITIALIZE_PARAMS::enableReconFrameOutput.
                                                                                                Client must allocate buffers for writing the reconstructed frames and register them with the Nvidia Video Encoder Interface with NV_ENC_REGISTER_RESOURCE::bufferUsage
                                                                                                set to NV_ENC_OUTPUT_RECON. 
                                                                                                Client must use the pointer obtained from ::NvEncMapInputResource() API and assign it to NV_ENC_PIC_PARAMS::outputReconBuffer.
                                                                                                Reconstructed output will be in NV_ENC_BUFFER_FORMAT_NV12 format when chromaFormatIDC is set to 1.
                                                                                                chromaFormatIDC = 3 is not supported. */
    public native NV_ENC_OUTPUT_PTR outputReconBuffer(); public native NV_ENC_PIC_PARAMS outputReconBuffer(NV_ENC_OUTPUT_PTR setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved3(int i); public native NV_ENC_PIC_PARAMS reserved3(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved3();    
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved6(int i); public native NV_ENC_PIC_PARAMS reserved6(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved6();
}
