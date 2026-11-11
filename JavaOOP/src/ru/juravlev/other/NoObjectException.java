package ru.juravlev.other;

public class NoObjectException extends RuntimeException {
    public NoObjectException() {
        super("No object");
    }
}
