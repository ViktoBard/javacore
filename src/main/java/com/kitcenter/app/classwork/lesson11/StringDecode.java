package com.kitcenter.app.classwork.lesson11;

/**
 * Created by Viktor on 03.06.2017.
 */
public class StringDecode {
    public String stringDecode(String word) {
        String plainText = ".,!ЪХЗЩШГНЕКУЦЙФюбьтимсчяфывапролджэъхзщшгнекуцйЫВАПРОЛ ДЖЭЮБЬТИМСЧЯ";
        String cypherText = "абвгдеёжзийклмнопрстуф хцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧШЩЪЫЬЭЮЯ.,!";
        StringBuilder stringBuilder = new StringBuilder(word);
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