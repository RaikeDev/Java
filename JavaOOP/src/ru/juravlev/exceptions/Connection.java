package ru.juravlev.exceptions;

import java.util.Random;

public class Connection implements AutoCloseable {
    private String address;
    private boolean isClosed;
    private String[] data;


    public Connection(String address) {
        setIsClosed(false);
        this.address = address;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean value) {
        this.isClosed = value;
    }

    public String getData() throws NetworkErrorException {
        if (isClosed()) throw new ClosedResourceException();
        Random random = new Random();
        if (random.nextInt(1, 3) == 1) throw new NetworkErrorException();
        else return "test connection";
    }


    @Override
    public void close() throws Exception {
        setIsClosed(true);
    }
}
