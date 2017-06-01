package com.kitcenter.runners.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Viktor on 31.05.2017.
 */
public class ReaderFileReader {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    "C:\\Temp\\Programming\\javacore\\src\\test\\resources\\input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}

//     try {
//             BufferedReader reader = new BufferedReader(
//             new FileReader("C:\\Temp\\Programming\\javacore\\src\\test\\resources\\input.txt"));
//             String line;
//             while ((line = reader.readLine()) != null) {
//             System.out.println(line);
//             }
//             reader.close();
//             } catch (FileNotFoundException e) {
//             e.printStackTrace();
//             } catch (IOException e) {
//             e.printStackTrace();
//             } finally {
//             System.out.println("Regardless about exception you will see this text ");
//
//             }
//             }
