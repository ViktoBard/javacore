package com.kitcenter.app.homework.lesson16;

/**
 * Created by Viktor on 01.07.2017.
 */
public class ChainedTraktor extends Tracktor {
    public ChainedTraktor(String name, int currentSpeed) {
        super(name, currentSpeed);
        this.setPaxCount(1);
        this.setWeight(345);
        this.setWheelsCount(4);
    }
}