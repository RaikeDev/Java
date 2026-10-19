public class Square implements Polyable {
    private Point2D topLeft;
    private int sideLength;

    public Square(Point2D topLeft, int sideLength) {
        if (topLeft == null) topLeft = new Point2D(0, 0);
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.topLeft = new Point2D(x, y);
        this.sideLength = sideLength;
    }

    public Point2D getTopLeft() {
        return new Point2D(topLeft);
    }

    public void setTopLeft(Point2D topLeft) {
        if (topLeft == null) throw new IllegalArgumentException("Не указана начальная позиция");
        this.topLeft = new Point2D(topLeft);
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть положительной");
        this.sideLength = sideLength;
    }


    public PolygonalChain getPolyline() {
        Point2D[] point2DS = new Point2D[4];
        point2DS[0] = topLeft;
        point2DS[1] = new Point2D(topLeft.getX() + sideLength, topLeft.getY());
        point2DS[2] = new Point2D(topLeft.getX() + sideLength, topLeft.getY() - sideLength);
        point2DS[3] = new Point2D(topLeft.getX(), topLeft.getY() - sideLength);
        return new PolygonalChain(point2DS);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }

}
