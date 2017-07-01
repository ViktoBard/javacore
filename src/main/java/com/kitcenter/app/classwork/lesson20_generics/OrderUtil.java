package com.kitcenter.app.classwork.lesson20_generics;

/**
 * Created by Viktor on 01.07.2017.
 */
public class OrderUtil {
    public static <K, V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static <T> boolean compare(BoxPrinterGeneric<T> p1, BoxPrinterGeneric<T> p2) {
        return p1.getVal().equals(p2.getVal());
    }
}
