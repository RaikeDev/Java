package ru.juravlev.geometry;

public class Square implements Polyable {
    private Point topLeft;
    private int sideLength;

    public Square(Point topLeft, int sideLength) {
        if (topLeft == null) topLeft = new Point(0, 0);
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.topLeft = new Point(x, y);
        this.sideLength = sideLength;
    }

    public Point getTopLeft() {
        return new Point(topLeft);
    }

    public void setTopLeft(Point topLeft) {
        if (topLeft == null) throw new IllegalArgumentException("Не указана начальная позиция");
        this.topLeft = new Point(topLeft);
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.sideLength = sideLength;
    }


    public ClosedPolyline getPolyline() {
        Point[] PointS = new Point[4];
        PointS[0] = topLeft;
        PointS[1] = new Point(topLeft.getX() + sideLength, topLeft.getY());
        PointS[2] = new Point(topLeft.getX() + sideLength, topLeft.getY() - sideLength);
        PointS[3] = new Point(topLeft.getX(), topLeft.getY() - sideLength);
        return new ClosedPolyline(PointS);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }

}
