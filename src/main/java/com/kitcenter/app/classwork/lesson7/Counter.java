package com.kitcenter.app.classwork.lesson7;

/**
 * Created by Viktor on 13.05.2017.
 */
public class Counter {
    public static void counter() {
        int counter1 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                counter1++;
            }
            System.out.println(counter1);
        }
    }
}