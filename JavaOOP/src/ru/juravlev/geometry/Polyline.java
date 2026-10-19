package ru.juravlev.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;

public class Polyline implements Lengthable, Polyable {
    private final List<Point2D> point2DS;

    public Polyline(Point2D... newPoint2DS) {
        checkPoints(Arrays.stream(newPoint2DS).toList());
        this.point2DS = new ArrayList<>(List.of(newPoint2DS));
    }

    public Polyline(ArrayList<Point2D> point2Ds) {
        checkPoints(point2Ds);
        point2DS = new ArrayList<Point2D>(point2Ds);
    }

    public Polyline(Polyline polyline) {
        checkPoints(polyline.getPoints());
//        if (polygonalLine == null) point2DS = new ArrayList<>();
        point2DS = polyline.getPoints();
    }

    public ArrayList<Point2D> getPoints() {
        return new ArrayList<>(point2DS);
    }

    public void setPoints(List<Point2D> newPoint2DS) {
        if (newPoint2DS == null) {
            throw new NullPointerException("Points must not be null");
        }
        Point2D[] array = newPoint2DS.toArray(new Point2D[0]);
        checkPoints(Arrays.stream(array).toList());
        point2DS.clear();
        point2DS.addAll(Arrays.asList(array));
    }

    public void addPoints(Point2D... newPoint2DS) {
        checkPoints(List.of(newPoint2DS));
        point2DS.addAll(Arrays.asList(newPoint2DS));
    }

    public double length() {
        double res = 0;
        for (int i = 0; i < point2DS.size() - 1; i++) {
            res += sqrt((this.point2DS.get(i + 1).getX() - this.point2DS.get(i).getX()) * (this.point2DS.get(i + 1).getX() - this.point2DS.get(i).getX()) + (this.point2DS.get(i + 1).getY() - this.point2DS.get(i).getY()) * (this.point2DS.get(i + 1).getY() - this.point2DS.get(i).getY()));
        }
        return res;
    }

    private static void checkPoints(List<Point2D> newPoint2DS) {
        if (newPoint2DS == null) {
            throw new NullPointerException("Points must not be null");
        }
        for (Point2D point2D : newPoint2DS) {
            if (point2D == null) {
                throw new NullPointerException("Point must not be null");
            }
        }
    }

    @Override
    public String toString() {
        String result = "Ломаная линия: [";
        for (int i = 0; i < point2DS.size(); i++) {
            result += point2DS.get(i);
            if (i < point2DS.size() - 1) result += ", ";
        }
        result += "]";
        return result;
    }

    public Polyline getPolyline() {
        return new Polyline(getPoints());
    }
}