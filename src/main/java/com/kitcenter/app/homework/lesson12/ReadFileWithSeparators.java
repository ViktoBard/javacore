package com.kitcenter.app.homework.lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 08.06.2017.
 */
public class ReadFileWithSeparators {
    String currentDir = System.getProperty("user.dir");

    public String readTheFile(String relativeToProject) throws IOException {
        String line;
        String absolutePath = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath));
        line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }
    public String createAbsolutePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }
}
