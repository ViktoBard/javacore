package com.kitcenter.runners.classwork.lesson20_generics;

import com.kitcenter.app.classwork.lesson20_generics.BoxPrinter;
import com.kitcenter.app.classwork.lesson8.Flat;

/**
 * Created by Viktor on 01.07.2017.
 */
public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(10);

        System.out.println(boxPrinter);
        Integer integer = (Integer) boxPrinter.getVal();

        BoxPrinter boxPrinter1 = new BoxPrinter(new String("d"));
        System.out.println(boxPrinter1);

        BoxPrinter boxPrinter2 = new BoxPrinter(new Flat("Komarova"));
        System.out.println(boxPrinter2);


    }
}