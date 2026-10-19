package ru.juravlev.city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private final List<Way> ways;

    public City(String name, Way... ways) {
        checkName(name);
        checkWays(ways);
        this.name = name;
        this.ways = new ArrayList<>();
        for (Way way : ways) {
            addWay(way);
        }
    }

    public City(String name) {
        this(name, new Way[0]);
    }

    public City(Way... ways) {
        checkWays(ways);
        this.ways = new ArrayList<>();
        for (Way way : ways) {
            addWay(way);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void setWays(Way... newWays) {
        checkWays(newWays);
        for (Way old : getWays()) {
            removeWay(old.getCityTo());
        }
        for (Way way : newWays) {
            addWay(way);
        }
    }

    public void addWay(Way way) {
        if (way == null) {
            throw new IllegalArgumentException("Путь не может быть null");
        }
        int index = indexOfCityTo(way.getCityTo());
        if (index >= 0) {
            ways.get(index).setCost(way.getCost());
            return;
        }
        ways.add(way);
    }

    public boolean removeWay(City destination) {
        int index = indexOfCityTo(destination);
        if (index == -1) {
            return false;
        }
        ways.remove(index);
        return true;
    }

    private int indexOfCityTo(City cityTo) {
        for (int i = 0; i < ways.size(); i++) {
            if (ways.get(i).getCityTo() == cityTo) {
                return i;
            }
        }
        return -1;
    }

    private static void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название города не может быть пустым");
        }
    }

    private static void checkWays(Way[] newWays) {
        if (newWays == null) {
            throw new IllegalArgumentException("Пути не могут быть null");
        }
        for (Way way : newWays) {
            if (way == null) {
                throw new IllegalArgumentException("Путь не может быть null");
            }
        }
    }

    public String toString() {
        if (name == null) {
            return "Город неизвестен";
        }
        String result = "Город '" + name + "'";
        if (!ways.isEmpty()) {
            result += ", Пути из него: ";
            for (Way way : ways) {
                result += way.getCityTo().getName() + ": " + way.getCost() + "; ";
            }
        }
        return result;
    }

}
