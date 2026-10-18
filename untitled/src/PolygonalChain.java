public class PolygonalChain {
    private final static double DEFAULT_SIDE = 1;
    private Point2D topLeft;
    private double side;

    public PolygonalChain(Point2D topLeft){
        this(topLeft, DEFAULT_SIDE);
    }
    public PolygonalChain(Point2D topLeft, double side) throws IllegalCordException {
        if (topLeft == null){
            throw new IllegalCordException("Переданная точка = null");
        }
        this.topLeft = topLeft;
        this.side = side;
    }
    public PolygonalChain(PolygonalChain other){
        if (){

        }

    }
}
