package com.kitcenter.app.homework.lesson13;

/**
 * Created by user on 12.06.2017.
 */
public class Human {
    private int age = 0;
    private String name = "";

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int checkAge(int age) {
        if (age >= 120 || age < 1) {
            System.out.println("Ты ввёл неправильный возраст");
        } else {
            System.out.println("Новый возраст утсановлен");
            setAge(age);
        }
        return age;
    }


    public void printName() {
        System.out.println("Твоё имя: "+getName());
    }

    public void printAge() {
        System.out.println("Возраст: "+getAge());
    }
}