import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
//        Stack st = new Stack();
//        ArrayList lst;
//        ArrayDeque deq;
    }
    /*
    стек push()pop()peek()
    динамический массив add()remove()get()set()
     */

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
