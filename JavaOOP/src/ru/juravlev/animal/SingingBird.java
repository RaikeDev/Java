package ru.juravlev.animal;

public final class SingingBird {
    private SingingBird() {
    }

    public static void singAll(Bird... birds) {
        for (Bird bird : birds) {
            if (bird == null) {
                throw new IllegalArgumentException("bird is null");
            }
            bird.sing();
        }
    }
}
