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
 // namespace detail

@Name("torch::data::Iterator<torch::data::Example<> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExampleIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExampleIterator(Pointer p) { super(p); }

  // Type aliases to make the class recognized as a proper iterator.

  /** Increments the iterator.
   *  Only permitted for valid iterators (not past the end). */
  public native @ByRef @Name("operator ++") ExampleIterator increment();

  /** Returns the current batch.
   *  Only permitted for valid iterators (not past the end). */
  public native @ByRef @Name("operator *") Example multiply();

  /** Returns a pointer to the current batch.
   *  Only permitted for valid iterators (not past the end). */
  public native @Name("operator ->") Example access();

  /** Compares two iterators for equality. */
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ExampleIterator other);

  /** Compares two iterators for inequality. */
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef ExampleIterator other);
}
