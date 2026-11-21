package ru.juravlev.other;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Section6_3 {
    public static <T, P> List<P> applyToAnyEl(List<T> list, Applyable<T, P> obj) {
        List<P> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(obj.apply(e));
        }
        return newList;
    }

    public static <T> List<T> filter(List<T> list, Testable<T> obj) {
        List<T> newList = new ArrayList<>();
        for (T e : list) {
            if (obj.test(e)) {
                newList.add(e);
            }
        }
        return newList;
    }

    public static <T> Helper<T> toT(List<T> list, Summarisable<T> conv) {
        if (conv.toT(list) == null || list.isEmpty()) {
            return Helper.empty();
        }
        return Helper.of(conv.toT(list));
    }

    public static <P, T> P collect(List<T> input, MethodToCreate<P> creator, Accum<P, T> accumulator) {
        P res = creator.create();
        for (T value : input) {
            accumulator.acc(res, value);
        }
        return res;
    }
}
