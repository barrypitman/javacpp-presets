// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

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


// Represents a name of the form "foo.bar.baz"
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class QualifiedName extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualifiedName(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QualifiedName(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QualifiedName position(long position) {
        return (QualifiedName)super.position(position);
    }
    @Override public QualifiedName getPointer(long i) {
        return new QualifiedName((Pointer)this).offsetAddress(i);
    }

  public QualifiedName() { super((Pointer)null); allocate(); }
  private native void allocate();

  // `name` can be a dotted string, like "foo.bar.baz", or just a bare name.
  /* implicit */ public QualifiedName(@StdString BytePointer name) { super((Pointer)null); allocate(name); }
private native void allocate(@StdString BytePointer name);
public QualifiedName(@StdString String name) { super((Pointer)null); allocate(name); }
private native void allocate(@StdString String name);

  public QualifiedName(@ByVal StringVector atoms) { super((Pointer)null); allocate(atoms); }
  private native void allocate(@ByVal StringVector atoms);
  // Unnecessary copy. Ideally we'd use something like std::string_view.
  /* implicit */

  // `name` must be a bare name (no dots!)
  public QualifiedName(@Const @ByRef QualifiedName prefix, @StdString BytePointer name) { super((Pointer)null); allocate(prefix, name); }
  private native void allocate(@Const @ByRef QualifiedName prefix, @StdString BytePointer name);
  public QualifiedName(@Const @ByRef QualifiedName prefix, @StdString String name) { super((Pointer)null); allocate(prefix, name); }
  private native void allocate(@Const @ByRef QualifiedName prefix, @StdString String name);

  // Is `this` a prefix of `other`?
  // For example, "foo.bar" is a prefix of "foo.bar.baz"
  public native @Cast("bool") boolean isPrefixOf(@Const @ByRef QualifiedName other);

  // The fully qualified name, like "foo.bar.baz"
  public native @StdString BytePointer qualifiedName();

  // The leading qualifier, like "foo.bar"
  public native @StdString BytePointer prefix();

  // The base name, like "baz"
  public native @StdString BytePointer name();

  public native @Const @ByRef StringVector atoms();

  

  
}
