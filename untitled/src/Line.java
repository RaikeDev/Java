import static java.lang.Math.sqrt;


public class Line implements Lengthable{
    private final static Point2D DEFAULT_POINT_2_D = new Point2D(0, 0);
    private Point2D start;
    private Point2D end;

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public Line(Point2D start, Point2D end) {
        this(check(start).getX(), check(start).getY(), check(end).getX(), check(end).getY());
    }

    public Line(Line line){
        this(line.start, line.end);
    }

    private static Point2D check(Point2D point2D){
        if (point2D == null){
            return DEFAULT_POINT_2_D;
        }
        else return point2D;
    }
    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.setStart(check(start).getX(), check(start).getY());
    }
    public void setStart(int x, int y){
        this.start = new Point2D(x, y);
    }

    public Point2D getEnd() {
        return end;
    }


    public void setEnd(Point2D end) {
        this.setEnd(check(end).getX(), check(end).getY());
    }
    public void setEnd(int x, int y){
        this.end = new Point2D(x, y);
    }


    public double length(){
        double kat1 = (this.getEnd().getX() - this.getStart().getX())*(this.getEnd().getX() - this.getStart().getX());
        double kat2 = (this.getEnd().getY() - this.getStart().getY())*(this.getEnd().getY() - this.getStart().getY());
        return(sqrt(kat1 + kat2));
    }
    @Override
    public String toString(){
        return "Линия от {" + getStart().getX() + ";" + getStart().getY() + "} до {" + getEnd().getX() + ";" + getEnd().getY() + "}";
    }
}