public final class DoubleValue implements Summable {
    private final double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    @Override
    public double toDouble() {
        return value;
    }
}