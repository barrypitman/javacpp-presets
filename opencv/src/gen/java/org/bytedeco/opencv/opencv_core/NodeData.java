// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::instr") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class NodeData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NodeData position(long position) {
        return (NodeData)super.position(position);
    }
    @Override public NodeData getPointer(long i) {
        return new NodeData((Pointer)this).offsetAddress(i);
    }

    public NodeData(@Cast("const char*") BytePointer funName/*=0*/, @Cast("const char*") BytePointer fileName/*=NULL*/, int lineNum/*=0*/, Pointer retAddress/*=NULL*/, @Cast("bool") boolean alwaysExpand/*=false*/, @Cast("cv::instr::TYPE") int instrType/*=cv::instr::TYPE_GENERAL*/, @Cast("cv::instr::IMPL") int implType/*=cv::instr::IMPL_PLAIN*/) { super((Pointer)null); allocate(funName, fileName, lineNum, retAddress, alwaysExpand, instrType, implType); }
    private native void allocate(@Cast("const char*") BytePointer funName/*=0*/, @Cast("const char*") BytePointer fileName/*=NULL*/, int lineNum/*=0*/, Pointer retAddress/*=NULL*/, @Cast("bool") boolean alwaysExpand/*=false*/, @Cast("cv::instr::TYPE") int instrType/*=cv::instr::TYPE_GENERAL*/, @Cast("cv::instr::IMPL") int implType/*=cv::instr::IMPL_PLAIN*/);
    public NodeData() { super((Pointer)null); allocate(); }
    private native void allocate();
    public NodeData(String funName/*=0*/, String fileName/*=NULL*/, int lineNum/*=0*/, Pointer retAddress/*=NULL*/, @Cast("bool") boolean alwaysExpand/*=false*/, @Cast("cv::instr::TYPE") int instrType/*=cv::instr::TYPE_GENERAL*/, @Cast("cv::instr::IMPL") int implType/*=cv::instr::IMPL_PLAIN*/) { super((Pointer)null); allocate(funName, fileName, lineNum, retAddress, alwaysExpand, instrType, implType); }
    private native void allocate(String funName/*=0*/, String fileName/*=NULL*/, int lineNum/*=0*/, Pointer retAddress/*=NULL*/, @Cast("bool") boolean alwaysExpand/*=false*/, @Cast("cv::instr::TYPE") int instrType/*=cv::instr::TYPE_GENERAL*/, @Cast("cv::instr::IMPL") int implType/*=cv::instr::IMPL_PLAIN*/);
    public NodeData(@ByRef NodeData ref) { super((Pointer)null); allocate(ref); }
    private native void allocate(@ByRef NodeData ref);
    public native @ByRef @Name("operator =") NodeData put(@Const @ByRef NodeData arg0);

    public native @Str BytePointer m_funName(); public native NodeData m_funName(BytePointer setter);
    public native @Cast("cv::instr::TYPE") int m_instrType(); public native NodeData m_instrType(int setter);
    public native @Cast("cv::instr::IMPL") int m_implType(); public native NodeData m_implType(int setter);
    public native @Cast("const char*") BytePointer m_fileName(); public native NodeData m_fileName(BytePointer setter);
    public native int m_lineNum(); public native NodeData m_lineNum(int setter);
    public native Pointer m_retAddress(); public native NodeData m_retAddress(Pointer setter);
    public native @Cast("bool") boolean m_alwaysExpand(); public native NodeData m_alwaysExpand(boolean setter);
    public native @Cast("bool") boolean m_funError(); public native NodeData m_funError(boolean setter);

    public native int m_counter(); public native NodeData m_counter(int setter);
    public native @Cast("uint64") int m_ticksTotal(); public native NodeData m_ticksTotal(int setter);
    @MemberGetter public native @ByRef NodeDataTlsData m_tls();
    public native int m_threads(); public native NodeData m_threads(int setter);

    // No synchronization
    public native double getTotalMs();
    public native double getMeanMs();
}
