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

@Name("torch::data::DataLoaderBase<torch::data::datasets::MapDataset<torch::data::datasets::MNIST,torch::data::transforms::Stack<torch::data::Example<> > >,torch::data::Example<>,std::vector<size_t> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MNISTRandomDataLoaderBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MNISTRandomDataLoaderBase(Pointer p) { super(p); }


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
  public native @ByVal ExampleIterator begin();

  /** Returns a special "sentinel" iterator that compares equal with a
   *  non-sentinel iterator once the DataLoader is exhausted. */
  public native @ByVal ExampleIterator end();

  /** Joins the DataLoader's worker threads and drains internal queues.
   *  This function may only be invoked from the main thread (in which the
   *  DataLoader lives). */
  public native void join();

  /** Returns the options with which the DataLoader was configured. */
  public native @Const @ByRef @NoException(true) FullDataLoaderOptions options();
}
