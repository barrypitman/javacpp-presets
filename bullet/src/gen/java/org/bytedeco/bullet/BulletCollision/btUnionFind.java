// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**UnionFind calculates connected subsets */
// Implements weighted Quick Union with path compression
// optimization: could use short ints instead of ints (halving memory, would limit the number of rigid bodies to 64k, sounds reasonable)
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btUnionFind extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btUnionFind(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btUnionFind(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btUnionFind position(long position) {
        return (btUnionFind)super.position(position);
    }
    @Override public btUnionFind getPointer(long i) {
        return new btUnionFind((Pointer)this).offsetAddress(i);
    }

	public btUnionFind() { super((Pointer)null); allocate(); }
	private native void allocate();

	//this is a special operation, destroying the content of btUnionFind.
	//it sorts the elements, based on island id, in order to make it easy to iterate over islands
	public native void sortIslands();

	public native void reset(int N);

	public native int getNumElements();
	public native @Cast("bool") boolean isRoot(int x);

	public native @ByRef btElement getElement(int index);

	public native @Name("allocate") void _allocate(int N);
	public native void Free();

	public native int find(int p, int q);

	public native void unite(int p, int q);

	public native int find(int x);
}
