package com.kitcenter.app.homework.lesson15;

/**
 * Created by Viktor on 28.06.2017.
 */

public class Chamomile extends Flower {
    private double price = 8;
    private int count;

    public Chamomile(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price * count;
    }
}