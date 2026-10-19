package ru.juravlev.math;

public final class IntegerValue implements Summable {
    private final int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    @Override
    public double toDouble() {
        return value;
    }
}