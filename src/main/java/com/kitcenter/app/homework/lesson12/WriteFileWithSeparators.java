package com.kitcenter.app.homework.lesson12;

import java.io.*;

/**
 * Created by user on 09.06.2017.
 */
public class WriteFileWithSeparators {
    String targetDir = System.getProperty("user.dir");

    public void writeFile(String word, String relativeToProject) throws IOException {
        String absolutePath = createAbsolutePath(targetDir, relativeToProject);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter
                        (new FileOutputStream(absolutePath)));
        writer.append(word);
        writer.close();
    }

    public String createAbsolutePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }
}
