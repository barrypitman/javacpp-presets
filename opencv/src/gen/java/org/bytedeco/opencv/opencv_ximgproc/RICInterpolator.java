// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \brief Sparse match interpolation algorithm based on modified piecewise locally-weighted affine
 * estimator called Robust Interpolation method of Correspondences or RIC from \cite Hu2017 and Variational
 * and Fast Global Smoother as post-processing filter. The RICInterpolator is a extension of the EdgeAwareInterpolator.
 * Main concept of this extension is an piece-wise affine model based on over-segmentation via SLIC superpixel estimation.
 * The method contains an efficient propagation mechanism to estimate among the pieces-wise models.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class RICInterpolator extends SparseMatchInterpolator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RICInterpolator(Pointer p) { super(p); }

    /** \brief K is a number of nearest-neighbor matches considered, when fitting a locally affine
     *model for a superpixel segment. However, lower values would make the interpolation
     *noticeably faster. The original implementation of \cite Hu2017 uses 32.
    */
    public native void setK(int k/*=32*/);
    public native void setK();
    /** \copybrief setK
     *  @see setK
     */
    public native int getK();
    /** \brief Interface to provide a more elaborated cost map, i.e. edge map, for the edge-aware term.
     *  This implementation is based on a rather simple gradient-based edge map estimation.
     *  To used more complex edge map estimator (e.g. StructuredEdgeDetection that has been
     *  used in the original publication) that may lead to improved accuracies, the internal
     *  edge map estimation can be bypassed here.
     *  @param costMap a type CV_32FC1 Mat is required.
     *  @see cv::ximgproc::createSuperpixelSLIC
    */
    public native void setCostMap(@Const @ByRef Mat costMap);
    /** \brief Get the internal cost, i.e. edge map, used for estimating the edge-aware term.
     *  @see setCostMap
     */
    public native void setSuperpixelSize(int spSize/*=15*/);
    public native void setSuperpixelSize();
    /** \copybrief setSuperpixelSize
     *  @see setSuperpixelSize
     */
    public native int getSuperpixelSize();
    /** \brief Parameter defines the number of nearest-neighbor matches for each superpixel considered, when fitting a locally affine
     *model.
    */
    public native void setSuperpixelNNCnt(int spNN/*=150*/);
    public native void setSuperpixelNNCnt();
    /** \copybrief setSuperpixelNNCnt
     *  @see setSuperpixelNNCnt
    */
    public native int getSuperpixelNNCnt();
    /** \brief Parameter to tune enforcement of superpixel smoothness factor used for oversegmentation.
     *  @see cv::ximgproc::createSuperpixelSLIC
    */
    public native void setSuperpixelRuler(float ruler/*=15.f*/);
    public native void setSuperpixelRuler();
    /** \copybrief setSuperpixelRuler
     *  @see setSuperpixelRuler
     */
    public native float getSuperpixelRuler();
    /** \brief Parameter to choose superpixel algorithm variant to use:
     * - cv::ximgproc::SLICType SLIC segments image using a desired region_size (value: 100)
     * - cv::ximgproc::SLICType SLICO will optimize using adaptive compactness factor (value: 101)
     * - cv::ximgproc::SLICType MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels (value: 102).
     *  @see cv::ximgproc::createSuperpixelSLIC
    */
    public native void setSuperpixelMode(int mode/*=100*/);
    public native void setSuperpixelMode();
    /** \copybrief setSuperpixelMode
     *  @see setSuperpixelMode
     */
    public native int getSuperpixelMode();
    /** \brief Alpha is a parameter defining a global weight for transforming geodesic distance into weight.
     */
    public native void setAlpha(float alpha/*=0.7f*/);
    public native void setAlpha();
    /** \copybrief setAlpha
     *  @see setAlpha
     */
    public native float getAlpha();
    /** \brief Parameter defining the number of iterations for piece-wise affine model estimation.
     */
    public native void setModelIter(int modelIter/*=4*/);
    public native void setModelIter();
    /** \copybrief setModelIter
     *  @see setModelIter
     */
    public native int getModelIter();
    /** \brief Parameter to choose wether additional refinement of the piece-wise affine models is employed.
    */
    public native void setRefineModels(@Cast("bool") boolean refineModles/*=true*/);
    public native void setRefineModels();
    /** \copybrief setRefineModels
     *  @see setRefineModels
     */
    public native @Cast("bool") boolean getRefineModels();
    /** \brief MaxFlow is a threshold to validate the predictions using a certain piece-wise affine model.
     * If the prediction exceeds the treshold the translational model will be applied instead.
    */
    public native void setMaxFlow(float maxFlow/*=250.f*/);
    public native void setMaxFlow();
    /** \copybrief setMaxFlow
     *  @see setMaxFlow
     */
    public native float getMaxFlow();
    /** \brief Parameter to choose wether the VariationalRefinement post-processing  is employed.
    */
    public native void setUseVariationalRefinement(@Cast("bool") boolean use_variational_refinement/*=false*/);
    public native void setUseVariationalRefinement();
    /** \copybrief setUseVariationalRefinement
     *  @see setUseVariationalRefinement
     */
    public native @Cast("bool") boolean getUseVariationalRefinement();
    /** \brief Sets whether the fastGlobalSmootherFilter() post-processing is employed.
    */
    public native void setUseGlobalSmootherFilter(@Cast("bool") boolean use_FGS/*=true*/);
    public native void setUseGlobalSmootherFilter();
    /** \copybrief setUseGlobalSmootherFilter
     *  @see setUseGlobalSmootherFilter
     */
    public native @Cast("bool") boolean getUseGlobalSmootherFilter();
    /** \brief Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public native void setFGSLambda(float lambda/*=500.f*/);
    public native void setFGSLambda();
    /** \copybrief setFGSLambda
     *  @see setFGSLambda
     */
    public native float getFGSLambda();
    /** \brief Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public native void setFGSSigma(float sigma/*=1.5f*/);
    public native void setFGSSigma();
    /** \copybrief setFGSSigma
     *  @see setFGSSigma
     */
    public native float getFGSSigma();
}
