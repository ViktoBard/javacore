package com.kitcenter.app.classwork.lesson17_enum;

/**
 * Created by Viktor on 21.06.2017.
 */
public enum Holiday {
    NEW_YEAR(1, "January", "New Year"), CHRISTMAS(25, "December", "Christmas");

    private int day;
    private String month;
    private String holydayName;

    Holiday(int day, String month, String holydayName) {
        this.day = day;
        this.month = month;
        this.holydayName = holydayName;
    }

    public int getDay() {
        return day;
    }

    public String getHolydayName() {
        return holydayName;
    }

    public String getMonth() {

        return month;
    }
}
