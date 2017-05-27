package com.kitcenter.runners.classwork.lesson10;

/**
 * Created by Viktor on 27.05.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "alla";
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
