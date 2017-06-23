package com.kitcenter.runners.classwork.lesson17_enum;

import com.kitcenter.app.classwork.lesson17_enum.Company;

/**
 * Created by Viktor on 21.06.2017.
 */
public class CompanyRunner {
    public static void main(String[] args) {
        for (Company company : Company.values()) {
            System.out.println(company.getFullName());
//            company.setValue(10);
            System.out.println(company.getValue());
        }
        System.out.println(Company.EBAY.getValue());
    }
}
