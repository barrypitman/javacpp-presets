// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief Abstract Node
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Node extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Node(Pointer p) { super(p); }

    /** Node identificator. Unique for every node on a single Pipeline */

    // fwd declare classes

    @MemberGetter public native @ByRef StringNodeOutputMap outputRefs();
    @MemberGetter public native @ByRef StringNodeInputMap inputRefs();

    @MemberGetter public native @ByRef StringNodeOutputMapMap outputMapRefs();
    @MemberGetter public native @ByRef StringNodeInputMapMap inputMapRefs();

    // helpers for setting refs
    public native void setOutputRefs(Output outRef);
    public native void setInputRefs(Input inRef);
    public native void setOutputMapRefs(OutputMap outMapRef);
    public native void setInputMapRefs(InputMap inMapRef);

    @NoOffset public static class DatatypeHierarchy extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DatatypeHierarchy(Pointer p) { super(p); }
    
        public DatatypeHierarchy(DatatypeEnum d, @Cast("bool") boolean c) { super((Pointer)null); allocate(d, c); }
        private native void allocate(DatatypeEnum d, @Cast("bool") boolean c);
        public DatatypeHierarchy(@Cast("dai::DatatypeEnum") int d, @Cast("bool") boolean c) { super((Pointer)null); allocate(d, c); }
        private native void allocate(@Cast("dai::DatatypeEnum") int d, @Cast("bool") boolean c);
        @MemberGetter public native DatatypeEnum datatype();
        @MemberGetter public native @Cast("bool") boolean descendants();
    }

    @NoOffset public static class Output extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Output(Pointer p) { super(p); }
    
        public enum Type { MSender(0), SSender(1);

            public final int value;
            private Type(int v) { this.value = v; }
            private Type(Type e) { this.value = e.value; }
            public Type intern() { for (Type e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        @MemberGetter public native @StdString BytePointer group();
        @MemberGetter public native @StdString BytePointer name();
        @MemberGetter public native Type type();
        // Which types and do descendants count as well?
        @MemberGetter public native @StdVector DatatypeHierarchy possibleDatatypes();
        public Output(@ByRef Node par, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types);
        public Output(@ByRef Node par, @StdString String n, @Cast("dai::Node::Output::Type") int t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString String n, @Cast("dai::Node::Output::Type") int t, @StdVector DatatypeHierarchy types);
        public Output(@ByRef Node par, @StdString BytePointer group, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, group, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer group, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types);
        public Output(@ByRef Node par, @StdString String group, @StdString String n, @Cast("dai::Node::Output::Type") int t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, group, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString String group, @StdString String n, @Cast("dai::Node::Output::Type") int t, @StdVector DatatypeHierarchy types);

        public native @ByRef Node getParent();

        /** Output to string representation */
        public native @StdString String toString();

        /**
         * Check if this output and given input are on the same pipeline.
         * @see canConnect for checking if connection is possible
         * @return True if output and input are on the same pipeline
         */
        public native @Cast("bool") boolean isSamePipeline(@Const @ByRef Input in);

        /**
         * Check if connection is possible
         * @param in Input to connect to
         * @return True if connection is possible, false otherwise
         */
        public native @Cast("bool") boolean canConnect(@Const @ByRef Input in);

        /**
         * Retrieve all connections from this output
         * @return Vector of connections
         */
        public native @StdVector Connection getConnections();

        /**
         * Link current output to input.
         *
         * Throws an error if this output cannot be linked to given input,
         * or if they are already linked
         *
         * @param in Input to link to
         */
        public native void link(@Const @ByRef Input in);

        /**
         * Unlink a previously linked connection
         *
         * Throws an error if not linked.
         *
         * @param in Input from which to unlink from
         */
        public native void unlink(@Const @ByRef Input in);
    }

    /**
     * Output map which keeps track of extra outputs assigned to a node
     * Extends std::unordered_map<std::string, dai::Node::Output>
     */
    @NoOffset public static class OutputMap extends StringNodeOutputMap {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public OutputMap(Pointer p) { super(p); }
    
        @MemberGetter public native @StdString BytePointer name();
        public OutputMap(@StdString BytePointer name, @ByVal Output defaultOutput) { super((Pointer)null); allocate(name, defaultOutput); }
        private native void allocate(@StdString BytePointer name, @ByVal Output defaultOutput);
        public OutputMap(@StdString String name, @ByVal Output defaultOutput) { super((Pointer)null); allocate(name, defaultOutput); }
        private native void allocate(@StdString String name, @ByVal Output defaultOutput);
        public OutputMap(@ByVal Output defaultOutput) { super((Pointer)null); allocate(defaultOutput); }
        private native void allocate(@ByVal Output defaultOutput);
        /** Create or modify an input */
        public native @ByRef @Name("operator []") Output get(@StdString BytePointer key);
        public native @ByRef @Name("operator []") Output get(@StdString String key);
    }

    @NoOffset public static class Input extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Input(Pointer p) { super(p); }
    
        public enum Type { SReceiver(0), MReceiver(1);

            public final int value;
            private Type(int v) { this.value = v; }
            private Type(Type e) { this.value = e.value; }
            public Type intern() { for (Type e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        @MemberGetter public native @StdString BytePointer group();
        @MemberGetter public native @StdString BytePointer name();
        @MemberGetter public native Type type();
        @MemberGetter public native @Cast("bool") boolean defaultBlocking();
        @MemberGetter public native int defaultQueueSize();
        @MemberGetter public native @ByRef BoolOptional blocking();
        @MemberGetter public native @ByRef @Cast("tl::optional<int>*") IntOptional queueSize();
        // Options - more information about the input
        @MemberGetter public native @ByRef BoolOptional waitForMessage();
        @MemberGetter public native @Cast("bool") boolean defaultWaitForMessage();
        @MemberGetter public native @StdVector DatatypeHierarchy possibleDatatypes();

        /** Constructs Input with default blocking and queueSize options */
        public Input(@ByRef Node par, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer n, Type t, @StdVector DatatypeHierarchy types);
        public Input(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, types); }
        private native void allocate(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @StdVector DatatypeHierarchy types);

        /** Constructs Input with specified blocking and queueSize options */
        public Input(@ByRef Node par, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, blocking, queueSize, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @StdVector DatatypeHierarchy types);
        public Input(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, blocking, queueSize, types); }
        private native void allocate(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @StdVector DatatypeHierarchy types);

        /** Constructs Input with specified blocking and queueSize as well as additional options */
        public Input(@ByRef Node par, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, blocking, queueSize, waitForMessage, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types);
        public Input(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, n, t, blocking, queueSize, waitForMessage, types); }
        private native void allocate(@ByRef Node par, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types);

        /** Constructs Input with specified blocking and queueSize as well as additional options */
        public Input(@ByRef Node par, @StdString BytePointer group, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, group, n, t, blocking, queueSize, waitForMessage, types); }
        private native void allocate(@ByRef Node par, @StdString BytePointer group, @StdString BytePointer n, Type t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types);
        public Input(@ByRef Node par, @StdString String group, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types) { super((Pointer)null); allocate(par, group, n, t, blocking, queueSize, waitForMessage, types); }
        private native void allocate(@ByRef Node par, @StdString String group, @StdString String n, @Cast("dai::Node::Input::Type") int t, @Cast("bool") boolean blocking, int queueSize, @Cast("bool") boolean waitForMessage, @StdVector DatatypeHierarchy types);

        public native @ByRef Node getParent();

        /** Input to string representation */
        public native @StdString String toString();

        /**
         * Overrides default input queue behavior.
         * @param blocking True blocking, false overwriting
         */
        public native void setBlocking(@Cast("bool") boolean blocking);

        /**
         * Get input queue behavior
         * @return True blocking, false overwriting
         */
        public native @Cast("bool") boolean getBlocking();

        /**
         * Overrides default input queue size.
         * If queue size fills up, behavior depends on {@code blocking} attribute
         * @param size Maximum input queue size
         */
        public native void setQueueSize(int size);

        /**
         * Get input queue size.
         * @return Maximum input queue size
         */
        public native int getQueueSize();

        /**
         * Overrides default wait for message behavior.
         * Applicable for nodes with multiple inputs.
         * Specifies behavior whether to wait for this input when a Node processes certain data or not.
         * @param waitForMessage Whether to wait for message to arrive to this input or not
         */
        public native void setWaitForMessage(@Cast("bool") boolean waitForMessage);

        /**
         * Get behavior whether to wait for this input when a Node processes certain data or not
         * @return Whether to wait for message to arrive to this input or not
         */
        public native @Cast("bool") boolean getWaitForMessage();

        /**
         * Equaivalent to setWaitForMessage but with inverted logic.
         */
        public native void setReusePreviousMessage(@Cast("bool") boolean reusePreviousMessage);

        /**
         * Equaivalent to getWaitForMessage but with inverted logic.
         */
        public native @Cast("bool") boolean getReusePreviousMessage();
    }

    /**
     * Input map which keeps track of inputs assigned to a node
     * Extends std::unordered_map<std::string, dai::Node::Input>
     */
    @NoOffset public static class InputMap extends StringNodeInputMap {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public InputMap(Pointer p) { super(p); }
    
        @MemberGetter public native @StdString BytePointer name();
        public InputMap(@ByVal Input defaultInput) { super((Pointer)null); allocate(defaultInput); }
        private native void allocate(@ByVal Input defaultInput);
        public InputMap(@StdString BytePointer name, @ByVal Input defaultInput) { super((Pointer)null); allocate(name, defaultInput); }
        private native void allocate(@StdString BytePointer name, @ByVal Input defaultInput);
        public InputMap(@StdString String name, @ByVal Input defaultInput) { super((Pointer)null); allocate(name, defaultInput); }
        private native void allocate(@StdString String name, @ByVal Input defaultInput);
        /** Create or modify an input */
        public native @ByRef @Name("operator []") Input get(@StdString BytePointer key);
        public native @ByRef @Name("operator []") Input get(@StdString String key);
    }

    // when Pipeline tries to serialize and construct on remote, it will check if all connected nodes are on same pipeline
    /** Id of node */
    @MemberGetter public native @Cast("const dai::Node::Id") long id();

    @MemberGetter public native @ByRef AssetManager assetManager();

    public native @ByRef DaiProperties getProperties();
    public native @ByVal VersionOptional getRequiredOpenVINOVersion();
    @MemberGetter public native @ByRef @Cast("dai::copyable_unique_ptr<dai::Properties>*") Pointer propertiesHolder();
    // Underlying properties
    @MemberGetter public native @ByRef DaiProperties properties();

    // access
    public native @ByVal Pipeline getParentPipeline();

    /** Deep copy the node */
    public native @UniquePtr Node clone();

    /** Retrieves nodes name */
    public native @Cast("const char*") BytePointer getName();

    /** Retrieves all nodes outputs */
    public native @StdVector Output getOutputs();

    /** Retrieves all nodes inputs */
    public native @StdVector Input getInputs();

    /** Retrieves reference to node outputs */
    public native @Cast("dai::Node::Output**") @StdVector PointerPointer getOutputRefs();

    /** Retrieves reference to node outputs */

    /** Retrieves reference to node inputs */
    public native @Cast("dai::Node::Input**") @StdVector PointerPointer getInputRefs();

    /** Retrieves reference to node inputs */

    /** Connection between an Input and Output */
    @NoOffset public static class Connection extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Connection(Pointer p) { super(p); }
    
        public Connection(@ByVal Output out, @ByVal Input in) { super((Pointer)null); allocate(out, in); }
        private native void allocate(@ByVal Output out, @ByVal Input in);
        @MemberGetter public native @Cast("dai::Node::Id") long outputId();
        @MemberGetter public native @StdString BytePointer outputName();
        @MemberGetter public native @StdString BytePointer outputGroup();
        @MemberGetter public native @Cast("dai::Node::Id") long inputId();
        @MemberGetter public native @StdString BytePointer inputName();
        @MemberGetter public native @StdString BytePointer inputGroup();
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Connection rhs);
    }

    /** Get node AssetManager as a const reference */

    /** Get node AssetManager as a reference */
    public native @ByRef AssetManager getAssetManager();
}
