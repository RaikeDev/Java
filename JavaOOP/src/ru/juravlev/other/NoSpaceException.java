package ru.juravlev.other;

public class NoSpaceException extends RuntimeException {
    public NoSpaceException() {
        super("No free space");
    }
}
