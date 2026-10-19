package ru.juravlev.geometry;

public final class Point2D extends PointAbstract {
    public Point2D(int x, int y) {
        super(x, y);
    }

    public Point2D(PointAbstract anyPoint) {
        super(anyPoint, 2);
    }
}