// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

@Name("btAlignedObjectArray<btScalar>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btScalarArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btScalarArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btScalarArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btScalarArray position(long position) {
        return (btScalarArray)super.position(position);
    }
    @Override public btScalarArray getPointer(long i) {
        return new btScalarArray((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") btScalarArray put(@Const @ByRef btScalarArray other);
	public btScalarArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an btAlignedObjectArray, and use a (const) reference to the array instead. */
	public btScalarArray(@Const @ByRef btScalarArray otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef btScalarArray otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @Cast("btScalar*") @ByRef DoublePointer at(int n);

	public native @Cast("btScalar*") @ByRef @Name("operator []") DoublePointer get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @Cast("const btScalar") double fillData/*=btScalar()*/);
	public native void resize(int newsize);
	public native @Cast("btScalar*") @ByRef DoublePointer expandNonInitializing();

	public native @Cast("btScalar*") @ByRef DoublePointer expand(@Cast("const btScalar") double fillValue/*=btScalar()*/);
	public native @Cast("btScalar*") @ByRef DoublePointer expand();

	public native void push_back(@Cast("const btScalar") double _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	public native int findBinarySearch(@Cast("const btScalar") double key);

	public native int findLinearSearch(@Cast("const btScalar") double key);

	// If the key is not in the array, return -1 instead of 0,
	// since 0 also means the first element in the array.
	public native int findLinearSearch2(@Cast("const btScalar") double key);

	public native void removeAtIndex(int index);
	public native void remove(@Cast("const btScalar") double key);

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef btScalarArray otherArray);
}
