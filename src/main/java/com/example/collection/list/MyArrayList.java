package com.example.collection.list;

import java.util.Arrays;

public class MyArrayList<T> {

    private int size = 0;
    private Object[] store;


    public boolean add(T index) {

        try {
            int length = store.length;
            Object[] add = new Object[length + 1];
            System.arraycopy(store, 0, add, 0, length);
            store = add;
        } catch (NullPointerException e) {
            store = new Object[1];
        }

        store[size] = index;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) store[index];
    }

    public T remove(int index) {
        Object[] remove = new Object[store.length - 1];
        Object result = store[index];

        System.arraycopy(store, 0, remove, 0, remove.length);
        System.arraycopy(store, index + 1, remove, index, store.length - index - 1);

        store = remove;
        size--;
        return (T) result;
    }

    public boolean contains(T index) {

        for (Object object : store) {
            T isContain = (T) object;

            if (isContain.equals(index))
                return true;
        }
        return false;
    }

    public int indexOf(T index) {

        for (int i = 0; i < store.length; i++) {
            T isEqual = (T) store[i];

            if (isEqual.equals(index))
                return i;
        }
        return -1;
    }


    public void clear() {
        Object[] clear = new Object[0];
        store = clear;
        size = 0;
    }
}
