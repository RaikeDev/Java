import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Line line = new Line(1,2,3,5);
        Line line1 = new Line(1,2,8,5);
        PolygonalLine
        System.out.println(findMax(line, line1));
    }
    public static double sum(Number...nums){
        double res = 0;
        for(Number i:nums){
            res += i.doubleValue();
        }
        return res;
    }
    public static Lengthable findMax(Lengthable...objects){
        double max = objects[0].length();
        Lengthable ob = objects[0];
        for (Lengthable object : objects) {
            double length = object.length();
            if (length > max) {
                max = length;
                ob = object;
            }
        }
        return ob;
    }

    public static PolygonalLine Polygonalable(Polygonalable...polyLines){
        PolygonalLine returnLine = polyLines[0].getPolyLine();
        for (Polygonalable i:polyLines){
            returnLine.addPoints(i.getPolyLine().getPoints());
        }
        return returnLine;
    }

    public static List<Student> sortByGrade(Student...students){
        List<Student> sortStudents = new ArrayList<Student>(List.of(students));
        return sortStudents.sort(compare(students[0], students[1]));


    }
    @Override
    static int compare(Student o1, Student o2) {
        if (o1.getAvgGrade() > o2.getAvgGrade()){
            return 1;
        };
        if (o1.getAvgGrade() == o2.getAvgGrade()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
