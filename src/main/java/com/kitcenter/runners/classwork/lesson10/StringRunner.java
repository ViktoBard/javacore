package com.kitcenter.runners.classwork.lesson10;

/**
 * Created by Viktor on 27.05.2017.
 */
public class StringRunner {
    public static void main(String[] args) {
        String center = new String("KT");
        String center2 = new String("KT");
        System.out.println(center == center2);
        System.out.println(center.equals(center2));
        String centerIntern = center.intern();
        String center3 = "KT";
        System.out.println(centerIntern == center3);
        System.out.println(center.isEmpty());
        System.out.println(center.equals(center2));


        String text = "4,5,6,7,8";
        String[] split = text.split(",");
        System.out.println(split[3]);
        System.out.println(text.charAt(0));
        System.out.println(text.compareTo("4,8"));
        System.out.println(text.length());
        System.out.println(text.replace("4", "324"));


        int counter = 5;
        Integer autoBoxingliteral = counter;
        Integer autoBoxing = new Integer(counter);
        int unboxingLiteral = autoBoxingliteral;
        int unboxing = autoBoxing;
    }
}
