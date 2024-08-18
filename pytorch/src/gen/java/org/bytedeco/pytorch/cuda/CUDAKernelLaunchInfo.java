// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.cuda.functions.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


/** Use to hold info about kernel launches so that we can run kernels
 *  asynchronously and still associate launches with device-side
 *  assertion failures */
@Namespace("c10::cuda") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAKernelLaunchInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDAKernelLaunchInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDAKernelLaunchInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAKernelLaunchInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDAKernelLaunchInfo position(long position) {
        return (CUDAKernelLaunchInfo)super.position(position);
    }
    @Override public CUDAKernelLaunchInfo getPointer(long i) {
        return new CUDAKernelLaunchInfo((Pointer)this).offsetAddress(i);
    }

  /** Filename of the code where the kernel was launched from */
  public native @Cast("const char*") BytePointer launch_filename(); public native CUDAKernelLaunchInfo launch_filename(BytePointer setter);
  /** Function from which the kernel was launched */
  public native @Cast("const char*") BytePointer launch_function(); public native CUDAKernelLaunchInfo launch_function(BytePointer setter);
  /** Line number of where the code was launched from */
  public native @Cast("uint32_t") int launch_linenum(); public native CUDAKernelLaunchInfo launch_linenum(int setter);
  /** Backtrace of where the kernel was launched from, only populated if
   *  CUDAKernelLaunchRegistry::gather_launch_stacktrace is True */
  public native @StdString BytePointer launch_stacktrace(); public native CUDAKernelLaunchInfo launch_stacktrace(BytePointer setter);
  /** Kernel that was launched */
  public native @Cast("const char*") BytePointer kernel_name(); public native CUDAKernelLaunchInfo kernel_name(BytePointer setter);
  /** Device the kernel was launched on */
  public native int device(); public native CUDAKernelLaunchInfo device(int setter);
  /** Stream the kernel was launched on */
  public native int stream(); public native CUDAKernelLaunchInfo stream(int setter);
  /** A number that uniquely identifies the kernel launch */
  public native @Cast("uint64_t") long generation_number(); public native CUDAKernelLaunchInfo generation_number(long setter);
}
