package ru.juravlev.other;

import ru.juravlev.geometry.Line;
import ru.juravlev.geometry.Point;
import ru.juravlev.geometry.Point3D;

import java.util.List;

public class Section6_2 {
    public static double findMax(List<? extends Box<? extends Number>> boxes) {
        double max = boxes.getFirst().getObject().doubleValue();
        for (Box<? extends Number> i : boxes) {
            if (i.getObject().doubleValue() > max) max = i.getObject().doubleValue();
        }
        return max;
    }

    public static void putPointToBox(Box<? super Point3D> box) {
        box.putObject(new Point3D(2, 1, 3));
    }

    public static void moveX(Line<?> line) {
        Point start = line.getStart();
        if (start.getX() < 0) {
            start.setX(start.getX() - 10);

        } else {
            start.setX(start.getX() + 10);
        }
    }

    public static void fillingArrayList(List<? super Integer> array) {
        for (int i = 1; i <= 100; i++) {
            array.add(i);
        }
    }
}
