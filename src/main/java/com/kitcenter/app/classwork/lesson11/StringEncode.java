package com.kitcenter.app.classwork.lesson11;

/**
 * Created by Viktor on 31.05.2017.
 */
public class StringEncode {
    public static String stringEncode(String stringEncode) {
        String plainText = "0123456789";
        String cypherText = "abcdefgABC";
        StringBuilder stringBuilder = new StringBuilder(stringEncode);
        String encodeString = "";

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
