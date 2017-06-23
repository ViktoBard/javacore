package com.kitcenter.app.homework.lesson12;

/**
 * Created by user on 23.06.2017.
 */
public enum Lesson12Menu {
    FIRSTPOSITION("1. Чтение из файла строк с массивами чисел"),
    SECONDPOSITION("2. Считывание из файла список слов в стобик"),
    NULLPOSITION("0. Выход");

    private String position;

    Lesson12Menu (String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
