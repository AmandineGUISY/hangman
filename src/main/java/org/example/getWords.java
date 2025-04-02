package org.example;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class getWords {
    public static List<String> wordlist;

    public static List<String> words(String path) {
        wordlist = new ArrayList<>();
        try {
            List<String> words = Files.readAllLines(Paths.get(path));
            wordlist.addAll(words);
        } catch (Exception error) {
            System.err.println("Error reading the file :" + error.getMessage());
        }
        return wordlist;
    }
}
