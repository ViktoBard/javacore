package com.kitcenter.runners.classwork.lesson20_generics;

import com.kitcenter.app.classwork.lesson5.Car;

/**
 * Created by Viktor on 01.07.2017.
 */
public class CastingRunner {
    public static void main(String[] args) {
        Car car = new Car();
        Object object = new Car();

        Object objectCar = car;
        objectCar.toString();
        car = (Car) objectCar;

        String string = (String) objectCar;
    }
}
