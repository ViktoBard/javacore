package com.kitcenter.runners.homework.lesson16;

import com.kitcenter.app.homework.lesson16.ChainedTraktor;
import com.kitcenter.app.homework.lesson16.Tracktor;
import com.kitcenter.app.homework.lesson16.WheeledTracktor;

/**
 * Created by Viktor on 01.07.2017.
 */
public class TraktorRunner {
    public static void main(String[] args) {
        Tracktor wheeledTracktor = new WheeledTracktor("Belarus", 80);
        Tracktor chainedTraktor = new ChainedTraktor("Not Belarus", 45);

        wheeledTracktor.printName();
        System.out.println(wheeledTracktor);
        chainedTraktor.printName();
        System.out.println(chainedTraktor);
    }
}