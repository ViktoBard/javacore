package com.kitcenter.app.classwork.lesson14_inheritance;

/**
 * Created by Viktor on 10.06.2017.
 */
public class Lexus extends Car {
    public Lexus(String name, int speed) {
        super(name, speed);
    }
    public void showDrive(){
        System.out.println("Super car");
    }
}
