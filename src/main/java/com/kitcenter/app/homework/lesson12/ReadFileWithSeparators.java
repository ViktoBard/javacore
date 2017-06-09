package com.kitcenter.app.homework.lesson12;

import java.io.*;
import java.net.URL;

/**
 * Created by user on 08.06.2017.
 */
public class ReadFileWithSeparators {
    String currentDir = System.getProperty("user.dir");

    public String readTheFile(String relativeToProject) throws IOException {
        String word = null;
        String absolutePath = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath));

        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( word = bufferedReader.readLine() ) != null ) {
            stringBuilder.append( word );
            stringBuilder.append( ls );
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();

    }

    public String createAbsolutePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }
}