package ru.juravlev.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Polyline implements Lengthable, Polyable, Cloneable {
    private final List<Point> PointS;

    public Polyline(Point... newPointS) {
        checkPoints(Arrays.stream(newPointS).toList());
        this.PointS = new ArrayList<>(List.of(newPointS));
    }

    public Polyline(ArrayList<Point> Points) {
        checkPoints(Points);
        PointS = new ArrayList<Point>(Points);
    }

    public Polyline(Polyline polyline) {
        checkPoints(polyline.getPoints());
        PointS = polyline.getPoints();
    }

    public ArrayList<Point> getPoints() {
        return new ArrayList<>(PointS);
    }

    public void setPoints(List<Point> newPointS) {
        if (newPointS == null) {
            throw new NullPointerException("Points must not be null");
        }
        Point[] array = newPointS.toArray(new Point[0]);
        checkPoints(Arrays.stream(array).toList());
        PointS.clear();
        PointS.addAll(Arrays.asList(array));
    }

    public void addPoints(Point... newPointS) {
        checkPoints(List.of(newPointS));
        PointS.addAll(Arrays.asList(newPointS));
    }

    public double length() {
        double res = 0;
        for (int i = 0; i < PointS.size() - 1; i++) {
            res += sqrt((this.PointS.get(i + 1).getX() - this.PointS.get(i).getX()) * (this.PointS.get(i + 1).getX() - this.PointS.get(i).getX()) + (this.PointS.get(i + 1).getY() - this.PointS.get(i).getY()) * (this.PointS.get(i + 1).getY() - this.PointS.get(i).getY()));
        }
        return res;
    }

    private static void checkPoints(List<Point> newPointS) {
        if (newPointS == null) {
            throw new NullPointerException("Points must not be null");
        }
        for (Point Point : newPointS) {
            if (Point == null) {
                throw new NullPointerException("Point must not be null");
            }
        }
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(getLines());
    }

    @Override
    public final boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Polyline polyline)) return false;

        List<Line> lines = getLines();
        List<Line> linesObj = polyline.getLines();

        return lines.equals(linesObj);
    }

    private List<Line> getLines() {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < PointS.size() - 1; i++) {
            lines.add(new Line(
                    PointS.get(i),
                    PointS.get(i + 1)
            ));
        }

        return lines;
    }


    @Override
    public Polyline clone() {
        try {
            Polyline pl = (Polyline) super.clone();
            List<Point> lst = new ArrayList<>();
            for (int i = 0; i < pl.PointS.size(); i++) {
                lst.add(pl.PointS.get(i).clone());
            }
            pl.setPoints(lst);
            return pl;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        String result = "Ломаная линия: [";
        for (int i = 0; i < PointS.size(); i++) {
            result += PointS.get(i);
            if (i < PointS.size() - 1) result += ", ";
        }
        result += "]";
        return result;
    }

    public Polyline getPolyline() {
        return new Polyline(getPoints());
    }


}