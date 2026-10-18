import java.io.IOException;

public class Main {
    static void main() throws IOException{
        System.out.println("start");
        try {
            sum(-2,3);
        } catch (IOException e) {
            System.out.println("catch");
        }
        System.out.println("end");

    }
    public static int sum(int x, int y) throws IOException {
        if (x<0) throw new NegativeValueException();
        return x+y;
    }
}
