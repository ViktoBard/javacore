package com.kitcenter.app.homework.lesson15;

/**
 * Created by Viktor on 28.06.2017.
 */
public class Tulip extends Flower {
    private double price = 12;
    private int count;

    public Tulip(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price * count;
    }
}