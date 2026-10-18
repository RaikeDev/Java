import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void task1_4_1() {
        Point2D point2D1 = new Point2D(3, 5);
        Point2D point2D2 = new Point2D(25, 6);
        Point2D point2D3 = new Point2D(7, 8);
        System.out.println(point2D1);
        System.out.println(point2D2);
        System.out.println(point2D3);
    }

    public static void task1_4_2() {
        Point2D point2D1 = new Point2D(1, 3);
        Point2D point2D2 = new Point2D(23, 8);
        Line firstLine = new Line(point2D1, point2D2);
        Line secondLine = new Line(5, 10, 25, 10);
        Line connectLine = new Line(firstLine.getStart(), secondLine.getEnd());
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(connectLine);
    }

    public static void task1_4_3() {
        Point2D point2D1 = new Point2D(3, 5);
        Point2D point2D2 = new Point2D(25, 6);
        Point2D point2D3 = new Point2D(7, 8);
        PolygonalLine pLine = new PolygonalLine(point2D1, point2D2, point2D3);
        System.out.println(pLine);
    }

    public static void task1_4_4() {
        House house = new House(2);
        House house2 = new House(35);
        House house3 = new House(91);
//        house.floors = 3;
        System.out.println(house);
    }

    public static void task1_4_5() {
        FullName kleo = new FullName("Клеопатра");
        FullName alex = new FullName("Александр", "Сергеевич", "Пушкин");
        FullName vladimir = new FullName("Владимир", "Маяковский");
        FullName christ = new FullName("Христофор", "Бонифатьевич");
        System.out.println(christ);
    }

    public static void task1_4_6() {
        Human lev = new Human("Лев");
        Human sergey = new Human(new FullName("Сергей", "Пушкин"), 0, lev);
        Human alexander = new Human(new FullName("Александр"), 0, sergey);

        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alexander);
    }

    public static void task1_4_7() {
        Student student1 = new Student("ivan");
        ArrayList<Integer> grades = new ArrayList<>(List.of(5, 3, 6));
        Student student2 = new Student("ivan", grades);
        System.out.println(student2);
    }

    public static void task1_4_8() {
        City saratov = new City("Saratov");
        Way wayFromNY = new Way(saratov, 100);
        City newYork = new City("New York", wayFromNY);
        System.out.println(newYork);
    }

    public static void task1_5_1() {
        Gun gun = new Gun(3);
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();

        System.out.println(gun);
    }

    public static void task1_5_2() {
        Cat barsik = new Cat("Барсик");
        barsik.meow();
        barsik.meow(3);
    }

    public static void task1_5_3() {
        Point2D point2D1 = new Point2D(1, 1);
        Point2D point2D2 = new Point2D(10, 15);
        Line line = new Line(point2D1, point2D2);


        System.out.println(line.length());
    }

    public static void task1_5_4() {
        Human man = new Human("vova");
        System.out.println(man);
        FullName petya = new FullName("Petya");
        Human petr = new Human(petya, 123, man);
        System.out.println(petr);
    }

    public static void task1_5_5() {
        Fraction f1 = new Fraction(12, 3);
        Fraction f2 = new Fraction(4, 6);
        Fraction f3 = new Fraction(-3, 6);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
        System.out.println(f1 + " + " + f2 + " / " + f3 + " - " + "5 = " + f1.sum(f2).div(f3).minus(5));
    }

    public static void task1_5_6() {
        Student s1 = new Student("Вася", new ArrayList<>(List.of(3, 4, 5, 4)));
        Student s2 = new Student("Петя", new ArrayList<>(List.of(5, 5, 5, 5)));
//        System.out.println("-----------------");
        System.out.println(s1.getAvgGrade());
        System.out.println(s2.getAvgGrade());
        System.out.println(s1.isExcellent());
        System.out.println(s2.isExcellent());
    }

    public static void task1_5_7() {
        PolygonalLine line = new PolygonalLine();

        line.addPoints(new Point2D(1, 5), new Point2D(2, 8), new Point2D(5, 3));

        System.out.println(line);
        System.out.println("Длина: " + line.length());

        line.addPoints(new Point2D(5, 15), new Point2D(8, 10));

        System.out.println(line);
        System.out.println("Длина: " + line.length());
    }

    public static void task1_5_8() {
        Square square = new Square(5, 3, 23);
        System.out.println(square);

        PolygonalLine line = square.squareSides();
        System.out.println(line);
        System.out.println("Длина: " + line.length());

        List<Point2D> pts = line.getPoints();
        pts.set(pts.size() - 1, new Point2D(15, 25));
        line.setPoints(pts);

        System.out.println(line);
        System.out.println("Длина: " + line.length());
    }

    public static void task1_6_1() {
        System.out.println(new House(-3));
    }

    public static void task1_6_2() {
        FullName mayakovsky = new FullName("Владимир", "Маяковский");

        System.out.println(mayakovsky);
    }

    public static void task1_6_3() {
        Square square = new Square(1, 1, 23);
        square.setSideLength(12);
        System.out.println(square);
    }

    public static void task1_6_4() {
        Fraction f1 = new Fraction(4, -6);
        System.out.println(f1);
    }

    public static void task1_6_5() {
        Gun gun = new Gun(7);

        gun.reload(3);
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();

        gun.reload(8);
        gun.shoot();
        gun.shoot();

        gun.discharge();
        gun.shoot();
    }

    public static void task1_6_6() {
        Point2D p1 = new Point2D(4, 4);
        Point2D p2 = new Point2D(46, 49);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p1);
        l1.setStart(5, 7);
        System.out.println(l1.getStart());
        System.out.println(l2);
    }

    //    public static void task1_6_7() {
