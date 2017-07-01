package com.kitcenter.app.homework.lesson15;

/**
 * Created by Viktor on 28.06.2017.
 */
public class Rose extends Flower {
    private double price = 15;
    private int count;

    public Rose(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price * count;
    }
}
