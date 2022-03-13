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

@Name("std::vector<torch::data::Example<> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExampleVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExampleVector(Pointer p) { super(p); }
    public ExampleVector(Example value) { this(1); put(0, value); }
    public ExampleVector(Example ... array) { this(array.length); put(array); }
    public ExampleVector()       { allocate();  }
    public ExampleVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ExampleVector put(@ByRef ExampleVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Example get(@Cast("size_t") long i);
    public native ExampleVector put(@Cast("size_t") long i, Example value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Example value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Example get();
    }

    public Example[] get() {
        Example[] array = new Example[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Example pop_back() {
        long size = size();
        Example value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ExampleVector push_back(Example value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ExampleVector put(Example value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ExampleVector put(Example ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

