import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(){
        Student s1 = new Student("vasya", null);
        Student s2 = new Student("petya", Rule.ofRange(2,5), List.of());
        s1.addGrade(888);
        Rule.EMPTY.checkWithCode(7);
    }
//        List<Integer> lst = new ArrayList<>();
////        lst.toArray();
//
//
//        Student st = new Student("vasia");
//        st.addGrade(99);
//        System.out.println(st);
//    }
}

interface Addable{
    void addFirst(int x);
}

class Student{
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private Rule rule;

    /**
     * полиморфизм - написани кода через использование механизма где ссылка определяет ЧТО ДОСТУПНО
     * а объект определяет как работает
     *
     * инкапсуляция - обеспечение безопасности работы с объектом
     * инкапсуляция состояния
     * инкапсуляция поведения - у объекта должен быть интерфейс взаимодействия с ним;
     * можно добавлять новое,
     * но менять старое только так чтобы оно не ломало ранее работавшее
     *
     * интерфейс объекта - это список его публичных методов
     */
    public Student(String name){
        this(name, Rule.EMPTY, List.of());
    }
    public Student(String name, Rule rule){
        this(name, rule, List.of());
    }

    public Student(String name, Rule rule, List<Integer> grades){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("name must be not empty");
        }
        this.name = name;
        this.rule = rule == null ? Rule.EMPTY : rule;
        if (grades == null) throw new IllegalArgumentException("grades must be not null");
        this.grades = new ArrayList<>(grades);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("name must be not empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void addGrade(int x){
        if (!rule.check(x)) throw new IllegalArgumentException("grade " + x + " is not allowed");
        grades.add(x);
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
