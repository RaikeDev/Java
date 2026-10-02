public class MainTest {
    public static void task1_2_1(){
        Point start = new Point(1,2);
        Point end = new Point(12,5);
        Line line = new Line(start, end);
        System.out.println(line);
    }
    public static void task1_2_2(){
        FullName name = new FullName("Пушкин");
        Human pushkin = new Human(name, 162);

        System.out.println(pushkin);
    }
    public static void task1_2_3(){
        FullName fatherName = new FullName("Чудов", "Иван");
        Human father = new Human(fatherName, 178);
        FullName name = new FullName("Чудов", "Петр");

        HumanWithFather humanWithFather = new HumanWithFather(name, 162, father);

        System.out.println(humanWithFather);
        System.out.println(father);
    }

    public static void task1_2_4(){
        Department it = new Department("IT");

        Employee petrov = new Employee("Петров", it);
        it.setBoss(petrov);

        System.out.println(it);
        System.out.println(petrov);
    }
    
}
