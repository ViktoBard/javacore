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
        switch (choose){
            case "1":
                HowToKnowHipotenusa.howToKnowHipotenusa();
                ClassDisplaying.classDisplaying();
                ClassChoosing.classChoosing();
                break;
            case "2":
                CalculateEvenOrOdd.calculate();
                ClassDisplaying.classDisplaying();
                ClassChoosing.classChoosing();
                break;
            case "3":
                DefineBiggerNumber.defineBiggerNumber();
                ClassDisplaying.classDisplaying();
                ClassChoosing.classChoosing();
                break;
            case "0":
                System.out.println("Ну ладно, пока");
                break;
            default:
                System.out.println("Не, такого класса еще нет, выбери существующий");
                ClassDisplaying.classDisplaying();
                ClassChoosing.classChoosing();
                break;
        }return;
    }
}
