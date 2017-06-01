package com.kitcenter.runners.classwork.lesson11;

import com.kitcenter.app.classwork.lesson11.StringEncode;

import static com.kitcenter.app.classwork.lesson11.StringEncode.stringEncode;

/**
 * Created by Viktor on 31.05.2017.
 */
public class StringEncodeRunner {
    public static void main(String[] args) {
        String word = "2235";
//        StringEncode stringEncode = new StringEncode;
//        stringEncode.stringEncode(word);
        String encoded = stringEncode(word);
        System.out.println(encoded);
    }
}