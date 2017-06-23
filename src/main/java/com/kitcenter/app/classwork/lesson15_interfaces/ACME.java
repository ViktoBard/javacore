package com.kitcenter.app.classwork.lesson15_interfaces;

/**
 * Created by Viktor on 14.06.2017.
 */
public class ACME implements Bicycle {
    @Override
    public void changeGear(int value) {
        System.out.println("ACME changing gear: " + value);
    }

    @Override
    public void shift() {
        System.out.println("ACME not bad");
    }
}
