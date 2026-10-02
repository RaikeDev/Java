import static java.lang.Math.sqrt;


public class Line {
    private final static Point DEFAULT_POINT = new Point(0, 0);
    private Point start;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Line(Point start, Point end) {
        this(check(start).getX(), check(start).getY(), check(end).getX(), check(end).getY());
    }

    public Line(Line line){
        this(line.start, line.end);
    }

    private static Point check(Point point){
        if (point == null){
            return DEFAULT_POINT;
        }
        else return point;
    }
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.setStart(check(start).getX(), check(start).getY());
    }
    public void setStart(int x, int y){
        this.start = new Point(x, y);
    }

    public Point getEnd() {
        return end;
    }


    public void setEnd(Point end) {
        this.setEnd(check(end).getX(), check(end).getY());
    }
    public void setEnd(int x, int y){
        this.end = new Point(x, y);
    }


    public double length(){
        return(sqrt((this.getEnd().getX() - this.getStart().getX())*(this.getEnd().getX() - this.getStart().getX()) + (this.getEnd().getY() - this.getStart().getY())*(this.getEnd().getY() - this.getStart().getY())));
    }
    @Override
    public String toString(){
        return "Линия от {" + getStart().getX() + ";" + getStart().getY() + "} до {" + getEnd().getX() + ";" + getEnd().getY() + "}";
    }
}