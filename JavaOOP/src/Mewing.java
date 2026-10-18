public final class Mewing {
    public static void mewing(Meowable... meowables) {
        for (Meowable meowable : meowables) {
            if (meowable == null) {
                throw new NullPointerException("meowable is null");
            }
            meowable.meow();
        }
    }
}
