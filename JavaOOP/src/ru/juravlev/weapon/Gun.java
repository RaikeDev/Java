package ru.juravlev.weapon;

public class Gun extends Weapon {
    private final int magazine;

    public Gun(int magazine) {
        this(Math.min(5, magazine), magazine);
    }

    public Gun(int bullets, int magazine) {
        super(checkBullets(bullets, magazine));
        this.magazine = magazine;
    }

    public int getMagazine() {
        return magazine;
    }

    @Override
    public int load(int ammo) {
        if (ammo > magazine) {
            throw new IllegalArgumentException("Патронов больше, чем вмещает магазин");
        }
        return super.load(ammo);
    }


    public int reload(int bullets) {
        if (bullets <= 0) {
            throw new IllegalArgumentException("Передано слишком маленькое число");
        }
        int loaded = Math.min(bullets, magazine - ammo());
        load(ammo() + loaded);
        return bullets - loaded;
    }

    public int discharge() {
        return load(0);
    }

    public boolean isCharge() {
        return ammo() > 0;
    }

    @Override
    public void shoot() {
        if (getAmmo()) {
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    private static int checkBullets(int bullets, int magazine) {
        if (magazine <= 0) {
            throw new IllegalArgumentException("Максимальная вместимость магазина должна быть больше 0");
        }
        if (bullets < 0 || bullets > magazine) {
            throw new IllegalArgumentException("Количество патронов должно быть от 0 до вместимости магазина");
        }
        return bullets;
    }
}
