import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades){
        if (grades == null) this.grades = new ArrayList<>();
        else this.grades = new ArrayList<>(grades);
        this.name = name;

    }
    public Student(String name){
        this(name, new ArrayList<>());
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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {

        this.grades = new ArrayList<>(grades);
    }

    public double getAvgGrade(){
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int g:grades){
            sum += g;
        }
        return sum == 0 ? 0 : sum / this.grades.size();
    }
    public boolean isExcellent(){
        if (grades.isEmpty()) return false;
        for (int grade:grades){
            if (grade != 5) return false;
        }
        return true;
    }
    private void validate(ArrayList<Integer> grades) {
        if (grades == null) {
             this.grades = new ArrayList<>();
        }
        for (Integer grade : grades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка вне диапазона " + grade);
            }
        }
    }

    @Override
    public String toString(){
        if (grades == null || grades.isEmpty()){
            return "grades: []";
        }
        String result = name + ": " + "[";
        for (int i=0; i<grades.size(); i++){
            if(i>0){
                result += ", ";
            }
            result += grades.get(i);
        }
        return result +  "]";

    }
}