package com.kitcenter.runners.homework.lesson10;

import java.util.Scanner;

/**
 * Created by user on 06.06.2017.
 */
public class HomeTaskRunner {
    public static void main(String[] args) {
        System.out.println("Hometask 10");
        System.out.println("Choose polindrome runner from 1 to 4:");

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("");
                PolindromsRunner.firstPolindrom();
                break;
            case "2":
                System.out.println("");
                PolindromsRunner.secondPolindrom();
                break;
            case "3":
                System.out.println("");
                PolindromsRunner.thirdPolindrom();
                break;
            case "4":
                System.out.println("");
                PolindromsRunner.fourthPolindrom();
                break;
        }
    }
}
