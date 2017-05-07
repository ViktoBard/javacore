package com.kitcenter.app.utils.runners;

import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Viktor on 05.05.2017.
 */
public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConvertor convertorfloatToChar = new PrimitiveConvertor();
        convertorfloatToChar.floatToChar();
        PrimitiveConvertor convertorintToChar = new PrimitiveConvertor();
        convertorintToChar.intToChar();
        PrimitiveConvertor convertorcharToInt = new PrimitiveConvertor();
        convertorcharToInt.charToInt();
    }
}