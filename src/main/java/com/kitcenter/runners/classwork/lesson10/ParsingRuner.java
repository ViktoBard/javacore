package com.kitcenter.runners.classwork.lesson10;

/**
 * Created by Viktor on 27.05.2017.
 */
public class ParsingRuner {
    public static void main(String[] args) {
        String integers = "11";
        int result = Integer.valueOf(integers);
        System.out.println(result);

        String result1 = String.valueOf(result);
        System.out.println(result1);


        String doubles = "1.5";
        double doubleResult = Double.valueOf(doubles);
        double resultTut = doubleResult + 2;
        System.out.println(resultTut);

        String doubleToString = String.valueOf(resultTut);
        String newString = doubleToString + 84849;
        System.out.println(newString);
    }
}
