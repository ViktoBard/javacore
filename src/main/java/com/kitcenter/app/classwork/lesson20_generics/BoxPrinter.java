package com.kitcenter.app.classwork.lesson20_generics;

/**
 * Created by Viktor on 01.07.2017.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public String toString() {
        return "{" +
                "val="+ val + "}";
    }
}