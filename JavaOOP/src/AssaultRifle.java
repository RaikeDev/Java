public class AssaultRifle extends Gun {
    private final int RateOfFire;

    public AssaultRifle(){
        super(30);
        this.RateOfFire = 30;
        load(getMagazine());
    }
    public AssaultRifle(int magazine){
        super(magazine);
        load(getMagazine());
        this.RateOfFire = magazine/2;
    }
    public AssaultRifle(int magazine, int RateOfFire){
        super(magazine);
        load(getMagazine());
        if (RateOfFire <= 0) throw new IllegalArgumentException("Скорострельность - только положительные числа");
        else this.RateOfFire = RateOfFire;
    }

    public void shootTime(int time){
        int countShoot = this.RateOfFire * time;
        if (countShoot > getBullets()) load(0);
        else load(getBullets()-countShoot);
    }

    private int getBullets() {
        return ammo();
    }

    @Override
    public void shoot(){
        int limit = RateOfFire;
        while (getBullets() > 0 && limit > 0){
            limit -= 1;
            load(getBullets() - 1);
            System.out.println("Бах!");
        }
        System.out.println("Клац!");
    }
}
