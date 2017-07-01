package com.kitcenter.runners.classwork.lesson20_generics;


import com.kitcenter.app.classwork.lesson20_generics.OrderPair;
import com.kitcenter.app.classwork.lesson20_generics.OrderUtil;

import javax.swing.*;

/**
 * Created by Viktor on 01.07.2017.
 */
public class OrderRunner {
    public static void main(String[] args) {
        OrderPair<String, Integer> p1 = new OrderPair<>("Even",8);
        OrderPair<String, Integer> p2 = new OrderPair<>("Odd",11);

        boolean same = OrderUtil.compare(p1,p2);
        System.out.println(same);

    }
}
