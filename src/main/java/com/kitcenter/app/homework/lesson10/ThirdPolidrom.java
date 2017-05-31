package com.kitcenter.app.homework.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 31.05.2017.
 */
public class ThirdPolidrom {
    public static boolean thirdPolidrom(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if (result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }

}