//
//    }
//    public static void task1_6_8() {
//        Student s1 = new Student("fedor", new int[]{1,3,4});
//        System.out.println(s1);
//    }
    public static void task1_6_9() {
        City moscow = new City("Москва");
        City varshava = new City("Варшава");
        City saratov = new City("Саратов");

        City piter = new City("Питер",
                new Way(moscow, 700),
                new Way(varshava, 900));
        System.out.println(piter);

        moscow.addWay(new Way(varshava, 100));
        moscow.addWay(new Way(saratov, 300));
        System.out.println(moscow);

        moscow.addWay(new Way(varshava, 150));
        System.out.println(moscow);

        moscow.removeWay(saratov);
        System.out.println(moscow);
    }

    public static void task1_6_10() {
//        Department it = new Department("IT");
//        Employee kozlov = new Employee("Козлов", it);
//        Department hr = new Department("HR");
//        Employee smirnova = new Employee("Смирнова", hr);
//
//        kozlov.setDepartment(hr);
//        System.out.println(kozlov);
//        System.out.println(hr.getTitle()+":"+hr.getEmployees());
//        System.out.println(hr);

        Department it = new Department("it");
        System.out.println("------------Зачисляем васю и петю в it------------");


    }

    public static void task2_1_2() {
        ClosedLine cl = new ClosedLine(new Point2D(1, 4), new Point2D(4, 2), new Point2D(46, 2), new Point2D(1, 1));
        System.out.println(cl);
    }

    public static void task2_1_3() {
        TwowayRoad boston = new TwowayRoad("Boston");
        TwowayRoad twr = new TwowayRoad("New York", new Way(boston, 19));
        System.out.println(boston);
        System.out.println(twr);
    }

    public static void task2_1_4() {
        AssaultRifle assaultRifle = new AssaultRifle(40, 5);
        assaultRifle.shoot();
        System.out.println(assaultRifle);
        assaultRifle.shootTime(10);
        System.out.println(assaultRifle);
        assaultRifle.reload(33);
        System.out.println(assaultRifle);
    }

    public static void task2_1_5() {
        Point3D pointXYZ = new Point3D(1, 2, 3);
        System.out.println(pointXYZ);
    }

    public static void task2_2_3() {
        Sparrow sparrow = new Sparrow();
        sparrow.sing();
        Cuckoo cuckoo = new Cuckoo();
        cuckoo.sing();
        Parrot parrot = new Parrot("хехехехехе");
        parrot.sing();
    }

    public static void task2_2_4() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 6);
        SquareFigure square = new SquareFigure(11);
        Triangle triangle = new Triangle(3, 6, 7);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);
    }

    public static void task2_2_5() {
        Color color = new Color("red");
        PointWithCharacteristic point = new PointWithCharacteristic(new Coordinates(0, 1)).with(color);
        System.out.println(point);
    }

    public static void task2_3_1() {
        System.out.println(Calculator.sum(
                new IntegerValue(2), new Fraction(3, 5), new DoubleValue(2.3)));

        System.out.println(Calculator.sum(
                new DoubleValue(3.6), new Fraction(49, 12),
                new IntegerValue(3), new Fraction(3, 2)));

        System.out.println(Calculator.sum(
                new Fraction(1, 3), new IntegerValue(1)));
    }

    public static void practice() {
        Point2D point2D = new Point2D(1, 2);
        Point3D pointXYZ = new Point3D(1, 2, 3);
        System.out.println(point2D);
        System.out.println(pointXYZ);
        Point2D point2D1 = new Point2D(point2D);
        Point2D point2D2 = new Point2D(pointXYZ);
        System.out.println(point2D1);
        System.out.println(point2D2);
        Point3D point3D1 = new Point3D(point2D);
        Point3D point3D2 = new Point3D(pointXYZ);
        System.out.println(point3D1);
        System.out.println(point3D2);
    }


    public static void task2_3_2() {

        SingingBird.singAll(new Sparrow(), new Cuckoo(), new Parrot("parrot sing like this"), new Sparrow());
    }

    public static void task2_3_3() {
        double genArea = GeneralArea.generalArea(new Triangle(12, 3, 10), new SquareFigure(2), new Circle(8));
        System.out.println(genArea);
    }

    public static void task2_3_4() {
        Mewing.mewing(new Cat("egor"));
    }
}
