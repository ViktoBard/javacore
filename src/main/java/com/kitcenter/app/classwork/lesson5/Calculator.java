package com.kitcenter.app.classwork.lesson5;

/**
 * Created by Viktor on 03.05.2017.
 */
public class Calculator {
    public int substract(int numberOne, int numberTwo) {
        return numberOne - numberTwo; //отнимание целых чисел
    }
    public double doubleSubstract(double dblOne, double dblTwo){
        return dblOne - dblTwo;//отнимание не целых чисел
    }

    public int sum(int numberOne, int numberTwo) {
        return Math.abs(numberOne + numberTwo);//сложение целых чисел
    }

    public int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo; //умножение целых чисел
    }

    public int division(int numberThree,int numberFour) {
        int result;
        if (numberThree <= 0 && numberFour <= 0) {
            result = 0;
            System.out.println("Как бэ, делить на нуль низя, либо какое-то из твоих чисел отрицательное!");
        }
        else {
        result = numberThree / numberFour; //деление целых чисел
        }
        return result;
    }


    public double mathPow(double dblOne, double dblTwo) {
        return Math.pow(dblOne, dblTwo);
    }//возведение в степень целых чисел

    public double mathPow2(double dblThree, double dblFour) {
        double result;
        if (dblThree < 0.0 || dblFour < 0.0) {
            result = 0;
            System.out.println("Стоп, возводить в степень число меньше нуля немного странно!");
        } else {
            result = Math.pow(dblThree, dblFour);
        } return result;
        //возведение в степень целых чисел c проверкой на отрицательные числа
    }

    public int random() {
        int a = 1;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b);
        return random_number1;
    }
}