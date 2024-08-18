// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// clang-format off

/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexHullShapeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btConvexHullShapeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConvexHullShapeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexHullShapeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btConvexHullShapeData position(long position) {
        return (btConvexHullShapeData)super.position(position);
    }
    @Override public btConvexHullShapeData getPointer(long i) {
        return new btConvexHullShapeData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btConvexInternalShapeData m_convexInternalShapeData(); public native btConvexHullShapeData m_convexInternalShapeData(btConvexInternalShapeData setter);

	public native btVector3FloatData m_unscaledPointsFloatPtr(); public native btConvexHullShapeData m_unscaledPointsFloatPtr(btVector3FloatData setter);
	public native btVector3DoubleData m_unscaledPointsDoublePtr(); public native btConvexHullShapeData m_unscaledPointsDoublePtr(btVector3DoubleData setter);

	public native int m_numUnscaledPoints(); public native btConvexHullShapeData m_numUnscaledPoints(int setter);
	public native @Cast("char") byte m_padding3(int i); public native btConvexHullShapeData m_padding3(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding3();

}
