package ru.juravlev.geometry;

public class SquareFigure extends Figure {
    int a;

    public SquareFigure(int a) {
        if (a <= 0) throw new IllegalArgumentException("Сторона не может быть отрицательной");
        this.a = a;
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
        return a * a;
    }

    @Override
    public String toString() {
        return "Площадь квадрата = " + area();
    }
}
