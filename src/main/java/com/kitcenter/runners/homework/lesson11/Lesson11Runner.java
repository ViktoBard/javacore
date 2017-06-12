package com.kitcenter.runners.homework.lesson11;

import java.util.Scanner;

/**
 * Created by user on 12.06.2017.
 */
public class Lesson11Runner {
    public static void main(String[] args) {
        System.out.println("В этом уроке вы можете выбрать:");
        System.out.println("1. Считывать данные пользователя - набор цифр через точку с запятой в ряд");
        System.out.println("2. Массив данных с разделителем");
        System.out.println("3. Строка, и ключевое слово");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                ArrayParserRunner.run();
                break;
            case "2":
                SecondArrayParserRunner.run();
                break;
            case "3":
                KeyWordRunner.run();
                break;
        }
    }
}
