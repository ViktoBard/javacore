package com.kitcenter.runners.classwork.lesson14_composition_aggregation;

import com.kitcenter.app.classwork.lesson14_composition_aggregation.Flat;
import com.kitcenter.app.classwork.lesson14_composition_aggregation.House;

/**
 * Created by Viktor on 10.06.2017.
 */
public class HouseRunner {
    public static void main(String[] args) {
        Flat[] flats = new Flat[3];
        Flat flat156 = new Flat();
        Flat flat135 = new Flat();
        Flat flat126 = new Flat();

        flats[0] = flat156;
        flats[1] = flat135;
        flats[2] = flat126;

        //Composition, creates a house only with flats
        House house = new House(flats);
        Flat[] houseFlats = house.getFlats();

        //Aggregation creates standart door wich can be replaced latter
        for (Flat flat : houseFlats) {
            flat.setItem("Standart Doors");
        }

        //Aggregation - replacing with a new door
        Flat houseFlat187 = houseFlats[0];
        houseFlat187.setItem("New door");

        for (Flat flat : houseFlats) {
            System.out.println(flat.getItem());
        }

        Flat houseFlat156 = houseFlats[2];
        houseFlat156.setService("Wihout service");
        for (Flat flat : houseFlats) {
            houseFlat187.setService("With service");
        }
        for (Flat flat : houseFlats) {
            System.out.println(flat.getService());
        }
    }
}