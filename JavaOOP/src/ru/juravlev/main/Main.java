package ru.juravlev.main;

//import ru.juravlev.main.MainTest;

import ru.juravlev.other.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        ru.juravlev.main.MainTest.task1_4_1();
//        ru.juravlev.main.MainTest.task1_4_2();
//        ru.juravlev.main.MainTest.task1_4_3();
//        ru.juravlev.main.MainTest.task1_4_4();
//        ru.juravlev.main.MainTest.task1_4_5();
//        ru.juravlev.main.MainTest.task1_4_6();
//        ru.juravlev.main.MainTest.task1_4_7();
//        ru.juravlev.main.MainTest.task1_4_8();
//
//        ru.juravlev.main.MainTest.task1_5_1();
//        ru.juravlev.main.MainTest.task1_5_2();
//        ru.juravlev.main.MainTest.task1_5_3();
//        ru.juravlev.main.MainTest.task1_5_4();
//        ru.juravlev.main.MainTest.task1_5_5();
//        ru.juravlev.main.MainTest.task1_5_6();
//        ru.juravlev.main.MainTest.task1_5_7();
//        ru.juravlev.main.MainTest.task1_5_8();
//
////        ru.juravlev.main.MainTest.task1_6_1();
//        ru.juravlev.main.MainTest.task1_6_2();
//        ru.juravlev.main.MainTest.task1_6_3();
//        ru.juravlev.main.MainTest.task1_6_4();
//        ru.juravlev.main.MainTest.task1_6_5();
//        ru.juravlev.main.MainTest.task1_6_6();
////        ru.juravlev.main.MainTest.task1_6_8();
//        ru.juravlev.main.MainTest.task1_6_9();
//        ru.juravlev.main.MainTest.task1_6_10();
//        ru.juravlev.main.MainTest.task2_1_2();
//        ru.juravlev.main.MainTest.task2_1_3();
//        ru.juravlev.main.MainTest.task2_1_4();
//        ru.juravlev.main.MainTest.task2_1_5();
//        ru.juravlev.main.MainTest.task2_2_3();
//        ru.juravlev.main.MainTest.task2_2_4();
//        ru.juravlev.main.MainTest.task2_2_5();
//        ru.juravlev.main.MainTest.task2_3_1();
//        ru.juravlev.main.MainTest.practice();
//        ru.juravlev.main.MainTest.task2_3_2();
//        ru.juravlev.main.MainTest.task2_3_3();
//        ru.juravlev.main.MainTest.task2_3_4();
//        ru.juravlev.main.MainTest.task2_3_5();
//        ru.juravlev.main.MainTest.task2_3_6();
//        ru.juravlev.main.MainTest.task2_3_7();
//        ru.juravlev.main.MainTest.task2_3_8();
//        ru.juravlev.main.MainTest.task2_3_9();

//        MainTest.task3_1_1();
//        MainTest.task3_1_3();
//        MainTest.task3_1_4();

//        MainTest.task3_1_5();

//        MainTest.task4_2_1();
//        System.out.println(MainTest.task4_2_2("1213", "1", "213"));


        MainTest.task6_2_1();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Helper<Integer> total = summator(list);

    }

    public static Helper<Integer> summator(List<Integer> l) {
        if (l == null || l.isEmpty()) return Helper.empty();
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return Helper.of(sum);
    }

    public static <T> List<T> func(List<T> lst, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        if (lst == null || lst.isEmpty()) return result;
        for (T item : lst) {
            if (predicate.test(item){
                result.add(apply(item));
            }
        }
        return result;
    } // O(1) map и

    class Flow{
        private List<T> list;
        public Flow(){

        }
    }
}
