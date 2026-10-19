package ru.juravlev.math;

public final class Calculator {
    private Calculator() {
    }

    public static double sum(Summable... items) {
        double result = 0;
        for (Summable item : items) {
            if (item == null) {
                throw new IllegalArgumentException("Слагаемое не задано");
            }
            result += item.toDouble();
        }
        return result;
    }
}