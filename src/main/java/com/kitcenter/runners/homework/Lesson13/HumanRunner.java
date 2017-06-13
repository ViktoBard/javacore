package com.kitcenter.runners.homework.Lesson13;

import com.kitcenter.app.homework.lesson13.Human;
import com.kitcenter.app.homework.lesson13.WhiteCollar;

import java.util.Scanner;

/**
 * Created by user on 12.06.2017.
 */
public class HumanRunner {
    public static void main(String[] args) {
        runner();
    }

    public static void runner() {
        System.out.println("Выбери:");
        System.out.println("1. Установить имя и возраст");
        System.out.println("2. Установить имя и возраст и компанию");
        System.out.println("3. Узнать возраст");
        System.out.println("4. Узнать имя");
        System.out.println("0. Выход");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                setAndShowAgeAndName();
                runner();
                break;
            case "2":
                setAndShowAgeAndNameAndCompany();
                runner();
                break;
            case "3":
                getAge();
                runner();
                break;
            case "4":
                getName();
                runner();
                break;
            case "0":
                System.out.println("Выход");
                break;
        }
    }

    public static void setAndShowAgeAndName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи имя:");
        String name = scanner.nextLine();
        System.out.println("Введи возраст:");
        int age = scanner.nextInt();

        Human human = new Human(name, age);
        human.setName(name);
        human.setAge(age);

        System.out.println(human.getName() + human.getAge());
    }

    public static void setAndShowAgeAndNameAndCompany() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введи имя:");
        String name = scanner.nextLine();
        System.out.println("Введи компанию:");
        String companyName = scanner.nextLine();
        System.out.println("Введи возраст:");
        int age = scanner.nextInt();


        WhiteCollar whiteCollar = new WhiteCollar(name, age, companyName);
        whiteCollar.setName(name);
        whiteCollar.checkAge(age);
        whiteCollar.checkCompanyName(companyName);

        whiteCollar.printName();
        whiteCollar.printAge();
        whiteCollar.printCompany();
    }

    public static void getAge() {
        Human human = new Human();
        System.out.println(human.getAge());
    }

    public static void getName() {
        Human human = new Human();
        System.out.println(human.getName());
    }
}