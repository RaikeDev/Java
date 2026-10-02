import static java.lang.Math.sqrt;

public class PolygonalLine {
    private Point[] points;

    public PolygonalLine(){this.points = new Point[0];}
    public PolygonalLine(Point...points){
        if (points == null) this.points = new Point[0];
        this.points = points.clone();
    }

    public Point[] getPoints() {
        return points == null ? new Point[0] : points.clone();
    }

    public void setPoints(Point[] points) {
        if (points == null) return;
        this.points = points.clone();
    }

    public void addPoints(Point...point){
        if (this.points == null) this.points = new Point[]{};
        Point[] newPoints = new Point[point.length + this.points.length];
        for (int i=0; i<this.points.length; i++){
            newPoints[i] = this.points[i];
        }
        for (int i=0; i<point.length; i++){
            newPoints[this.points.length + i] = point[i];
        }
        this.points = newPoints;
    }

    public double length(){
        double res=0;
        for (int i=0; i < points.length - 1; i++){
            res += sqrt((this.points[i+1].getX() - this.points[i].getX())*(this.points[i+1].getX() - this.points[i].getX()) + (this.points[i+1].getY() - this.points[i].getY())*(this.points[i+1].getY() - this.points[i].getY()));

        }
        return res;
    }

    public String toString(){
        String result = "Ломаная линия: [";
        for (int i=0; i<points.length; i++){
            result += points[i];
            if (i < points.length-1) result += ", ";
        }
        result += "]";
        return result;
    }
}