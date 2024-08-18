// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::vector<std::unique_ptr<tflite::Subgraph> >") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class SubgraphVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SubgraphVector(Pointer p) { super(p); }
    public SubgraphVector(@Cast({"", "std::unique_ptr<tflite::Subgraph>&&"}) Subgraph value) { this(1); put(0, value); }
    public SubgraphVector(@Cast({"", "std::unique_ptr<tflite::Subgraph>&&"}) Subgraph ... array) { this(array.length); put(array); }
    public SubgraphVector()       { allocate();  }
    public SubgraphVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef SubgraphVector put(@ByRef @StdMove SubgraphVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public Subgraph front() { return get(0); }
    public Subgraph back() { return get(size() - 1); }
    @Index(function = "at") public native @UniquePtr @Cast({"", "std::unique_ptr<tflite::Subgraph>&&"}) Subgraph get(@Cast("size_t") long i);
    public native SubgraphVector put(@Cast("size_t") long i, Subgraph value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @UniquePtr @Cast({"", "std::unique_ptr<tflite::Subgraph>&&"}) Subgraph value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @UniquePtr @Cast({"", "std::unique_ptr<tflite::Subgraph>&&"}) Subgraph get();
    }

    public Subgraph[] get() {
        Subgraph[] array = new Subgraph[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Subgraph pop_back() {
        long size = size();
        Subgraph value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public SubgraphVector push_back(Subgraph value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public SubgraphVector put(Subgraph value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public SubgraphVector put(Subgraph ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

