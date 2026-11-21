package ru.juravlev.main;

import ru.juravlev.animal.*;
import ru.juravlev.exceptions.ClosedResourceException;
import ru.juravlev.exceptions.Connection;
import ru.juravlev.exceptions.ExampleConnector;
import ru.juravlev.exceptions.NetworkErrorException;
import ru.juravlev.geometry.*;
import ru.juravlev.math.*;
import ru.juravlev.other.*;
import ru.juravlev.people.*;
import ru.juravlev.weapon.AssaultRifle;
import ru.juravlev.weapon.Gun;
import ru.juravlev.weapon.Shooter;
import ru.juravlev.work.Department;
import ru.juravlev.city.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.math.BigInteger;

public class MainTest {
    public static void task1_4_1() {
        Point Point1 = new Point(3, 5);
        Point Point2 = new Point(25, 6);
        Point Point3 = new Point(7, 8);
        System.out.println(Point1);
        System.out.println(Point2);
        System.out.println(Point3);
    }

    public static void task1_4_2() {
        Point Point1 = new Point(1, 3);
        Point Point2 = new Point(23, 8);
        Line firstLine = new Line(Point1, Point2);
        Line secondLine = Line.of(5, 10, 25, 10);
        Line connectLine = new Line(firstLine.getStart(), secondLine.getEnd());
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(connectLine);
    }

    public static void task1_4_3() {
        Point Point1 = new Point(3, 5);
        Point Point2 = new Point(25, 6);
        Point Point3 = new Point(7, 8);
        Polyline pLine = new Polyline(Point1, Point2, Point3);
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
        Point Point1 = new Point(1, 1);
        Point Point2 = new Point(10, 15);
        Line line = new Line(Point1, Point2);


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
        Polyline line = new Polyline();

        line.addPoints(new Point(1, 5), new Point(2, 8), new Point(5, 3));

        System.out.println(line);
        System.out.println("Длина: " + line.length());

        line.addPoints(new Point(5, 15), new Point(8, 10));

        System.out.println(line);
        System.out.println("Длина: " + line.length());
    }

    public static void task1_5_8() {
        Square square = new Square(5, 3, 23);
        System.out.println(square);

        Polyline line = square.getPolyline();
        System.out.println(line);
        System.out.println("Длина: " + line.length());

        List<Point> pts = line.getPoints();
        pts.set(pts.size() - 1, new Point(15, 25));
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

        gun.unload();
        gun.shoot();
    }

    public static void task1_6_6() {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(46, 49);
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
//        ru.juravlev.people.Student s1 = new ru.juravlev.people.Student("fedor", new int[]{1,3,4});
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
//        ru.juravlev.work.Department it = new ru.juravlev.work.Department("IT");
//        ru.juravlev.work.Employee kozlov = new ru.juravlev.work.Employee("Козлов", it);
//        ru.juravlev.work.Department hr = new ru.juravlev.work.Department("HR");
//        ru.juravlev.work.Employee smirnova = new ru.juravlev.work.Employee("Смирнова", hr);
//
//        kozlov.setDepartment(hr);
//        System.out.println(kozlov);
//        System.out.println(hr.getTitle()+":"+hr.getEmployees());
//        System.out.println(hr);

        Department it = new Department("it");
        System.out.println("------------Зачисляем васю и петю в it------------");
    }


