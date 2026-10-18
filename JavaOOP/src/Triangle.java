class Triangle extends Figure {
    private final int a, b, c;

    public Triangle(int a, int b, int c){
        if (!(a < b + c) || !(b < a + c) || !(c < b + a)) throw new IllegalArgumentException("Такого треугольника не может быть");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    double area() {
        double p = (double) ((a + b + c) / 2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Площадь треугольника = " + area();
    }
}