package com.kitcenter.app.classwork.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Viktor on 03.06.2017.
 */
public class ReadFile {
//    String currentDir = System.getProperty("user.dir");
//
//    public String readTheFile(String relativeToProject) throws IOException {
//        String line;
//        String absolutePath = createAbsolutePath(currentDir, relativeToProject);
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath));
//        line = bufferedReader.readLine();
//        bufferedReader.close();
//        return line;
//    }
//    public String createAbsolutePath(String project, String relativeToProject) {
//        File file = new File(project, relativeToProject);
//        return file.getAbsolutePath();
//    }

    public String readTheFileFromResources (String resourcesFileName) throws IOException {
        String line;
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader(getPath(resourcesFileName)));
        line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }


    public String getPath(String fileName) {
        String path = null;
        URL url = this.getClass().getClassLoader().getResource(fileName);
        if (url != null) {
            path = url.getPath();
        } else {
            System.out.println("Not found resource");
        }
        return path;
    }
}