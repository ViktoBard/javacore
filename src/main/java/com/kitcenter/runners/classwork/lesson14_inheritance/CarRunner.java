package com.kitcenter.runners.classwork.lesson14_inheritance;

import com.kitcenter.app.classwork.lesson14_inheritance.BMW;
import com.kitcenter.app.classwork.lesson14_inheritance.Lexus;

/**
 * Created by Viktor on 10.06.2017.
 */
public class CarRunner {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", 200);
        bmw.showNameAndSpeed();
        bmw.showDrive();

        Lexus lexus = new Lexus("Lexus", 250);
        lexus.showNameAndSpeed();
        lexus.showDrive();
    }
}
