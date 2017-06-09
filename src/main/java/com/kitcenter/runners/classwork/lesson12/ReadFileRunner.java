package com.kitcenter.runners.classwork.lesson12;

import com.kitcenter.app.classwork.lesson12.ReadFile;
import com.kitcenter.app.classwork.lesson12.WriteFile;
import com.kitcenter.app.homework.lesson10.FirstPolindrom;

import java.io.IOException;

/**
 * Created by Viktor on 03.06.2017.
 */
public class ReadFileRunner {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        String word = null;
        word = readFile.readTheFile("input.txt");
        FirstPolindrom firstPolindrom = new FirstPolindrom();
        boolean result = firstPolindrom.firstPolindrom(word);
        if (result) {
            WriteFile writeFile = new WriteFile();
            writeFile.writeFile(word, "src\\main\\resources\\output.txt");
        } else {
            System.out.print("");
        }
    }
}
