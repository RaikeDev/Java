public class LengthSummer {
    public static double lengthSummer(Lengthable...lengthables){
        int res = 0;
        for (Lengthable l:lengthables){
            res += l.length();
        }
        return res;
    }
}
