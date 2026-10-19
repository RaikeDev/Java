package ru.juravlev.people;

public class Check0to1 implements Checker {
    @Override
    public boolean check(int x) {
        return x >= 0 && x <= 1;
    }
}
