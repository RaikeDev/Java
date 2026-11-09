package ru.juravlev.math;

import java.util.Objects;

public final class Fraction extends Number implements Summable, Cloneable {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не должен быть 0");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double toDouble() {
        return doubleValue();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fraction) {
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;

        return new Fraction(numerator, denominator);
    }

    public Fraction mult(Fraction fraction) {
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.numerator;

        return new Fraction(numerator, denominator);
    }

    public Fraction div(Fraction fraction) {
        if (fraction.numerator == 0) throw new IllegalArgumentException("Знаменатель не должен быть 0");
        int denominator = this.denominator * fraction.numerator;
        int numerator = this.numerator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(Fraction fraction) {
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;

        return new Fraction(numerator, denominator);
    }

    public Fraction minus(int num) {
        int denominator = this.denominator;
        int numerator = this.numerator - num * this.denominator;

        return new Fraction(numerator, denominator);
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Fraction fraction = (Fraction) object;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
