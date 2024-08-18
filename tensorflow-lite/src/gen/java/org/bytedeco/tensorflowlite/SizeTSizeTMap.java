// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Name("std::unordered_map<size_t,size_t>") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class SizeTSizeTMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeTSizeTMap(Pointer p) { super(p); }
    public SizeTSizeTMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SizeTSizeTMap put(@ByRef SizeTSizeTMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public long front() { return get(0); }
    public long back() { return get(size() - 1); }
    @Index public native @Cast("size_t") long get(@Cast("size_t") long i);
    public native SizeTSizeTMap put(@Cast("size_t") long i, long value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Cast("size_t") long first();
        public native @Name("operator *().second") @MemberGetter @Cast("size_t") long second();
    }
}

