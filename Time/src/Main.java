public class Main {
    public static void main(String[]args) {
        Time time = new Time();
        time.sec = 85232;
        System.out.println(Time.printTime(time.sec));
    }
}