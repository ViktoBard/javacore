package com.kitcenter.app.homework.lesson6;

import java.util.InputMismatchException;

/**
 * Created by Viktor on 12.05.2017.
 */
public class HowToKnowHipotenusa {
    public void howToKnowHipotenusa(double result1, double result2) {
        if (result1 <= 0 || result2 <= 0) {
            System.out.println("Введи норм данные");
        } else
            System.out.println("Вот, пожалуйста, длина гипотенузы " + Math.sqrt(result1 * result1 + result2 * result2));
    }
}