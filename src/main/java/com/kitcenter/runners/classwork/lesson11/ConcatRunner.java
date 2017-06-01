package com.kitcenter.runners.classwork.lesson11;

/**
 * Created by Viktor on 31.05.2017.
 */
public class ConcatRunner {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        StringBuilder stringBuilder = new StringBuilder(c);
        for (long i = 0; i < 100000; i++)
            c = c.concat(b);
//        stringBuilder.append(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}