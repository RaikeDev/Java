package ru.juravlev.weapon;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    public abstract void shoot();

    public int ammo() {
        return ammo;
    }

    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return true;
    }

    public int load(int ammo) {
        if (ammo < 0) throw new RuntimeException();
        int tmp = this.ammo;
        this.ammo = ammo;
        return tmp;
    }

    public int unload(){
        int bullets = ammo;
        ammo = 0;
        return bullets;
    }
}
