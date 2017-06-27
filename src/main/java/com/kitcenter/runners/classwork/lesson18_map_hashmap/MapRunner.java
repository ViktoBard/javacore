package com.kitcenter.runners.classwork.lesson18_map_hashmap;

import java.util.HashMap;

/**
 * Created by Viktor on 24.06.2017.
 */
public class MapRunner {
    public static void main(String[] args) {
        HashMap m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println(m1.get("Zara"));
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

//        Map map = new HashMap<String, String>();
//        map.put(1, "Daizy");
//        map.put(1, "Lola");
    }
}
