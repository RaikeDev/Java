

public class MainTest {
    public static void task1_3_1(){
        int[] vasyaGrades = new int[]{3,4,5};
        Student vasya = new Student("Vasya", vasyaGrades);
//        System.out.println(vasya);
        Student petya = new Student("Petya", vasya.grades);
//        System.out.println(petya);
        petya.grades[0] = 5;
        System.out.println(vasya);
        System.out.println(petya);
        int[] andreyGrades = vasyaGrades;
        Student andrey = new Student("Andrey", andreyGrades);
        System.out.println(andrey);
    }

    public static void task1_3_2(){
        Point point1 = new Point(1,4);
        Point point2 = new Point(-9,3);
        Point[] points= new Point[]{point1, point2};
        PolygonalLine polygonalLine = new PolygonalLine(points);
        System.out.println(polygonalLine);
    }

    public static void task1_3_3(){
        City a = new City("a", null);
        City b = new City("b", null);
        City c = new City("c", null);
        City d = new City("d", null);
        City e = new City("e", null);
        City f = new City("f", null);
        a.ways = new Way[]{new Way(f, 1), new Way(b, 5), new Way(d, 6)};
        b.ways = new Way[]{new Way(a, 5), new Way(c, 3)};
        c.ways = new Way[]{new Way(b, 3), new Way(d, 4)};
        d.ways = new Way[]{new Way(a, 6), new Way(e, 2), new Way(c, 4)};
        e.ways = new Way[]{new Way(f, 2)};
        f.ways = new Way[]{new Way(e, 2), new Way(b, 1)};

        System.out.println(a);
    }

    public static void task1_3_4(){
        Department it = new Department("it");
        Employee stas = new Employee("stasik", it);
        Employee vova = new Employee("vova", it);
        Employee borya = new Employee("borya", it);
        Employee[] employees = new Employee[]{stas, vova, borya};
        it.setEmployees(employees);

        for (Employee e : stas.getDepartment().getEmployees()) {
            System.out.print(e.getName() + " ");
        }
    }

}
