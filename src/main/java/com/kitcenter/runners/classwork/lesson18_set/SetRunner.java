package com.kitcenter.runners.classwork.lesson18_set;

import java.util.HashSet;

/**
 * Created by Viktor on 24.06.2017.
 */
public class SetRunner {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("a");
        hs.add("C");
        hs.add("F");
        hs.add("A");
        System.out.println(hs); //[A, B, C, D, E, F]
    }
}