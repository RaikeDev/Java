package ru.juravlev.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name) {
        setName(name);
    }

    public void shoot() {
        if (weapon == null) {
            System.out.println("не могу участвовать в перестрелке");
        } else {
            weapon.shoot();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("имя не передано");
        }
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}