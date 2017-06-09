package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson11.ArrayParser;
import com.kitcenter.app.homework.lesson12.ReadFileWithSeparators;


import java.io.IOException;

import java.util.Scanner;


/**
 * Created by user on 08.06.2017.
 */
public class ReadAndWriteFileWithSeparatorsRunner {
    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {

        ArrayParser userData = new ArrayParser();
        Scanner scanner = new Scanner(System.in);
        ReadFileWithSeparators readFileWithSeparators = new ReadFileWithSeparators();
        String word;
        word = readFileWithSeparators.readTheFile("src\\main\\resources\\input.txt");
        System.out.println(word);
        String newWord = word.replace("\n", "").replace("\r", "");
        String[] arr = newWord.split(",");
        double[] data = new double[arr.length];

//        try {
//            for (int i = 0; i < arr.length; i++) {
//                data[i] = Double.parseDouble(arr[i]);
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Incorrect input parameters");
//            return;
//        }
        System.out.println("Please put > for descending or < for ascending");
        String direction = scanner.nextLine();
        userData.arrayParser(data, direction);
        Double
        System.out.println();
    }
}
