package com.kitcenter.app.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by Viktor on 13.05.2017.
 */
public class Loop {
    public static void loop(double result1, double result2) {
        if (result1 > result2) {
            while (result1 > result2) {
                result1 = result1 - 1;
                System.out.println(result1 + " " + result1);
            }
        } else {
            System.out.println(result1 + " " + result2);
        }
    }
}