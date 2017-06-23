package com.kitcenter.app.classwork.lesson15_polimorphism;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "Do not forget to make a homework";
    }
}
