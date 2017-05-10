package com.kitcenter.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Viktor on 06.05.2017.
 */
public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double circleArea = PI * Math.pow(radius, 2);
        double circleArea2 = PI * Math.pow(radius2, 2);
        System.out.println("Area is " + circleArea);
        System.out.println("Area2 is " + circleArea2);
        if ((radius > radius2) || (circleArea > circleArea2)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.println("Area1 is smaller");
            System.out.println("Area2 is bigger");
        }
    }
}