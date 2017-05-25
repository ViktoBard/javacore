package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.app.classwork.lesson6.CalculateEvenOrOdd;
import com.kitcenter.app.homework.lesson6.DefineBiggerOrEqualNumber;
import com.kitcenter.app.homework.lesson6.HowToKnowHipotenusa;

/**
 * Created by Viktor on 17.05.2017.
 */
class ClassDisplaying {
    public static void classDisplaying (){
        String Hipotenusa = HowToKnowHipotenusa.class.toString();
        String Calculate = CalculateEvenOrOdd.class.toString();
        String DefineNumber = DefineBiggerOrEqualNumber.class.toString();

        System.out.println("1. " + Hipotenusa);
        System.out.println("2. " + Calculate);
        System.out.println("3. " + DefineNumber);
        System.out.println("0. Выход");
    }
}