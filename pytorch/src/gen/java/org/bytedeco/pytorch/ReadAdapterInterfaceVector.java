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

@Name("std::vector<std::shared_ptr<caffe2::serialize::ReadAdapterInterface> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReadAdapterInterfaceVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadAdapterInterfaceVector(Pointer p) { super(p); }
    public ReadAdapterInterfaceVector(ReadAdapterInterface value) { this(1); put(0, value); }
    public ReadAdapterInterfaceVector(ReadAdapterInterface ... array) { this(array.length); put(array); }
    public ReadAdapterInterfaceVector()       { allocate();  }
    public ReadAdapterInterfaceVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ReadAdapterInterfaceVector put(@ByRef ReadAdapterInterfaceVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public ReadAdapterInterface front() { return get(0); }
    public ReadAdapterInterface back() { return get(size() - 1); }
    @Index(function = "at") public native @SharedPtr("caffe2::serialize::ReadAdapterInterface") ReadAdapterInterface get(@Cast("size_t") long i);
    public native ReadAdapterInterfaceVector put(@Cast("size_t") long i, ReadAdapterInterface value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr("caffe2::serialize::ReadAdapterInterface") ReadAdapterInterface value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @SharedPtr("caffe2::serialize::ReadAdapterInterface") @Const ReadAdapterInterface get();
    }

    public ReadAdapterInterface[] get() {
        ReadAdapterInterface[] array = new ReadAdapterInterface[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public ReadAdapterInterface pop_back() {
        long size = size();
        ReadAdapterInterface value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ReadAdapterInterfaceVector push_back(ReadAdapterInterface value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ReadAdapterInterfaceVector put(ReadAdapterInterface value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ReadAdapterInterfaceVector put(ReadAdapterInterface ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

