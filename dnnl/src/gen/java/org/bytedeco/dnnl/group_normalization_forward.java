// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_batch_normalization
 <p>
 *  \addtogroup dnnl_api_group_normalization Group Normalization
 * 
 *  A primitive to perform group normalization.
 * 
 *  Both forward and backward propagation primitives support in-place
 *  operation; that is, src and dst can refer to the same memory for forward
 *  propagation, and diff_dst and diff_src can refer to the same memory for
 *  backward propagation.
 * 
 *  The group normalization primitives computations can be controlled by
 *  specifying different \ref dnnl::normalization_flags values. For example,
 *  group normalization forward propagation can be configured to either
 *  compute the mean and variance or take them as arguments. It can either
 *  perform scaling and shifting using gamma and beta parameters or not.
 * 
 *  @see \ref dev_guide_group_normalization in developer guide
 * 
 *  \{
 <p>
 *  Group normalization forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class group_normalization_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public group_normalization_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public group_normalization_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public group_normalization_forward position(long position) {
        return (group_normalization_forward)super.position(position);
    }
    @Override public group_normalization_forward getPointer(long i) {
        return new group_normalization_forward((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a group normalization forward propagation
     *  primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a group normalization forward
         *  propagation primitive.
         * 
         *  \note
         *      In-place operation is supported: the dst can refer to the same
         *      memory as the src.
         * 
         *  @param aengine Engine to use.
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training and
         *      #dnnl::prop_kind::forward_inference.
         *  @param src_desc Source memory descriptor.
         *  @param dst_desc Destination memory descriptor.
         *  @param groups Group normalization groups parameter.
         *  @param epsilon Group normalization epsilon parameter.
         *  @param flags Group normalization flags (\ref
         *      dnnl::normalization_flags).
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, normalization_flags flags,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, groups, epsilon, flags, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, normalization_flags flags,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, normalization_flags flags) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, groups, epsilon, flags); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, normalization_flags flags);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, groups, epsilon, flags, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, @Cast("dnnl::normalization_flags") int flags,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, @Cast("dnnl::normalization_flags") int flags) { super((Pointer)null); allocate(aengine, aprop_kind, src_desc, dst_desc, groups, epsilon, flags); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_desc, @Const @ByRef org.bytedeco.dnnl.memory.desc dst_desc,
                        @Cast("dnnl::memory::dim") long groups, float epsilon, @Cast("dnnl::normalization_flags") int flags);

        /** Constructs a primitive descriptor for a group normalization
         *  forward propagation primitive from a C API primitive descriptor
         *  that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a group normalization
         *      forward propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::workspace_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc workspace_desc();

        /** Returns memory descriptor for mean.
         *  @return Memory descriptor for mean. */
        public native @ByVal org.bytedeco.dnnl.memory.desc mean_desc();

        /** Returns memory descriptor for variance.
         *  @return Memory descriptor for variance. */
        public native @ByVal org.bytedeco.dnnl.memory.desc variance_desc();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();

        /** \copydoc dnnl::primitive_desc_base::get_group_size()const */
        public native @Cast("dnnl::memory::dim") long get_group_size();

        /** \copydoc dnnl::primitive_desc_base::get_epsilon()const */
        public native float get_epsilon();

        /** Returns normalization flags.
         *  @return Normalization flags. */
        public native normalization_flags get_flags();
    }

    /** Default constructor. Produces an empty object. */
    public group_normalization_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a group normalization forward propagation primitive.
     *  @param pd Primitive descriptor for a group normalization forward
     *      propagation primitive. */
    public group_normalization_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a group normalization forward propagation primitive from
     *      a cache blob.
     *  @param pd Primitive descriptor for a group normalization forward
     *      propagation primitive.
     *  @param cache_blob Cache blob. */
    public group_normalization_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public group_normalization_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public group_normalization_forward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
