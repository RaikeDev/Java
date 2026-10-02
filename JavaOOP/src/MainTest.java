public class MainTest {
    public static void task1_4_1(){
        Point point1 = new Point(3, 5);
        Point point2 = new Point(25, 6);
        Point point3 = new Point(7, 8);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }

    public static void task1_4_2(){
        Point point1 = new Point(1, 3);
        Point point2 = new Point(23, 8);
        Line firstLine = new Line(point1, point2);
        Line secondLine = new Line(5,10,25,10);
        Line connectLine = new Line(firstLine.getStart(), secondLine.getEnd());
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(connectLine);
    }

    public static void task1_4_3(){
        Point point1 = new Point(3,5);
        Point point2 = new Point(25,6);
        Point point3 = new Point(7,8);
        PolygonalLine pLine = new PolygonalLine(point1, point2, point3);
        System.out.println(pLine);
    }

    public static void task1_4_4(){
        House house = new House(2);
        House house2 = new House(35);
        House house3 = new House(91);
//        house.floors = 3;
        System.out.println(house);
    }

    public static void task1_4_5(){
        FullName kleo = new FullName("Клеопатра");
        FullName alex = new FullName("Александр", "Сергеевич", "Пушкин");
        FullName vladimir = new FullName("Владимир", "Маяковский");
        FullName christ = new FullName("Христофор", "Бонифатьевич");
        System.out.println(christ);
    }

    public static void task1_4_6(){
        Human lev = new Human("Лев");
        Human sergey = new Human(new FullName("Сергей", "Пушкин"), 0, lev);
        Human alexander = new Human(new FullName("Александр"), 0, sergey);

        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alexander);
    }

    public static void task1_4_7(){
        Student student1 = new Student("ivan");
        int[]grades = {5,4,5};
        Student student2 = new Student("ivan", grades);
        System.out.println(student2);
    }
    public static void task1_4_8(){
        City saratov = new City("Saratov");
        Way wayFromNY = new Way(saratov, 100);
        City newYork = new City("New York", wayFromNY);
        System.out.println(newYork);
    }

    public static void task1_5_1(){
        Gun gun = new Gun(3);
        System.out.println(gun.shot());
        System.out.println(gun.shot());
        System.out.println(gun.shot());
        System.out.println(gun.shot());
        System.out.println(gun.shot());

        System.out.println(gun);
    }
    public static void task1_5_2(){
        Cat barsik = new Cat("Барсик");
        System.out.println(barsik.meow());
        System.out.println(barsik.meow(3));
    }
    public static void task1_5_3(){
        Point point1 = new Point(1, 1);
        Point point2 = new Point(10, 15);
        Line line = new Line(point1, point2);


        System.out.println(line.length());
    }
    public static void task1_5_4(){
        Human man = new Human("vova");
        System.out.println(man);
        FullName petya = new FullName("Petya");
        Human petr = new Human(petya, 123, man);
        System.out.println(petr);
    }
    public static void task1_5_5(){
        Fraction f1 = new Fraction(12, 3);
        Fraction f2 = new Fraction(4, 6);
        Fraction f3 = new Fraction(-3, 6);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
        System.out.println(f1 + " + " + f2 + " / " + f3 + " - " + "5 = " + f1.sum(f2).div(f3).minus(5));
    }
    public static void task1_5_6(){
        Student s1 = new Student("Вася", new int[]{3,4,5,4});
        Student s2 = new Student("Петя", new int[]{5,5,5,5});
        System.out.println(s1.getAvgGrade());
        System.out.println(s2.getAvgGrade());
        System.out.println(s1.isExcellent());
        System.out.println(s2.isExcellent());
    }
    public static void task1_5_7(){
        PolygonalLine line = new PolygonalLine();

        line.addPoints(new Point(1, 5), new Point(2, 8), new Point(5, 3));

        System.out.println(line);
        System.out.println("Длина: " + line.length());

        line.addPoints(new Point(5, 15), new Point(8, 10));

        System.out.println(line);
        System.out.println("Длина: " + line.length());
    }
    public static void task1_5_8(){
        Square square = new Square(5, 3, 23);
        System.out.println(square);

        PolygonalLine line = square.squareSides();
        System.out.println(line);
        System.out.println("Длина: " + line.length());

        Point[] pts = line.getPoints();
        pts[pts.length - 1] = new Point(15, 25);
        line.setPoints(pts);

        System.out.println(line);
        System.out.println("Длина: " + line.length());
    }
    public static void task1_6_1(){
        System.out.println(new House(-3));
    }
}
