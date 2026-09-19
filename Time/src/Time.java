public class Time {
    public int sec;
    public static String printTime(int sec){
        if (sec>86400) sec %= 86400;
        int hour = sec / 3600;
        sec %= 3600;
        int min = sec / 60;
        sec %= 60;
        return hour+":"+min+":"+sec;
    }
}
