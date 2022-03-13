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


/** A {@code Sampler} that returns random indices. */
@Namespace("torch::data::samplers") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RandomSampler extends Sampler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomSampler(Pointer p) { super(p); }

  /** Constructs a {@code RandomSampler} with a size and dtype for the stored indices.
   * 
   *  The constructor will eagerly allocate all required indices, which is the
   *  sequence {@code 0 ... size - 1}. {@code index_dtype} is the data type of the stored
   *  indices. You can change it to influence memory usage. */
  public RandomSampler(
        @Cast("int64_t") long size,
        ScalarType index_dtype/*=torch::kInt64*/) { super((Pointer)null); allocate(size, index_dtype); }
  private native void allocate(
        @Cast("int64_t") long size,
        ScalarType index_dtype/*=torch::kInt64*/);
  public RandomSampler(
        @Cast("int64_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(
        @Cast("int64_t") long size);

  /** Resets the {@code RandomSampler} to a new set of indices. */
  public native void reset(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional new_size);
  public native void reset();

  /** Returns the next batch of indices. */
  public native @ByVal SizeTVectorOptional next(@Cast("size_t") long batch_size);

  /** Serializes the {@code RandomSampler} to the {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the {@code RandomSampler} from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);

  /** Returns the current index of the {@code RandomSampler}. */
  public native @Cast("size_t") @NoException(true) long index();
}
