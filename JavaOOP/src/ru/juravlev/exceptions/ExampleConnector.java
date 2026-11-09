package ru.juravlev.exceptions;

import java.util.Random;

public class ExampleConnector {
    public void register() {
        if (new Random().nextBoolean()) throw new RuntimeException();
        System.out.println("register connection");
    }

    public void unregister() {
        System.out.println("unregister connection");
    }

    public void makeConnect(Connection conn) throws NetworkErrorException {
        register();
        conn.getData();
        unregister();
    }
}