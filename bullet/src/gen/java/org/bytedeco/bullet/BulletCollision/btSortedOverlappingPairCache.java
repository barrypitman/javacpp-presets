// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btSortedOverlappingPairCache maintains the objects with overlapping AABB
 * Typically managed by the Broadphase, Axis3Sweep or btSimpleBroadphase */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSortedOverlappingPairCache extends btOverlappingPairCache {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSortedOverlappingPairCache(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSortedOverlappingPairCache(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSortedOverlappingPairCache position(long position) {
        return (btSortedOverlappingPairCache)super.position(position);
    }
    @Override public btSortedOverlappingPairCache getPointer(long i) {
        return new btSortedOverlappingPairCache((Pointer)this).offsetAddress(i);
    }

	public btSortedOverlappingPairCache() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void processAllOverlappingPairs(btOverlapCallback arg0, btDispatcher dispatcher);

	public native Pointer removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher);

	public native void cleanOverlappingPair(@ByRef btBroadphasePair pair, btDispatcher dispatcher);

	public native btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native btBroadphasePair findPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native void cleanProxyFromPairs(btBroadphaseProxy proxy, btDispatcher dispatcher);

	public native void removeOverlappingPairsContainingProxy(btBroadphaseProxy proxy, btDispatcher dispatcher);

	public native @Cast("bool") boolean needsBroadphaseCollision(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native @Cast("btBroadphasePairArray*") @ByRef BT_QUANTIZED_BVH_NODE_Array getOverlappingPairArray();

	public native btBroadphasePair getOverlappingPairArrayPtr();

	public native int getNumOverlappingPairs();

	public native btOverlapFilterCallback getOverlapFilterCallback();

	public native void setOverlapFilterCallback(btOverlapFilterCallback callback);

	public native @Cast("bool") boolean hasDeferredRemoval();

	public native void setInternalGhostPairCallback(btOverlappingPairCallback ghostPairCallback);

	public native void sortOverlappingPairs(btDispatcher dispatcher);
}
