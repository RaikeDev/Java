public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException();
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
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

    public String toString(){
        return numerator + "/" + denominator;
    }
}
