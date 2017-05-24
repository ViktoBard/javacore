package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by Viktor on 11.05.2017.
 */
public class DefineBiggerNumber {
    public double defineBiggerNumber (double numberOne, double numberTwo) {
        System.out.println("Введите два числа чтоб узнать какое их них больше");
        double biggerNumber = numberOne >= numberTwo ? numberOne : numberTwo;
        if (numberOne == numberTwo) {
            System.out.println("Так что ты хочешь узнать, числа же одинаковые");
        } else {
            System.out.println("Это число таки больше " + biggerNumber);
        }
        return biggerNumber;
    }
}