package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Viktor on 06.05.2017.
 */
public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner (System.in);
        double radius = scanner.nextDouble();
        scanner.nextDouble();
        double circleArea = 3.14 * Math.pow(radius, 2);
        double circleArea2 = 3.14 * Math.pow(radius, 4);
        System.out.println("Area is " + circleArea);

        if (circleArea > circleArea2)
            System.out.print("Area1 is bigger");
        else
            System.out.print("Area2 is bigger");
    }
}
