package com.kitcenter.app.homework.lesson13;

/**
 * Created by user on 23.06.2017.
 */
public enum HumanMenu {
    FIRSTPOSITION("1. Установить имя и возраст"),
    SECONDPOSITION("2. Установить имя и возраст и компанию"),
    THIRDPOSITION("3. Узнать возраст"),
    FOURTHPOSITION("4. Узнать имя"),
    NULLPOSITION("0. Выход");

    private String position;

    HumanMenu(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
