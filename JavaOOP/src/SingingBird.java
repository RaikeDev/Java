public final class SingingBird {
    private SingingBird() {
    }

    public static void singAll(Bird... birds) {
        for (Bird bird : birds) {
            if (bird == null) {
                throw new IllegalArgumentException("Bird is null");
            }
            bird.sing();
        }
    }
}
