package ru.juravlev.other;

import java.util.List;

public interface Summarisable<T> {
    T toT(List<T> list);
}
