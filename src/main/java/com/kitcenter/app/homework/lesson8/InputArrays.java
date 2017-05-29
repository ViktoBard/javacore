package com.kitcenter.app.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by user on 29.05.2017.
 */
public class InputArrays {
    public void inputArrays(BufferedReader reader) {
        try {
            int sum = 0;
            String txt;
            while (true) {
                txt = reader.readLine();
                if (!txt.equals("exit") && !txt.equals("выход")) {
                    int a = Integer.valueOf(txt);
                    sum += a;
                } else break;
            }
            System.out.println("Сумма всех чисел равна " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Неправильные штуки вводишь");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}