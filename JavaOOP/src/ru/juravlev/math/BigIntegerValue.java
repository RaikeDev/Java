package ru.juravlev.math;

import java.math.BigInteger;

public class BigIntegerValue implements Summable {
    private final BigInteger value;

    public BigIntegerValue(BigInteger value) {
        if (value == null) {
            throw new IllegalArgumentException("Число не задано");
        }
        this.value = value;
    }

    @Override
    public double toDouble() {
        return value.doubleValue();
    }
}
