package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Lesson12Menu;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 12.06.2017.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        System.out.println("В этом уроке вы можете выбрать:");
        for (Lesson12Menu lesson12Menu : Lesson12Menu.values()) {
            System.out.println(lesson12Menu.getPosition());
        }
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
            case "0":
                break;
        }
    }
}
