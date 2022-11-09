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

/** The MNIST dataset. */
@Namespace("torch::data::datasets") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MNIST extends MNISTDataSet {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MNIST(Pointer p) { super(p); }

  /** The mode in which the dataset is loaded. */
  public enum Mode { kTrain(0), kTest(1);

      public final int value;
      private Mode(int v) { this.value = v; }
      private Mode(Mode e) { this.value = e.value; }
      public Mode intern() { for (Mode e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** Loads the MNIST dataset from the {@code root} path.
   * 
   *  The supplied {@code root} path should contain the *content* of the unzipped
   *  MNIST dataset, available from http://yann.lecun.com/exdb/mnist. */
  public MNIST(@StdString BytePointer root, Mode mode/*=torch::data::datasets::MNIST::Mode::kTrain*/) { super((Pointer)null); allocate(root, mode); }
  private native void allocate(@StdString BytePointer root, Mode mode/*=torch::data::datasets::MNIST::Mode::kTrain*/);
  public MNIST(@StdString BytePointer root) { super((Pointer)null); allocate(root); }
  private native void allocate(@StdString BytePointer root);
  public MNIST(@StdString String root, @Cast("torch::data::datasets::MNIST::Mode") int mode/*=torch::data::datasets::MNIST::Mode::kTrain*/) { super((Pointer)null); allocate(root, mode); }
  private native void allocate(@StdString String root, @Cast("torch::data::datasets::MNIST::Mode") int mode/*=torch::data::datasets::MNIST::Mode::kTrain*/);
  public MNIST(@StdString String root) { super((Pointer)null); allocate(root); }
  private native void allocate(@StdString String root);

  /** Returns the {@code Example} at the given {@code index}. */
  public native @ByVal Example get(@Cast("size_t") long index);

  /** Returns the size of the dataset. */
  public native @ByVal SizeTOptional size();

  /** Returns true if this is the training subset of MNIST. */
  // NOLINTNEXTLINE(bugprone-exception-escape)
  public native @Cast("bool") @NoException(true) boolean is_train();

  /** Returns all images stacked into a single tensor. */
  public native @Const @ByRef Tensor images();

  /** Returns all targets stacked into a single tensor. */
  public native @Const @ByRef Tensor targets();
}
