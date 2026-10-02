public class Main {
    public static void main(String[]args){
        Human kleopatra = new Human("Клеопатра", 152);
        Human pushkin = new Human("Пушкин", 167);
        Human alex = new Human("Александр", 189);
        System.out.println(kleopatra.getInfo());
        System.out.println(pushkin.getInfo());
        System.out.println(alex.getInfo());

        System.out.println("");

        Point p = new Point(1,5);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("");

        FullName kleo = new FullName("Клеопатра", "", "");
        System.out.println(kleo.getFullName());

        System.out.println("");


        Time time = new Time();
        time.sec = 85232;
        System.out.println(Time.printTime(time.sec));

        System.out.println("");

        House house = new House();
        house.floors = 1;
        System.out.println(house);

        House house2 = new House();
        house2.floors = 5;
        System.out.println(house2);

        House house3 = new House();
        house3.floors = 23;
        System.out.println(house3);
    }
}
