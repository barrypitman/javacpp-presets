// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;

// #endif

// #ifndef B3_DBVT_USE_MEMMOVE
// #endif

// #ifndef B3_DBVT_ENABLE_BENCHMARK
// #endif

// #ifndef B3_DBVT_SELECT_IMPL
// #endif

// #ifndef B3_DBVT_MERGE_IMPL
// #endif

// #ifndef B3_DBVT_INT0_IMPL
// #endif

//
// Defaults volumes
//

/* b3DbvtAabbMm			*/
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3DbvtAabbMm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3DbvtAabbMm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3DbvtAabbMm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3DbvtAabbMm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3DbvtAabbMm position(long position) {
        return (b3DbvtAabbMm)super.position(position);
    }
    @Override public b3DbvtAabbMm getPointer(long i) {
        return new b3DbvtAabbMm((Pointer)this).offsetAddress(i);
    }

	public native @ByVal b3Vector3 Center();
	public native @ByVal b3Vector3 Lengths();
	public native @ByVal b3Vector3 Extents();
	public native @Const @ByRef b3Vector3 Mins();
	public native @Const @ByRef b3Vector3 Maxs();
	public static native @ByVal b3DbvtAabbMm FromCE(@Const @ByRef b3Vector3 c, @Const @ByRef b3Vector3 e);
	public static native @ByVal b3DbvtAabbMm FromCR(@Const @ByRef b3Vector3 c, @Cast("b3Scalar") float r);
	public static native @ByVal b3DbvtAabbMm FromMM(@Const @ByRef b3Vector3 mi, @Const @ByRef b3Vector3 mx);
	public static native @ByVal b3DbvtAabbMm FromPoints(@Const b3Vector3 pts, int n);
	public static native @ByVal b3DbvtAabbMm FromPoints(@Cast("const b3Vector3**") PointerPointer ppts, int n);
	public native void Expand(@Const @ByRef b3Vector3 e);
	public native void SignedExpand(@Const @ByRef b3Vector3 e);
	public native @Cast("bool") boolean Contain(@Const @ByRef b3DbvtAabbMm a);
	public native int Classify(@Const @ByRef b3Vector3 n, @Cast("b3Scalar") float o, int s);
	public native @Cast("b3Scalar") float ProjectMinimum(@Const @ByRef b3Vector3 v, @Cast("unsigned") int signs);
	

	

	
	
	
	

	public native @ByRef b3Vector3 tMins();
	public native @ByRef b3Vector3 tMaxs();
}
