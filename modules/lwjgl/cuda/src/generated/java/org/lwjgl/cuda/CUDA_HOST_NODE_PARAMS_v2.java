/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_HOST_NODE_PARAMS_v2 {
 *     void (*{@link CUhostFnI fn}) (void *userData);
 *     void * userData;
 * }</code></pre>
 */
public class CUDA_HOST_NODE_PARAMS_v2 extends Struct<CUDA_HOST_NODE_PARAMS_v2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FN,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FN = layout.offsetof(0);
        USERDATA = layout.offsetof(1);
    }

    protected CUDA_HOST_NODE_PARAMS_v2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_HOST_NODE_PARAMS_v2 create(long address, @Nullable ByteBuffer container) {
        return new CUDA_HOST_NODE_PARAMS_v2(address, container);
    }

    /**
     * Creates a {@code CUDA_HOST_NODE_PARAMS_v2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_HOST_NODE_PARAMS_v2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fn} field. */
    @NativeType("void (*) (void *)")
    public CUhostFn fn() { return nfn(address()); }
    /** @return the value of the {@code userData} field. */
    @NativeType("void *")
    public long userData() { return nuserData(address()); }

    /** Sets the specified value to the {@code fn} field. */
    public CUDA_HOST_NODE_PARAMS_v2 fn(@NativeType("void (*) (void *)") CUhostFnI value) { nfn(address(), value); return this; }
    /** Sets the specified value to the {@code userData} field. */
    public CUDA_HOST_NODE_PARAMS_v2 userData(@NativeType("void *") long value) { nuserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_HOST_NODE_PARAMS_v2 set(
        CUhostFnI fn,
        long userData
    ) {
        fn(fn);
        userData(userData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_HOST_NODE_PARAMS_v2 set(CUDA_HOST_NODE_PARAMS_v2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_HOST_NODE_PARAMS_v2 malloc() {
        return new CUDA_HOST_NODE_PARAMS_v2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_HOST_NODE_PARAMS_v2 calloc() {
        return new CUDA_HOST_NODE_PARAMS_v2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance allocated with {@link BufferUtils}. */
    public static CUDA_HOST_NODE_PARAMS_v2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_HOST_NODE_PARAMS_v2(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance for the specified memory address. */
    public static CUDA_HOST_NODE_PARAMS_v2 create(long address) {
        return new CUDA_HOST_NODE_PARAMS_v2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_HOST_NODE_PARAMS_v2 createSafe(long address) {
        return address == NULL ? null : new CUDA_HOST_NODE_PARAMS_v2(address, null);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_HOST_NODE_PARAMS_v2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_HOST_NODE_PARAMS_v2 malloc(MemoryStack stack) {
        return new CUDA_HOST_NODE_PARAMS_v2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_HOST_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_HOST_NODE_PARAMS_v2 calloc(MemoryStack stack) {
        return new CUDA_HOST_NODE_PARAMS_v2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS_v2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fn}. */
    public static CUhostFn nfn(long struct) { return CUhostFn.create(memGetAddress(struct + CUDA_HOST_NODE_PARAMS_v2.FN)); }
    /** Unsafe version of {@link #userData}. */
    public static long nuserData(long struct) { return memGetAddress(struct + CUDA_HOST_NODE_PARAMS_v2.USERDATA); }

    /** Unsafe version of {@link #fn(CUhostFnI) fn}. */
    public static void nfn(long struct, CUhostFnI value) { memPutAddress(struct + CUDA_HOST_NODE_PARAMS_v2.FN, value.address()); }
    /** Unsafe version of {@link #userData(long) userData}. */
    public static void nuserData(long struct, long value) { memPutAddress(struct + CUDA_HOST_NODE_PARAMS_v2.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_HOST_NODE_PARAMS_v2.FN));
    }

    // -----------------------------------

    /** An array of {@link CUDA_HOST_NODE_PARAMS_v2} structs. */
    public static class Buffer extends StructBuffer<CUDA_HOST_NODE_PARAMS_v2, Buffer> implements NativeResource {

        private static final CUDA_HOST_NODE_PARAMS_v2 ELEMENT_FACTORY = CUDA_HOST_NODE_PARAMS_v2.create(-1L);

        /**
         * Creates a new {@code CUDA_HOST_NODE_PARAMS_v2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_HOST_NODE_PARAMS_v2#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_HOST_NODE_PARAMS_v2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fn} field. */
        @NativeType("void (*) (void *)")
        public CUhostFn fn() { return CUDA_HOST_NODE_PARAMS_v2.nfn(address()); }
        /** @return the value of the {@code userData} field. */
        @NativeType("void *")
        public long userData() { return CUDA_HOST_NODE_PARAMS_v2.nuserData(address()); }

        /** Sets the specified value to the {@code fn} field. */
        public CUDA_HOST_NODE_PARAMS_v2.Buffer fn(@NativeType("void (*) (void *)") CUhostFnI value) { CUDA_HOST_NODE_PARAMS_v2.nfn(address(), value); return this; }
        /** Sets the specified value to the {@code userData} field. */
        public CUDA_HOST_NODE_PARAMS_v2.Buffer userData(@NativeType("void *") long value) { CUDA_HOST_NODE_PARAMS_v2.nuserData(address(), value); return this; }

    }

}