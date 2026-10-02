public class Way {
    City cityTo;
    int cost;

    public Way(City cityTo, int cost){
        this.cityTo = cityTo;
        this.cost = cost;
    }
    public String toString(){
        return cost + "";
    }
}
