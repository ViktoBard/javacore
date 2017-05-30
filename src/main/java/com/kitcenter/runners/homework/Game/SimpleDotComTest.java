package com.kitcenter.runners.homework.Game;

import com.kitcenter.app.homework.Game.SimpleDotCom;

/**
 * Created by user on 30.05.2017.
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "1";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
