
package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir");
        System.out.println("Working directory: " + userDir);

        File file = FileUtils.getFile(userDir, "random_text_file.txt");

        try {
            String fileData = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println(fileData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
