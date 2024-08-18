// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief input split creates that allows reading
 *  of records from split of data,
 *  independent part that covers all the dataset
 *
 *  see InputSplit::Create for definition of record
 */
@Namespace("dmlc") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class InputSplit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputSplit(Pointer p) { super(p); }

  /** \brief a blob of memory region */
  public static class Blob extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Blob() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Blob(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Blob(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Blob position(long position) {
          return (Blob)super.position(position);
      }
      @Override public Blob getPointer(long i) {
          return new Blob((Pointer)this).offsetAddress(i);
      }
  
    /** \brief points to start of the memory region */
    public native Pointer dptr(); public native Blob dptr(Pointer setter);
    /** \brief size of the memory region */
    public native @Cast("size_t") long size(); public native Blob size(long setter);
  }
  /**
   * \brief hint the inputsplit how large the chunk size
   *  it should return when implementing NextChunk
   *  this is a hint so may not be enforced,
   *  but InputSplit will try adjust its internal buffer
   *  size to the hinted value
   */
  public native void HintChunkSize(@Cast("size_t") long arg0);
  /** \brief get the total size of the InputSplit */
  public native @Cast("size_t") long GetTotalSize();
  /** \brief reset the position of InputSplit to beginning */
  public native void BeforeFirst();
  /**
   * \brief get the next record, the returning value
   *   is valid until next call to NextRecord, NextChunk or NextBatch
   *   caller can modify the memory content of out_rec
   *
   *   For text, out_rec contains a single line
   *   For recordio, out_rec contains one record content(with header striped)
   *
   * @param out_rec used to store the result
   * @return true if we can successfully get next record
   *     false if we reached end of split
   * @see InputSplit::Create for definition of record
   */
  public native @Cast("bool") boolean NextRecord(Blob out_rec);
  /**
   * \brief get a chunk of memory that can contain multiple records,
   *  the caller needs to parse the content of the resulting chunk,
   *  for text file, out_chunk can contain data of multiple lines
   *  for recordio, out_chunk can contain multiple records(including headers)
   *
   *  This function ensures there won't be partial record in the chunk
   *  caller can modify the memory content of out_chunk,
   *  the memory is valid until next call to NextRecord, NextChunk or NextBatch
   *
   *  Usually NextRecord is sufficient, NextChunk can be used by some
   *  multi-threaded parsers to parse the input content
   *
   * @param out_chunk used to store the result
   * @return true if we can successfully get next record
   *     false if we reached end of split
   * @see InputSplit::Create for definition of record
   * @see RecordIOChunkReader to parse recordio content from out_chunk
   */
  public native @Cast("bool") boolean NextChunk(Blob out_chunk);
  /**
   * \brief get a chunk of memory that can contain multiple records,
   *  with hint for how many records is needed,
   *  the caller needs to parse the content of the resulting chunk,
   *  for text file, out_chunk can contain data of multiple lines
   *  for recordio, out_chunk can contain multiple records(including headers)
   *
   *  This function ensures there won't be partial record in the chunk
   *  caller can modify the memory content of out_chunk,
   *  the memory is valid until next call to NextRecord, NextChunk or NextBatch
   *
   *
   * @param out_chunk used to store the result
   * @return true if we can successfully get next record
   *     false if we reached end of split
   * @see InputSplit::Create for definition of record
   * @see RecordIOChunkReader to parse recordio content from out_chunk
   */
  public native @Cast("bool") boolean NextBatch(Blob out_chunk, @Cast("size_t") long arg1);
  /** \brief destructor*/
  /**
   * \brief reset the Input split to a certain part id,
   *  The InputSplit will be pointed to the head of the new specified segment.
   *  This feature may not be supported by every implementation of InputSplit.
   * @param part_index The part id of the new input.
   * @param num_parts The total number of parts.
   */
  public native void ResetPartition(@Cast("unsigned") int part_index, @Cast("unsigned") int num_parts);
  /**
   * \brief factory function:
   *  create input split given a uri
   * @param uri the uri of the input, can contain hdfs prefix
   * @param part_index the part id of current input
   * @param num_parts total number of splits
   * @param type type of record
   *   List of possible types: "text", "recordio", "indexed_recordio"
   *     - "text":
   *         text file, each line is treated as a record
   *         input split will split on '\n' or '\r'
   *     - "recordio":
   *         binary recordio file, see recordio.h
   *     - "indexed_recordio":
   *         binary recordio file with index, see recordio.h
   * @return a new input split
   * @see InputSplit::Type
   */
  
  /**
   * \brief factory function:
   *  create input split given a uri for input and index
   * @param uri the uri of the input, can contain hdfs prefix
   * @param index_uri the uri of the index, can contain hdfs prefix
   * @param part_index the part id of current input
   * @param num_parts total number of splits
   * @param type type of record
   *   List of possible types: "text", "recordio", "indexed_recordio"
   *     - "text":
   *         text file, each line is treated as a record
   *         input split will split on '\n' or '\r'
   *     - "recordio":
   *         binary recordio file, see recordio.h
   *     - "indexed_recordio":
   *         binary recordio file with index, see recordio.h
   * @param shuffle whether to shuffle the output from the InputSplit,
   *                supported only by "indexed_recordio" type.
   *                Defaults to "false"
   * @param seed random seed to use in conjunction with the "shuffle"
   *             option. Defaults to 0
   * @param batch_size a hint to InputSplit what is the intended number
   *                   of examples return per batch. Used only by
   *                   "indexed_recordio" type
   * @param recurse_directories whether to recursively traverse directories
   * @return a new input split
   * @see InputSplit::Type
   */
  
}
