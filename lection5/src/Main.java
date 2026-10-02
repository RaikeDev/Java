import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(){
        List<Integer> lst = new ArrayList<>();
        lst.toArray();


        Student st = new Student("vasia");
        st.addGrade(99);
        System.out.println(st);
    }
}

class Student{
    private String name;
    private List<Integer> grades = new ArrayList<>();

    /**
     * инкапсуляция - обеспечение безопасности работы с объектом
     * инкапсуляция состояния
     * инкапсуляция поведения - у объекта должен быть интерфейс взаимодействия с ним;
     * можно добавлять новое,
     * но менять старое только так чтобы оно не ломало ранее работавшее
     * интерфейс объекта - это список его публичных методов
     */
    public Student(String name){
        this(name, new ArrayList<>());
    }

    public Student(String name, List<Integer> grades){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("name must be not empty");
        }
        this.name = name;
        for (int x:grades){
            if (x<2 || x>5){
                throw new IllegalArgumentException();
            }
        }
        this.grades = new ArrayList<>(grades);
    }

    public void setName(String name) {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("name must be not empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void addGrade(int x){
        if (x >= 2 && x <= 5){
            grades.add(x);
        }
    }

    /**
     * для того чтобы не получать доступ через getGrades. Потому что изменяемый тип данных.
     * но засоряет память
     */
    public List<Integer> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\''+
                ", grades=" + grades + '}';
    }
}
