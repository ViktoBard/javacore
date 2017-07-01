package com.kitcenter.app.homework.lesson16;

/**
 * Created by Viktor on 01.07.2017.
 */
public abstract class Machine implements Run {
    private static final int MAX_SPEED = 100;
    private static final int MIN_SPEED = 1;
    private static final int MIN_PAX_COUNT = 1;
    private static final int MAX_PAX_COUNT = 5;

    private String name;
    private int currentSpeed;
    protected double weight;
    protected int paxCount;
    protected int wheelsCount;


    public Machine(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}