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
        Random generator = new Random();
        int[] even = new int[15];
        int n;
        for (int i = 0; i < even.length; i++) {
            even[i] = (int) (Math.random() * 9);
//            n = generator.nextInt(9);
//            even[i] = n;
            System.out.print(even[i] + " ");
        }
        System.out.println();
        int j = 0;
        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 == 0) {
                j++;
            }
            System.out.print("Array has: " + j + " even numbers");
            System.out.println("\n");
        }
    }

    public void randomArray() {
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                j++;
            }
        }
        System.out.print("Array has: " + j + " even numbers");
        System.out.println("\n");
    }


}