    public static void task2_1_2() {
        ClosedPolyline cl = new ClosedPolyline(new Point(1, 4), new Point(4, 2), new Point(46, 2), new Point(1, 1));
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
        Point Point = new Point(1, 2);
        Point3D pointXYZ = new Point3D(1, 2, 3);
        System.out.println(Point);
        System.out.println(pointXYZ);
        Point Point1 = new Point(Point);
        Point Point2 = new Point(pointXYZ);
        System.out.println(Point1);
        System.out.println(Point2);
        Point3D point3D1 = new Point3D(Point);
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

    public static void task2_3_5() {
        System.out.println(LengthSummer.lengthSummer(Line.of(1, 2, 2, 5), new ClosedPolyline(new Point(2, 5), new Point(5, 3))));
    }

    public static void task2_3_6() {
        System.out.println(new Square(new Point(1, 3), 2).getPolyline());
    }

    public static void task2_3_7() {
        System.out.println(new Breakdowns(new Square(1, 1, 12), new Polyline(new Point(1, 2), new Point(2, 3))));
    }

    public static void task2_3_8() {
        Shooter noWpn = new Shooter("vova");
        Shooter withGun = new Shooter("vova");
        withGun.setWeapon(new Gun(2));
        Shooter withAssaultRifle = new Shooter("vova");
        withAssaultRifle.setWeapon(new AssaultRifle(5));

        noWpn.shoot();
        withGun.shoot();
        withAssaultRifle.shoot();
    }

    public static void task2_3_9() {
        Student vasya = new Student("vasya", new ArrayList<>(List.of(0, 1, 1)), new Check0to1());
        Student petya = new Student("petya", new ArrayList<>(List.of(0, 8, 2)), new CheckEven());
        System.out.println(vasya);
        System.out.println(petya);
    }

    public static void task3_1_3() {
        System.out.println(Calculator.sum(new IntegerValue(7), new Fraction(11, 3), new DoubleValue(3.21), new BigIntegerValue(new BigInteger("12345678912345678912"))));
    }

    public static void task3_1_4() {
        System.out.println(Pow.toPow("4", "3"));
    }

    public static void task3_1_5() {
        ru.juravlev.geometry.Point point1 = new Point(1, 2);
        java.awt.Point point2 = new java.awt.Point(4, 3);
        System.out.println(point1);
        System.out.println(point2);
    }

    public static void task3_2_1() {

    }

    public static void test1(Student s, int... values) {
        ArrayList<Integer> copy = (ArrayList<Integer>) s.getGrades();
        for (int v : values) {
            try {
                s.addGrade(v);
            } catch (IllegalGradeException e) {
                s.setGrades(copy);
                return;
            }
        }
    }

    public static void test2(Student s, int... values) {
        ArrayList<Integer> copy = (ArrayList<Integer>) s.getGrades();
        for (int v : values) {
            copy.add(v);
        }
        s.setGrades(copy);
    }


    public static void task4_2_1() {
        Connection con = new Connection("ermakov.edu");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(con.getData());
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }

    public static int task4_2_2(String... str) {
        List<Integer> array = new ArrayList<>();
        for (String s : str) {
            try {
                array.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        if (array.isEmpty()) {
            throw new IllegalArgumentException("Нет чисел");
        }

        int result = array.getFirst();

        for (int i = 1; i < array.size(); i++) {
            result /= array.get(i);
        }

        return result;
    }

//    public static void task4_2_3(List<Student> students) {
//        students.forEach(s -> s.addGrade((int) (Math.random() * 10) + 1));
//
//
//    }

//    public static void task4_2_3(int x, Student... students) {
//        List<List<Student>> copy = new ArrayList<>();
//        for (Student s : students) {
//            copy.add(s.getGrades());
//        }
//
//        try {
//            for (Student s : students) {
//                s.addGrade(x);
//            }
//        } catch (IllegalGradeException e) {
//            for (int i = 0; i < copy.size(); i++) {
//                students[i].setGrades(copy.get(i));
//            }
//        }
//    }

    public static void task4_2_4() {
        ExampleConnector connector = new ExampleConnector();
        Connection conn = new Connection("127.0.0.1");

        try {
            connector.makeConnect(conn);
        } catch (NetworkErrorException | ClosedResourceException e) {
            connector.unregister();
        } catch (RuntimeException e) {

        }

    }

    //    public static void task6_1_2() {
//        ru.juravlev.other.Storage<Integer> s1 = new ru.juravlev.other.Storage<>(null);
//        System.out.println(extractNumber(s1, 0));
//
//        ru.juravlev.other.Storage<Integer> s2 = new ru.juravlev.other.Storage<>(99);
//        System.out.println(extractNumber(s2, -1));
//
//        ru.juravlev.other.Storage<String> s3 = new ru.juravlev.other.Storage<>(null);
//        System.out.println(extractString(s3, "default"));
//
//        ru.juravlev.other.Storage<String> s4 = new ru.juravlev.other.Storage<>("hello");
//        System.out.println(extractString(s4, "hello world"));
//    }
//
    public static Integer extractNumber(ru.juravlev.other.Storage<Integer> storage, Integer alternative) {
        return storage.get(alternative);
    }

    public static String extractString(ru.juravlev.other.Storage<String> storage, String alternative) {
        return storage.get(alternative);
    }


//    public static void task6_1_3()

    public static void task6_2_1() {
        Line<Point> l = new Line<>(new Point(2, 4), new Point(2, 1));
        System.out.println(l);
        Section6_2.moveX(l);
        System.out.println(l);
    }

    public static void task6_2_2() {
        System.out.println(Section6_2.findMax(List.of(new Box<Integer>(5), new Box<Double>(3.0), new Box<Float>(53.9f))));
    }

    public static void task6_2_3() {
        Box<Point> pointBox = new Box<>();
        Section6_2.putPointToBox(pointBox);
        System.out.println(pointBox.getObject());
        Box<Point3D> point3DBox = new Box<>();
        Section6_2.putPointToBox(point3DBox);
        System.out.println(point3DBox.getObject());
    }

    public static void task6_2_4() {
        List<Integer> arr = new ArrayList<>();
        Section6_2.fillingArrayList(arr);
        System.out.println(arr);
    }

    public static void task6_3_1() {
        List<String> stringArr = new ArrayList<>(List.of("qwerty", "asdfg", "zx"));
        Applyable<String, Integer> lengthForAnyEl = new Applyable<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        List<Integer> res1 = Section6_3.applyToAnyEl(stringArr, lengthForAnyEl);
        System.out.println(stringArr);
        System.out.println(res1);


        List<Integer> intArr = new ArrayList<>(List.of(1, -3, 7));
        Applyable<Integer, Integer> anyElToPositive = new Applyable<Integer, Integer>() {
            @Override
            public Integer apply(Integer value) {
                if (value < 0) {
                    return -value;
                }
                return value;
            }
        };
        List<Integer> res2 = Section6_3.applyToAnyEl(intArr, anyElToPositive);
        System.out.println(intArr);
        System.out.println(res2);


        List<int[]> arrays = List.of(new int[]{3, 12}, new int[]{1, 23, 322});

        Applyable<int[], Integer> maxInArray = new Applyable<>() {
            @Override
            public Integer apply(int[] values) {
                if (values == null || values.length == 0) {
                    throw new IllegalArgumentException();
                }

                int max = values[0];
                for (int value : values) {
                    if (value > max) {
                        max = value;
                    }
                }
                return max;
            }
        };

        List<Integer> res3 = Section6_3.applyToAnyEl(arrays, maxInArray);
        System.out.println(res3);
    }

    public static void task6_3_2() {
        List<String> stringArr = new ArrayList<>(List.of("qwerty", "asdfg", "zx"));

        Testable<String> stringMoreThen3 = new Testable<String>() {
            @Override
            public boolean test(String text) {
                if (text.length() < 3)
                    return false;
                return true;
            }
        };

        List<String> res3 = Section6_3.filter(stringArr, stringMoreThen3);
        System.out.println(res3);


        List<Integer> intArray = new ArrayList<>(List.of(1, -3, 7));
        Testable<Integer> onlyPos = new Testable<Integer>() {
            @Override
            public boolean test(Integer value) {
                if (value < 0) return false;
                else return true;
            }
        };
        System.out.println(Section6_3.filter(intArray, onlyPos));


        List<int[]> arrOfArr = new ArrayList<>(List.of(new int[]{2, 3, 2}, new int[]{4, 3, -1}, new int[]{-2, -43}));
        Testable<int[]> onlyNeg = new Testable<int[]>() {
            @Override
            public boolean test(int[] obj) {
                for (int i : obj) {
                    if (i > 0) return false;
                }
                return true;
            }
        };
        System.out.println(Arrays.deepToString(Section6_3.filter(arrOfArr, onlyNeg).toArray()));
    }

    public static void task6_3_3() {
        List<Integer> lst = new ArrayList<>(List.of(1, -3, 7));

        Summarisable<Integer> s = new Summarisable<Integer>() {
            @Override
            public Integer toT(List<Integer> list) {
                int sum = 0;
                for (int i : list) {
                    sum += i;
                }
                ;
                return sum;
            }
        };

        System.out.println(Section6_3.toT(lst, s).getResOrDefault(0));
    }

    public static void task6_3_4() {
        List<Integer> lst = new ArrayList<>(List.of(1, -3, 7));

        Accum<List<List<Integer>>, Integer> accum = new Accum<List<List<Integer>>, Integer>() {
            @Override
            public void acc(List<List<Integer>> result, Integer value) {
                if (value > 0) result.get(0).add(value);
                if (value < 0) result.get(1).add(value);
            }
        };

        MethodToCreate<List<List<Integer>>> methodToCreate = new MethodToCreate<List<List<Integer>>>() {
            @Override
            public List<List<Integer>> create() {
                return List.of(new ArrayList<>(), new ArrayList<>());
            }
        };

        System.out.println(Section6_3.collect(lst, methodToCreate, accum));

        List<String> words = List.of("qwerty", "asdfg", "zx", "qw");
        MethodToCreate<List<List<String>>> createWordGroups = new MethodToCreate<List<List<String>>>() {
            @Override
            public List<List<String>> create() {
                return new ArrayList<>();
            }
        };
        Accum<List<List<String>>, String> groupByLength = new Accum<List<List<String>>, String>() {
            @Override
            public void acc(List<List<String>> result, String value) {
                for (List<String> group : result) {
                    if (group.getFirst().length() == value.length()) {
                        group.add(value);
                        return;
                    }
                }
                List<String> group = new ArrayList<>();
                group.add(value);
                result.add(group);
            }
        };
        System.out.println(Section6_3.collect(words, createWordGroups, groupByLength));

        List<String> wordsWithDuplicates = List.of("qwerty", "asdfg", "qwerty", "qw");
        MethodToCreate<Set<String>> createWordSet = new MethodToCreate<Set<String>>() {
            @Override
            public Set<String> create() {
                return new LinkedHashSet<>();
            }
        };
        Accum<Set<String>, String> addToSet = new Accum<Set<String>, String>() {
            @Override
            public void acc(Set<String> result, String value) {
                result.add(value);
            }
        };
        System.out.println(Section6_3.collect(wordsWithDuplicates, createWordSet, addToSet));
    }

}
