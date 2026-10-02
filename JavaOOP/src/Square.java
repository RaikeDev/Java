public class Square {
    private Point topLeft;
    private int sideLength;

    public Square(Point topLeft, int sideLength){
        if (topLeft == null) topLeft = new Point(0,0);
        if (sideLength <= 0) throw new IllegalArgumentException();
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    public Square(int x, int y, int sideLength){
        if (sideLength <= 0) throw new IllegalArgumentException();
        this.topLeft = new Point(x,y);
        this.sideLength = sideLength;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public PolygonalLine squareSides(){
        Point[] points = new Point[4];
        points[0] = topLeft;
        points[1] = new Point(topLeft.getX()+sideLength, topLeft.getY());
        points[2] = new Point(topLeft.getX(), topLeft.getY()-sideLength);
        points[3] = new Point(topLeft.getX()+sideLength, topLeft.getY()-sideLength);
        return new PolygonalLine(points);
    }

    @Override
    public String toString(){
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }
}
