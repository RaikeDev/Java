import java.util.ArrayList;
import java.util.List;

public class Breakdowns extends Polyline implements Polyable {

    public Breakdowns(Polyable... polyables) {
        super(collectPoints(polyables));
    }

    private static ArrayList<Point2D> collectPoints(Polyable... polyables) {
        ArrayList<Point2D> points = new ArrayList<>();
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
