package ru.juravlev.other;

public class Helper<T> {
    private T res;

    private Helper(T res) {
        this.res = res;
    }

    public static <P> Helper<P> of(P res) {
        return new Helper<>(res);
    }

    public static <P> Helper<P> empty() {
        return new Helper<>(null);
    }

    public T getResOrDefault(T defaultV) {
        if (res == null || isEmpty()) return defaultV;
        return res;
    }

    public T getResOrThrow(RuntimeException e) {
        if (isEmpty()) throw e;
        return res;
    }

    public T getResOrGenerateDefault(Generator<T> generator) {
        if (isEmpty()) return generator.generate();
        return res;
    }

    public boolean isEmpty() {
        if (res == null) return true;
        return false;
    }
}
