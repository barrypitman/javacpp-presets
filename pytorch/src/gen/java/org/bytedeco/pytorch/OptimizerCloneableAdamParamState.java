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


@Name("torch::optim::OptimizerCloneableParamState<torch::optim::AdamParamState>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableAdamParamState extends OptimizerParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableAdamParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableAdamParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableAdamParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableAdamParamState position(long position) {
        return (OptimizerCloneableAdamParamState)super.position(position);
    }
    @Override public OptimizerCloneableAdamParamState getPointer(long i) {
        return new OptimizerCloneableAdamParamState((Pointer)this).offsetAddress(i);
    }

}
