package ru.juravlev.people;

public class Human {
    private FullName name;
    private int height;
    private final Human father;

    public Human(Human human) {
        if (human.getName() == null) throw new IllegalArgumentException("Имя не указано");
        this.name = human.name;

        this.height = human.height;
        this.father = human.father;
    }

    public Human(FullName name, int height, Human father) {
        if (name == null) throw new IllegalArgumentException("Имя не указано");
        this.name = name;

        this.height = height;
        this.father = father;
    }

    public Human(String name) {
        this(new FullName(name));
    }

    public Human(FullName name) {
        this(name, 0, null);
    }

    public Human(String father, String name) {
        this(new FullName(father), new FullName(name));
    }

    public Human(FullName father, FullName name) {
        this(name, 0, new Human(father));
    }

    public FullName getName() {
        return new FullName(name);
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public String getPatronymic() {
        return name.getPatronymic();
    }

    public String getSecondName() {
        for (Human human = this; human != null; human = human.father) {
            String secName = human.name.getSecName();
            if (secName != null) {
                return secName;
            }
        }
        return null;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Human getFather() {
        return new Human(father);
    }

    private static String join(String base, String part) {
        if (part == null) {
            return base;
        }
        return base.isEmpty() ? part : base + " " + part;
    }

    private String formatName() {
        String result = join("", getFirstName());
        result = join(result, getSecondName());
        return join(result, getPatronymic());
    }

    @Override
    public String toString() {
        String result = "имя: " + formatName();
        if (father != null) {
            result += ", отец: " + father.formatName();
        }
        return result;
    }
}


