package com.kitcenter.app.classwork.lesson12;

import java.io.*;
import java.net.URL;

/**
 * Created by Viktor on 03.06.2017.
 */
public class WriteFile {
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


//    public String getPath(String fileName) {
//        String path = null;
//        URL url = this.getClass().getClassLoader().getResource(fileName);
//        if (url != null) {
//            path = url.getPath();
//        } else {
//            System.out.println("Not found resource");
//        }
//        return path;
//    }
}