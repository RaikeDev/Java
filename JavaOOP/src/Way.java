public class Way {
    private City cityTo;
    private int cost;

    public Way(City cityTo, int cost){
        this.cityTo = cityTo;
        this.cost = cost;
    }

    public City getCityTo() {
        return cityTo;
    }

    public void setCityTo(City cityTo) {
        this.cityTo = cityTo;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return String.valueOf(cost);
    }
}
