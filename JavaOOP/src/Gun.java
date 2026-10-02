public class Gun {
    private int bullets;


    public Gun(){
        this.bullets = 5;
    }
    public Gun(int bullets){
        this.bullets = bullets;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public String shot(){
        if (this.bullets > 0){
            this.bullets -= 1;
            return "Бах!";
        }
        return "Клац!";
    }

    @Override
    public String toString(){
        return "Количество патронов: " + bullets;
    }
}
