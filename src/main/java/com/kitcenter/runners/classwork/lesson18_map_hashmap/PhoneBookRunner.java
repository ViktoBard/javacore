package com.kitcenter.runners.classwork.lesson18_map_hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Viktor on 24.06.2017.
 */
public class PhoneBookRunner {
    public static void main(String[] args) {
        HashSet nameA = new HashSet();
        nameA.add("Abraham Bright");
        nameA.add("Abigale Boom");
        nameA.add("Alen Woody");

        HashSet nameB = new HashSet();
        nameB.add("Brian White");
        nameB.add("Bird Brown");
        nameB.add("Bow Towel");

        HashMap m1 = new HashMap();
        m1.put("A", nameA);
        m1.put("B", nameB);
        System.out.println(m1.get("A"));

//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        Season m2  = Season.valueOf(bf.readLine().toUpperCase());

//        HashMap keyMap = new HashMap();
//        keyMap.put("A","Abc");
//        keyMap.put("A","Abd");
//        keyMap.put("A","Abe");
//        keyMap.put("A","Abf");
//        keyMap.put("A","Abg");
//        keyMap.put("B","Bcd");
//        keyMap.put("B","Abd");
//        keyMap.put("B","Abe");
//        keyMap.put("B","Abf");
//        keyMap.put("B","Abg");
//
//
//        HashMap valueMap = new HashMap();
//        valueMap.put("A");
//
//        HashMap mainMap = new HashMap();
//        mainMap.put(A, nameA);
//        mainMap.put("B", nameB);
//        System.out.println(mainMap.get(keyA));

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Daizy");
        map.put(2, "Lola");
        Set set = map.keySet();
        Set set1 = map.entrySet();
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue().toString()+ entry.getKey().toString());
        }
    }
}
