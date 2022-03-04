// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppig;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppig.*;



/** \} affine_transform */

/** \defgroup affine_transform_batch Affine Transform Batch
 *
 * Details of the warp affine operation are described above in the WarpAffine section. WarpAffineBatch generally takes the same parameter list as 
 * WarpAffine except that there is a list of N instances of those parameters (N > 1) and that list is passed in device memory. A convenient
 * data structure is provided that allows for easy initialization of the parameter lists.  The aTransformedCoeffs array is for internal use only
 * and should not be directly initialized by the application.  The only restriction on these functions is
 * that there is one single source ROI rectangle and one single destination ROI rectangle which are applied respectively to each image 
 * in the batch.  The primary purpose of this function is to provide improved performance for batches of smaller images as long as GPU 
 * resources are available.  Therefore it is recommended that the function not be used for very large images as there may not be resources 
 * available for processing several large images simultaneously.  
 * A single set of oSrcRectROI and oDstRectROI values are applied to each source image and destination image in the batch.
 * Source and destination image sizes may vary but oSmallestSrcSize must be set to the smallest
 * source and image size in the batch. The parameters in the NppiWarpAffineBatchCXR structure represent the corresponding
 * per-image nppiWarpAffine parameters for each image in the batch.  The NppiWarpAffineBatchCXR array must be in device memory.
 * The nppiWarpAffineBatchInit function MUST be called AFTER the application has initialized the array of NppiWarpAffineBatchCXR structures
 * and BEFORE calling any of the nppiWarpAffineBatch functions to so that the aTransformedCoeffs array can be internally pre-initialized
 * for each image in the batch. The batch size passed to nppiWarpAffineBatchInit must match the batch size passed to the corresponding
 * warp affine batch function.
 *
 *
 * WarpAffineBatch supports the following interpolation modes:
 *
 * <pre>{@code
 *   NPPI_INTER_NN
 *   NPPI_INTER_LINEAR
 *   NPPI_INTER_CUBIC
 * }</pre>
 *
 * \section Error Codes
 * The warp affine primitives return the following error codes:
 *
 *         - ::NPP_RECTANGLE_ERROR if either destination ROI width or
 *           height is less than 1 pixel.
 *         - ::NPP_INTERPOLATION_ERROR if eInterpolation has an illegal value.
 *         - ::NPP_SIZE_ERROR if source size width or height is less than 2 pixels.
 *
 * <h3><a name="CommonWarpAffineBatchParameters">Common parameters for nppiWarpAffineBatch functions include:</a></h3>
 *
 * @param oSmallestSrcSize Size in pixels of the entire smallest source image width and height, may be from different images.
 * @param oSrcRectROI Region of interest in the source images.
 * @param oDstRectROI Region of interest in the destination images.
 * @param eInterpolation The type of eInterpolation to perform resampling. Currently limited to NPPI_INTER_NN, NPPI_INTER_LINEAR, or NPPI_INTER_CUBIC. 
 * @param pBatchList Device memory pointer to nBatchSize list of NppiWarpAffineBatchCXR structures.
 * @param nBatchSize Number of NppiWarpAffineBatchCXR structures in this call (must be > 1).
 * @param nppStreamCtx \ref application_managed_stream_context. 
 * @return \ref image_data_error_codes, \ref roi_error_codes
 *
 * \{
 *
 */

@Properties(inherit = org.bytedeco.cuda.presets.nppig.class)
public class NppiWarpAffineBatchCXR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiWarpAffineBatchCXR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiWarpAffineBatchCXR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiWarpAffineBatchCXR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiWarpAffineBatchCXR position(long position) {
        return (NppiWarpAffineBatchCXR)super.position(position);
    }
    @Override public NppiWarpAffineBatchCXR getPointer(long i) {
        return new NppiWarpAffineBatchCXR((Pointer)this).offsetAddress(i);
    }

    public native @Const Pointer pSrc(); public native NppiWarpAffineBatchCXR pSrc(Pointer setter);  /* device memory pointer */
    public native int nSrcStep(); public native NppiWarpAffineBatchCXR nSrcStep(int setter);
    public native Pointer pDst(); public native NppiWarpAffineBatchCXR pDst(Pointer setter);        /* device memory pointer */
    public native int nDstStep(); public native NppiWarpAffineBatchCXR nDstStep(int setter);
    public native @Cast("Npp64f*") DoublePointer pCoeffs(); public native NppiWarpAffineBatchCXR pCoeffs(DoublePointer setter);   /* device memory pointer to the tranformation matrix with double precision floating-point coefficient values to be used for this image */
    public native @Cast("Npp64f") double aTransformedCoeffs(int i, int j); public native NppiWarpAffineBatchCXR aTransformedCoeffs(int i, int j, double setter);
    @MemberGetter public native @Cast("Npp64f(* /*[2]*/ )[3]") DoublePointer aTransformedCoeffs(); /* FOR INTERNAL USE, DO NOT INITIALIZE  */
}
