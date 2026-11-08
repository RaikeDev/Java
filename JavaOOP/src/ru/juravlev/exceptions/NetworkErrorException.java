package ru.juravlev.exceptions;

public class NetworkErrorException extends Exception {
    public NetworkErrorException() {
    }

    ;

    public NetworkErrorException(String message) {
        super(message);
    }

    public NetworkErrorException(Throwable throwable) {
        super(throwable);
    }

    public NetworkErrorException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
