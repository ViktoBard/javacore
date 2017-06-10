package com.kitcenter.app.classwork.lesson14_inheritance;

/**
 * Created by Viktor on 10.06.2017.
 */
public class Car {
    protected String name;
    protected int speed;

    public Car (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void showNameAndSpeed() {
        System.out.println(name + " " + speed);
    }
    public void showDrive(){
        System.out.println("Drive car");
    }
}
