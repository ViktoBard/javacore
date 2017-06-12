package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.ReadFileWithSeparators;
import com.kitcenter.runners.homework.lesson11.ArrayParserRunner;
import com.kitcenter.runners.homework.lesson11.KeyWordRunner;
import com.kitcenter.runners.homework.lesson11.SecondArrayParserRunner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 12.06.2017.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        System.out.println("В этом уроке вы можете выбрать:");
        System.out.println("1. Чтение из файла строк с массивами чисел");
        System.out.println("2. Считывание из файла список слов в стобик");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                try {
                    ReadAndWriteFileWithSeparatorsRunner.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "2":
                try {
                    ReadAndWriteColumnRunner.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
