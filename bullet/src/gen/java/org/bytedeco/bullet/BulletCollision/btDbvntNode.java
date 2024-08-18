// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/* btDbv(normal)tNode                */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDbvntNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDbvntNode(Pointer p) { super(p); }

    public native @ByRef @Cast("btDbvtVolume*") btDbvtAabbMm volume(); public native btDbvntNode volume(btDbvtAabbMm setter);
    public native @ByRef btVector3 normal(); public native btDbvntNode normal(btVector3 setter);
    public native @Cast("btScalar") double angle(); public native btDbvntNode angle(double setter);
    public native @Cast("bool") boolean isleaf();
    public native @Cast("bool") boolean isinternal();
    public native btDbvntNode childs(int i); public native btDbvntNode childs(int i, btDbvntNode setter);
    @MemberGetter public native @Cast("btDbvntNode**") PointerPointer childs();
    public native Pointer data(); public native btDbvntNode data(Pointer setter);

    public btDbvntNode(@Const btDbvtNode n) { super((Pointer)null); allocate(n); }
    private native void allocate(@Const btDbvtNode n);
}
