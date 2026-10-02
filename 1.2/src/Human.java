class Human {
    private FullName name;
    private int height;

    @Override
    public String toString() {
        return "имя: " + name + ", рост: " + height;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public void setName(int height) {
        this.height = height;
    }

    public Human(FullName name, int height) {
        this.name = name;
        this.height = height;
    }

    public FullName getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }
}
