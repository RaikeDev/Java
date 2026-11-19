package ru.juravlev.geometry;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.Iterator;

public class ClosedPolyline extends Polyline implements Iterable<Point> {
    public ClosedPolyline(Point... PointS) {
        super(PointS);
        closeLine();
    }

    @Override
    public void setPoints(List<Point> newPointS) {
        super.setPoints(newPointS);
        closeLine();
    }

    @Override
    public void addPoints(Point... newPointS) {
        if (newPointS == null) {
            throw new NullPointerException("Points must not be null");
        }
        List<Point> PointS = getPoints();
        if (isClosed(PointS)) {
            PointS.removeLast();
        }
        PointS.addAll(Arrays.asList(newPointS));
        setPoints(PointS);
    }


    private void closeLine() {
        List<Point> PointS = getPoints();
        if (PointS.size() > 1 && !isClosed(PointS)) {
            PointS.add(PointS.getFirst());
            super.setPoints(PointS);
        }
    }

    private static boolean isClosed(List<Point> PointS) {
        return PointS.size() > 1 && PointS.getFirst() == PointS.getLast();
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






