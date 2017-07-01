package com.kitcenter.app.homework.lesson16;

/**
 * Created by Viktor on 01.07.2017.
 */
public class WheeledTracktor extends Tracktor {
    public WheeledTracktor(String name, int currentSpeed) {
        super(name, currentSpeed);
        this.setPaxCount(2);
        this.setWeight(400);
        this.setWheelsCount(4);
    }
}