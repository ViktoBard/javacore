package com.kitcenter.app.classwork.lesson15_abstract;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }
}
