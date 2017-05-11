package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import com.kitcenter.app.homework.lesson6.DefineBiggerNumber;
import com.kitcenter.app.homework.lesson6.HowToKnowHipotenusa;

import java.util.Scanner;

/**
 * Created by Viktor on 11.05.2017.
 */
public class LittleProgramRunner {
    public static void main(String[] args) {
        System.out.println("Введите число 1, 2 или 3 для продолжения:");
        Scanner scanner = new Scanner(System.in);
        float result1 = scanner.nextFloat();
        if (result1 == 1) {
            HowToKnowHipotenusa.howToKnowHipotenusa();
        } else if (result1 == 2) {
            CalculateEvenOrOdd.calculate();
        } else if (result1 == 3) {
            DefineBiggerNumber.defineBiggerNumber();
        } else {
            System.out.println("Запусти еще раз и введи числа 1, 2 или 3");
        }
    }
}