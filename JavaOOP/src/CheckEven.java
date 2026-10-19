public class CheckEven implements Checker {
    @Override
    public boolean check(int x) {
        return x % 2 == 0;
    }
}
