package com.kitcenter.app.classwork.lesson14_inheritance;

/**
 * Created by Viktor on 10.06.2017.
 */
public  class Person {
    protected String name;
    protected int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public void showClassName(){
        System.out.println("Person class");
    }
}
