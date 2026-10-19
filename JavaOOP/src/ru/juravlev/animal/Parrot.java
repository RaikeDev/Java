package ru.juravlev.animal;

public final class Parrot extends Bird {
    private final String text;

    public Parrot(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Текст попугая не может быть пустым");
        }
        this.text = text;
    }

    @Override
    public void sing() {
        int max = text.length();
        int min = 1;
        String res = "";
        for (int i = 0; i < (int) (Math.random() * (max - min + 1)) + min; i++) {
            res += text.charAt(i);
        }
        System.out.println(res);
    }
}
