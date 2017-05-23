package com.kitcenter.app.classwork.lesson6;
import java.util.Scanner;

/**
 * Created by Viktor on 10.05.2017.
 */
public class CalculateEvenOrOdd {
    public static void calculate() {
        System.out.println("Запустилась программа проверки деления с проверкой остатка");
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        float result = scanner.nextFloat() % 2;
        if (result == 0) {
            System.out.println("Деление целого числа");
        } else {
            System.out.println("Деление не целого числа");
        }return;
    }
}
