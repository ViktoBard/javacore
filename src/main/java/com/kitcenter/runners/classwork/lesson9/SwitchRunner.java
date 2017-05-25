package com.kitcenter.runners.classwork.lesson9;

import java.util.Scanner;

/**
 * Created by Viktor on 24.05.2017.
 */
public class SwitchRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String task = scanner.next();
        switch (task){
            case "1":
                printTask(task);
                break;
            case "2":
                printTask(task);
                break;
            case "3":
                printTask(task);
                break;
            default:printTask("Default task");
        }
    }

    public static void printTask (String taskNumber) {
        System.out.println("The task number: " + taskNumber);
    }
}
