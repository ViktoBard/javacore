package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Viktor on 11.05.2017.
 */
public class DefineBiggerNumber {
    public static void defineBiggerNumber () {
        System.out.println("Введите два числа чтоб узнать какое их них больше");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double result1 = scanner1.nextFloat();
        double result2 = scanner2.nextFloat();
        if (result1 > result2) {
            System.out.println("Первое число всё таки больше");
        } else if (result1 < result2) {
            System.out.println("Второе число всё таки больше");
        } else {
            System.out.println("Так что ты хочешь узнать, числа же одинаковые");
        }return;
    }
}
