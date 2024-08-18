// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_INPUT_RESOURCE_OPENGL_TEX
 * NV_ENC_REGISTER_RESOURCE::resourceToRegister must be a pointer to a variable of this type,
 * when NV_ENC_REGISTER_RESOURCE::resourceType is NV_ENC_INPUT_RESOURCE_TYPE_OPENGL_TEX
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_INPUT_RESOURCE_OPENGL_TEX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_INPUT_RESOURCE_OPENGL_TEX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_INPUT_RESOURCE_OPENGL_TEX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_INPUT_RESOURCE_OPENGL_TEX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_INPUT_RESOURCE_OPENGL_TEX position(long position) {
        return (NV_ENC_INPUT_RESOURCE_OPENGL_TEX)super.position(position);
    }
    @Override public NV_ENC_INPUT_RESOURCE_OPENGL_TEX getPointer(long i) {
        return new NV_ENC_INPUT_RESOURCE_OPENGL_TEX((Pointer)this).offsetAddress(i);
    }

    /** [in]: The name of the texture to be used. */
    public native @Cast("uint32_t") int texture(); public native NV_ENC_INPUT_RESOURCE_OPENGL_TEX texture(int setter);
    /** [in]: Accepted values are GL_TEXTURE_RECTANGLE and GL_TEXTURE_2D. */
    public native @Cast("uint32_t") int target(); public native NV_ENC_INPUT_RESOURCE_OPENGL_TEX target(int setter);
}
