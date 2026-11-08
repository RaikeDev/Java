package ru.juravlev.exceptions;

public class ClosedResourceException extends RuntimeException {
    public ClosedResourceException() {
        super("попытка использования закрытого ресурса");
    }
}
