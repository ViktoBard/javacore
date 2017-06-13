package com.kitcenter.app.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 12.06.2017.
 */
public class WhiteCollar extends Human {
    private String companyName = "";

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean checkCompanyName(String testString) {
        if (testString.matches("^[a-zA-Z ]+$")) {
            setCompanyName(testString);
            return true;
        } else {
            System.out.println("Неверные данные");
            return false;
        }
    }

    public void printCompany() {
        System.out.println("Имя компании: "+getCompanyName());
    }
}