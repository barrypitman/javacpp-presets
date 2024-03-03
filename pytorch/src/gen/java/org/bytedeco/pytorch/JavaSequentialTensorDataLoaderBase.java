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

@Name("torch::data::DataLoaderBase<JavaCPP_javacpp_0003a_0003aDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e,JavaCPP_javacpp_0003a_0003aDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e::BatchType,torch::data::samplers::SequentialSampler::BatchRequestType>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaSequentialTensorDataLoaderBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaSequentialTensorDataLoaderBase(Pointer p) { super(p); }


  /** Constructs a new DataLoader from a {@code dataset} to sample from, {@code options}
   *  to configure the DataLoader with, and a {@code sampler} that specifies the
   *  sampling strategy. */

  // NOLINTNEXTLINE(bugprone-exception-escape)

  /** Returns an iterator into the DataLoader. The lifetime of the iterator is
   *  bound to the DataLoader. In C++ standards language, the category of the
   *  iterator is {@code OutputIterator}. See
   *  https://en.cppreference.com/w/cpp/named_req/OutputIterator for what this
   *  means. In short: you may increment the iterator and dereference it, but
   *  cannot go back, or step forward more than one position at a time. When the
   *  DataLoader is exhausted, it will compare equal with the special
   *  "sentinel" iterator returned by {@code DataLoader::end()}. Most of the time, you
   *  should only use range-for loops to loop over the DataLoader, but
   *  standard algorithms like {@code std::copy(dataloader.begin(), dataloader.end(),
   *  output_iterator)}  are supported too. */
  public native @ByVal TensorExampleVectorIterator begin();

  /** Returns a special "sentinel" iterator that compares equal with a
   *  non-sentinel iterator once the DataLoader is exhausted. */
  public native @ByVal TensorExampleVectorIterator end();

  /** Joins the DataLoader's worker threads and drains internal queues.
   *  This function may only be invoked from the main thread (in which the
   *  DataLoader lives). */
  public native void join();

  /** Returns the options with which the DataLoader was configured. */
  public native @Const @ByRef @NoException(true) FullDataLoaderOptions options();
}
