package ru.juravlev.geometry;

import java.util.Arrays;

public sealed class Point implements Cloneable permits Point3D {

    protected int[] coords;

    public Point(int... coords) {
        this.coords = coords.clone();
    }

    public Point(int x, int y) {
        coords = new int[2];
        this.coords[0] = x;
        this.coords[1] = y;
    }

    public Point(Point point) {
        coords = new int[2];
        this.coords[0] = point.getX();
        this.coords[1] = point.getY();
    }


    public int getCoordinate(int i) {
        return coords[i];
    }

    void setCoordinate(int i, int v) {
        coords[i] = v;
    }

    public int getX() {
        return coords[0];
    }

    public void setX(int x) {
        coords[0] = x;
    }

    public int getY() {
        return coords[1];
    }

    public void setY(int y) {
        coords[1] = y;
    }

    public int[] getPoints() {
        return coords;
    }


    @Override
    public Point clone() {
        try {
            Point point = (Point) super.clone();
            point.coords = coords.clone();
            return point;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(coords);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Arrays.equals(coords, point.coords);
    }

    @Override
    public String toString() {
        return Arrays.toString(coords);
    }
}