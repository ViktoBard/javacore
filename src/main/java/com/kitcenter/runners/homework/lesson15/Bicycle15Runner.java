package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.Bicycle15WithRing;
import com.kitcenter.app.homework.lesson15.Bicycle15WithRingInterface;
import com.kitcenter.app.homework.lesson15.CustomBicycle15;

/**
 * Created by Viktor on 28.06.2017.
 */
public class Bicycle15Runner {
    public static void main(String[] args) {
        Bicycle15WithRing bicycle15WithRing = new Bicycle15WithRing();
        bicycle15WithRing.ring();
        CustomBicycle15 customBicycle15 = new CustomBicycle15();
        customBicycle15.setGear(45);
        customBicycle15.ride();
    }
}
