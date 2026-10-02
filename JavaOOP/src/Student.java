public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[]grades){
        validate(grades);
        this.name = name;
        this.grades = grades.clone();
    }
    public Student(String name){
        this(name, new int[]{});
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        validate(grades);
        this.grades = grades.clone();
    }

    public double getAvgGrade(){
        if (grades.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int g:grades){
            sum += g;
        }
        return sum == 0 ? 0 : sum / this.grades.length;
    }
    public boolean isExcellent(){
        if (grades.length == 0) return false;
        for (int grade:grades){
            if (grade != 5) return false;
        }
        return true;
    }
    private static void validate(int[] grades) {
        if (grades == null) {
            throw new IllegalArgumentException("grades == null");
        }
        for (int grade : grades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка вне диапазона" + grade);
            }
        }
    }

    @Override
    public String toString(){
        if (grades == null || grades.length == 0){
            return "grades: []";
        }
        String result = name + ": " + "[";
        for (int i=0; i<grades.length; i++){
            if(i>0){
                result += ", ";
            }
            result += grades[i];
        }
        return result +  "]";

    }
}