package com.kitcenter.runners.classwork.lesson15_interfaces;


import com.kitcenter.app.classwork.lesson15_interfaces.ACME;
import com.kitcenter.app.classwork.lesson15_interfaces.BMA;
import com.kitcenter.app.classwork.lesson15_interfaces.BMN;
import com.kitcenter.app.classwork.lesson15_interfaces.Bicycle;

/**
 * Created by Viktor on 14.06.2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        System.out.println(Bicycle.PI);
        bicycleActions(bma,20);
        bicycleActions(acme,23);
        bicycleActions(bmn,2333);
    }
    public static void bicycleActions(Bicycle bicycle, int value) {
        bicycle.changeGear(value);
        bicycle.shift();
    }
}
