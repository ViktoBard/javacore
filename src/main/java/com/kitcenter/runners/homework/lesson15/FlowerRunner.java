package com.kitcenter.runners.homework.lesson15;

import com.kitcenter.app.homework.lesson15.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Viktor on 28.06.2017.
 */
public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("Enter how much flowers you want to buy");
        System.out.println("First roses, second tulips, third chamolines:");

        Scanner scanner = new Scanner(System.in);
        int flower1 = scanner.nextInt();
        int flower2 = scanner.nextInt();
        int flower3 = scanner.nextInt();

        Flower rose = new Rose(flower1);
        Flower tulip = new Tulip( flower2);
        Flower clove = new Chamomile(flower3);

        double price = Bouquet.bouquet(rose, tulip, clove);
        System.out.println("Your flower composition cost " + price + " uah");
    }
}