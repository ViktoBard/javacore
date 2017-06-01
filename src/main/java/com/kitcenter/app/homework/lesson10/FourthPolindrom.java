package com.kitcenter.app.homework.lesson10;

/**
 * Created by Viktor on 31.05.2017.
 */
public class FourthPolindrom {
    public static void fourthPolindrom() {
        String palindrome = "moom";
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
        if (palindrome.equals(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
