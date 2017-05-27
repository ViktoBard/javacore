package com.kitcenter.app.homework.lesson8;

import java.util.Random;

/**
 * Created by user on 26.05.2017.
 */
public class HomeworkArrays {
    public void evenArrayRow() {
        int[] even = new int[10];
        for (int i = 0, n = 2; i < even.length; n = n + 2, i++) {
            even[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void evenArrayColumn() {
        int[] even = new int[10];
        for (int i = 0, n = 2; i < even.length; n = n + 2, i++) {
            even[i] = n;
            System.out.println(n);
        }
        System.out.println();
    }

    public void oddArrayRow() {
        int[] even = new int[50];
        for (int i = 0, n = 1; i < even.length; n = n + 2, i++) {
            even[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void oddArrayReversRow() {
        int[] even = new int[50];
        for (int i = 0, n = 99; i < even.length; n = n - 2, i++) {
            even[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void randomArray09() {
        int eveNumber = 0;
        int[] even = new int[15];
        for (int i = 0; i < even.length; i++) {
            Random generator = new Random();
            even[i] = generator.nextInt(10);
            System.out.print(even[i] + " ");
            if (even[i] > 0 & even[i] % 2 == 0) eveNumber++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + eveNumber + " четных");
    }

    public void randomArray0999() {
        int maxIndex = 0;
        int[] even = new int[15];
        for (int i = 0; i < even.length; i++) {
            Random generator = new Random();
            even[i] = generator.nextInt(999);
            System.out.print(even[i] + " ");
            if (even[i] > maxIndex) {
                maxIndex = even[i];
            }
        }
        System.out.println("");
        System.out.println("Максимальное число в этом массиве " + maxIndex);
    }

    public void twoDimensionalArray() {
        int first = 8;
        int second = 5;
        int[][] even = new int[first][second];
        for (int i = 0; i < first; i++) {
            for (int k = 0; k <second; k++) {
                even[i][k] = 10 + (int) (Math.random() * (99 - 10));
            }
        }
        for (int i = 0; i < first; i++) {
            for (int j = 0; j < second; j++)
                System.out.print(even[i][j] + " ");
            System.out.println();
        }
    }
}

//
//        int m = 8, n = 5;
//        int mas[][] = new int[m][n];
//
//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++) {
//                mas[i][j] = 10 + (int) (Math.random() * (99 - 10));
//            }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++)
//                System.out.print(mas[i][j] + " ");
//            System.out.println();
//        }
//        System.out.println("\n");

