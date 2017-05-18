package com.kitcenter.app.homework.lesson6;

import com.kitcenter.runners.homework.lesson6.MainProgramRunner;

import java.util.Scanner;

/**
 * Created by Viktor on 12.05.2017.
 */
public class HowToKnowHipotenusa {
    public static void howToKnowHipotenusa (){
        System.out.println("Запустилась программа вычисления длины гипотенузы");
        System.out.println("Введите длины катетов:");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double result1 = scanner1.nextFloat();
        double result2 = scanner2.nextFloat();
        System.out.println("Вот, пожалуйста, длина гипотенузы " + Math.sqrt(result1*result1+ result2*result2));
    }
}
