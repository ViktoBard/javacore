package com.kitcenter.runners.classwork.lesson13_encapsulation;

import com.kitcenter.app.classwork.lesson13_encapsulation.Bicycle;

/**
 * Created by Viktor on 07.06.2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.color);

        String name = "AUTHOR";
        Bicycle bicycle1 = new Bicycle(name);
        System.out.println(bicycle1.getName());
        bicycle1.setName("AUTHOR-2");
        bicycle1.printMe();
        System.out.println(bicycle1.getSpeed());
        bicycle1.setSpeed("78");
        System.out.println("Speed of bicycle: "+ bicycle1.getSpeed());

//        String color = "Red";
//        Bicycle bicycle2 = new Bicycle(name, color);
//        System.out.println(bicycle2.getName() + " " + bicycle2.color);
//
//        int size = 23;
//        Bicycle bicycle3 = new Bicycle(size, name);
//        System.out.println(bicycle3.getName() + " " + bicycle3.size);
//
//
//        Bicycle bicycle4 = new Bicycle(size, color,name);
//        System.out.println(bicycle4.getName() + " " + bicycle4.size);

    }
}
