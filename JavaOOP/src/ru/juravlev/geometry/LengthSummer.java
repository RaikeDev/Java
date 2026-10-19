package ru.juravlev.geometry;

public class LengthSummer {
    public static double lengthSummer(Lengthable... lengthables) {
        double res = 0;
        for (Lengthable l : lengthables) {
            res += l.length();
        }
        return res;
    }
}
