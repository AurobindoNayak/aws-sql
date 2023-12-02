package com.ants.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFile {

    //this has been introduced in java 11
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\aurob\\OneDrive\\Desktop\\Intellij\\java-latest-features-17\\resources\\hello.txt");
        //Path path = Paths.get("..\\resources\\hello.txt");
        String content = Files.readString(path);
        System.out.println(content);

        Path path1 = Paths.get("C:\\Users\\aurob\\OneDrive\\Desktop\\Intellij\\java-latest-features-17\\resources\\hello-new.txt");
        Files.writeString(path1,"Hello new world");

    }
}
