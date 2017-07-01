package com.kitcenter.runners.classwork.lesson20_generics;

import com.kitcenter.app.classwork.lesson20_generics.BoxPrinterGeneric;
import com.kitcenter.app.classwork.lesson20_generics.OrderUtil;
import com.kitcenter.app.classwork.lesson8.Flat;

/**
 * Created by Viktor on 01.07.2017.
 */
public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 = new BoxPrinterGeneric<>(new Integer(10));
        System.out.println(value1);

        BoxPrinterGeneric<Flat> value2 = new BoxPrinterGeneric<>(new Flat("Komarova "));
        System.out.println(value2);
        BoxPrinterGeneric<Flat> value3 = new BoxPrinterGeneric<>(new Flat("Komarova23 "));
        System.out.println(value3);

        boolean compareFlat = OrderUtil.compare(value2, value3);
        System.out.println(compareFlat);

        Integer intValue1 = value1.getVal();
        BoxPrinterGeneric<String> value4 = new BoxPrinterGeneric<String>("Hello world");
        System.out.println(value4);

// Here is the same error, but now it is compile-time error
//        Integer intValue2 = value2.getVal();
    }
}