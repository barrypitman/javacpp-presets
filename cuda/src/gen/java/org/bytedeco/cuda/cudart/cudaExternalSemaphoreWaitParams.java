// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
* External semaphore wait parameters
*/
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreWaitParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreWaitParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreWaitParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreWaitParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreWaitParams position(long position) {
        return (cudaExternalSemaphoreWaitParams)super.position(position);
    }

        /**
        * Parameters for fence objects
        */
            /**
            * Value of fence to be waited on
            */
            @Name("params.fence.value") public native @Cast("unsigned long long") long params_fence_value(); public native cudaExternalSemaphoreWaitParams params_fence_value(long setter);
            /**
             * Pointer to NvSciSyncFence. Valid if ::cudaExternalSemaphoreHandleType
             * is of type ::cudaExternalSemaphoreHandleTypeNvSciSync.
             */
            @Name("params.nvSciSync.fence") public native Pointer params_nvSciSync_fence(); public native cudaExternalSemaphoreWaitParams params_nvSciSync_fence(Pointer setter);
            @Name("params.nvSciSync.reserved") public native @Cast("unsigned long long") long params_nvSciSync_reserved(); public native cudaExternalSemaphoreWaitParams params_nvSciSync_reserved(long setter);
        /**
         * Parameters for keyed mutex objects
         */
            /**
             * Value of key to acquire the mutex with
             */
            @Name("params.keyedMutex.key") public native @Cast("unsigned long long") long params_keyedMutex_key(); public native cudaExternalSemaphoreWaitParams params_keyedMutex_key(long setter);
            /**
             * Timeout in milliseconds to wait to acquire the mutex
             */
            @Name("params.keyedMutex.timeoutMs") public native @Cast("unsigned int") int params_keyedMutex_timeoutMs(); public native cudaExternalSemaphoreWaitParams params_keyedMutex_timeoutMs(int setter);
    /**
     * Only when ::cudaExternalSemaphoreSignalParams is used to
     * signal a ::cudaExternalSemaphore_t of type
     * ::cudaExternalSemaphoreHandleTypeNvSciSync, the valid flag is 
     * ::cudaExternalSemaphoreSignalSkipNvSciBufMemSync: which indicates
     * that while waiting for the ::cudaExternalSemaphore_t, no memory
     * synchronization operations should be performed for any external memory
     * object imported as ::cudaExternalMemoryHandleTypeNvSciBuf.
     * For all other types of ::cudaExternalSemaphore_t, flags must be zero.
     */
    public native @Cast("unsigned int") int flags(); public native cudaExternalSemaphoreWaitParams flags(int setter);
}
