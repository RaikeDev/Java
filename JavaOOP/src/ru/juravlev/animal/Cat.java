package ru.juravlev.animal;

public class Cat implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public void meow(int count) {
        String result = name + ": ";
        for (int i = 0; i < count; i++) {
            if (i == 0) result += "мяу";
            else result += "-мяу";
        }
        result += "!";

        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
