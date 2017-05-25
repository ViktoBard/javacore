package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import com.kitcenter.app.homework.lesson6.DefineBiggerNumber;
import com.kitcenter.app.homework.lesson6.HowToKnowHipotenusa;

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
                HowToKnowHipotenusa.howToKnowHipotenusa();
                menuRepeating();
                break;
            case "2":
                CalculateEvenOrOdd.calculate();
                menuRepeating();
                break;
            case "3":

//                DefineBiggerNumber.defineBiggerNumber(double numberOne, double numberTwo);
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