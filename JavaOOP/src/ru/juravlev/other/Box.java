package ru.juravlev.other;

public class Box<T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        if (isEmpty()) throw new NoObjectException();
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T popObject() {
        if (isEmpty()) throw new NoObjectException();
        T temp = object;
        object = null;
        return temp;
    }

    public void putObject(T object) {
        if (!isEmpty()) {
            throw new NoSpaceException();
        }
        this.object = object;
    }

    public boolean isEmpty() {
        return this.object == null;
    }
}
