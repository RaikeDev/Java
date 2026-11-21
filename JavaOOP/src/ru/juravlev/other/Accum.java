package ru.juravlev.other;

import java.util.List;

public interface Accum<P, T> {
    void acc(P result, T value);
}
