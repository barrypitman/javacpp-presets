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


/**
 * class Resolver
 *
 * Represents an "outer environment" in which we an look up names and return
 * a corresponding SugaredValue. This is used during compilation to resolve
 * references to names which are not defined internal to the graph.
 *
 * Example: PythonResolver looks at the enclosing Python scope for {@code name}.
 *
 * NOTE: When adding methods, keep this an abstract class (i.e. all new methods
 * should be purely virtual). Resist the urge to provide a default
 * implementation; you should explicitly think about how each resolver would
 * handle the method.
 */
@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Resolver extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Resolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Resolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Resolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Resolver position(long position) {
        return (Resolver)super.position(position);
    }
    @Override public Resolver getPointer(long i) {
        return new Resolver((Pointer)this).offsetAddress(i);
    }


  // Resolve a given name to a SugaredValue. This takes the method `m` that the
  // caller is currently constructing, since we may need to insert nodes into
  // the graph to create a value.
  public native @SharedPtr @ByVal SugaredValue resolveValue(
        @StdString BytePointer name,
        @ByRef GraphFunction m,
        @Const @ByRef SourceRange loc);
  public native @SharedPtr @ByVal SugaredValue resolveValue(
        @StdString String name,
        @ByRef GraphFunction m,
        @Const @ByRef SourceRange loc);

  // Resolve `name` to a TypePtr.
  public native @ByVal Type.TypePtr resolveType(@StdString BytePointer name, @Const @ByRef SourceRange loc);
  public native @ByVal Type.TypePtr resolveType(@StdString String name, @Const @ByRef SourceRange loc);
}
