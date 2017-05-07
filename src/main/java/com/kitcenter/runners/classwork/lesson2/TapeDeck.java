package com.kitcenter.runners.classwork.lesson2;

/**
 * Created by Viktor on 02.05.2017.
 */
public class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("плёнка проигрывается");
    }

    void recordTape() {
        System.out.println("идет запись на плёнку");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}