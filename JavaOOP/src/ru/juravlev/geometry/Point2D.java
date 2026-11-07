package ru.juravlev.geometry;

import java.awt.*;
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
}