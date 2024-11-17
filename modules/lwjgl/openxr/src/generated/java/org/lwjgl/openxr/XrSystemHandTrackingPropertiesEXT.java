/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * System property for hand tracking.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrSystemHandTrackingPropertiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTracking#XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsHandTracking}, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemHandTrackingPropertiesEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsHandTracking};
 * }</code></pre>
 */
public class XrSystemHandTrackingPropertiesEXT extends Struct<XrSystemHandTrackingPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSHANDTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSHANDTRACKING = layout.offsetof(2);
    }

    protected XrSystemHandTrackingPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemHandTrackingPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemHandTrackingPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrSystemHandTrackingPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHandTrackingPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32}, indicating if current system is capable of hand tracking input. */
    @NativeType("XrBool32")
    public boolean supportsHandTracking() { return nsupportsHandTracking(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemHandTrackingPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTracking#XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT} value to the {@link #type} field. */
    public XrSystemHandTrackingPropertiesEXT type$Default() { return type(EXTHandTracking.XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemHandTrackingPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHandTrackingPropertiesEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemHandTrackingPropertiesEXT set(XrSystemHandTrackingPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingPropertiesEXT malloc() {
        return new XrSystemHandTrackingPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingPropertiesEXT calloc() {
        return new XrSystemHandTrackingPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSystemHandTrackingPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemHandTrackingPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance for the specified memory address. */
    public static XrSystemHandTrackingPropertiesEXT create(long address) {
        return new XrSystemHandTrackingPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemHandTrackingPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrSystemHandTrackingPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemHandTrackingPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingPropertiesEXT malloc(MemoryStack stack) {
        return new XrSystemHandTrackingPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemHandTrackingPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingPropertiesEXT calloc(MemoryStack stack) {
        return new XrSystemHandTrackingPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemHandTrackingPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHandTrackingPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #supportsHandTracking}. */
    public static int nsupportsHandTracking(long struct) { return memGetInt(struct + XrSystemHandTrackingPropertiesEXT.SUPPORTSHANDTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemHandTrackingPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHandTrackingPropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHandTrackingPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSystemHandTrackingPropertiesEXT, Buffer> implements NativeResource {

        private static final XrSystemHandTrackingPropertiesEXT ELEMENT_FACTORY = XrSystemHandTrackingPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrSystemHandTrackingPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHandTrackingPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSystemHandTrackingPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemHandTrackingPropertiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHandTrackingPropertiesEXT.ntype(address()); }
        /** @return the value of the {@link XrSystemHandTrackingPropertiesEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHandTrackingPropertiesEXT.nnext(address()); }
        /** @return the value of the {@link XrSystemHandTrackingPropertiesEXT#supportsHandTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsHandTracking() { return XrSystemHandTrackingPropertiesEXT.nsupportsHandTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemHandTrackingPropertiesEXT#type} field. */
        public XrSystemHandTrackingPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHandTrackingPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTracking#XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT} value to the {@link XrSystemHandTrackingPropertiesEXT#type} field. */
        public XrSystemHandTrackingPropertiesEXT.Buffer type$Default() { return type(EXTHandTracking.XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link XrSystemHandTrackingPropertiesEXT#next} field. */
        public XrSystemHandTrackingPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrSystemHandTrackingPropertiesEXT.nnext(address(), value); return this; }

    }

}