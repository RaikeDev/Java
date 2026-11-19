package ru.juravlev.geometry;

import java.util.ArrayList;

public class Breakdowns extends Polyline implements Polyable {

    public Breakdowns(Polyable... polyables) {
        super(collectPoints(polyables));
    }

    private static ArrayList<Point> collectPoints(Polyable... polyables) {
        ArrayList<Point> points = new ArrayList<>();
        for (Polyable p : polyables) {
            if (p == null) continue;
            Polyline line = p.getPolyline();
            points.addAll(line.getPoints());
        }
        return points;
    }

    @Override
    public Polyline getPolyline() {
        return new Polyline(new ArrayList<>(getPoints()));
    }
}
