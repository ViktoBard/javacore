package com.kitcenter.app.homework.lesson6;

/**
 * Created by Viktor on 11.05.2017.
 */
public class DefineBiggerOrEqualNumber {
    public void defineBiggerOrEqualNumber(double numberOne, double numberTwo) {
        if (numberOne == numberTwo) {
            System.out.println("Так что ты хочешь узнать, числа же одинаковые");
        } else {
            double biggerNumber = numberOne >= numberTwo ? numberOne : numberTwo;
            System.out.println("Это число таки больше " + biggerNumber);
        }
    }
}