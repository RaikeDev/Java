public class PointDemo{
    public static void main(String[]args){
        Point p = new Point(1,5);

        Point p2 = new Point(2,2);

        Point p3 = new Point(3,3);


        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
class Point {
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


