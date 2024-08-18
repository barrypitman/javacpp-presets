// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::vector<std::pair<TfLiteNode,TfLiteRegistration> >") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class RegistrationNodePairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegistrationNodePairVector(Pointer p) { super(p); }
    public RegistrationNodePairVector(TfLiteNode[] firstValue, TfLiteRegistration[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public RegistrationNodePairVector()       { allocate();  }
    public RegistrationNodePairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef RegistrationNodePairVector put(@ByRef @StdMove RegistrationNodePairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef TfLiteNode first(@Cast("size_t") long i); public native RegistrationNodePairVector first(@Cast("size_t") long i, TfLiteNode first);
    @Index(function = "at") public native @ByRef TfLiteRegistration second(@Cast("size_t") long i);  public native RegistrationNodePairVector second(@Cast("size_t") long i, TfLiteRegistration second);

    public RegistrationNodePairVector put(TfLiteNode[] firstValue, TfLiteRegistration[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

