package com.kitcenter.runners.classwork.lesson17_enum;

import com.kitcenter.app.classwork.lesson17_enum.Holiday;

/**
 * Created by Viktor on 21.06.2017.
 */
public class HolidayRunner {
    public static void main(String[] args) {
        for (Holiday holiday : Holiday.values()) {
            System.out.println(holiday.getHolydayName() + " holyday is on " + holiday.getMonth() + ", " + holiday.getDay());
        }
    }
}
