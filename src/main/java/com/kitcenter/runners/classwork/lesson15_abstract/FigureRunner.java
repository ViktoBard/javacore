package com.kitcenter.runners.classwork.lesson15_abstract;

import com.kitcenter.app.classwork.lesson15_abstract.Circle;
import com.kitcenter.app.classwork.lesson15_abstract.Figure;
import com.kitcenter.app.classwork.lesson15_abstract.Rectangle;
import com.kitcenter.app.classwork.lesson15_abstract.Square;

/**
 * Created by Viktor on 14.06.2017.
 */
public abstract class FigureRunner {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        Figure rectangle = new Rectangle(10, 15);
        Figure square = new Square(2);

        double circlePerimeter = getPerimeter(circle);
        double rectanglePerimeter = getPerimeter(rectangle);
        double squareLength = getPerimeter(square);

        System.out.println(circlePerimeter + " " + rectanglePerimeter + " " + squareLength);
    }

    public static double getPerimeter(Figure figure) {
        return figure.getPerimeter();
    }
}