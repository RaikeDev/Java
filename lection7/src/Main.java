
public class Main {
    class MyStack{
        void push(int x){

        }
        int pop(){return 0;}
    }
    class MyQueue{
        void offer(int x){

        }
        int poll(){return 0;}
    }
    class StackQueue{
        private MyStack stack;
        private MyQueue myQueue;

        void push(int x){
            stack.push(x);
        }
        int pop(){return 0;}

        void offer(int x){
            myQueue.offer(x);
        }
        int poll(){return 0;}
    }
    /*
    1) квадрат-прямоугольник
    2) стэк и список
     */
}


    /*
    1) шаблонизация
    2) множества-подмножества (Is-A)

    Если не являются подмножествами - то не должен делать наследование.
     */

    void main(){
        Student st1 = new Student(new Check2to5());
        st1.add(3);


//        Figure f = new Circle(); // polimorfizm
//        f.area();
//        ArrayList lst = new ArrayList(List.of(3,2,6,1));
//        lst.sort(new IntComparator());
//        System.out.println(lst);
    }

    class Student{
        private ArrayList<Integer> grades = new ArrayList<>();
        Checker ch;
        public Student(Checker ch){
            this.ch = ch;
        }
        public void add (int x){
            if (!ch.check(x)) throw new IllegalArgumentException();
            grades.add(x);
        }
    }



    abstract class Checker{
        public abstract boolean check(int x);
    }

    class Check2to5 extends Checker{
        @Override
        public boolean check(int x){
            return x>=2&&x<=5;
        };
    }

    class IntComparator implements Comparator<Integer>{
        public int compare(Integer x, Integer y){
            return y-x;
        }
    }
    void m2(Figure f){
        System.out.println(
                f.area()
        );
    }
    abstract class Figure{
        abstract double area();
    }
    class Rectangle extends Figure{
        int a,b;

        public Rectangle(int a, int b ) {
            this.a = a;
            this.b = b;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        @Override
        double area(){
            return a*b;
        }
    }
    class Square extends Figure{
        int a;

        public Square(int a){
            this.a = a;
        }

        public int getA() {
            return a;
        }
        public void setA(int a) {
            this.a = a;
        }

        @Override
        double area(){
            return a*a;
        }
    }

    class Circle extends Figure{
        @Override
        double area(){
            return 0;
        }
    }
    class Triangle extends Figure{
        @Override
        double area(){
            return 0;
        }
    }
