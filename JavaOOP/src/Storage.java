public final class Storage<T> {
    private final T object;

    public Storage(T object) {
        this.object = object;
    }

    public T get(T alternative) {
        return object != null ? object : alternative;
    }

    public T getRaw() {
        return object;
    }
}
