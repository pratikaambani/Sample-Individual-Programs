package com.sample.collection.list;

/**
 * Created by Pratik Ambani on 31/12/2017.
 */

import java.util.Arrays;

public class CustomList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}