package ru.juravlev.geometry;

public final class Color extends Characteristic {
    private final String value;

    public Color(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException();
        this.value = value;
    }

    @Override
    public String toString() {
        return "color = " + value;
    }
}
