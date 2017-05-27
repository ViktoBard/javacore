package com.kitcenter.runners.classwork.lesson10;

import java.util.Arrays;

/**
 * Created by Viktor on 27.05.2017.
 */
public class StringToDisplayRunner {
    public static void main(String[] args) {

        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
//        for (int i = 0; i < charArrayToString.length; i++) {
//            stringToDisplay += charArrayToString[i];
//        }
        stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",", "") //remove the commas
                .replace("[", "") //remove the right bracket
                .replace("]", "") //remove the left bracket
                .replace(" ", "\n") //remove white spaces
                .trim(); //trim empty cells at end
        System.out.println(stringToDisplay);
    }
}