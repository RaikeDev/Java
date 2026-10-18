public class Way {
    private final City cityTo;
    private int cost;

    public Way(City cityTo, int cost){
        if (cityTo == null) {
            throw new IllegalArgumentException("Город не может быть null");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной");
        }
        this.cityTo = cityTo;
        this.cost = cost;
    }
    public Way(City cityTo){
        if (cityTo == null) {
            throw new IllegalArgumentException("Город не может быть null");
        }
        this.cityTo = cityTo;
    }

    public City getCityTo() {
        return cityTo;
    }

//    public void setCityTo(City cityTo) {
//        this.cityTo = cityTo;
//    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной");
        }
        this.cost = cost;
    }

    @Override
    public String toString(){
        return cityTo.getName() + ": " + cost;
    }
}
