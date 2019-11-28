// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvgraph;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvgraph.*;


/* Helper struct for Traversal parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvgraph.class)
public class nvgraphTraversalParameter_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvgraphTraversalParameter_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvgraphTraversalParameter_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphTraversalParameter_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvgraphTraversalParameter_t position(long position) {
        return (nvgraphTraversalParameter_t)super.position(position);
    }

	public native @Cast("size_t") long pad(int i); public native nvgraphTraversalParameter_t pad(int i, long setter);
	@MemberGetter public native @Cast("size_t*") SizeTPointer pad();
}
