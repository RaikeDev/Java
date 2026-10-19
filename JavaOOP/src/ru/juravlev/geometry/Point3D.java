package ru.juravlev.geometry;

public final class Point3D extends PointAbstract {
    public Point3D(int x, int y, int z) {
        super(x, y, z);
    }

    public Point3D(PointAbstract anyPoint) {
        super(anyPoint, 3);
    }

    public int getZ() {
        return getCoordinate(2);
    }

    public void setZ(int z) {
        setCoordinate(2, z);
    }

}
