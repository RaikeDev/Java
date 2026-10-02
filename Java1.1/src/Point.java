
public class Point {
    private int x,y;
    @Override
    public String toString(){
        return "{" + x + ";" + y + "}";
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}


