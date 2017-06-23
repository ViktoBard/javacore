package com.kitcenter.runners.classwork.lesson15_polimorphism;

import com.kitcenter.app.classwork.lesson15_polimorphism.Person;
import com.kitcenter.app.classwork.lesson15_polimorphism.Student;
import com.kitcenter.app.classwork.lesson15_polimorphism.Teacher;
import com.kitcenter.app.classwork.lesson15_polimorphism.Worker;

/**
 * Created by Viktor on 14.06.2017.
 */
public class PersonRunner {
    public static void main(String[] args) {
        Person student = new Student("Egor", "KitCenter");
        System.out.println(student);
        Person teacher = new Teacher("Ivan");
        Person worker = new Worker("Vi");
        showResponse(student, "What class is it?");
        showResponse(teacher, "What time is now?");
        showResponse(worker, "What??");
    }

    public static void showResponse(Person person, String question) {
        System.out.println(person.getResponse(question));
    }
}
