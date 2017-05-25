package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import com.kitcenter.app.homework.lesson6.DefineBiggerOrEqualNumber;
import com.kitcenter.app.homework.lesson6.HowToKnowHipotenusa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Viktor on 17.05.2017.
 */
public class ClassChoosing {
    public static void classChoosing() {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Запустилась программа вычисления длины гипотенузы");
                System.out.println("Введите длины катетов:");
                try {
                    double result1 = scanner.nextFloat();
                    double result2 = scanner.nextFloat();
                    HowToKnowHipotenusa howToKnowHipotenusa = new HowToKnowHipotenusa();
                    howToKnowHipotenusa.howToKnowHipotenusa(result1, result2);
                } catch (InputMismatchException e) {
                    System.out.println("Буквы не подходят сюда");
                }
                menuRepeating();
                break;

            case "2":
                System.out.println("Запустилась программа проверки деления с проверкой остатка");
                System.out.println("Введите число");
                try {
                    float result = scanner.nextFloat() % 2;
                    CalculateEvenOrOdd calculate = new CalculateEvenOrOdd();
                    calculate.calculate(result);
                } catch (InputMismatchException e) {
                    System.out.println("Буквы не подходят сюда");
                }
                menuRepeating();
                break;

            case "3":
                System.out.println("Введите два числа чтоб узнать какое их них больше");
                try {
                    double numberOne = scanner.nextDouble();
                    double numberTwo = scanner.nextDouble();
                    DefineBiggerOrEqualNumber defineBiggerOrEqualNumber = new DefineBiggerOrEqualNumber();
                    defineBiggerOrEqualNumber.defineBiggerOrEqualNumber(numberOne, numberTwo);
                } catch (InputMismatchException e) {
                    System.out.println("Буквы не подходят сюда");
                }
                menuRepeating();
                break;

            case "0":
                System.out.println("Ну ладно, пока");
                break;

            default:
                System.out.println("Не, такого класса еще нет, выбери существующий");
                menuRepeating();
                break;
        }
    }

    public static void menuRepeating() {
        ClassDisplaying.classDisplaying();
        ClassChoosing.classChoosing();
    }
}