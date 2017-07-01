package com.kitcenter.app.homework.lesson15;

/**
 * Created by Viktor on 01.07.2017.
 */
public class Bouquet {
    public static double bouquet(Flower ... flowers){
        double price = 0;
        for(int i = 0; i < flowers.length; i++){
            price += flowers[i].getPrice();
        }
        return price;
    }
}
