package ru.juravlev.other;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack<T> {
    private T[] array;
    private int size;


    public Stack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Ёмкость не может быть отрицательной");
        }

        array = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean push(T e) {
        if (size == array.length) {
            int newCapacity = array.length == 0 ? 1 : array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }

        array[size] = e;
        size++;
        return true;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException("Стек пуст");
        }

        T temp = array[size - 1];
        array[size - 1] = null;
        size--;

        return temp;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("Стек пуст");
        }

        return array[size - 1];
    }

    public int size() {
        return size;
    }
}