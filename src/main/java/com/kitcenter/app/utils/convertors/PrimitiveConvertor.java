package com.kitcenter.app.utils.convertors;


/**
 * Created by Viktor on 05.05.2017.
 */
public class PrimitiveConvertor {
    float float1 = 2.0f;
    int int1 = 5;
    char char1 = 'd';

    public void floatToChar() {
        float1 = (float) char1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }
    public void intToChar() {
        int1 = (int) char1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }
    public void charToInt() {
        int1 = (char) int1;
        System.out.println("Input int value is " + char1 + ". Output char value is " + int1);
    }
}