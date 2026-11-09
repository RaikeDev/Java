package ru.juravlev.geometry;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.Iterator;

public class PolygonalChain extends Polyline implements Iterable<Point2D> {
    public PolygonalChain(Point2D... point2DS) {
        super(point2DS);
        closeLine();
    }
//    public PolygonalChain(List<Point2D> point2DS){
//        super(point2DS);
//        closeLine();
//    }

    @Override
    public void setPoints(List<Point2D> newPoint2DS) {
        super.setPoints(newPoint2DS);
        closeLine();
    }

    @Override
    public void addPoints(Point2D... newPoint2DS) {
        if (newPoint2DS == null) {
            throw new NullPointerException("Points must not be null");
        }
        List<Point2D> point2DS = getPoints();
        if (isClosed(point2DS)) {
            point2DS.removeLast();
        }
        point2DS.addAll(Arrays.asList(newPoint2DS));
        setPoints(point2DS);
    }


    private void closeLine() {
        List<Point2D> point2DS = getPoints();
        if (point2DS.size() > 1 && !isClosed(point2DS)) {
            point2DS.add(point2DS.getFirst());
            super.setPoints(point2DS);
        }
    }

    private static boolean isClosed(List<Point2D> point2DS) {
        return point2DS.size() > 1 && point2DS.getFirst() == point2DS.getLast();
    }

    @Override
    public String toString() {
        String result = "Замкнутая ломаная линия: [";
        for (int i = 0; i < super.getPoints().size(); i++) {
            result += super.getPoints().get(i);
            if (i < super.getPoints().size() - 1) result += ", ";
        }
        result += "]";
        return result;
    }


    @Override
    public Iterator<Point2D> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Point2D> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Point2D> spliterator() {
        return Iterable.super.spliterator();
    }
}

@Override
public Iterator<Point2D> iterator(){
    return new Iterator<Point2D>(){
        int lastRet;
        @Override
        public boolean hasNext(){
            return true;
        }
        @Override
        public Point2D next(){
            List<Point2D> list = getPoints();
            if (lastRet == list.size()){
                lastRet = 0;
            }
            return list.get(lastRet++);
        }
    }
}



