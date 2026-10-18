import java.util.Arrays;

public abstract sealed class PointAbstract permits Point2D {
    private final int[] coords;

    PointAbstract(int... coords){
        this.coords = coords.clone();
    }

    PointAbstract(PointAbstract source, int dimension){
        this.coords = Arrays.copyOf(source.coords, source.coords.length);
    }

    public int getCoordinate(int i){
        return coords[i];
    }

    void setCoordinate(int i, int v){
        coords[i] = v;
    }

    public int getX(){
        return coords[0];
    }

    public void setX(int x){
        coords[0] = x;
    }

    public int getY(){
        return coords[1];
    }

    public void setY(int y){
        coords[1] = y;
    }

    public int[] getPoints(){
        return coords.clone();
    }

    @Override public String toString(){
        return Arrays.toString(coords);
    }
}