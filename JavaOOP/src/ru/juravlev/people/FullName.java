package ru.juravlev.people;

public class FullName {
    private final String secName;
    private final String firstName;
    private final String patronymic;

    public FullName(String firstName, String secName, String patronymic) {
        this.firstName = firstName;
        this.secName = secName;
        this.patronymic = patronymic;

        if (this.firstName == null && this.secName == null && this.patronymic == null) {
            throw new IllegalArgumentException("Хотя бы один параметр должен быть задан");
        }
    }

    public FullName(String firstName, String secName) {
        this(firstName, secName, null);
    }

    public FullName(String firstName) {
        this(firstName, null, null);
    }

    public FullName(FullName name) {
        if (name.firstName == null && name.secName == null && name.patronymic == null) {
            throw new IllegalArgumentException("Хотя бы один параметр должен быть задан");
        }
        this.firstName = name.firstName;
        this.secName = name.secName;
        this.patronymic = name.patronymic;
    }

    public String getSecName() {
        return secName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        if (secName == null && patronymic == null) {
            return firstName;
        }
        if (patronymic == null) {
            return firstName + " " + secName;
        }
        return firstName + " " + secName + " " + patronymic;
    }
}

