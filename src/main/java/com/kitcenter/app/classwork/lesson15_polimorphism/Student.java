package com.kitcenter.app.classwork.lesson15_polimorphism;

/**
 * Created by Viktor on 14.06.2017.
 */
public class Student extends Person {

    private String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question) {
        return "Ehhh, what was the question?";
    }

    @Override
    public String toString() {
        return "Имя и университет студента: "+name + " " +university;
    }
}