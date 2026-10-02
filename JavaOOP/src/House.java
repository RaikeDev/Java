public class House {
    private final int floors;

    public House(int floors){
        if (floors < 0) throw new IllegalArgumentException("argument must be positive");
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString(){
        if (floors % 10 == 1) return ("дом с " + floors + " этажом");
        else return ("дом с " + floors + " этажами");
    }
}
