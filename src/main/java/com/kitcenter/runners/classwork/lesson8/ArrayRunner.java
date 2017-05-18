package com.kitcenter.runners.classwork.lesson8;

import com.kitcenter.app.classwork.lesson5.Car;
import com.kitcenter.app.classwork.lesson8.ArrayUtil;
import com.kitcenter.app.classwork.lesson8.Flat;

import java.util.Arrays;

/**
 * Created by Viktor on 17.05.2017.
 */
public class ArrayRunner {
    public static void main(String[] args) {
//        int[] intArr = {3, 4, 5, 6};
//        int[] intArrInitial = new int[4];
//        intArrInitial[0] = 3;
//        intArrInitial[1] = 4;
//        intArrInitial[2] = 5;
//        intArrInitial[3] = 6;
//        intArrInitial[0] = 7;
//        System.out.println(intArrInitial[3]);
//        System.out.println(intArr[3]);
//
//        for(int item: intArr){
//            System.out.println(item);
//        }
//        for(int i = 0; i <intArr.length; i++){
//            System.out.println(intArr[i]);
//        }
//        Car[] carArr = new Car[2];
//        Car bmw = new Car();
//        bmw.name = "BMW";
//        Car audi = new Car();
//        audi.name = "Audi";
//        carArr[0] = bmw;
//        carArr[1] = audi;{
//        for (Car car : carArr)
//            System.out.println(car.name);
//        }
//
//        long[] newArr = new long[4];
//        for (int x = 0; x < newArr.length; x++) {
//            newArr[x] = x * 245634563464564355L;
//        }
//        for (long numberOne : newArr) {
//            System.out.println(numberOne);
//        }
//
//
//        Flat[] flatArr = new Flat[2];
//        Flat mine = new Flat();
//        mine.adress = "mine";
//        Flat yours = new Flat();
//        yours.adress = "yours";
//        flatArr[0] = mine;
//        flatArr[1] = yours;
//        {
//            for (Flat flat : flatArr)
//                System.out.println(flat.adress);
//        }

        //empty multi-dimension array 2x2
//        int[][] a = new int[2][2];
//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[1][0] = 3;
//        a[1][1] = 4;
//        for (int[] numberOne : a) {
//            System.out.println(numberOne);
//        }
//        //empty multi-dimension array 2x2
//        int[][] multidimenEmpty = new int[2][];
//        multidimenEmpty[0] = new int [3];
//        multidimenEmpty[1] = new int [3];
//    }


//        int[][] intArray = new int[2][3];
//        for (int j = 0; j < intArray.length; j++) {
//            for (int k = 0; k < intArray[j].length; k++) {
//                intArray[j][k] = j * k;
//            }
//        }

        ArrayUtil arrayUtil = new ArrayUtil();
        int[][] intArray = arrayUtil.createAndFill(23,3);
        System.out.println(Arrays.deepToString(intArray));
        for(int []itemArray: intArray){
            for (int item: itemArray){
                System.out.println(item);
            }
        }

    }
}


//        for (int[] numberOne : a) {
//            System.out.println(numberOne);
//        }
//        //full multi-dimension array 2x2
//        int[][] multidimenFull = new int[2][];
//        multidimenFull[0] = new int [] {1,2,3};
//        multidimenFull[1] = new int [] {2,3,4,5};
//    }
//}