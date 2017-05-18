package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import com.kitcenter.app.homework.lesson6.DefineBiggerNumber;
import com.kitcenter.app.homework.lesson6.HowToKnowHipotenusa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Viktor on 11.05.2017.
 */
public class MainProgramRunner {
    public static void main(String[] args) {
        System.out.println("Выбери класс который ты хочешь запустить:");
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        while (flag = true) {
            try {
            ClassChoosing.classChoosing();
            float result1 = scanner.nextFloat();
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
                flag = false;
            } else {
                {
                    System.out.println("Не, такого класса еще нет, выбери существующий");
                    flag=true;
                }
            }
        }
        catch (InputMismatchException error1){
                System.out.println("мда... ты ж букву ввёл!");}
        }scanner.close();
    }
}