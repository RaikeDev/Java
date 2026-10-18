import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Coordinates {
    private final int[] values;

    public Coordinates(int... values) {
        if (values.length < 1 || values.length > 3) {
            throw new IllegalArgumentException("Expected 1 to 3 coordinates, got " + values.length);
        }
        this.values = values.clone();
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}