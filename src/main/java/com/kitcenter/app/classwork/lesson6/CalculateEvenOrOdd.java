package com.kitcenter.app.classwork.lesson6;
import java.util.Scanner;

/**
 * Created by Viktor on 10.05.2017.
 */
public class CalculateEvenOrOdd {
    public void calculate(float result) {
        float number = result % 2;
        if (number == 0) {
            System.out.println("Деление целого числа");
        } else {
            System.out.println("Деление не целого числа");
        }
    }
}
