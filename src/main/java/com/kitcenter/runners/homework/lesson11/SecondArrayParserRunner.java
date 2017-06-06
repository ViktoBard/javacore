package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.homework.lesson11.SecondArrayParser;

import java.util.Scanner;

/**
 * Created by user on 06.06.2017.
 */
public class SecondArrayParserRunner {
    public static void main(String[] args) { run();}
    public static void run(){
        SecondArrayParser userData = new SecondArrayParser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select and enter any separator");
        String separator = scanner.nextLine();
        System.out.println(("Please enter info divided it by selected separator"));
        String str = scanner.nextLine();
        String[] arr = str.split(separator);
        userData.secondArrayParser(arr);
    }
}
