package com.kitcenter.app.homework.lesson10;

/**
 * Created by user on 31.05.2017.
 */
public class FirstPolindrom {
    public void firstPolindrom (String word){
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            isPalindrome = isPalindrome && (word.charAt(i) == word.charAt(word.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
