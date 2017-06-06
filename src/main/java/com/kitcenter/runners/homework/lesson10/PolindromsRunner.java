package com.kitcenter.runners.homework.lesson10;

import com.kitcenter.app.homework.lesson10.FirstPolindrom;
import com.kitcenter.app.homework.lesson10.FourthPolindrom;
import com.kitcenter.app.homework.lesson10.SecondPolindrom;
import com.kitcenter.app.homework.lesson10.ThirdPolidrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 31.05.2017.
 */
public class PolindromsRunner {
    public static void main(String[] args) {
        firstPolindrom();
        secondPolindrom();
        thirdPolindrom();
        fourthPolindrom();
    }

    public static void firstPolindrom() {
        System.out.println("Введите слово, чтоб проверить, полидром ли это:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        FirstPolindrom firstPolindrom = new FirstPolindrom();
        firstPolindrom.firstPolindrom(word);
    }

    public static void secondPolindrom() {
        System.out.println("Введите слово, чтоб проверить, полидром ли это:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        SecondPolindrom secondPolindrom = new SecondPolindrom();
        secondPolindrom.secondPolindrom(word);
    }

    public static void thirdPolindrom() {
        System.out.println("Введите слово, чтоб проверить, полидром ли это:");
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введи что-нибудь: ");
            String input = inputStream.readLine();
            System.out.print("Думаю это: ");
            System.out.print(ThirdPolidrom.thirdPolidrom(input));
        } catch (IOException exception) {
            System.err.println("Ошибочка");
        }
    }

    public static void fourthPolindrom() {
        System.out.println("Введите слово, чтоб проверить, полидром ли это:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        FourthPolindrom fourthPolindrom = new FourthPolindrom();
        fourthPolindrom.fourthPolindrom(word);
    }
}