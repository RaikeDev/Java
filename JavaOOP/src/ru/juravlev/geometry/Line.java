package ru.juravlev.geometry;

import java.awt.*;
import java.util.Objects;

import static java.lang.Math.sqrt;


public class Line<T extends Point> implements Lengthable, Cloneable {
    private final static Point DEFAULT_POINT = new Point(0, 0);
    private T start, end;

    public Line(T p1, T p2) {
        try {
            start = (T) p1.clone();
            end = (T) p2.clone();
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(
                    "Не удалось скопировать точки линии", e
            );
        }

    }

    public static Line<Point> of(int x1, int y1, int x2, int y2) {
        return new Line<>(x1, y1, x2, y2);
    }

    public static Line<Point3D> of(int x1, int y1, int z1, int x2, int y2, int z2) {
        return new Line<>(new Point3D(x1, y1, z1), new Point3D(x2, y2, z2));
    }

    private Line(int x1, int y1, int x2, int y2) {
        this((T) new Point(x1, y1), (T) new Point(x2, y2));
    }

    public Line(Line<T> line) {
        this(line.start, line.end);
    }

    private Point check(Point point) {
        if (point == null) {
            return DEFAULT_POINT;
        } else return point;
    }



    public void setStart(int x, int y) {
        start.setX(x);
        start.setY(y);
    }

    public void setStart(T start){
        this.start = start;
    }

    public Point getStart() {
        return start;
    }

    public void setEnd(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public void setEnd(T end) {
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }





    public double length(){
        int[] a = start.getPoints();
        int[] b = end.getPoints();
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - b[i]) * (a[i] - b[i]);
        }

        return Math.sqrt(sum);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end) ||
                Objects.equals(start, line.end) && Objects.equals(end, line.start);
    }

    @Override
    public int hashCode() {
        return start.hashCode() + end.hashCode();
    }

    public Line<T> clone(){
        try{
            Line<T> l = (Line<T>)super.clone();
            l.start =(T) start.clone();
            l.end = (T) end.clone();
            return l;
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Линия от {" + getStart().getX() + ";" + getStart().getY() + "} до {" + getEnd().getX() + ";" + getEnd().getY() + "}";
    }
}