public final class GeneralArea {
    public static double generalArea(Figure... figures) {
        double res = 0;
        for (Figure figure : figures) {
            if (figure == null) {
                throw new NullPointerException("figure is null");
            }
            res += figure.area();
        }
        return res;
    }
}
