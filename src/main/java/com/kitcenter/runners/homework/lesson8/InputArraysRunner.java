package com.kitcenter.runners.homework.lesson8;

import com.kitcenter.app.homework.lesson8.InputArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by user on 29.05.2017.
 */
public class InputArraysRunner {
    public static void main(String[] args) {
        InputArraysRunner.menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для создания нового массива нажми 1");
        System.out.println("А для выхода напиши: \"exit\"");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Введите числа для создания массива");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                InputArrays inputArrays = new InputArrays();
                inputArrays.inputArrays(reader);
                menuRepeating();
                break;
            case "exit":
                System.out.println("ну ладно, пока");
                break;
            default:
                System.out.println("неправильно ввел чтото, давай еще раз");
                menuRepeating();
                break;
        }
    }

    public static void menuRepeating() {
        InputArraysRunner.menu();
    }
}