package ru.juravlev.geometry;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус не может быть отрицательным");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Радиус круга = " + radius + ", Площадь круга = " + area();
    }
}