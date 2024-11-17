/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkExternalSemaphoreProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalSemaphorePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
 *     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
 *     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
 * }</code></pre>
 */
public class VkExternalSemaphorePropertiesKHR extends VkExternalSemaphoreProperties {

    protected VkExternalSemaphorePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalSemaphorePropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkExternalSemaphorePropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkExternalSemaphorePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalSemaphorePropertiesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkExternalSemaphorePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES} value to the {@code sType} field. */
    @Override
    public VkExternalSemaphorePropertiesKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkExternalSemaphorePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkExternalSemaphorePropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalSemaphorePropertiesKHR set(VkExternalSemaphorePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalSemaphorePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHR malloc() {
        return new VkExternalSemaphorePropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalSemaphorePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphorePropertiesKHR calloc() {
        return new VkExternalSemaphorePropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalSemaphorePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalSemaphorePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalSemaphorePropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalSemaphorePropertiesKHR} instance for the specified memory address. */
    public static VkExternalSemaphorePropertiesKHR create(long address) {
        return new VkExternalSemaphorePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalSemaphorePropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkExternalSemaphorePropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalSemaphorePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalSemaphorePropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalSemaphorePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExternalSemaphorePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHR malloc(MemoryStack stack) {
        return new VkExternalSemaphorePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalSemaphorePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphorePropertiesKHR calloc(MemoryStack stack) {
        return new VkExternalSemaphorePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphorePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphorePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkExternalSemaphorePropertiesKHR} structs. */
    public static class Buffer extends VkExternalSemaphoreProperties.Buffer {

        private static final VkExternalSemaphorePropertiesKHR ELEMENT_FACTORY = VkExternalSemaphorePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkExternalSemaphorePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalSemaphorePropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkExternalSemaphorePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkExternalSemaphorePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalSemaphorePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES} value to the {@code sType} field. */
        @Override
        public VkExternalSemaphorePropertiesKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkExternalSemaphorePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkExternalSemaphorePropertiesKHR.npNext(address(), value); return this; }

    }

}