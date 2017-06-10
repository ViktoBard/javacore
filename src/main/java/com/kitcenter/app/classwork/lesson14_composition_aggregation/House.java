package com.kitcenter.app.classwork.lesson14_composition_aggregation;


/**
 * Created by Viktor on 10.06.2017.
 */
public class House {
    private Flat[] flats;

    public House(Flat[] flats) {
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }
}
