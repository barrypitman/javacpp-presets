// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**The btPoolAllocator class allows to efficiently allocate a large pool of objects, instead of dynamically allocating them separately. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btPoolAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPoolAllocator(Pointer p) { super(p); }

	public btPoolAllocator(int elemSize, int maxElements) { super((Pointer)null); allocate(elemSize, maxElements); }
	private native void allocate(int elemSize, int maxElements);

	public native int getFreeCount();

	public native int getUsedCount();

	public native int getMaxCount();

	public native @Name("allocate") Pointer _allocate(int size);

	public native @Cast("bool") boolean validPtr(Pointer ptr);

	public native void freeMemory(Pointer ptr);

	public native int getElementSize();

	public native @Cast("unsigned char*") BytePointer getPoolAddress();
}
