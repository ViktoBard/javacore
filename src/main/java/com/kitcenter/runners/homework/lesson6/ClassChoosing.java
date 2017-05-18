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
        float result1 = scanner.nextFloat();

        while (true){
        if (result1 == 1) {
            HowToKnowHipotenusa.howToKnowHipotenusa();
            System.out.println("Игарем снова?");
        } else if (result1 == 2) {
            CalculateEvenOrOdd.calculate();
            System.out.println("Игарем снова?");
        } else if (result1 == 3) {
            DefineBiggerNumber.defineBiggerNumber();
            System.out.println("Игарем снова?");
        } else if (result1 == 0) {
            System.out.println("Ну ладно, пока");
            break;
        } else {
            {
                System.out.println("Не, такого класса еще нет, выбери существующий");
            }
        }
    }
}
}

