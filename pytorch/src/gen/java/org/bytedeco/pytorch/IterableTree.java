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


// Specialized Tree structure to matched against for special handling
// of builtin functions iterables expressions like zip(), enumerate(), etc.
// zip and enumerate can be modeled as a tree of SimpleValue/RangeValue:
//    zip(x, y) ->  (x, y) with tuple assignment to each loop target
//    enumerate(x) -> (range(0, math.inf, 1), x)
// So a complicated expression like zip(a, enumerate(b), range(0, 100)) will be:
// (a, (range(0, math.inf, 1), b), range(0, 100))
// We use those base iterables to fill in the loop information like
// max_trip_count and set the value table for loop targets
// Iterables can contain lists of SugaredValues like ModuleLists. If it
// does, then we emit it unrolled and require that all values it contains
// have a statically-determinable length.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IterableTree extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IterableTree(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IterableTree(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public IterableTree position(long position) {
        return (IterableTree)super.position(position);
    }
    @Override public IterableTree getPointer(long i) {
        return new IterableTree((Pointer)this).offsetAddress(i);
    }

  public IterableTree() { super((Pointer)null); allocate(); }
  private native void allocate();
  public IterableTree(
        @Const @ByRef SourceRange range,
        @ByRef GraphFunction m,
        @ByVal SugaredValueArrayRef children) { super((Pointer)null); allocate(range, m, children); }
  private native void allocate(
        @Const @ByRef SourceRange range,
        @ByRef GraphFunction m,
        @ByVal SugaredValueArrayRef children);
  public native @StdString BytePointer kind();

  public native @SharedPtr @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  public native void addChild(
        @Const @ByRef SourceRange range,
        @ByRef GraphFunction m,
        @Const @SharedPtr @ByRef SugaredValue iter_value);

  public native @ByVal SugaredValueVector get_children();

  // If this iterable contains a ModuleList or Tuple, then it will have a
  // static length, and we will emit it as an unrolled for loop.
  public native @ByVal LongOptional staticLen();

  // given a IterableTree node, get all the base iterables/leaves under the
  // IterableTree node. This enables
  // us to get all the basic SugaredValues that contains valid loop information
  // with len() and getitem()
  public native @ByVal SugaredValueVector get_base_iterables();

  public native Value len(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);
  public native @SharedPtr @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type_hint);
  public native @SharedPtr @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx);
}
