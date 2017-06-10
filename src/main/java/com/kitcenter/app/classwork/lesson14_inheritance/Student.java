package com.kitcenter.app.classwork.lesson14_inheritance;

/**
 * Created by Viktor on 10.06.2017.
 */
public class Student extends Person { //class name
    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void showName() {
        System.out.println(name);
    }

    public void showNameAndAge() {
        System.out.println(name + " " + age);
    }


    public void showClassName(){
        System.out.println("Student class");
    }

//    private String university; //class fields
//    private String response = "Ehhh, what was the question?";
//
//    public Student(String name, String university) { // constructor
//        super(name); // call parent (super) class constructor
//        this.university = university; // extend with new properties
//    }
//
//    public String getResponse(String question) { // method
//        return response;
//    }
}
