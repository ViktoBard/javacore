package com.kitcenter.app.classwork.lesson15_abstract;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Square extends Figure {
    private int square;

    public Square(int square) {
        this.square = square;
    }

    @Override
    public double getPerimeter() {
        return square * 4;
    }
}
