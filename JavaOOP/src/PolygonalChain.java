import java.util.Arrays;
import java.util.List;

public class PolygonalChain extends Polyline {
    public PolygonalChain(Point2D... point2DS){
        super(point2DS);
        closeLine();
    }

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
    public String toString(){
        String result = "Замкнутая ломаная линия: [";
        for (int i = 0; i < super.getPoints().size(); i++){
            result += super.getPoints().get(i);
            if (i < super.getPoints().size()-1) result += ", ";
        }
        result += "]";
        return result;
    }
}
