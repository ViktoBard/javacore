package com.kitcenter.app.classwork.lesson15_polimorphism;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }
}