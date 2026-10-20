package ru.juravlev.math;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public final class Pow {
    private Pow() {

    }

    public static double toPow(String x, String y) {
        return pow(parseInt(x), parseInt(y));
    }
}
