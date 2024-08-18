// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MPSHooksInterface extends AcceleratorHooksInterface {
    static { Loader.load(); }
    /** Default native constructor. */
    public MPSHooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MPSHooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MPSHooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MPSHooksInterface position(long position) {
        return (MPSHooksInterface)super.position(position);
    }
    @Override public MPSHooksInterface getPointer(long i) {
        return new MPSHooksInterface((Pointer)this).offsetAddress(i);
    }

  // this fails the implementation if MPSHooks functions are called, but
  // MPS backend is not present.
//   #define FAIL_MPSHOOKS_FUNC(func)
//     TORCH_CHECK(false, "Cannot execute ", func, "() without MPS backend.");

  // Initialize the MPS library state
  public native void initMPS();
  public native @Cast("bool") boolean hasMPS();
  public native @Cast("bool") boolean isOnMacOSorNewer(@Cast("unsigned") int major/*=13*/, @Cast("unsigned") int minor/*=0*/);
  public native @Cast("bool") boolean isOnMacOSorNewer();
  public native @Const @ByRef Generator getDefaultMPSGenerator();
  public native Allocator getMPSDeviceAllocator();
  public native void deviceSynchronize();
  public native void commitStream();
  public native Pointer getCommandBuffer();
  public native Pointer getDispatchQueue();
  public native void emptyCache();
  public native @Cast("size_t") long getCurrentAllocatedMemory();
  public native @Cast("size_t") long getDriverAllocatedMemory();
  public native void setMemoryFraction(double arg0);
  public native void profilerStartTrace(@StdString BytePointer mode, @Cast("bool") boolean waitUntilCompleted);
  public native void profilerStartTrace(@StdString String mode, @Cast("bool") boolean waitUntilCompleted);
  public native void profilerStopTrace();
  public native @Cast("uint32_t") int acquireEvent(@Cast("bool") boolean enable_timing);
  public native void releaseEvent(@Cast("uint32_t") int event_id);
  public native void recordEvent(@Cast("uint32_t") int event_id);
  public native void waitForEvent(@Cast("uint32_t") int event_id);
  public native void synchronizeEvent(@Cast("uint32_t") int event_id);
  public native @Cast("bool") boolean queryEvent(@Cast("uint32_t") int event_id);
  public native double elapsedTimeOfEvents(@Cast("uint32_t") int start_event_id, @Cast("uint32_t") int end_event_id);
  public native @Cast("bool") boolean hasPrimaryContext(@Cast("c10::DeviceIndex") byte device_index);
//   #undef FAIL_MPSHOOKS_FUNC
}
