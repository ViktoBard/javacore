package com.kitcenter.app.classwork.lesson13_encapsulation;

/**
 * Created by Viktor on 07.06.2017.
 */
public class Bicycle {
    public int size;
    public String color;
    private String name;
    private String speed = "23";

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle() {
        System.out.println("Override default constructor");
    }

    public Bicycle(String name) {
        this.name = name;
    }

    public Bicycle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Bicycle(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public Bicycle(int size, String color, String name) {
        this(size, name);
        this.color = color;
        this.printMe();
    }

    public void printMe() {
        System.out.println("Print" + showNameAndColor());
    }

    private String showNameAndColor(){
        return name + " " + color;
    }
}