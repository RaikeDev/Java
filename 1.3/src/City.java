public class City {
    String name;
    Way[] ways;

    public City(){}
    public City(String name, Way[] ways){
        this.name = name;
        this.ways = ways;

    }
    public String toString(){
        if (name == null){
            return "Город неизвестен";
        }
        String result = "Город '" + name + "', Пути из него: ";
        for (Way way : ways) {
            result += way.cityTo.name + ": " + way.cost + "; ";
        }
        return result;
    }

}
