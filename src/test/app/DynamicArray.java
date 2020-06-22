package test.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public abstract class DynamicArray<T> {

    private T[] array = (T[]) new Object[10];
    private int elementsInArray = 0;

    protected void get() {

    }
    public DynamicArray() {}

    public void add(T el) {
        if (elementsInArray == array.length) {
            array = Arrays.copyOf(array, array.length*2);
        }
        array[elementsInArray++] = el;
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
    }

    public T get(int index) {
        return array[index];
    }

    @FunctionalInterface
    interface BBB {
        void get();
    }
}
