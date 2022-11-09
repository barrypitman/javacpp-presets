// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** RAII guard that sets a certain default device in its constructor, and
 *  changes it back to the device that was originally active upon destruction.
 * 
 *  The device is always reset to the one that was active at the time of
 *  construction of the guard. Even if you {@code set_device} after construction, the
 *  destructor will still reset the device to the one that was active at
 *  construction time.
 * 
 *  This device guard does NOT have an uninitialized state; it is guaranteed
 *  to reset a device on exit.  If you are in a situation where you *might*
 *  want to setup a guard (i.e., are looking for the moral equivalent
 *  of optional<DeviceGuard>), see OptionalDeviceGuard. */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeviceGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceGuard(Pointer p) { super(p); }

  /** No default constructor; see Note [Omitted default constructor from RAII] */
  

  /** Set the current device to the passed Device. */
  public DeviceGuard(@ByVal Device device) { super((Pointer)null); allocate(device); }
  private native void allocate(@ByVal Device device);

  /** This constructor is for testing only. */
  public DeviceGuard(
        @ByVal Device device,
        @Cast("const c10::impl::DeviceGuardImplInterface*") Pointer impl) { super((Pointer)null); allocate(device, impl); }
  private native void allocate(
        @ByVal Device device,
        @Cast("const c10::impl::DeviceGuardImplInterface*") Pointer impl);

  /** Copy is disallowed */
  
  

  /** Move is disallowed, as DeviceGuard does not have an uninitialized state,
   *  which is required for moves on types with nontrivial destructors. */
  
  

  /** Sets the device to the given one.  The specified device must be consistent
   *  with the device type originally specified during guard construction.
   * 
   *  TODO: The consistency check here is inconsistent with StreamGuard's
   *  behavior with set_stream, where a stream on a different device than
   *  the original one isn't an error; we just reset the stream and then
   *  switch devices. */
  public native void reset_device(@ByVal Device device);

  /** This method is for testing only. */
  public native void reset_device(
        @ByVal Device device,
        @Cast("const c10::impl::DeviceGuardImplInterface*") Pointer impl);

  /** Sets the device index to the given one.  The device type is inferred
   *  from the original device type the guard was constructed with. */
  public native void set_index(@Cast("c10::DeviceIndex") byte index);

  /** Returns the device that was set at the time the guard was constructed. */
  public native @ByVal Device original_device();

  /** Returns the most recent device that was set using this device guard,
   *  either from construction, or via set_device. */
  public native @ByVal Device current_device();
}
