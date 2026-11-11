package ru.juravlev.geometry;

import java.util.Arrays;

public final class Point3D extends Point {

    public Point3D(int x, int y, int z) {
        super(x, y);
        coords = new int[]{x, y, z};
    }

    public Point3D(Point point, int z) {
        super(point.getX(), point.getY());
        this.coords = new int[]{point.getCoordinate(0), point.getCoordinate(1), z};
    }

    public Point3D(Point point) {
        super(point);
        coords = Arrays.copyOf(point.getPoints(), 3);
    }

    public int getZ() {
        return getCoordinate(2);
    }

    public void setZ(int z) {
        setCoordinate(2, z);
    }
}
