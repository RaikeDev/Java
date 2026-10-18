public final class Fraction extends Number implements Summable{
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
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

    public Fraction sum(Fraction fraction){
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;

        return new Fraction(numerator, denominator);
    }
    public Fraction mult(Fraction fraction){
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.numerator;

        return new Fraction(numerator, denominator);
    }
    public Fraction div(Fraction fraction){
        if (fraction.numerator == 0) throw new IllegalArgumentException("Знаменатель не должен быть 0");
        int denominator = this.denominator * fraction.numerator;
        int numerator = this.numerator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }
    public Fraction minus(Fraction fraction){
        int denominator = this.denominator * fraction.denominator;
        int numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;

        return new Fraction(numerator, denominator);
    }
    public Fraction minus(int num){
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
    public String toString(){
        return numerator + "/" + denominator;
    }
}
