import java.util.ArrayList;
import java.util.List;

public final class PointWithCharacteristic{
    private final Coordinates coordinates;
    private final List<Characteristic> characteristics = new ArrayList<>();


    public PointWithCharacteristic(Coordinates coordinates) {
        if (coordinates == null) throw new IllegalArgumentException("Точка не задана");
        else {
            this.coordinates = coordinates;
        }
    }


    public PointWithCharacteristic with(Characteristic characteristic){
        if (characteristic == null) throw new IllegalArgumentException("Не переданы характеристики");
        else {
            characteristics.add(characteristic);
        }
        return this;
    }

    public List<Characteristic> getCharacteristics() {
        return List.copyOf(characteristics);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        String result = "{" + coordinates;
        for (Characteristic characteristic : characteristics) {
            result += ", " + characteristic;
        }
        return result + "}";
    }
}
