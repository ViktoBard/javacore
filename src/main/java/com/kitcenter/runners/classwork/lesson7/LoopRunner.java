package com.kitcenter.runners.classwork.lesson7;

import com.kitcenter.app.classwork.lesson7.Loop;

import java.util.Scanner;

/**
 * Created by Viktor on 13.05.2017.
 */
public class LoopRunner {
    public static void main(String[] args) {
//        System.out.println("Введите два числа:");
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//        double result1 = scanner1.nextDouble();
//        double result2 = scanner2.nextDouble();
//        Loop.loop(result1,result2);
        int a = 5;
        int b = 10;
        if ( a > b)
            System.out.println(a);
        else {
            System.out.println(b);
        }
        System.out.println(a > b ? printNumber(a) : printNumber(b));


        Scanner scanner = new Scanner(System.in);
        String browser=scanner.next();
        String chrome = "Chrome";
//        String firefox = "Firefox";
        String browserLauncher = browser !=null ? browser : chrome;
    }

    public static int printNumber (int number) {
        System.out.println(number);
        return number;
    }
}
