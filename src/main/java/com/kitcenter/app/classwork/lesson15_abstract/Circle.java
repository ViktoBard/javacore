package com.kitcenter.app.classwork.lesson15_abstract;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.pow(radius, 2);
    }
}
