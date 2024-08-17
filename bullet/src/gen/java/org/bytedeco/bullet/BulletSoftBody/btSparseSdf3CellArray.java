// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;

@Name("btAlignedObjectArray<btSparseSdf<3>::Cell*>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSparseSdf3CellArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSparseSdf3CellArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSparseSdf3CellArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSparseSdf3CellArray position(long position) {
        return (btSparseSdf3CellArray)super.position(position);
    }
    @Override public btSparseSdf3CellArray getPointer(long i) {
        return new btSparseSdf3CellArray((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") btSparseSdf3CellArray put(@Const @ByRef btSparseSdf3CellArray other);
	public btSparseSdf3CellArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an btAlignedObjectArray, and use a (const) reference to the array instead. */
	public btSparseSdf3CellArray(@Const @ByRef btSparseSdf3CellArray otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef btSparseSdf3CellArray otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByPtrRef btSparseSdf3.Cell at(int n);

	public native @ByPtrRef @Name("operator []") btSparseSdf3.Cell get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @ByPtrRef btSparseSdf3.Cell fillData/*=btSparseSdf<3>::Cell*()*/);
	public native void resize(int newsize);
	public native @ByPtrRef btSparseSdf3.Cell expandNonInitializing();

	public native @ByPtrRef btSparseSdf3.Cell expand(@ByPtrRef btSparseSdf3.Cell fillValue/*=btSparseSdf<3>::Cell*()*/);
	public native @ByPtrRef btSparseSdf3.Cell expand();

	public native void push_back(@ByPtrRef btSparseSdf3.Cell _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	public native int findBinarySearch(@ByPtrRef btSparseSdf3.Cell key);

	public native int findLinearSearch(@ByPtrRef btSparseSdf3.Cell key);

	// If the key is not in the array, return -1 instead of 0,
	// since 0 also means the first element in the array.
	public native int findLinearSearch2(@ByPtrRef btSparseSdf3.Cell key);

	public native void removeAtIndex(int index);
	public native void remove(@ByPtrRef btSparseSdf3.Cell key);

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef btSparseSdf3CellArray otherArray);
}
