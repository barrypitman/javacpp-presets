// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuNarrowPhaseInternalData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuNarrowPhaseInternalData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuNarrowPhaseInternalData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuNarrowPhaseInternalData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuNarrowPhaseInternalData position(long position) {
        return (b3GpuNarrowPhaseInternalData)super.position(position);
    }
    @Override public b3GpuNarrowPhaseInternalData getPointer(long i) {
        return new b3GpuNarrowPhaseInternalData((Pointer)this).offsetAddress(i);
    }

	public native b3ConvexUtilityArray m_convexData(); public native b3GpuNarrowPhaseInternalData m_convexData(b3ConvexUtilityArray setter);

	public native @ByRef b3ConvexPolyhedronDataArray m_convexPolyhedra(); public native b3GpuNarrowPhaseInternalData m_convexPolyhedra(b3ConvexPolyhedronDataArray setter);
	public native @ByRef b3Vector3Array m_uniqueEdges(); public native b3GpuNarrowPhaseInternalData m_uniqueEdges(b3Vector3Array setter);
	public native @ByRef b3Vector3Array m_convexVertices(); public native b3GpuNarrowPhaseInternalData m_convexVertices(b3Vector3Array setter);
	public native @ByRef b3IntArray m_convexIndices(); public native b3GpuNarrowPhaseInternalData m_convexIndices(b3IntArray setter);

	public native b3ConvexPolyhedronDataOCLArray m_convexPolyhedraGPU(); public native b3GpuNarrowPhaseInternalData m_convexPolyhedraGPU(b3ConvexPolyhedronDataOCLArray setter);
	public native b3Vector3OCLArray m_uniqueEdgesGPU(); public native b3GpuNarrowPhaseInternalData m_uniqueEdgesGPU(b3Vector3OCLArray setter);
	public native b3Vector3OCLArray m_convexVerticesGPU(); public native b3GpuNarrowPhaseInternalData m_convexVerticesGPU(b3Vector3OCLArray setter);
	public native b3IntOCLArray m_convexIndicesGPU(); public native b3GpuNarrowPhaseInternalData m_convexIndicesGPU(b3IntOCLArray setter);

	public native b3Vector3OCLArray m_worldVertsB1GPU(); public native b3GpuNarrowPhaseInternalData m_worldVertsB1GPU(b3Vector3OCLArray setter);
	public native b3Int4OCLArray m_clippingFacesOutGPU(); public native b3GpuNarrowPhaseInternalData m_clippingFacesOutGPU(b3Int4OCLArray setter);
	public native b3Vector3OCLArray m_worldNormalsAGPU(); public native b3GpuNarrowPhaseInternalData m_worldNormalsAGPU(b3Vector3OCLArray setter);
	public native b3Vector3OCLArray m_worldVertsA1GPU(); public native b3GpuNarrowPhaseInternalData m_worldVertsA1GPU(b3Vector3OCLArray setter);
	public native b3Vector3OCLArray m_worldVertsB2GPU(); public native b3GpuNarrowPhaseInternalData m_worldVertsB2GPU(b3Vector3OCLArray setter);

	public native @ByRef b3GpuChildShapeArray m_cpuChildShapes(); public native b3GpuNarrowPhaseInternalData m_cpuChildShapes(b3GpuChildShapeArray setter);
	public native b3GpuChildShapeOCLArray m_gpuChildShapes(); public native b3GpuNarrowPhaseInternalData m_gpuChildShapes(b3GpuChildShapeOCLArray setter);

	public native @ByRef b3GpuFaceArray m_convexFaces(); public native b3GpuNarrowPhaseInternalData m_convexFaces(b3GpuFaceArray setter);
	public native b3GpuFaceOCLArray m_convexFacesGPU(); public native b3GpuNarrowPhaseInternalData m_convexFacesGPU(b3GpuFaceOCLArray setter);

	public native GpuSatCollision m_gpuSatCollision(); public native b3GpuNarrowPhaseInternalData m_gpuSatCollision(GpuSatCollision setter);

	public native b3Int4OCLArray m_triangleConvexPairs(); public native b3GpuNarrowPhaseInternalData m_triangleConvexPairs(b3Int4OCLArray setter);

	public native b3Contact4OCLArray m_pBufContactBuffersGPU(int i); public native b3GpuNarrowPhaseInternalData m_pBufContactBuffersGPU(int i, b3Contact4OCLArray setter);
	@MemberGetter public native @Cast("b3OpenCLArray<b3Contact4>**") PointerPointer m_pBufContactBuffersGPU();
	public native int m_currentContactBuffer(); public native b3GpuNarrowPhaseInternalData m_currentContactBuffer(int setter);
	public native b3Contact4Array m_pBufContactOutCPU(); public native b3GpuNarrowPhaseInternalData m_pBufContactOutCPU(b3Contact4Array setter);

	public native b3RigidBodyDataArray m_bodyBufferCPU(); public native b3GpuNarrowPhaseInternalData m_bodyBufferCPU(b3RigidBodyDataArray setter);
	public native b3RigidBodyDataOCLArray m_bodyBufferGPU(); public native b3GpuNarrowPhaseInternalData m_bodyBufferGPU(b3RigidBodyDataOCLArray setter);

	public native b3InertiaDataArray m_inertiaBufferCPU(); public native b3GpuNarrowPhaseInternalData m_inertiaBufferCPU(b3InertiaDataArray setter);
	public native b3InertiaDataOCLArray m_inertiaBufferGPU(); public native b3GpuNarrowPhaseInternalData m_inertiaBufferGPU(b3InertiaDataOCLArray setter);

	public native int m_numAcceleratedShapes(); public native b3GpuNarrowPhaseInternalData m_numAcceleratedShapes(int setter);
	public native int m_numAcceleratedRigidBodies(); public native b3GpuNarrowPhaseInternalData m_numAcceleratedRigidBodies(int setter);

	public native @ByRef b3CollidableArray m_collidablesCPU(); public native b3GpuNarrowPhaseInternalData m_collidablesCPU(b3CollidableArray setter);
	public native b3CollidableOCLArray m_collidablesGPU(); public native b3GpuNarrowPhaseInternalData m_collidablesGPU(b3CollidableOCLArray setter);

	public native b3SapAabbOCLArray m_localShapeAABBGPU(); public native b3GpuNarrowPhaseInternalData m_localShapeAABBGPU(b3SapAabbOCLArray setter);
	public native b3SapAabbArray m_localShapeAABBCPU(); public native b3GpuNarrowPhaseInternalData m_localShapeAABBCPU(b3SapAabbArray setter);

	public native @ByRef b3OptimizedBvhArray m_bvhData(); public native b3GpuNarrowPhaseInternalData m_bvhData(b3OptimizedBvhArray setter);
	public native @ByRef b3TriangleIndexVertexArrayArray m_meshInterfaces(); public native b3GpuNarrowPhaseInternalData m_meshInterfaces(b3TriangleIndexVertexArrayArray setter);

	public native @ByRef b3QuantizedBvhNodeArray m_treeNodesCPU(); public native b3GpuNarrowPhaseInternalData m_treeNodesCPU(b3QuantizedBvhNodeArray setter);
	public native @ByRef b3BvhSubtreeInfoArray m_subTreesCPU(); public native b3GpuNarrowPhaseInternalData m_subTreesCPU(b3BvhSubtreeInfoArray setter);

	public native @ByRef b3BvhInfoArray m_bvhInfoCPU(); public native b3GpuNarrowPhaseInternalData m_bvhInfoCPU(b3BvhInfoArray setter);
	public native b3BvhInfoOCLArray m_bvhInfoGPU(); public native b3GpuNarrowPhaseInternalData m_bvhInfoGPU(b3BvhInfoOCLArray setter);

	public native b3QuantizedBvhNodeOCLArray m_treeNodesGPU(); public native b3GpuNarrowPhaseInternalData m_treeNodesGPU(b3QuantizedBvhNodeOCLArray setter);
	public native b3BvhSubtreeInfoOCLArray m_subTreesGPU(); public native b3GpuNarrowPhaseInternalData m_subTreesGPU(b3BvhSubtreeInfoOCLArray setter);

	public native @ByRef b3Config m_config(); public native b3GpuNarrowPhaseInternalData m_config(b3Config setter);
}
