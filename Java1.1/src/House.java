public class House {
    int floors = 0;
    @Override
    public String toString(){
        if (floors % 10 == 1) return ("дом с " + floors + " этажом");
        else return ("дом с " + floors + " этажами");
    }
}
