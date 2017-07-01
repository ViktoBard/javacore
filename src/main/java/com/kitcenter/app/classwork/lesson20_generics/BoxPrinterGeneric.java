package com.kitcenter.app.classwork.lesson20_generics;

/**
 * Created by Viktor on 01.07.2017.
 */
public class BoxPrinterGeneric<T> {
    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public String toString() {
        return "{" +
                "val=" +
                val + "}";
    }
}