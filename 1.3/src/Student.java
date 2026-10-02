public class Student {
    public String name;
    public int[] grades;

    public Student(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString(){
        if (grades == null){
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
