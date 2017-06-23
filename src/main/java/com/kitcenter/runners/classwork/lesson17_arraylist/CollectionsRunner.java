package com.kitcenter.runners.classwork.lesson17_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Viktor on 21.06.2017.
 */
public class CollectionsRunner {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        System.out.println(myList);

        int theSize = myList.size();
        System.out.println(theSize);

        boolean isIn = myList.contains(string2);
        System.out.println(isIn);

        int index = myList.indexOf(string2);
        System.out.println(index);

        boolean isEmpty = myList.isEmpty();
        System.out.println(isEmpty);

        myList.remove(string1);
        isIn = myList.contains(string1);
        System.out.println(myList);

        System.out.println(isIn);
        Collections.reverse(myList);
//        Collections.revers(myList);
    }
}
