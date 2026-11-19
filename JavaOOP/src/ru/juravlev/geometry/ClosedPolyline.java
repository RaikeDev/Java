package ru.juravlev.geometry;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.Iterator;

public class ClosedPolyline extends Polyline implements Iterable<Point> {
    public ClosedPolyline(Point... point2DS) {
        super(point2DS);
        closeLine();
    }

    @Override
    public void setPoints(List<Point> newPoint2DS) {
        super.setPoints(newPoint2DS);
        closeLine();
    }

    @Override
    public void addPoints(Point... newPoint2DS) {
        if (newPoint2DS == null) {
            throw new NullPointerException("Points must not be null");
        }
        List<Point> point2DS = getPoints();
        if (isClosed(point2DS)) {
            point2DS.removeLast();
        }
        point2DS.addAll(Arrays.asList(newPoint2DS));
        setPoints(point2DS);
    }


    private void closeLine() {
        List<Point> point2DS = getPoints();
        if (point2DS.size() > 1 && !isClosed(point2DS)) {
            point2DS.add(point2DS.getFirst());
            super.setPoints(point2DS);
        }
    }

    private static boolean isClosed(List<Point> point2DS) {
        return point2DS.size() > 1 && point2DS.getFirst() == point2DS.getLast();
    }

    @Override
    public String toString() {
        String result = "Замкнутая ломаная линия: [";
        List<Point> points = super.getPoints();
        for (int i = 0; i < points.size(); i++) {
            result += points.get(i);
            if (i < points.size() - 1) result += ", ";
        }
        result += "]";
        return result;
    }


//    @Override
//    public Iterator<Point> iterator() {
//        return null;
//    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return Iterable.super.spliterator();
    }


    public Iterator<Point> iterator() {
        return new Iterator<Point>() {
            int lastRet;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Point next() {
                List<Point> list = getPoints();
                if (lastRet == list.size()) {
                    lastRet = 0;
                }
                return list.get(lastRet++);
            }
        };
    }
}






