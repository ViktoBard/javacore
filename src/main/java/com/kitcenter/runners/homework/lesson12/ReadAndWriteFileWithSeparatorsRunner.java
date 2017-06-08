package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.classwork.lesson12.ReadFile;
import com.kitcenter.app.classwork.lesson12.WriteFile;
import com.kitcenter.app.homework.lesson10.FirstPolindrom;

import java.io.IOException;

/**
 * Created by user on 08.06.2017.
 */
public class ReadAndWriteFileWithSeparatorsRunner {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        String word = null;
        word = readFile.readTheFileFromResources("input.txt");
        FirstPolindrom firstPolindrom = new FirstPolindrom();
        boolean result = firstPolindrom.firstPolindrom(word);
        if (result) {
            WriteFile writeFile = new WriteFile();
            writeFile.writeFile(word, "src\\main\\resources\\outputArray.txt");
        } else {
            System.out.print("");
        }
    }
}
