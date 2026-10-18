public class TwowayRoad extends City {
    public TwowayRoad(String name, Way... ways) {
        super(name, ways);
    }
    public TwowayRoad(Way... ways) {
        super(ways);
    }
    @Override
    public void addWay(Way way) {
        super.addWay(way);
        City destination = way.getCityTo();
        if (!hasWay(destination, this, way.getCost())) {
            destination.addWay(new Way(this, way.getCost()));
        }
    }
    @Override
    public boolean removeWay(City destination) {
        boolean removed = super.removeWay(destination);
        if (removed) {
            destination.removeWay(this);
        }
        return removed;
    }

    private static boolean hasWay(City from, City to, int cost) {
        for (Way way : from.getWays()) {
            if (way.getCityTo() == to && way.getCost() == cost) {
                return true;
            }
        }
        return false;
    }
}
