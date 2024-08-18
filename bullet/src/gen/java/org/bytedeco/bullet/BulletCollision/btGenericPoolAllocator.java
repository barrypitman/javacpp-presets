// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Generic Allocator with pools
/**
General purpose Allocator which can create Memory Pools dynamiacally as needed.
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGenericPoolAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGenericPoolAllocator(Pointer p) { super(p); }

	public native btGenericMemoryPool m_pools(int i); public native btGenericPoolAllocator m_pools(int i, btGenericMemoryPool setter);
	@MemberGetter public native @Cast("btGenericMemoryPool**") PointerPointer m_pools();
	public native @Cast("size_t") long m_pool_count(); public native btGenericPoolAllocator m_pool_count(long setter);

	public native @Cast("size_t") long get_pool_capacity();
	public btGenericPoolAllocator(@Cast("size_t") long pool_element_size, @Cast("size_t") long pool_element_count) { super((Pointer)null); allocate(pool_element_size, pool_element_count); }
	private native void allocate(@Cast("size_t") long pool_element_size, @Cast("size_t") long pool_element_count);

	/** Allocates memory in pool
	/**
	@param size_bytes size in bytes of the buffer
	*/
	public native @Name("allocate") Pointer _allocate(@Cast("size_t") long size_bytes);

	public native @Cast("bool") boolean freeMemory(Pointer pointer);
}
