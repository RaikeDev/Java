package ru.juravlev.geometry;

public class Rectangle extends Figure {
    int a, b;

    public Rectangle(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательной");
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательной");
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательной");
        this.a = a;
    }

    @Override
    double area() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Площадь прямоугольника = " + area();
    }
}
