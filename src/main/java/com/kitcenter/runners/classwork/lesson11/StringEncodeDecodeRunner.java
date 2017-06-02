package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.StringDecode;
import com.kitcenter.app.classwork.lesson11.StringEncode;

import java.util.Scanner;

/**
 * Created by Viktor on 31.05.2017.
 */
public class StringEncodeDecodeRunner {
    public static void main(String[] args) {
        choosing();
    }

    public static void choosing() {
        System.out.println("Выбери 1, если хочешь зашифровать сообщение");
        System.out.println("Выбери 2, если хочешь расшифровать сообщение");
        System.out.println("или 0 для выхода");
        String choose = (StringEncodeDecodeRunner.scaner());
        switch (choose) {
            case "1":
                encoder();
                break;
            case "2":
                decoder();
                break;
            case "0":
                break;
            default:
                System.out.println("Давай еше раз");
                choosing();
        }
    }

    public static void encoder() {
        System.out.println("Сейчас ты можешь ввести чтото, чтоб перевести это в серкетный код!");
        System.out.println("Вводи только русские буквы верхнего и нижнего регистра:");
        String word = (StringEncodeDecodeRunner.scaner());
        StringEncode encode = new StringEncode();
        encode.stringEncode(word);
        System.out.println(encode.stringEncode(word));
        choosing();
    }

    public static void decoder() {
        System.out.println("Сейчас ты можешь ввести чтото, чтоб перевести это в серкетный код!");
        System.out.println("Вводи сюда код который ты получил:");
        String word = (StringEncodeDecodeRunner.scaner());
        StringDecode decode = new StringDecode();
        decode.stringDecode(word);
        System.out.println(decode.stringDecode(word));
        choosing();
    }

    public static String scaner() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        return word;
    }
}