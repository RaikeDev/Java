package ru.juravlev.geometry;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Point2D extends PointAbstract implements Cloneable {
    public Point2D(int x, int y) {
        super(x, y);
    }

    public Point2D(PointAbstract anyPoint) {
        super(anyPoint, 2);
    }

    @Override
    public Point2D clone() {
        try {
            return (Point2D) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point = (Point2D) o;
        return Arrays.equals(coords, point.coords);
    }
}