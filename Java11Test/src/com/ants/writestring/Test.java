package com.ants.writestring;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/aurob/OneDrive/Desktop/Intellij/Java11Test/src/resources/old.txt");
        //URL resource = Test.class.getClassLoader().getResource("old.txt");
        String content = Files.readString(path);
        System.out.println(content);

        String newfileContent = content.replace("hello world1", "new helloworld");
        Path newpath = Paths.get("C:/Users/aurob/OneDrive/Desktop/Intellij/Java11Test/src/resources/new.txt");
        Files.writeString(newpath,newfileContent);

    }
}
