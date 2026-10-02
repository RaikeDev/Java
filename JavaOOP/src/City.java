public class City {
    private String name;
    private Way[] ways;

    public City(){}

    public City(String name, Way...ways){
        this.name = name;
        this.ways = ways;
    }
    public City(String name){
        this(name, new Way[]{});
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Way[] getWays() {
        return ways;
    }

    public void setWays(Way[] ways) {
        this.ways = ways;
    }

    public String toString(){
        if (name == null){
            return "Город неизвестен";
        }
        String result = "Город '" + name + "', Пути из него: ";
        for (Way way : ways) {
            result += way.getCityTo().getName() + ": " + way.getCost() + "; ";
        }
        return result;
    }

}
