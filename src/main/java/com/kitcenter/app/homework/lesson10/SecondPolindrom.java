package com.kitcenter.app.homework.lesson10;

/**
 * Created by user on 31.05.2017.
 */
public class SecondPolindrom {
    public void secondPolindrom(String word) {
        String B = "";
        String C = word.replace(" ", "");
        char[] mass = C.toCharArray();
        char[] mass2 = new char[mass.length];
        for (int i = mass.length - 1; i >= 0; ) {
            for (int j = 0; j < mass2.length; j++) {

                mass2[j] = mass[i];
                i--;

                B += mass2[j];
            }
        }
        System.out.println(word + " " + B);
        System.out.println("Слово полиндром, если два слова одинаковы!");
    }
}
