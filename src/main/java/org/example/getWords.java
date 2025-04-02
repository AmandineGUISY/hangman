package org.example;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class getWords {
    public static List<String> wordlist;

    public static List<String> words() {
        wordlist = new ArrayList<>();
        try {
            String filePath = getWords.class.getClassLoader().getResource("words.txt").getPath();
            List<String> words = Files.readAllLines(Paths.get(filePath));
            wordlist.addAll(words);
        } catch (Exception e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
        return wordlist;
    }
}
