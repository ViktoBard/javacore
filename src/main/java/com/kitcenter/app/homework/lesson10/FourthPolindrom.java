package com.kitcenter.app.homework.lesson10;

/**
 * Created by Viktor on 31.05.2017.
 */
public class FourthPolindrom {
    public void fourthPolindrom(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        if (word.equals(builder.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
