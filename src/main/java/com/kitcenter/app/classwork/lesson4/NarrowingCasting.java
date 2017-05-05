package com.kitcenter.app.classwork.lesson4;

/**
 * Created by Viktor on 03.05.2017.
 */
public class NarrowingCasting {
    double double1 = 3.14159d;
    float float1 = 0.0f;

    public void narrowing() {
        float1 = (float) double1;
        System.out.println(float1);
    }
}