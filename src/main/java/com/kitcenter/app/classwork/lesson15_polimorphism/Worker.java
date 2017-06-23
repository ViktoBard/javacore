package com.kitcenter.app.classwork.lesson15_polimorphism;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Worker extends Person {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String getResponse(String question) {
        return "I do no make homework";
    }
}
