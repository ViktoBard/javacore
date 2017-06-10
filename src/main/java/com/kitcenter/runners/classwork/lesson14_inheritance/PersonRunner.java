package com.kitcenter.runners.classwork.lesson14_inheritance;

import com.kitcenter.app.classwork.lesson14_inheritance.Student;

/**
 * Created by Viktor on 10.06.2017.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Student student = new Student("Vi");
        student.showName();

        Student student1 = new Student("Vi",23);
        student1.showNameAndAge();
        student1.showClassName();
    }
}
