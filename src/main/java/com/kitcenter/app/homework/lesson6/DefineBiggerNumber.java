package com.kitcenter.app.homework.lesson6;

/**
 * Created by Viktor on 11.05.2017.
 */
//public class DefineBiggerNumber {
//    public static void defineBiggerNumber () {
//        System.out.println("Введите два числа чтоб узнать какое их них больше");
//        Scanner scanner1 = new Scanner(System.in);
//            double result1 = scanner1.nextFloat();
//            double result2 = scanner1.nextFloat();
//            if (result1 > result2) {
//                System.out.println("Первое число всё таки больше");
//            } else if (result1 < result2) {
//                System.out.println("Второе число всё таки больше");
//            } else {
//                System.out.println("Так что ты хочешь узнать, числа же одинаковые");
//            }
//        }
//    }


public class DefineBiggerNumber {
    public void defineBiggerNumber(double numberOne, double numberTwo) {
        System.out.println("Введите два числа чтоб узнать какое их них больше");

        if (numberOne == numberTwo) {
            System.out.println("Так что ты хочешь узнать, числа же одинаковые");
        } else {
            double biggerNumber = numberOne >= numberTwo ? numberOne : numberTwo;
            System.out.println("Это число таки больше " + biggerNumber);
        }
    }
}
//    }
//}