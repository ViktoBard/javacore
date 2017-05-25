package com.kitcenter.runners.classwork.lesson6;
import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Viktor on 10.05.2017.
 */
public class CalculateEvenOrOddRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Запустилась программа проверки деления с проверкой остатка");
        System.out.println("Введите число");
        try {
            float result = scanner.nextFloat() % 2;
            CalculateEvenOrOdd calculate = new CalculateEvenOrOdd();
            calculate.calculate(result);
        } catch (InputMismatchException e) {
            System.out.println("Буквы не подходят сюда");
        }
    }
}