package ru.juravlev.other;

public interface Applyable<T, P> {
    P apply(T value);
}
