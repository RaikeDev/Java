import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args){

    }

    /**
     * 1) техническая сторона
     * 2) философия наследования
     */
    abstract class SuperParent{

        String tmp;
        void m(){

        }
    }

    class A{
        int x;
        void m(){
            System.out.println("hello!");
        }
    }
    class B extends A{ // расширение
        void m2(){
            super.m();
            System.out.println("hello from B");
        }
        void m()
    }
}
