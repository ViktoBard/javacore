package com.kitcenter.app.homework.Game;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

/**
 * Created by user on 30.05.2017.
 */
public class GameHelper {
    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.println(promt + " ");
//        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            if (inputLine.length()==0) return null;
//            }catch (IOException e){
//                System.out.println("IOException" + e);
//            }
        return inputLine;
    }
}
