package com.kitcenter.app.classwork.lesson17_enum;

/**
 * Created by Viktor on 21.06.2017.
 */

public enum Company {
    EBAY(30, "Ebay Inc"), GOOGLE(15, "Google Inc");
    private int value;
    private String fullName;

     Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFullName() {
        return fullName;
    }
}
