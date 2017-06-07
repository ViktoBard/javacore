package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.KeyWord;

import java.util.Scanner;

/**
 * Created by user on 07.06.2017.
 */
public class KeyWordRunner {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        KeyWord keyWord = new KeyWord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select key word");
        String word = scanner.nextLine();
        System.out.println("Please enter some text with/without key word");
        String str = scanner.nextLine();
        String[] arr = str.split(word);
        keyWord.dataParser(arr);
    }
}