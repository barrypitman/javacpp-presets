// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

/*
 template <typename T>
 void setElem(btMatrixX<T>& mat, int row, int col, T val)
 {
 mat.setElem(row,col,val);
 }
 */

@Name("btMatrixX<float>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btMatrixXf extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMatrixXf(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMatrixXf(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btMatrixXf position(long position) {
        return (btMatrixXf)super.position(position);
    }
    @Override public btMatrixXf getPointer(long i) {
        return new btMatrixXf((Pointer)this).offsetAddress(i);
    }

	public native int m_rows(); public native btMatrixXf m_rows(int setter);
	public native int m_cols(); public native btMatrixXf m_cols(int setter);
	public native int m_operations(); public native btMatrixXf m_operations(int setter);
	public native int m_resizeOperations(); public native btMatrixXf m_resizeOperations(int setter);
	public native int m_setElemOperations(); public native btMatrixXf m_setElemOperations(int setter);

	public native @ByRef btFloatArray m_storage(); public native btMatrixXf m_storage(btFloatArray setter);
	public native @ByRef btIntArrayArray m_rowNonZeroElements1(); public native btMatrixXf m_rowNonZeroElements1(btIntArrayArray setter);

	public native FloatPointer getBufferPointerWritable();

	public native @Const FloatPointer getBufferPointer();
	public btMatrixXf() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btMatrixXf(int rows, int cols) { super((Pointer)null); allocate(rows, cols); }
	private native void allocate(int rows, int cols);
	public native void resize(int rows, int cols);
	public native int cols();
	public native int rows();
	/**we don't want this read/write operator(), because we cannot keep track of non-zero elements, use setElem instead */
	/*T& operator() (int row,int col)
	{
		return m_storage[col*m_rows+row];
	}
	*/

	public native void addElem(int row, int col, float val);

	public native void setElem(int row, int col, float val);

	public native void mulElem(int row, int col, float val);

	public native void copyLowerToUpperTriangle();

	public native @Name("operator ()") float apply(int row, int col);

	public native void setZero();

	public native void setIdentity();

	public native void printMatrix(@Cast("const char*") BytePointer msg);
	public native void printMatrix(String msg);

	public native void rowComputeNonZeroElements();
	public native @ByVal btMatrixXf transpose();

	public native @ByVal @Name("operator *") btMatrixXf multiply(@Const @ByRef btMatrixXf other);

	// this assumes the 4th and 8th rows of B and C are zero.
	public native void multiplyAdd2_p8r(@Cast("const btScalar*") DoublePointer B, @Cast("const btScalar*") DoublePointer C, int numRows, int numRowsOther, int row, int col);
	public native void multiplyAdd2_p8r(@Cast("const btScalar*") DoubleBuffer B, @Cast("const btScalar*") DoubleBuffer C, int numRows, int numRowsOther, int row, int col);
	public native void multiplyAdd2_p8r(@Cast("const btScalar*") double[] B, @Cast("const btScalar*") double[] C, int numRows, int numRowsOther, int row, int col);

	public native void multiply2_p8r(@Cast("const btScalar*") DoublePointer B, @Cast("const btScalar*") DoublePointer C, int numRows, int numRowsOther, int row, int col);
	public native void multiply2_p8r(@Cast("const btScalar*") DoubleBuffer B, @Cast("const btScalar*") DoubleBuffer C, int numRows, int numRowsOther, int row, int col);
	public native void multiply2_p8r(@Cast("const btScalar*") double[] B, @Cast("const btScalar*") double[] C, int numRows, int numRowsOther, int row, int col);

	public native void setSubMatrix(int rowstart, int colstart, int rowend, int colend, float value);

	public native void setSubMatrix(int rowstart, int colstart, int rowend, int colend, @Const @ByRef btMatrixXf block);
	public native void setSubMatrix(int rowstart, int colstart, int rowend, int colend, @Const @ByRef btVectorXf block);

	public native @ByVal btMatrixXf negative();
}
