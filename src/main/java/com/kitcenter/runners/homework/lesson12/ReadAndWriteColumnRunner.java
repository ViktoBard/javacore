package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson10.FirstPolindrom;
import com.kitcenter.app.homework.lesson12.ReadColumn;
import com.kitcenter.app.homework.lesson12.WriteColumn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Viktor on 10.06.2017.
 */
public class ReadAndWriteColumnRunner {
    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {
        ReadColumn readColumn = new ReadColumn();
        String wordOne;
        wordOne = readColumn.readTheFile("src\\main\\resources\\inputWords.txt");
        System.out.println(wordOne);
        String wordTwo = wordOne.replace("\n", "").replace("\r", "");

        FirstPolindrom firstPolindrom = new FirstPolindrom();
        boolean result = firstPolindrom.firstPolindrom(wordTwo);
        if (result) {
            WriteColumn writeColumn = new WriteColumn();
            String polinrom = "is polindrom";
            writeColumn.writeFile(wordOne, polinrom, "src\\main\\resources\\output.txt");
        } else {
            WriteColumn writeColumn = new WriteColumn();
            String notPolinrom = "is not polindrom";
            writeColumn.writeFile(wordOne, notPolinrom, "src\\main\\resources\\output.txt");
        }
    }
}
