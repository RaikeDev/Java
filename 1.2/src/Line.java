public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString(){
        return "Линия от {" + start.x + ";" + start.y + "} до {" + end.x + ";" + end.y + "}";
    }
}