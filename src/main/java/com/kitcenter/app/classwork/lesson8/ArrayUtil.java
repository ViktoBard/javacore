package com.kitcenter.app.classwork.lesson8;

/**
 * Created by Viktor on 17.05.2017.
 */
public class ArrayUtil {
    public int[][] createAndFill(int dimension, int length){
        int[][] intArray = new int[dimension][length];
        for (int j = 0; j < intArray.length; j++) {
            for (int k = 0; k < intArray[j].length; k++) {
                intArray[j][k] = j * k;
            }
        }
        return intArray;
    }

    public int[] createAndFill (int length){
        int[] newArr = new int[4];
        for (int x = 0; x < newArr.length; x++) {
            newArr[x] = x * 24563456;
        }
        for (int numberOne : newArr) {
            System.out.println(numberOne);
        }
        return newArr;
    }
}
